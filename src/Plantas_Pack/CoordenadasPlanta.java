package Plantas_Pack;

import java.util.logging.Level;
import java.util.logging.Logger;
import plantasvszombie_joselobo.AdministracionDeRecursos;
import plantasvszombie_joselobo.Main;
import plantasvszombie_joselobo.Partida;

public class CoordenadasPlanta {

    private transient AdministracionDeRecursos main;
    private int x, y, fila;
    private Partida partida;
    private Planta planta;

    public CoordenadasPlanta(AdministracionDeRecursos main, int x, int y, int fila, Partida partida) {
        this.main = main;
        this.x = x;
        this.y = y;
        this.partida = partida;
        this.fila = fila;
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

    public void CreateNuez() {
        this.planta = new Nuez(x, y, fila, main, partida);
    }

    public void CreatePetaCereza() {
        this.planta = new PetaCereza(x, y, fila, main, partida);
        this.planta.start();
    }

    public void stop() {
        if (planta != null) {
            if (planta.isAlive()) {
                this.planta.Para();
            }
        }
    }

    public void resume() {
        if (planta != null) {
            this.planta.Continua();
        }
    }

    public void DeletePlant() {
        //;
        try {
            this.planta.deletPlantita();
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            this.planta.setInvisible();
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            // this.planta.stop();
        } catch (Exception e) {
            e.printStackTrace();
        }
        this.planta = null;
    }

    public void remover() {
        this.planta.reducirVida(99999);
        this.planta = null;
    }

}
