package Plantas_Pack;

import Hilos.ParpadeoDeLabels;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import plantasvszombie_joselobo.AdministracionDeRecursos;
import plantasvszombie_joselobo.Main;
import static plantasvszombie_joselobo.Main.playMusic;
import plantasvszombie_joselobo.Partida;

/**
 *
 * @author rinal
 */
public class LanzaGuizantes extends Planta implements Serializable {

    javax.swing.JLabel lanzaguisante;

    ArrayList<Guizante> guisantes = new ArrayList();
    ArrayList<Zombi> refFilaZombi;

    public LanzaGuizantes(int x, int y, int fila, AdministracionDeRecursos main, Partida partida) {
        super(x, y, fila, main, partida);
        build();
    }

    @Override
    public void build() {
        tiempoRecarga = 9000;
        lanzaguisante = new javax.swing.JLabel();
        try {
            File archivo = new File("./GameImage\\lanzaguisantes.gif");
            Image img = Toolkit.getDefaultToolkit().createImage(
                    archivo.getPath()).getScaledInstance(55, 55, 0);
            lanzaguisante.setIcon(new javax.swing.ImageIcon(img));
        } catch (Exception e) {
            System.out.println("No encontro Imagen Lanzaguisantes");
        }
        lanzaguisante.setOpaque(false);
        lanzaguisante.setLocation(x, y);
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                main.PanelControl_Plantas.add(lanzaguisante, new org.netbeans.lib.awtextra.AbsoluteConstraints(x, y, -1, -1));
            }
        });
        lanzaguisante.setText(" ");
        refFilaZombi = partida.getfilaZombis(fila);
    }

    @Override
    public void Attack() {
        guisantes.add(new Guizante(x + 20, y - 10, fila, main, partida));
        guisantes.get(guisantes.size() - 1).start();
        Clip effect = playMusic("./GameMusic\\SoundEffects\\PeaShooter.wav");
        effect.start();
    }

    @Override
    public void run() {
        //aqui ultima modificacion haciendo una referencia
        while (vida > 0) {
            boolean tirar = false;
            for (Zombi Z : refFilaZombi) {
                if (Z.Rzombihitbox != null && Z.getX() < 640) {
                    tirar = true;
                    break;
                }
            }
            try {
                Thread.sleep((long) (tiempoDeAtaque * partida.multiplicador));
            } catch (InterruptedException ex) {
            }
            if (tirar) {
                Attack();

            }
            try {
                Thread.sleep(0);
            } catch (InterruptedException ex) {
            }
        }
        //partida.EliminarPlanta(fila, partida.GetColumnaAnalisis(x));
        //deletPlantita();
    }//run

    @Override
    public void Parpadear() {
        if (vida > 0) {
            ParpadeoDeLabels a = new ParpadeoDeLabels(lanzaguisante, 1, 1, 50);
            a.start();
        } else {
            /* ParpadeoDeLabels a = new ParpadeoDeLabels(lanzaguisante, 1, 4001, 0, true, true);
            a.start();
            RPlantaHitbox = null;
             */
        }
    }

    @Override
    public void setInvisible() {
        if (lanzaguisante != null) {
            lanzaguisante.setVisible(false);
        }
    }

    @Override
    public void deletPlantita() {
        lanzaguisante.setVisible(false);
        lanzaguisante = null;
        RPlantaHitbox = null;
        vida = 0;
    }

    public static Clip playMusic(String filepath) {
        try {
            File music = new File(filepath);
            AudioInputStream AudioImput = AudioSystem.getAudioInputStream(music);
            Clip clip = AudioSystem.getClip();
            clip.open(AudioImput);
            return clip;
        } catch (Exception e) {
            System.out.println("El Archivo no Existe");
            e.printStackTrace();
        }
        return null;
    }

    public void Para() {
        for (Guizante guisante : guisantes) {
            guisante.suspend();
        }
        this.suspend();
    }

    public void Continua() {
        for (Guizante guisante : guisantes) {
            guisante.resume();
        }
        this.resume();
    }

    public void reload(AdministracionDeRecursos administracionDeRecursos) {
        this.main = administracionDeRecursos;
        try {
            File archivo = new File("./GameImage\\lanzaguisantes.gif");
            Image img = Toolkit.getDefaultToolkit().createImage(
                    archivo.getPath()).getScaledInstance(55, 55, 0);
            lanzaguisante.setIcon(new javax.swing.ImageIcon(img));
        } catch (Exception e) {
            System.out.println("No encontro Imagen Lanzaguisantes");
        }
        main.PanelControl_Plantas.add(lanzaguisante, new org.netbeans.lib.awtextra.AbsoluteConstraints(x, y, -1, -1));
        try {
            for (Guizante guisante : guisantes) {
                guisante.reload(main);
                guisante.start();
            }
        } catch (Exception e) {
        }

        this.start();
    }

}
