import java.util.Arrays;

public class J8MinMaxIntPrimitiveArray {
    public static void main(String[] args) {
        int[] arr = {7,5,2,10,11,17};
        getSummaryStatistics(arr);

        int[] arr2 = {};
        getSummaryStatistics(arr2);

        int[] arr3 = null;
        //extracted(arr3);


    }
    private static void getSummaryStatistics(int[] arr) {
        System.out.println(Arrays.stream(arr).min());
        System.out.println(Arrays.stream(arr).min().getAsInt());
        System.out.println(Arrays.stream(arr).max());
        System.out.println(Arrays.stream(arr).average());
        System.out.println(Arrays.stream(arr).count());
        System.out.println(Arrays.stream(arr).sum());
        System.out.println(Arrays.stream(arr).summaryStatistics());
    }
}
