package Plantas_Pack;

import java.awt.Image;
import java.awt.Toolkit;
import java.io.File;
import java.util.logging.Level;
import java.util.logging.Logger;
import plantasvszombie_joselobo.Main;

public class Zombi extends Thread {

    protected Main main;
    protected int vida = 200, dano = 20, velocidad = 250, tiempoDeAtaque, x, y;
    protected javax.swing.JLabel label;

    public Zombi() {
    }

    public Zombi(Main main, int x, int y) {
        this.x = x;
        this.y = y;
        this.main = main;
    }

    @Override
    public void run() {
        while (true) {
            x--;
            label.setLocation(x, y);
            try {
                Thread.sleep((long) (velocidad*main.multiplicador));
            } catch (InterruptedException ex) {
            }
        }

    }
}
