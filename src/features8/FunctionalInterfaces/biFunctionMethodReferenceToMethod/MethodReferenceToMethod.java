package features8.FunctionalInterfaces.biFunctionMethodReferenceToMethod;

import java.util.function.BiFunction;

public class MethodReferenceToMethod {
    public static void main(String[] args) {

        // referenciando ao método add
        BiFunction<Integer, Integer, Integer> adder1 = Arithmetic::add;
        // referenciando ao método add
        BiFunction<Integer, Float, Float>adder2 = Arithmetic::add;
        // referenciando ao método add
        BiFunction<Float, Float, Float>adder3 = Arithmetic::add;


        int result1 = adder1.apply(10, 20);
        float result2 = adder2.apply(10, 20.0f);
        float result3 = adder3.apply(10.0f, 20.0f);

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
    }

}
