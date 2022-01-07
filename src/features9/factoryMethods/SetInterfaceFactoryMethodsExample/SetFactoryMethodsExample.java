package features9.factoryMethods.SetInterfaceFactoryMethodsExample;

import java.util.Set;

public class SetFactoryMethodsExample {
    public static void main(String[] args) {

        Set<String> set = Set.of("Java","JavaFX","Spring","Hibernate","JSP");

        for(String l:set) {
            System.out.println(l);
        }
    }
}
