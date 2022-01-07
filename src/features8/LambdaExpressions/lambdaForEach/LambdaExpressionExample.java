package features8.LambdaExpressions.lambdaForEach;

import java.util.ArrayList;
import java.util.List;

public class LambdaExpressionExample {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("ankit");
        list.add("mayank");
        list.add("irfan");
        list.add("jai");

        for (String a: list) {
            System.out.println(a);
        }
        System.out.println();


        list.forEach(
                (n) -> System.out.println(n)
        );
        System.out.println();



    }
}
