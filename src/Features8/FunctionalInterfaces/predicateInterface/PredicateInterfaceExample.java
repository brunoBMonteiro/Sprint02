package Features8.FunctionalInterfaces.predicateInterface;

import java.util.function.Predicate;

public class PredicateInterfaceExample {
    static Boolean checkAge(int age){
        if(age>17) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args){
        // Usando a interface predicada
        // expressões que referenciam métodos ::
        // Adicionado no java 8
        Predicate<Integer> predicate =  PredicateInterfaceExample::checkAge;
        // chamando método predicado
        boolean result = predicate.test(25);
        System.out.println(result);
    }
}
