import java.util.Stack;
import java.util.regex.Pattern;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public final static Character END_BRACKETS = ']';
    public final static Character START_BRACKETS = '[';

    public static void main(String[] args) {
        String input = "a3[b2[cd]]";
        //String input = "a[bxyz2[cd]]";
        //String input = "a3[b2[cd]]";
        //stack
        //merge
        //result
        Stack<Character> stack = new Stack<>();
        StringBuilder result = new StringBuilder();
        for (char ch : input.toCharArray()) {
            StringBuilder merge = new StringBuilder();
            if (END_BRACKETS.equals(ch)) {
                Character rem = stack.pop();
                while (!rem.equals(START_BRACKETS)) {
                    merge.append(rem);
                    rem = stack.pop();
                }
                //merge2 = merge2.reverse();
                merge = new StringBuilder().append(result).append(merge);
                Character numchar = stack.peek();
                StringBuilder repeatStr = new StringBuilder();
                if(Character.isDigit(numchar)){
                    stack.pop();
                    for(int i=1;i<=Character.getNumericValue(numchar);i++) {
                        repeatStr.append(merge);
                    }
                }
                result = repeatStr.isEmpty()?merge:repeatStr;
            } else {
                stack.push(ch);
            }
        }
        while(!stack.isEmpty()) {
            result.append(stack.pop());
        }
        System.out.println(result.reverse());

    }
}