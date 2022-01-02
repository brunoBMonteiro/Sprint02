package Features8.optional;

/*
public class OptionalExample {
    // Sem Optional class, acontece a NullPointerException
        public static void main(String[] args) {
            String[] str = new String[10];
            String lowercaseString = str[5].toLowerCase();
            System.out.print(lowercaseString);
        }
     */
//Exemplo opcional Java: Se o valor não estiver presente

import java.util.Optional;

public class OptionalExample {
        public static void main(String[] args) {
            String[] str = new String[10];
            // Adicionando string na posição 5 para verificar
            //str[5] = "Java Devil Edition!";

            // Retorna nada
            //Optional<String> checkNull = Optional.empty();

            // verificando se é nulo
            Optional<String> checkNull = Optional.ofNullable(str[5]);

            // verificando se o valor está presente ou não
            if(checkNull.isPresent()){
                String lowercaseString = str[5].toUpperCase();
                System.out.print(lowercaseString);
            }else {
                System.out.println("string value is not present");
            }

            // Get consigo pegar o valor de dentro
            System.out.println();
            //System.out.println(checkNull.get());

        }


}



