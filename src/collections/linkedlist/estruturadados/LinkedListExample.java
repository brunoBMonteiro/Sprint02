package collections.linkedlist.estruturadados;

import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {
    public static void main(String[] args) {

        //Creating list of Books
        // Pode ser usada como Lista, Pilha, Fila.
        List<Book> list = new LinkedList<Book>();


        //Creating Books
        Book b1=new Book(101,"Let us C","Yashwant Kanetkar");
        Book b2=new Book(102,"Data Communications & Networking","Forouzan");
        Book b3=new Book(103,"Operating System","Galvin");
        Book b4 = new Book(105, "teste", "testando");

        //Adding Books to list
        list.add(b1);
        list.add(b2);
        list.add(b3);
        list.add(b4);

        //removendo por indice
        list.remove(3);

        //Traversing list
        for(Book b:list){
            System.out.println(b.id+" "+b.name+" "+b.author);
        }
    }
}