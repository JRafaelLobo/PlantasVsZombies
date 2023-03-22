package Plantas_Pack;

import Hilos.ParpadeoDeLabels;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.File;
import java.io.Serializable;
import javax.swing.SwingUtilities;
import plantasvszombie_joselobo.AdministracionDeRecursos;
import plantasvszombie_joselobo.Main;
import plantasvszombie_joselobo.Partida;

/**
 *
 * @author rinal
 */
public class Nuez extends Planta implements Serializable {

    javax.swing.JLabel nuez;

    public Nuez(int x, int y, int fila, AdministracionDeRecursos main, Partida partida) {
        super(x, y, fila, main, partida);
        vida = 1400;
        tiempoRecarga = 2000;
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
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                main.PanelControl_Plantas.add(nuez, new org.netbeans.lib.awtextra.AbsoluteConstraints(x, y, -1, -1));
            }
        });
        nuez.setText(" ");
    }

    @Override
    public void Parpadear() {
        if (vida > 0) {
            ParpadeoDeLabels a = new ParpadeoDeLabels(nuez, 1, 1, 50);
            a.start();
        } else {
            /*RPlantaHitbox = null;
            nuez.setVisible(false);
            partida.EliminarPlanta(fila, partida.GetColumnaAnalisis(x));*/
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

    @Override
    public void setInvisible() {
        nuez.setVisible(false);
        /*SwingUtilities.invokeLater(new Runnable() {
            public void run() {

            }
        });*/
    }

    @Override
    public void deletPlantita() {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                nuez.setVisible(false);
                nuez = null;
                RPlantaHitbox = null;
                vida = 0;
            }
        });

    }

    @Override
    public void reload() {
        main.PanelControl_Plantas.add(nuez, new org.netbeans.lib.awtextra.AbsoluteConstraints(x, y, -1, -1));
    }
}
