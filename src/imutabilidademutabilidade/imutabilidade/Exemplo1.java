package imutabilidade;

public class Exemplo1 {
        public static void main(String[] args) {

            String str1 = new String("john");
            String str2 = str1 ;
            System.out.println(str1.hashCode());
            System.out.println(str2.hashCode());

            str2 = "monk";
            System.out.println(str2.hashCode());
            str2 = "john";
            System.out.println(str2.hashCode());


            System.out.println("-------------------------------");

            // A classe string buffer é segura para threads, varios seguimentos não podem acessá-la diretamente
            StringBuffer sb = new StringBuffer("mohan");
            StringBuffer sb1 = sb.append("kumar");
            System.out.println(sb.hashCode());
            System.out.println(sb1.hashCode()+"- "+(sb1==sb)+" -"+sb.hashCode());


            String s = "Sachin" ;
            s.concat ( "Tendulkar" ); // método concat () anexa a string no final
            System.out.println (s); // imprimirá Sachin porque strings são objetos imutáveis
        }

}

// os objetos imutáveis  não podem ser alterados para seu valor ou estado, uma vez que são criados.
// No caso de objetos imutáveis, sempre que alterarmos o estado do objeto, um novo objeto será criado.
// os objetos imutáveis  não fornecem nenhum método para alterar os valores.
// os objetos imutáveis  são thread-safe por padrão. Ou seja uma vez contruido outra Thread não pode alterá-lo
// considerando que os objetos imutáveis  são classes legadas, classes wrapper, classe String, etc.