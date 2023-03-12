package Plantas_Pack;

import java.awt.Rectangle;
import static java.nio.file.Files.delete;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import plantasvszombie_joselobo.Main;

public class MovimientoDeGuisantes implements Runnable {

    Main main;
    JLabel jlabel;
    int fila, x, y;
    boolean isAlive;

    public MovimientoDeGuisantes(Main main, JLabel jlabel, int fila) {
        this.main = main;
        this.jlabel = jlabel;
        this.fila = fila;
        x = jlabel.getX();
        y = jlabel.getY();
    }

    public JLabel getJlabel() {
        return jlabel;
    }

    public void setJlabel(JLabel jlabel) {
        this.jlabel = jlabel;
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
        main.JP_PatioFrontal.add(jlabel);
        Rectangle Rguisante = new Rectangle(x, y, 10, 10);
        Rectangle Rzombi = new Rectangle(main.ZFilas2.get(0).x, main.ZFilas2.get(0).y, 10, 10);
        while (isAlive) {
            x++;
            jlabel.setLocation(x, y);
            Rguisante.setLocation(x, y);
            if (Rguisante.intersects(Rzombi)) {
                isAlive = false;
            }
            try {
                Thread.sleep((long) (5000 * main.multiplicador));
            } catch (InterruptedException ex) {
            }
        }
        Rguisante = null;
        jlabel = null;
    }

}
