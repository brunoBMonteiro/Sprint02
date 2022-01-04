package Features9.privateInterfaceMethods;

public interface Sayable {

    default void say() {
        saySomething(); // chamando método privado
        sayPolitely(); // Chamando private static method
        sayHello(); // Chamando método default
    }
    // Método privado dentro da interface
    private void saySomething() {
        System.out.println("Hello... I'm private method");
    }

    // Método privado dentro da interface
    // Métodos static e default na interface foi add no java 8
    private static void sayPolitely(){
        System.out.println("I'm private static method");
    }

    default void sayHello(){
        System.out.println("Hello default method");
    }
}