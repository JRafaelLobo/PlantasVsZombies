package Plantas_Pack;

import java.awt.Image;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.io.File;
import java.util.logging.Level;
import java.util.logging.Logger;
import plantasvszombie_joselobo.Main;
import plantasvszombie_joselobo.Partida;

public class Zombi extends Thread {

    protected Main main;
    protected Partida partida;
    protected int vida = 200, dano = 20, velocidad = 220, tiempoDeAtaque, x, y, fila;
    protected javax.swing.JLabel label;
    protected Rectangle Rzombihitbox;

    public Zombi() {
    }

    public Zombi(Main main, Partida partida, int x, int y, int fila) {
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
    }

    @Override
    public String toString() {
        return "Zombi{" + "vida=" + vida + ", x=" + x + ", y=" + y + '}';
    }

    @Override
    public void run() {
        System.out.println("NO");
    }
}
