package servidor;

import io.grpc.Server;
import io.grpc.ServerBuilder;

import java.io.IOException;

public class Servidor {
    public static void main(String[] args) throws IOException, InterruptedException {

        //INICIA SERVIDOR
        System.out.println("Iniciando servidor gRPC...");
        Server server = ServerBuilder.forPort(9001)
                .addService(new gameImpl())
                .build();
        server.start();
        System.out.println("Servidor iniciado com sucesso");

        //ENCERRA SERVIDOR
        Runtime.getRuntime().addShutdownHook(new Thread(()-> {
            System.out.println("Encerrando servidor...");
            server.shutdown();
            System.out.println("Servidor encerrado");
        }));

        server.awaitTermination();

    }
}
