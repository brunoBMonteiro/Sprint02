package LambdaExpressions.lambdaNoParameter;

public class LambdaExpressionExampleNoParameter {
    public static void main(String[] args) {

        // Lambda no parameter
        Sayable s=()->{
            return "I have nothing to say.";
        };
        System.out.println(s.say());
    }
}
