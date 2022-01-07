package features8.FunctionalInterfaces.functionInterface;

import java.util.function.Function;

public class FunctionInterfaceExample {

    static String show(String message){
        return "Hello "+ message;
    }
    public static void main(String[] args) {
        // Função interface que refere ao método
        Function<String, String> fun = FunctionInterfaceExample::show;
        // Chamando a função do método interface
        System.out.println(fun.apply("Bruno"));
    }
}
