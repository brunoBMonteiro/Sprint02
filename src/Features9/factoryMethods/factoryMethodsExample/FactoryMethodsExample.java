package Features9.factoryMethods.factoryMethodsExample;

import java.util.List;

public class FactoryMethodsExample {

    // without factory methods
    /*
     public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Java");
        list.add("JavaFX");
        list.add("Spring");
        list.add("Hibernate");
        list.add("JSP");
        for(String l : list){
            System.out.println(l);
        }
    }
    No código acima, o método de ação é chamado repetidamente
    para cada elemento de lista, enquanto em Java 9 podemos fazê-lo
    em uma única linha de código usando os factory methods.
     */

    // With factory methods
    public static void main(String[] args) {
        List<String> list = List.of("Java","JavaFX","Spring","Hibernate","JUnit");

        for(String l:list) {
            System.out.println(l);
        }
    }
}
