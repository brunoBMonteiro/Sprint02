package collections.hashmap.estruturadados;

import java.util.HashMap;

public class HasMapExample {
    public static void main(String[] args) {

        HashMap<String, Integer> map = new HashMap<>();
        map.put("Aman", 19);
        map.put("Sunny", 29);
        map.put("Ritesh", 39);

        System.out.println(map);


        /*
        Vamos ver em qual índice a Chave, o par de valor
        será salvo no HashMap. Quando chamamos o método put(),
        então ele calcula o código hash da chave "Aman". Suponha que o código hash
        de "Aman" seja 2657860. Para armazenar a chave na memória, temos que calcular o índice.
         */

        // Calcular o indice

        //O índice minimiza o tamanho da matriz. A fórmula para calcular o índice é:
        //Index = hashcode(Key) & (n-1);

        //Onde n é o tamanho da matriz. Portanto, o valor do índice para "Aman" é:
        //Index = 2657860 & (16-1) = 4;

    }
}
