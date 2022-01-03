package Features8.methodReference;

public class MethodReferenceExample {

    public static void saySomething(){
        System.out.println("Hello, this is static method.");
    }

    public static void ThreadStatus(){
        System.out.println("Thread is running...");
    }

    public static void main(String[] args) {

        // Refere-se ao método estático
        Sayable sayable = MethodReferenceExample::saySomething;
        // Chamando o método interface
        sayable.say();

        // Usando a interface funcional Runnable para consultar o método estático
        Thread t1 = new Thread(MethodReferenceExample::ThreadStatus);
        t1.start();


    }

}

