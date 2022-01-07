package features8.FunctionalInterfaces.consumerInterface;

import java.util.function.Consumer;
public class ConsumerInterfaceExample {

    static void printMessage(String name){
        System.out.println("Hello "+name);
    }

    static void printValue(int val){
        System.out.println(val);
    }

    public static void main(String[] args) {

        // Método de encaminhamento para interface consumer tipo String
        Consumer<String> consumer1 = ConsumerInterfaceExample::printMessage;

        consumer1.accept("Bruno");
        // Chamando método consumer

        // Método de encaminhamento para interface consumer do tipo integer
        Consumer<Integer> consumer2 = ConsumerInterfaceExample::printValue;
        consumer2.accept(12);   // Chamando método consumer
    }
}
