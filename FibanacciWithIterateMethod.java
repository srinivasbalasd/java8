import java.util.stream.Stream;

public class FibanacciWithIterateMethod {
    public static void main(String[] args) {
        Stream.iterate(new int[]{0,1},f -> new int[]{f[1],f[0]+f[1]})
                .limit(10)
                .map(a->a[0]).forEach(System.out::println);
    }
    //0 1 0
    //1 1
    //1 2
}
