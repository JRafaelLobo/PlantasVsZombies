package Plantas_Pack;

import Hilos.ParpadeoDeLabels;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.File;
import java.util.ArrayList;
import plantasvszombie_joselobo.Main;
import plantasvszombie_joselobo.Partida;

/**
 *
 * @author rinal
 */
public class Girasol extends Planta {

    javax.swing.JLabel girasol;

    public Girasol(int x, int y, int fila, Main main, Partida partida) {
        super(x, y, fila, main, partida);
        build();
    }

    @Override
    public void build() {
        girasol = new javax.swing.JLabel();
        try {
            File archivo = new File("./GameImage\\sunflower.gif");
            Image img = Toolkit.getDefaultToolkit().createImage(
                    archivo.getPath()).getScaledInstance(55, 55, 0);
            girasol.setIcon(new javax.swing.ImageIcon(img));
        } catch (Exception e) {
            System.out.println("No encontro Imagen girasol");
        }
        girasol.setOpaque(false);
        girasol.setLocation(x, y);
        main.JP_PatioFrontal.add(girasol, new org.netbeans.lib.awtextra.AbsoluteConstraints(x, y, -1, -1));
        girasol.setText(" ");
    }

    public void Producir() {
        partida.soles.add(new Sol(x, y, main, partida, true));
        partida.soles.get(partida.soles.size() - 1).start();
    }

    public void Parpadear() {
        ParpadeoDeLabels a = new ParpadeoDeLabels(girasol, 1, 4000, 50);
        a.start();
    }

    @Override
    public void run() {
        //aqui ultima modificacion haciendo una referencia
        while (vida > 0) {
            try {
                Thread.sleep((long) (20000 * main.multiplicador));
            } catch (InterruptedException ex) {
            }
            Producir();

        }
        girasol.setVisible(false);
        RPlantaHitbox = null;
        girasol = null;
    }//run

}
