package Plantas_Pack;

import Hilos.ParpadeoDeLabels;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.io.File;
import java.util.logging.Level;
import java.util.logging.Logger;
import plantasvszombie_joselobo.AdministracionDeRecursos;
import plantasvszombie_joselobo.Main;
import plantasvszombie_joselobo.Partida;

public class Zombi extends Thread {

    protected AdministracionDeRecursos main;
    protected Partida partida;
    protected int vida = 200, dano = 20, velocidad = 120, tiempoDeAtaque = 1000, x, y, fila;
    protected javax.swing.JLabel label;
    protected Rectangle Rzombihitbox;
    protected boolean pause = false;

    public Zombi() {
    }

    public Zombi(AdministracionDeRecursos main, Partida partida, int x, int y, int fila) {
        this.partida = partida;
        this.x = x;
        this.y = y;
        this.main = main;
        this.fila = fila;
        Rzombihitbox = new Rectangle(x, y, 70, 70);
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public void recucirVida(int vida) {
        this.vida = this.vida - vida;
        if (this.vida > 0) {
            Parpadear();
        } else {
            label.setVisible(false);
            Rzombihitbox = null;
            //partida.getfilaZombis(fila).remove(this);
        }
        // if (partida.getfilaZombis(fila).get(0) != null) {
        // int numeliminar = partida.getfilaZombis(fila).indexOf(this);

        //partida.getfilaZombis(fila).set(numeliminar, null);
        //partida.getfilaZombis(fila).remove(numeliminar);
    }

    @Override
    public String toString() {
        return "Zombi{" + "vida=" + vida + ", x=" + x + ", y=" + y + '}';
    }

    @Override
    public void run() {
        System.out.println("NO");
    }

    public void Parpadear() {

    }

    public int getX() {
        return x;
    }

    public boolean isPause() {
        return pause;
    }

    public void setPause(boolean pause) {
        this.pause = pause;
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

}
