package Plantas_Pack;

import java.util.logging.Level;
import java.util.logging.Logger;
import plantasvszombie_joselobo.Main;
import plantasvszombie_joselobo.Partida;

public class CoordenadasPlanta {

    private Main main;
    private int x, y, fila;
    private Partida partida;
    private Planta planta;

    public CoordenadasPlanta(Main main, int x, int y, int fila, Partida partida) {
        this.main = main;
        this.x = x;
        this.y = y;
        this.partida = partida;
        this.fila = fila;
    }

    public Main getMain() {
        return main;
    }

    public void setMain(Main main) {
        this.main = main;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Partida getPartida() {
        return partida;
    }

    public void setPartida(Partida partida) {
        this.partida = partida;
    }

    public Planta getPlanta() {
        return planta;
    }

    public void setPlanta(Planta planta) {
        this.planta = planta;
    }

    public void CreateGirasol() {
        this.planta = new Girasol(x, y, fila, main, partida);
        this.planta.start();
    }

    public void CreateLanzaguisante() {
        this.planta = new LanzaGuizantes(x, y, fila, main, partida);
        this.planta.start();
    }

}
