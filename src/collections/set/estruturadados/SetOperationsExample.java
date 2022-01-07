package collections.set.estruturadados;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetOperationsExample {
    public static void main(String args[]) {

        Integer[] A = {22, 45,33, 66, 55, 34, 77};
        Integer[] B = {33, 2, 83, 45, 3, 12, 55};

        Set<Integer> set1 = new HashSet<Integer>();
        // convertendo matriz em lista e add elementos da matriz A na no conjunto set1
        set1.addAll(Arrays.asList(A));
        Set<Integer> set2 = new HashSet<Integer>();
        // convertendo matriz em lista e add elementos da matriz B no conjunto set2
        set2.addAll(Arrays.asList(B));

        //O método adicionará todos esses elementos ao union_data que não
        // estão presentes nele e dá a união de ambos os conjuntos.

        // Encontrando a União de set1 e set2
        Set<Integer> union_data = new HashSet<Integer>(set1);
        union_data.addAll(set2);
        System.out.print("União de set1 e set2 is: " );
        System.out.println(union_data);

        // Método obterá todos esses elementos do intersection_data que estão presentes no set2 e
        // o armazenarão no intersection_data.
        // Agora, o intersection_data contém o valor de intersecção de ambos os conjuntos.

        // Encontrando a intersecção de set1 e set2
        Set<Integer> intersection_data = new HashSet<Integer>(set1);
        intersection_data.retainAll(set2);
        System.out.print("Intersecção de set1 e set2 is: ");
        System.out.println(intersection_data);

        //método removerá todos esses elementos do difference_data que estão presentes no conjunto2
        // e dará a diferença de ambos os conjuntos.

        // Econtrando a diferença de set1 e set2
        Set<Integer> difference_data = new HashSet<Integer>(set1);
        difference_data.removeAll(set2);
        System.out.print("Diferença de set1 and set2 is: ");
        System.out.println(difference_data);

    }
}
