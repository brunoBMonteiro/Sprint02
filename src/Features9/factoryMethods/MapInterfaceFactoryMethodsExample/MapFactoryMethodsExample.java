package Features9.factoryMethods.MapInterfaceFactoryMethodsExample;

import java.util.Map;

// Example with map.of()
public class MapFactoryMethodsExample {
    public static void main(String[] args) {
        Map<Integer,String> map = Map.of(101,"JavaFX",102,"Hibernate",103,"Spring MVC");

        for(Map.Entry<Integer, String> m : map.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }
    }
}
