package LambdaExpressions.exemploComESemLambdaExpression;

public class LambdaExpressionExample {
    public static void main(String[] args) {
        int width=10;

        /*
        // Sem lambda, implementação Drawable usando classe anônima
        Drawable d = new Drawable(){
            public void draw(){
                System.out.println("Drawing " + width);
            }
        };
        d.draw();
         */

        //with lambda
        Drawable d=()->{
            System.out.println("Drawing " + width);
        };
        d.draw();
    }
}
