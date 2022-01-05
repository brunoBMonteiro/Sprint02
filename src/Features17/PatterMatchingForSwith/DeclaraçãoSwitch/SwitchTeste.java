package Features17.PatterMatchingForSwith.DeclaraçãoSwitch;

// Não suporta por que uso o java 11

public class SwitchTeste {
    public static void main(String[] args) {

        final String b = "B";
        switch (args[0]) {
            case "A" -> System.out.println("Parameter is A");
            case b -> System.out.println("Parameter is b");
            default -> System.out.println("Parameter is unknown");
        };
        // Em nosso exemplo, se a variável B não fosse final,
        // o compilador lançaria uma expressão constante exigida de erro.
    }
}
