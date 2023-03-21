package Plantas_Pack;

import Hilos.ParpadeoDeLabels;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.File;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import plantasvszombie_joselobo.AdministracionDeRecursos;
import plantasvszombie_joselobo.Main;
import plantasvszombie_joselobo.Partida;

/**
 *
 * @author rinal
 */
public class PetaCereza extends Planta {

    javax.swing.JLabel petacereza;

    public PetaCereza(int x, int y, int fila, AdministracionDeRecursos main, Partida partida) {
        super(x, y, fila, main, partida);
        vida = 4000;
        build();
    }

    @Override
    public void build() {
        tiempoRecarga = 35000;
        petacereza = new javax.swing.JLabel();
        try {
            File archivo = new File("./GameImage\\PetaCereza.png");
            Image img = Toolkit.getDefaultToolkit().createImage(
                    archivo.getPath()).getScaledInstance(50, 50, 0);
            petacereza.setIcon(new javax.swing.ImageIcon(img));
        } catch (Exception e) {
            System.out.println("No encontro Imagen Nuez");
        }
        petacereza.setOpaque(false);
        petacereza.setLocation(x, y);
        main.PanelControl_Plantas.add(petacereza, new org.netbeans.lib.awtextra.AbsoluteConstraints(x, y, -1, -1));
        petacereza.setText(" ");
    }

    @Override
    public void Parpadear() {
        if (vida > 0) {
            ParpadeoDeLabels a = new ParpadeoDeLabels(petacereza, 1, 1, 50);
            a.start();
        } else {
            /*RPlantaHitbox = null;
            nuez.setVisible(false);
            partida.EliminarPlanta(fila, partida.GetColumnaAnalisis(x));*/
        }
    }

    @Override
    public void run() {
        int n = 50;
        for (int i = 0; i < 5; i++) {
            try {
                File archivo = new File("./GameImage\\PetaCereza.png");
                Image img = Toolkit.getDefaultToolkit().createImage(
                        archivo.getPath()).getScaledInstance(n, n, 0);
                petacereza.setIcon(new javax.swing.ImageIcon(img));
            } catch (Exception e) {
                System.out.println("No encontro Imagen Nuez");
            }
            n++;
            try {
                Thread.sleep((long) (25 * partida.multiplicador));
            } catch (InterruptedException ex) {
                Logger.getLogger(PetaCereza.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        for (int i = 1; i <= 5; i++) {
            ArrayList<Zombi> T = partida.getfilaZombis(fila);
            for (Zombi zombi : T) {
                if (zombi.getX() < x + 120 && zombi.getX() > x - 120) {
                    if (zombi.getY() < y + 120 && zombi.getY() > y - 120) {
                        try {
                            zombi.recucirVida(500);
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                }
                try {
                    Thread.sleep(0);
                } catch (InterruptedException ex) {
                    Logger.getLogger(PetaCereza.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            try {
                Thread.sleep(0);
            } catch (InterruptedException ex) {
                Logger.getLogger(PetaCereza.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        int Columna = partida.GetColumnaAnalisis(x);
        partida.pala(fila, Columna);
    }//run

    @Override
    public void setInvisible() {
        petacereza.setVisible(false);
    }

    @Override
    public void deletPlantita() {
        petacereza.setVisible(false);
        petacereza = null;
        RPlantaHitbox = null;
        vida = 0;
    }
}
