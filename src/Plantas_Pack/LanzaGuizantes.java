package Plantas_Pack;

import java.awt.Image;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import plantasvszombie_joselobo.Main;

/**
 *
 * @author rinal
 */
public class LanzaGuizantes extends Planta {

    javax.swing.JLabel guisante;
    Rectangle R;
    boolean test;
    int vida = 100;
    Main main;

    public LanzaGuizantes(int x, int y, int fila, Main main) {
        super(x, y, fila, main);
    }

    @Override
    public void Attack() {
        File archivo = new File("./GameImage\\guisante.png");
        Image img = Toolkit.getDefaultToolkit().createImage(
                archivo.getPath()).getScaledInstance(100, 100, 0);
        guisante = new javax.swing.JLabel();
        guisante.setIcon(new javax.swing.ImageIcon(img));
        x = -10;
        guisante.setLocation(x, y);
        MovimientoDeGuisantes M = new MovimientoDeGuisantes(main, guisante, 100);
        Thread T = new Thread(M);
        T.start();
    }

    @Override
    public void run() {
    }
}
