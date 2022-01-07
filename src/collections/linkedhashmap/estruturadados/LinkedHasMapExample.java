package collections.linkedhashmap.estruturadados;

import java.util.LinkedHashMap;

public class LinkedHasMapExample {
    public static void main(String args[]){
        LinkedHashMap<Integer, String> map = new LinkedHashMap<Integer, String>();

        map.put(100,"Ana");
        map.put(102,"Rahul");
        map.put(101,"Maria");


        //Fetching key - Chave de busca
        System.out.println("Keys: "+map.keySet());
        //Fetching value - Valor de busca
        System.out.println("Values: "+map.values());
        //Fetching key-value pair - Busca por par de chave valor
        System.out.println("Key-Value pairs: "+map.entrySet());
    }
}
