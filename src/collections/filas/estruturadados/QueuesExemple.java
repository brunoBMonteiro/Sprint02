package collections.filas.estruturadados;

import java.util.LinkedList;
import java.util.Queue;

public class QueuesExemple {
    public static void main(String[] args) {

        // não posso instanciar uma interface, mas posso
        // intanciar uma classe de subtipo de interface
        // ex: LinkedList, lista encadeada


        // somente os métodos disponiveis na Queue ficaram
        // disponiveis para gente chamar

        // FIFO- First in, First out - Primeiro entrar, primeiro a sair
        Queue<Integer> fila = new LinkedList<Integer>();

        fila.add(1);
        fila.add(2);
        fila.add(3);
        fila.add(4);
        fila.add(5);
        System.out.println(fila);

        // Primeiro entrar, primeiro a sair
        fila.remove();
        System.out.println(fila);

        
    }
}
