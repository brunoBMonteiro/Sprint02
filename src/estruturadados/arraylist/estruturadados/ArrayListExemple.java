package estruturadados.arraylist.estruturadados;

import java.util.ArrayList;

public class ArrayListExemple {
    public static void main(String[] args) {

        ArrayList<String> arrayList = new ArrayList<String>();

        arrayList.add("A");
        arrayList.add("B");
        arrayList.add("C");

        System.out.println(arrayList);

        // adicionando na posição 1
        arrayList.add(0, "D");

        System.out.println(arrayList);

        // removendo pela posição do array
        arrayList.remove(0);

        System.out.println(arrayList);
    }
}
