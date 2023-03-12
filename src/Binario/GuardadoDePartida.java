package Binario;

import java.io.Serializable;
import plantasvszombie_joselobo.Partida;

public class GuardadoDePartida implements Serializable {

    Partida P;

    public GuardadoDePartida() {
    }

    public GuardadoDePartida(Partida P) {
        this.P = P;
    }

    public Partida getP() {
        return P;
    }

    public void setP(Partida P) {
        this.P = P;
    }

}
