import java.util.Arrays;
import java.util.Optional;
import java.util.stream.IntStream;

public class J8MinMaxCharArrayPrmtv {
    public static void main(String[] args) {
        char[] chars2 = {'a','b'};
       // Arrays.stream(chars)
        //can not resolve method stream(char[])
        String str = new String(chars2);
        System.out.println((char)str.chars().min().orElse(65));

        char[] chars = {'a', 'b', 'x', 'c', 'm', 'p', 'n', 'z', 'h', 'A'};

        Optional<Character> smallest = IntStream.range(0, chars.length-1)
                .mapToObj(i -> chars[i])
                .sorted()
                .findFirst();

        System.out.println("Smallest character: " + (smallest.isPresent() ? smallest.get() : "None"));
    }
}
