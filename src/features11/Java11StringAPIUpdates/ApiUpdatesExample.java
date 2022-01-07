package features11.Java11StringAPIUpdates;

// Novos métodos String
public class ApiUpdatesExample {
    public static void main(String[] args) {
        System.out.println("==========String#repeat=========");
        // String#repeat
        //permite concatenar uma string consigo mesma um determinado número de vezes:
        int s = 1;
        for (int i = 4; i >= 0; i--){
            System.out.println(" ".repeat(i));
            System.out.println("*".repeat(s));
            s+=2;
        }
        String name = "Java devil edition";
        System.out.println(name.repeat(2));
        System.out.println();

        System.out.println("==========String#strip=========");
        // String#strip
        // livrar de todos os espaços brancos
        String hello = " hello ";
        System.out.println(hello.strip());
        System.out.println(hello.stripLeading());
        System.out.println(hello.stripTrailing());
        System.out.println();

        System.out.println("==========String#isBlank=========");
        //verificar se uma instância string está vazia ou contém espaço branco
        String nuBank = " ";
        System.out.println(nuBank.isBlank());  // true
        System.out.println();

        System.out.println("==========String#isEmpty=========");
        System.out.println(nuBank.isEmpty());  // false
        System.out.println();

        System.out.println("==========String#lines=========");
        //Usando este novo método, podemos facilmente dividir uma instância
        // string em um Fluxo<String> de linhas separadas:
        nuBank = "Tem dinheiro\nna conta";
        nuBank.lines().forEach(System.out::println);
    }

}
