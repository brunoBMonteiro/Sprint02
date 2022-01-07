package features9.privateInterfaceMethods;

public class PrivateInterface implements Sayable{
    public static void main(String[] args) {

        Sayable s = new PrivateInterface();
        s.say();
    }
}
