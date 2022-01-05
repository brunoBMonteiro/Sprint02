package Features9.StreamAPIImprovement.ofNullable;


import java.util.stream.Stream;
// This program will not produce any output.
public class StreamExample {
    public static void main(String[] args) {
        Stream<Integer> val
                = Stream.ofNullable(null);
        val.forEach(System.out::println);
    }
}
