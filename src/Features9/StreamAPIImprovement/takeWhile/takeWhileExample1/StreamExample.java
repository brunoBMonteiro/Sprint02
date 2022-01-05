package Features9.StreamAPIImprovement.takeWhile.takeWhileExample1;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

// temos uma lista de inteiros e capta valores uniformes usando o método takewhile.
// retorna uma lista vazia porque falha no elemento da primeira lista e faz paradas por aqui

public class StreamExample {
    public static void main(String[] args) {
        List<Integer> list
                // Se retirar o 1 ele retorna e 2 e para novamente
                = Stream.of(1,2,3,4,5,6,7,8,9,10)
                // Pegar enquanto
                .takeWhile(i -> (i % 2 == 0)).collect(Collectors.toList());
        System.out.println(list);
    }
}
