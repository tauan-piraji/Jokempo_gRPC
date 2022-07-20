package servidor;

import com.proto.conversor.APIRequest;
import com.proto.conversor.APIResponse;
import com.proto.conversor.APIserviceGrpc;
import io.grpc.stub.StreamObserver;

public class gameImpl extends APIserviceGrpc.APIserviceImplBase {

    @Override
    public void match(APIRequest request, StreamObserver<APIResponse> responseObserver) {
        //simula jogador
        String Y = "";
        double x = 0;
        x = Math.random();
        if(x < 0.4) {
            Y = "Pedra";
        }else if(x < 0.7) {
            Y = "Tesoura";
        }else{
            Y = "papel";
        }

        // faz a conversão por meio da API utilizando os valores que vem da requisição
        ProcessaGame game = new ProcessaGame(request.getMao(), Y);

        //cria a resposta da requisição
        APIResponse response = APIResponse.newBuilder().setResponse(game.play(game)).build();

        /////envia a resposta e completa a execução
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

}
