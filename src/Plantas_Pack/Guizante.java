package Plantas_Pack;

import java.awt.Image;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.io.File;
import java.io.Serializable;
import static java.nio.file.Files.delete;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import plantasvszombie_joselobo.AdministracionDeRecursos;
import plantasvszombie_joselobo.Main;
import plantasvszombie_joselobo.Partida;

public class Guizante extends Thread implements Serializable {

    AdministracionDeRecursos main;
    JLabel guisante;
    int fila, x, y, dano = 20;
    boolean isAlive = true;
    Rectangle RguisanteHitbox;
    Partida partida;
    ArrayList<Zombi> refFilaZombi;
    boolean boleaninutilquesirveparaquenoaparezcavariasvecesumensaje = true;

    public Guizante(int x, int y, int fila, AdministracionDeRecursos main, Partida partida) {
        this.main = main;
        this.fila = fila;
        this.x = x;
        this.y = y;
        this.partida = partida;
        refFilaZombi = partida.getfilaZombis(fila);

        guisante = new javax.swing.JLabel();
        try {
            File archivo = new File("./GameImage\\guisante.png");
            Image img = Toolkit.getDefaultToolkit().createImage(
                    archivo.getPath()).getScaledInstance(45, 45, 0);
            guisante.setIcon(new javax.swing.ImageIcon(img));
        } catch (Exception e) {
            System.out.println("No se encuentra la imagen del guisante");
        }
        guisante.setOpaque(false);
        guisante.setLocation(x, y);
        main.PanelControl_Proyectiles.add(guisante, new org.netbeans.lib.awtextra.AbsoluteConstraints(x, y, -1, -1));

        guisante.setText(" ");
    }

    public int getFila() {
        return fila;
    }

    public void setFila(int fila) {
        this.fila = fila;
    }

    public boolean isIsAlive() {
        return isAlive;
    }

    public void setIsAlive(boolean isAlive) {
        this.isAlive = isAlive;
    }

    @Override
    public void run() {
        RguisanteHitbox = new Rectangle(x, y, 35, 35);
        while (isAlive) {
            try {
                Thread.sleep((long) (5 * partida.multiplicador));
            } catch (InterruptedException ex) {
                System.out.println("Error guisante");
            }
            x++;
            guisante.setLocation(x, y);

            main.PanelControl_Proyectiles.add(guisante, new org.netbeans.lib.awtextra.AbsoluteConstraints(x, y, -1, -1));

            RguisanteHitbox.setLocation(x, y);
            for (int i = 0; i < refFilaZombi.size(); i++) {

                try {
                    if (RguisanteHitbox.intersects(refFilaZombi.get(i).Rzombihitbox)) {
                        this.guisante.setVisible(false);
                        if (!refFilaZombi.isEmpty()) {
                            if (refFilaZombi.get(i) != null) {
                                refFilaZombi.get(i).recucirVida(dano);
                            }
                        }
                        isAlive = false;
                        try {
                            Thread.sleep(0);
                        } catch (InterruptedException ex) {
                            System.out.println("c mamo");
                        }
                    }
                } catch (Exception e) {
                    if (boleaninutilquesirveparaquenoaparezcavariasvecesumensaje) {
                        //System.out.println("Eso hace que el lanzaguisantes continue avanzando = Guisantes linea 100");
                        //e.printStackTrace();
                        // boleaninutilquesirveparaquenoaparezcavariasvecesumensaje = false;
                    }
                }
            }
            if (x > 640) {
                isAlive = false;
                try {
                    Thread.sleep(0);
                } catch (InterruptedException ex) {
                }
            }
        }
        if (guisante != null) {
            try {
                guisante.setVisible(false);
            } catch (Exception e) {
            }
        }
        try {
            Thread.sleep(0);
        } catch (InterruptedException ex) {
        }
        try {
            RguisanteHitbox = null;
            guisante = null;
            Thread.sleep(0);
        } catch (Exception e) {
            System.out.println("No se puede setear en null");
        }
    }

    public void reload(AdministracionDeRecursos administracionDeRecursos) {
        this.main = administracionDeRecursos;
        main.PanelControl_Proyectiles.add(guisante, new org.netbeans.lib.awtextra.AbsoluteConstraints(x, y, -1, -1));
    }
}
