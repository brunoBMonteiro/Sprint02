package mutabilidade;

public class Exemplo1 {
    private String s;

    Exemplo1(String s) {
        this.s = s;
    }
    public String getName() {
        return s;
    }
    public void setName(String coursename) {
        this.s = coursename;
    }

    public static void main(String[] args) {
        Exemplo1 obj = new Exemplo1("JavaScript");
        System.out.println(obj.getName());


// Aqui, podemos atualizar o nome usando o método setName.
        obj.setName("Java");
        System.out.println(obj.getName());
    }

    // Métodos para modificar os valores dos campos
    // Getters e Setters dos objetos
}

// Os objetos mutáveis  podem ser alterados para qualquer valor ou estado sem adicionar um novo objeto.
// Objetos mutáveis  fornecem um método para alterar o conteúdo do objeto.
// Os objetos mutáveis  suportam os setters e getters.
// Os objetos Mutable podem ou não ser thread-safe.
// Os exemplos de classes mutáveis  são StringBuffer, Java.util.Date, StringBuilder, etc.