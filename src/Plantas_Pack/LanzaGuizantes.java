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

    javax.swing.JLabel lanzaguisante;
    Rectangle R;
    boolean test;


    public LanzaGuizantes(int x, int y, int fila, Main main) {
        super(x, y, fila, main);
        lanzaguisante = new javax.swing.JLabel();
        try {
            File archivo = new File("./GameImage\\lanzaguisantes.gif");
            Image img = Toolkit.getDefaultToolkit().createImage(
                    archivo.getPath()).getScaledInstance(70, 70, 0);
            lanzaguisante.setIcon(new javax.swing.ImageIcon(img));
        } catch (Exception e) {
            System.out.println("No encontro Imagen Lanzaguisantes");
        }
        lanzaguisante.setLocation(x, y);
        main.JP_PatioFrontal.add(lanzaguisante, new org.netbeans.lib.awtextra.AbsoluteConstraints(x, y, -1, -1));//aqui el error
        lanzaguisante.setText(" ");
        lanzaguisante.setOpaque(false);

    }

    @Override
    public void Attack() {
        Guizante M = new Guizante(main, fila, x + 10, y);
        M.start();
    }

    @Override
    public void run() {
    }
}
