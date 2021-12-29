package collectios.linkedlist.estruturadados;

import java.util.LinkedList;
import java.util.List;

public class Book {
    int id;
    String name,author;

    public Book(int id, String name, String author) {
        this.id = id;
        this.name = name;
        this.author = author;

    }
}

class LinkedListExample {
    public static void main(String[] args) {

        //Creating list of Books
        // Pode ser usada como Lista, Pilha, Fila.
        List<Book> list = new LinkedList<Book>();
        //Creating Books
        Book b1=new Book(101,"Let us C","Yashwant Kanetkar");
        Book b2=new Book(102,"Data Communications & Networking","Forouzan");
        Book b3=new Book(103,"Operating System","Galvin");

        //Adding Books to list
        list.add(b1);
        list.add(b2);
        list.add(b3);

        //Traversing list
        for(Book b:list){
            System.out.println(b.id+" "+b.name+" "+b.author);
        }
    }
}
