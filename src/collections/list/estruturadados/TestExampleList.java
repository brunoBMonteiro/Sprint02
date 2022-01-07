package collections.list.estruturadados;

import java.util.ArrayList;
import java.util.List;

public class TestExampleList {
    public static void main(String[] args) {
        //Creating a List
        List<String> list = new ArrayList<String>();
        //Adding elements in the List
        list.add("Mango");
        list.add("Apple");
        list.add("Banana");
        list.add("Grapes");


        // indices
        list.add(2, "Coco");

        System.out.println(list);
        //Iterating the List element using for-each loop
        for(String fruit:list) {
            System.out.println(fruit);
        }
    }
}

