package Plantas_Pack;

import Hilos.ParpadeoDeLabels;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.File;
import plantasvszombie_joselobo.Main;
import plantasvszombie_joselobo.Partida;

/**
 *
 * @author rinal
 */
public class Nuez extends Planta {

    javax.swing.JLabel nuez;

    public Nuez(int x, int y, int fila, Main main, Partida partida) {
        super(x, y, fila, main, partida);
        vida = 4000;
        build();
    }

    @Override
    public void build() {
        nuez = new javax.swing.JLabel();
        try {
            File archivo = new File("./GameImage\\Nuez.png");
            Image img = Toolkit.getDefaultToolkit().createImage(
                    archivo.getPath()).getScaledInstance(55, 55, 0);
            nuez.setIcon(new javax.swing.ImageIcon(img));
        } catch (Exception e) {
            System.out.println("No encontro Imagen Nuez");
        }
        nuez.setOpaque(false);
        nuez.setLocation(x, y);
        main.JP_PatioFrontal.add(nuez, new org.netbeans.lib.awtextra.AbsoluteConstraints(x, y, -1, -1));
        nuez.setText(" ");
    }

    public void Parpadear() {
        if (vida > 0) {
            ParpadeoDeLabels a = new ParpadeoDeLabels(nuez, 1, 4000, 50);
            a.start();
        } else {
            RPlantaHitbox = null;
            ParpadeoDeLabels a = new ParpadeoDeLabels(nuez, 1, 0, 50, true, true);
            a.start();

        }
    }

    @Override
    public void run() {
        //aqui ultima modificacion haciendo una referencia
        /*while (vida > 0) {
            try {
                Thread.sleep((long) (20000 * main.multiplicador));
            } catch (InterruptedException ex) {
            }
        }
        nuez.setVisible(false);
        RPlantaHitbox = null;
        nuez = null;*/
    }//run

}
