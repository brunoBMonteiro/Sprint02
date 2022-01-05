package Features9.FlowAPI;

import java.util.List;
import java.util.concurrent.SubmissionPublisher;

// Link reference: https://dev.to/ajiteshtiwari/java-9-flow-api-4e38
/*
Java 9 API de fluxo
A API flow é o suporte oficial da Java para especificação de fluxos reativos.
É uma combinação dos padrões Iterator (Pull) e Observer (Push).

A API flow é uma especificação inter-operação e não uma API de usuário final como rxJava.

Se você é um desenvolvedor (mesmo um desatualizado :D), você certamente deve ter ouvido falar sobre fluxos reativos,
IO não bloqueando, chamadas assíncrodas, etc.
 */

public class Main {
    public static void main(String[] args) {
        List<String> items = List.of("1", "2", "3", "4", "5", "6", "7", "8", "9");
        SubmissionPublisher<String> publisher = new SubmissionPublisher<>();
        publisher.subscribe(new MySubscriber<>());

        items.forEach(s -> {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            publisher.submit(s);
        });

        publisher.close();
    }
}
