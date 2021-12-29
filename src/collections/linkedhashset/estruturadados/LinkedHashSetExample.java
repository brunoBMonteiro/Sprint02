package collections.linkedhashset.estruturadados;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetExample {
    public static void main(String args[]){
        //Creating HashSet and adding elements
        LinkedHashSet<String> set = new LinkedHashSet();

        // elementos iteram na ordem de inserção
        set.add("One");
        set.add("Two");
        set.add("Three");
        set.add("Four");
        set.add("Five");

        // ignora elementos duplicados
        set.add("Three");

        Iterator<String> i=set.iterator();

        while(i.hasNext()) {
            System.out.println(i.next());
        }


    }
}
