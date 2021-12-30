package Collections.hashset.estruturadados;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {
    public static void main(String args[]){

        //Criando HashSet e adicionando elementos
        HashSet<String> set = new HashSet();

        // elementos eles são inseridos com base no hasCode e não em ordem
        // usando hashCode para que ordem utiliza, no caso menor para maior
        set.add("One");
        System.out.println(set.hashCode());
        set.add("Two");
        System.out.println(set.hashCode());
        set.add("Three");
        System.out.println(set.hashCode());
        set.add("Four");
        System.out.println(set.hashCode());
        set.add("Five");
        System.out.println(set.hashCode());
        // não permite elementos duplicados
        set.add("Five");

        Iterator<String> i = set.iterator();

        while(i.hasNext())
        {
            System.out.println(i.next());
        }

    }
}
