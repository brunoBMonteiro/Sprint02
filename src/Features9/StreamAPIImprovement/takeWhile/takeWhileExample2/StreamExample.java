package Features9.StreamAPIImprovement.takeWhile.takeWhileExample2;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//Neste exemplo, estamos obtendo os primeiros dois elementos porque são pares e param no terceiro elemento.
//

public class StreamExample {
    public static void main(String[] args) {
        List<Integer> list
                = Stream.of(2,2,3,4,5,6,7,8,9,10)
                // Pegar enquanto
                .takeWhile(i -> (i % 2 == 0)).collect(Collectors.toList());
        System.out.println(list);
    }
}
