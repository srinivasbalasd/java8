import java.util.Objects;
import java.util.stream.Stream;

public class StreamOfExample {
    public static void main(String[] args) {
        Stream<String> stringStream = Stream.of("One", null, "Three", "Four", null);
        stringStream
                //.filter(Objects::nonNull)
                .forEach(System.out::println);  //Outputs: One Three Four
    }
}
