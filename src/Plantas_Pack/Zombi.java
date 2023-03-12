package Plantas_Pack;

import java.awt.Image;
import java.awt.Toolkit;
import java.io.File;
import java.util.logging.Level;
import java.util.logging.Logger;
import plantasvszombie_joselobo.Main;

public class Zombi implements Runnable {
    
    protected Main main;
    protected int vida = 200, dano = 20, tiempoDeAtaque, x, y;
    javax.swing.JLabel label;
    
    public Zombi() {
    }
    
    public Zombi(Main main, int x, int y) {
        this.x = x;
        this.y = y;
        File archivo = new File("./GameImage\\ZombiNormal.gif");
        Image img = Toolkit.getDefaultToolkit().createImage(
                archivo.getPath()).getScaledInstance(100, 100, 0);
        label = new javax.swing.JLabel();
        label.setIcon(new javax.swing.ImageIcon(img));
        main.JP_PatioFrontal.add(label);
        this.main = main;
        this.x = x;
        this.y = y;
    }
    
    @Override
    public void run() {
        while (true) {
            x--;
            label.setLocation(x, y);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
            }
        }
        
    }
}
