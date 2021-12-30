package Collections.treeset.estruturadados;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String args[]){

        //Creating and adding elements
        TreeSet<String> al=new TreeSet<String>();

        al.add("Ana");
        // ordem crescente de referencia has
        System.out.println(al.hashCode());
        al.add("João");
        System.out.println(al.hashCode());
        al.add("Ana");
        // apenas elementos unicos
        al.add("Jayne");
        System.out.println(al.hashCode());

        //Atravessando elementos
        Iterator<String> itr=al.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
