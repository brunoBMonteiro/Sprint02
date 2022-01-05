package Features17.PatterMatchingForSwith.PatterForSwitch.padroesDeTipo;

// Não suporta por que uso o java 11

public class Example {
    public static void main(String[] args) {
        // Sem os padrões de tipo
        /*
        static double getDoubleUsingIf(Object o) {
            double result;
            if (o instanceof Integer) {
                result = ((Integer) o).doubleValue();
            } else if (o instanceof Float) {
                result = ((Float) o).doubleValue();
            } else if (o instanceof String) {
                result = Double.parseDouble(((String) o));
            } else {
                result = 0d;
            }
            return result;
        }

         */
        // resolvendo o mesmo problema com menos código usando padrões de tipo no switch:
        /*
        static double getDoubleUsingSwitch(Object o) {
    return switch (o) {
        case Integer i -> i.doubleValue();
        case Float f -> f.doubleValue();
        case String s -> Double.parseDouble(s);
        default -> 0d;
    };
}
         */
    }
}
