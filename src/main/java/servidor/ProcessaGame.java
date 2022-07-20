package servidor;

public class ProcessaGame {
    private String maoJogador1;
    private String maoJogador2;

    public ProcessaGame(String maoJogador1, String maoJogador2) {
        this.maoJogador1 = maoJogador1;
        this.maoJogador2 = maoJogador2;
    }

    public String getMaoJogador1() {
        return maoJogador1;
    }

    public void setMaoJogador1(String maoJogador1) {
        this.maoJogador1 = maoJogador1;
    }

    public String getMaoJogador2() {
        return maoJogador2;
    }

    public void setMaoJogador2(String maoJogador2) {
        this.maoJogador2 = maoJogador2;
    }

    public String play(ProcessaGame processaGame) {
        int winner = 0;
        if(processaGame.getMaoJogador1().equalsIgnoreCase("Pedra")) {
            if(processaGame.getMaoJogador2().equalsIgnoreCase("Pedra")) {
                winner = 0;
            }else if(processaGame.getMaoJogador2().equalsIgnoreCase("Papel")) {
                winner = 2;
            }else{
                winner = 1;
            }
        }else if(processaGame.getMaoJogador1().equalsIgnoreCase("Papel")) {
            if(processaGame.getMaoJogador2().equalsIgnoreCase("Pedra")) {
                winner = 1;
            }else if(processaGame.getMaoJogador2().equalsIgnoreCase("papel")) {
                winner = 0;
            }else{
                winner = 2;
            }
        }else{
            if(processaGame.getMaoJogador2().equalsIgnoreCase("Pedra")) {
                winner = 2;
            }else if(processaGame.getMaoJogador2().equalsIgnoreCase("papel")) {
                winner = 1;
            }else{
                winner = 0;
            }
        }
        if(winner == 1) {
            return "win";
        }else if(winner == 2) {
            return "lost";
        }else{
            return "deadlock";
        }
    }
}
