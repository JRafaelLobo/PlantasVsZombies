package Plantas_Pack;

import java.awt.Image;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.io.File;
import static java.nio.file.Files.delete;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import plantasvszombie_joselobo.Main;

public class Guizante extends Thread {

    Main main;
    JLabel guisante;
    int fila, x, y;
    boolean isAlive = true;

    public Guizante(Main main, int fila, int x, int y) {
        this.main = main;
        this.fila = fila;
        guisante = new javax.swing.JLabel();
        try {
            File archivo = new File("./GameImage\\guisante.png");
            Image img = Toolkit.getDefaultToolkit().createImage(
                    archivo.getPath()).getScaledInstance(10, 10, 0);
            guisante.setIcon(new javax.swing.ImageIcon(img));
        } catch (Exception e) {
        }
        x += 10;
        guisante.setLocation(x, y);
        main.JP_PatioFrontal.add(guisante, new org.netbeans.lib.awtextra.AbsoluteConstraints(x, y, -1, -1));//aqui el error
        guisante.setText(" ");
        guisante.setOpaque(false);

    }

    public Main getMain() {
        return main;
    }

    public void setMain(Main main) {
        this.main = main;
    }

    public int getFila() {
        return fila;
    }

    public void setFila(int fila) {
        this.fila = fila;
    }

    public boolean isIsAlive() {
        return isAlive;
    }

    public void setIsAlive(boolean isAlive) {
        this.isAlive = isAlive;
    }

    @Override
    public void run() {
        Rectangle Rguisante = new Rectangle(x, y, 10, 10);
        while (isAlive) {
            x++;
            guisante.setLocation(x, y);
            Rguisante.setLocation(x, y);
            if (Rguisante.intersects(main.ZFilas2.get(0).Rzombihitbox)) {
                isAlive = false;
            }
            try {
                Thread.sleep((long) (100 * main.multiplicador));
            } catch (InterruptedException ex) {
            }
        }
        Rguisante = null;
        guisante = null;
    }

}
