package features11.NewHTTPClient.example1;

// Doc reference: https://docs.oracle.com/en/java/javase/11/docs/api/java.net.http/java/net/http/HttpClient.html

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpClient.Redirect;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.time.Duration;

public class ClientHttp {

    public static void main(String[] args) throws IOException, InterruptedException {

        // Requisição
        HttpRequest request = HttpRequest.newBuilder()
                // Métodos Http
                // POST
                // PUT
                .GET()
                // Não posso passar o delete, sem permissão
                //.DELETE()

//                 Usando o URI.create para passar a URL
                // url para testar o timeout, que não vai ter resposta
//                .uri(URI.create("https://cat-fact.herokuapp.com/facts/"))
//                .uri(URI.create("https://www.getpostman.com"))
 //               .uri(URI.create("https://postman-echo.com/delete"))
                .uri(URI.create("https://apichallenges.herokuapp.com/todos"))
//                .uri(URI.create("https://xkcd.com/info.0.json"))

                // Indicando que quero receber JSON
                .headers("Accept", "application/json")
                // Indicando que quero receber XMl Mas depende da aolicação aceitar o formato
//                .headers("Accept", "application/xml", "chave", "valor", "chave", "valor")
                // Chama apenas um, headers no plural chama vários
//                .header(null, null)

                // Se não receber a resposta ele executa o timeout
                .timeout(Duration.ofSeconds(3))
                .build();

//         Executa a requisição
        HttpClient httpClient = HttpClient.newBuilder()
//                Qualquer chamada http deve ter um time out, caso a consulta não seja encontrada
//                timeout encerra a requisição
//               // Duration classe inmplementada no java 8
                // Se não estabeler a conexão ele executa o timeout
                .connectTimeout(Duration.ofSeconds(3))
                .followRedirects(Redirect.NORMAL)
                .build();

//         Response - resposta do que ta sendo retornado
        HttpResponse<String> response = httpClient.send(request, BodyHandlers.ofString());

//         Na resposta consigo pegar algumas informações
//         Retorna um JSON de um site de figurinhas
        System.out.println(response.body());
        System.out.println(response.statusCode());
        System.out.println(response.headers());
        System.out.println(response.version());

    }

}