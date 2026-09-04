import com.sun.net.httpserver.HttpServer;
import com.sun.net.httpserver.HttpExchange;
import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;

public class Main {
    public static void main(String[] args) throws IOException {
        HttpServer server = HttpServer.create(new InetSocketAddress(8080), 0);

        server.createContext("/", (exchange) -> {
            String response = """
                <html>
                <head><title>Java Hello World</title></head>
                <body>
                    <h1>Hello World from Java!</h1>
                    <p>This application is running inside a Docker container.</p>
                </body>
                </html>
                """;

            exchange.sendResponseHeaders(200, response.getBytes().length);

            try (OutputStream output = exchange.getResponseBody()) {
                output.write(response.getBytes());
            }
        });

        server.start();
        System.out.println("Java server running on port 8080");
    }
}
