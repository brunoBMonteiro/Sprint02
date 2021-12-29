package collections.map.estruturadados;

import java.util.HashMap;
import java.util.Map;

public class MapGenericExample {
    public static void main(String args[]){
        Map<Integer,String> map=new HashMap<Integer,String>();

        // adicionando
        map.put(100,"Amit");
        map.put(101,"Vijay");
        map.put(102,"Rahul");

        //Retorna uma exibição definida dos mapeamentos contidos neste mapa
        map.entrySet()
                //Retorna um Fluxo sequencial com esta coleção como sua fonte
                .stream()
                //Classificado de acordo com o Comparador fornecido no caso o key
                .sorted(Map.Entry.comparingByKey())
                //Classificado de acordo com o Comparador fornecido
                .forEach(System.out::println);

    }
}
