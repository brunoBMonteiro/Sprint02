package Features9.factoryMethods.MapInterfaceFactoryMethodsExample2;

import java.util.Map;

// Example with map.ofEntries()
public class MapFactoryMethodsExample {
    public static void main(String[] args) {
        // Creating Map Entry
        Map.Entry<Integer, String> e1 = Map.entry(101, "Java");
        Map.Entry<Integer, String> e2 = Map.entry(102, "Spring");
        // Creating Map using map entries
        Map<Integer, String> map = Map.ofEntries(e1,e2);
        // Iterating Map
        for(Map.Entry<Integer, String> m : map.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }
    }
}
