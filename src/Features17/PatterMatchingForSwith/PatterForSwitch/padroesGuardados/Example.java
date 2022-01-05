package Features17.PatterMatchingForSwith.PatterForSwitch.padroesGuardados;

// Não suporta por que uso o java 11

public class Example {
    public static void main(String[] args) {

    /*
    static double getDoubleValueUsingIf(Object o) {
    return switch (o) {
        case String s -> {
            if (s.length() > 0) {
                yield Double.parseDouble(s);
            } else {
                yield 0d;
            }
        }
        default -> 0d;
    };
}
     */
      // resolver o mesmo problema usando padrões protegidos, usa-se uma combinação de um
        // padrão e uma expressão booleana:
        /*
        static double getDoubleValueUsingGuardedPatterns(Object o) {
    return switch (o) {
        case String s && s.length() > 0 -> Double.parseDouble(s);
        default -> 0d;
    };
}
         */

    }
}
