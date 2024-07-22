import java.util.*;
import java.util.stream.Stream;

public class StreamImmutableExample {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("one", "two", "three");
        Stream<String> stream = list.stream();
        Stream stream2 = Stream.of(stream.filter(s -> s.startsWith("t"))); // This does NOT modify the original stream. Instead, it creates a new Stream.
        //stream2.forEach(System.out::println);
        //stream.forEach(System.out::println);

    }
}
