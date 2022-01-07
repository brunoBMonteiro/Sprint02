package features8.LambdaExpressions.multipleParameter;

public class LambdaExpressionExample {
    public static void main(String[] args) {

        // Multiple parameters in lambda expression
        Addable ad1 = (a,b,c) -> ((a+b) / c);
        System.out.println(ad1.add(10,20, 2));

        // Multiple parameters with data type in lambda expression
        Addable ad2 = (int a,int b, int c) -> ((a+b) / c);
        System.out.println(ad2.add(100,200, 2));
    }
}
