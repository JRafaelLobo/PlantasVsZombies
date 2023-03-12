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
    int max;
    boolean isAlive;
    double multiplicador;

    public MovimientoDeGuisantes(Main main, JLabel jlabel, int max, double multiplicador) {
        this.main = main;
        this.jlabel = jlabel;
        this.max = max;
        this.multiplicador = multiplicador;
    }

    public JLabel getJlabel() {
        return jlabel;
    }

    public void setJlabel(JLabel jlabel) {
        this.jlabel = jlabel;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public boolean isIsAlive() {
        return isAlive;
    }

    public void setIsAlive(boolean isAlive) {
        this.isAlive = isAlive;
    }

    @Override
    public void run() {
        jPanelBase.add(jlabel);
        Rectangle R = new Rectangle();
        main.ZFilas1.get(0);
        while (isAlive) {
            jlabel.setLocation(jlabel.getX() + 1, jlabel.getY());
            R.setLocation(jlabel.getX(), jlabel.getY());
            if (R.intersects(R)) {
                isAlive = false;
            }
            try {
                Thread.sleep((long) (5000 * multiplicador));
            } catch (InterruptedException ex) {
                Logger.getLogger(MovimientoDeGuisantes.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        jlabel = null;
    }

}
