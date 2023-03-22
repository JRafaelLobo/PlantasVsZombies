package Plantas_Pack;

import Hilos.ParpadeoDeLabels;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.SwingUtilities;
import plantasvszombie_joselobo.AdministracionDeRecursos;
import plantasvszombie_joselobo.Main;
import plantasvszombie_joselobo.Partida;

/**
 *
 * @author rinal
 */
public class PetaCereza extends Planta implements Serializable{
    
    javax.swing.JLabel petacereza;
    
    public PetaCereza(int x, int y, int fila, AdministracionDeRecursos main, Partida partida) {
        super(x, y, fila, main, partida);
        vida = 4000;
        RPlantaHitbox = null;
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
    }
    
    @Override
    public void run() {
        int n = 50;
        for (int i = 0; i < 10; i++) {
            try {
                File archivo = new File("./GameImage\\PetaCereza.png");
                Image img = Toolkit.getDefaultToolkit().createImage(
                        archivo.getPath()).getScaledInstance(n, n, 0);
                SwingUtilities.invokeLater(new Runnable() {
                    public void run() {
                        petacereza.setIcon(new javax.swing.ImageIcon(img));
                    }
                });
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
        for (int i = fila - 1; i <= fila + 1; i++) {
            boolean flag = true;
            if (i <= 0 || i > 5) {
                flag = false;
            }
            if (flag) {
                for (Zombi zombi : partida.getfilaZombis(i)) {
                    if (zombi.getX() < x + 150 && zombi.getX() > x - 150 && zombi.Rzombihitbox != null) {
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
                }
            }
            
            try {
                Thread.sleep(0);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
        this.reducirVida(9999);
        try {
            Thread.sleep(10);
        } catch (InterruptedException ex) {
            Logger.getLogger(PetaCereza.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//run

    @Override
    public void setInvisible() {
        petacereza.setVisible(false);
        /*
        if (petacereza != null) {
            SwingUtilities.invokeLater(new Runnable() {
                public void run() {
                    petacereza.setVisible(false);
                }
            });
        }*/
    }
    
    @Override
    public void deletPlantita() {
        
        petacereza.setVisible(false);
        petacereza = null;
        RPlantaHitbox = null;
        vida = 0;
        
    }
}
