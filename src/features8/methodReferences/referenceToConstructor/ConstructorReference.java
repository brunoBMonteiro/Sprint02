package features8.methodReferences.referenceToConstructor;


public class ConstructorReference {
        public static void main(String[] args) {

            Messageable hello = Message::new;
            hello.getMessage("Hello");

        }

    }

