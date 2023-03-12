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

    @Override
    public void Attack() {
        R = new Rectangle();
        File archivo = new File("./GameImage\\guisante.png");
        Image img = Toolkit.getDefaultToolkit().createImage(
                archivo.getPath()).getScaledInstance(100, 100, 0);
        guisante = new javax.swing.JLabel();
        guisante.setIcon(new javax.swing.ImageIcon(img));
        guisante.setLocation(x + 10, y + 10);
        MovimientoDeGuisantes M = new MovimientoDeGuisantes(main, guisante, 100, multiplicador);
        Thread T = new Thread(M);
        T.start();
    }

    @Override
    public void run() {
    }
}
