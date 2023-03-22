package Plantas_Pack;

import Hilos.ParpadeoDeLabels;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.SwingUtilities;
import plantasvszombie_joselobo.AdministracionDeRecursos;
import plantasvszombie_joselobo.Main;
import plantasvszombie_joselobo.Partida;

/**
 *
 * @author rinal
 */
public class Girasol extends Planta implements Serializable {

    protected javax.swing.JLabel girasol;

    public Girasol(int x, int y, int fila, AdministracionDeRecursos main, Partida partida) {
        super(x, y, fila, main, partida);
        build();
    }

    @Override

    public void build() {
        tiempoRecarga = 8000;
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
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                main.PanelControl_Plantas.add(girasol, new org.netbeans.lib.awtextra.AbsoluteConstraints(x, y, -1, -1));
            }
        });
        girasol.setText(" ");
    }

    @Override
    public void Parpadear() {
        if (vida > 0) {
            ParpadeoDeLabels a = new ParpadeoDeLabels(girasol, 1, 1, 50);
            a.start();
        } else {
            /*ParpadeoDeLabels a = new ParpadeoDeLabels(girasol, 1, 1, 0, true, true);
            a.start();*/
        }
    }

    @Override
    public void run() {
        //aqui ultima modificacion haciendo una referencia
        while (vida > 0) {
            try {
                Thread.sleep((long) (20000 * partida.multiplicador));
            } catch (InterruptedException ex) {
                girasol.setVisible(false);
                RPlantaHitbox = null;
                girasol = null;
            }
            Producir();
            try {
                Thread.sleep(100);
            } catch (InterruptedException ex) {
                Logger.getLogger(Girasol.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        /*girasol.setVisible(false);
        RPlantaHitbox = null;
        girasol = null;
        partida.EliminarPlanta(fila, partida.GetColumnaAnalisis(x));*/
    }//run

    public void Producir() {
        partida.soles.add(new Sol(x, y, main, partida, true));
        partida.soles.get(partida.soles.size() - 1).start();
    }

    @Override
    public void setInvisible() {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                if (girasol != null) {
                    girasol.setVisible(false);
                }
            }
        });

    }

    @Override
    public void deletPlantita() {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                if (girasol != null) {
                    girasol.setVisible(false);
                    girasol = null;
                    RPlantaHitbox = null;
                }
            }
        });

    }

    public void reload() {
        main.PanelControl_Plantas.add(girasol, new org.netbeans.lib.awtextra.AbsoluteConstraints(x, y, -1, -1));
    }
}
