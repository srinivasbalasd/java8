import java.util.Arrays;
import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.List;

public class J8listintegers {
    public static void main(String[] args) {

        // list of integer numbers
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        // get minimum number from list of integers
        int minNumber = numbers
                .stream()
                .min(Comparator.comparing(Integer::valueOf))
                .get();

        System.out.println("1. The Minimum number is = "
                + minNumber);

        // get maximum number from list of integers
        int maxNumber = numbers
                .stream()
                .max(Comparator.comparing(Integer::valueOf))
                .get();

        System.out.println("2. The Maximum number is = "
                + maxNumber);

        // get maximum number from list of integers
        IntSummaryStatistics  summaryStatistics = numbers
                .stream().mapToInt(e->e).summaryStatistics();
        System.out.println(summaryStatistics);
    }
}
