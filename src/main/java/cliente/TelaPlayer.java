package cliente;

import com.proto.conversor.APIRequest;
import com.proto.conversor.APIResponse;
import com.proto.conversor.APIserviceGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class TelaPlayer extends JFrame {
    private JLabel labelTitulo;
    private JLabel winner;
    private JComboBox<String> mao;
    private JButton btnPlay;

    public TelaPlayer() {
        this.setSize(300, 200);
        setResizable(false);
        setTitle("Jokenpô");
        setLayout(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        iniciaComponentes();

    }

    public void iniciaComponentes() {
        labelTitulo = new JLabel();
        labelTitulo.setFont(new Font("Tahoma", 0, 18));
        labelTitulo.setHorizontalAlignment(SwingConstants.CENTER);
        labelTitulo.setText("Jokenpô");
        labelTitulo.setBounds(0, 0, 300, 30);
        getContentPane().add(labelTitulo);

        mao = new JComboBox<String>();
        mao.setBounds(30, 50, 100, 25);
        mao.setModel(new DefaultComboBoxModel<>(new String[] { "Pedra", "Papel", "Tesoura"}));
        getContentPane().add(mao);

        btnPlay = new JButton();
        btnPlay.setText("PLAY");
        btnPlay.setBounds(150, 50, 125, 25);
        btnPlay.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {

                //criando canal de transporte
                ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 9001)
                        .usePlaintext()
                        .build();

                //criando cliente
                APIserviceGrpc.APIserviceBlockingStub stub = APIserviceGrpc.newBlockingStub(channel);

                //Paramentros da request
                APIRequest request = APIRequest.newBuilder().setMao(String.valueOf(mao)).build();

                //Pega response
                APIResponse response = stub.match(request);
                winner.setText(response.getResponse());

                //fecha o canal
                channel.shutdown();
            }
        });
        getContentPane().add(btnPlay);

        winner = new JLabel();
        winner.setText("");
        winner.setBounds(130, 90, 100, 25);
        winner.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(winner);
    }

}