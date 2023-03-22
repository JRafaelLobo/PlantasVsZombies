/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Plantas_Pack;

import Hilos.ParpadeoDeLabels;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.File;
import java.io.Serializable;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;
import plantasvszombie_joselobo.AdministracionDeRecursos;
import plantasvszombie_joselobo.Main;
import plantasvszombie_joselobo.Partida;

/**
 *
 * @author Rafael Jr
 */
public class ZombiCono extends Zombi implements Serializable {

    public ZombiCono(AdministracionDeRecursos main, Partida partida, int x, int y, int fila) {
        super(main, partida, x, y, fila);
        File archivo = null;
        Image img = null;
        vida = 250;
        label = new javax.swing.JLabel();
        try {
            archivo = new File("./GameImage\\ZombiCono.png");
            img = Toolkit.getDefaultToolkit().createImage(
                    archivo.getPath()).getScaledInstance(70, 70, 0);
            label.setIcon(new javax.swing.ImageIcon(img));
        } catch (Exception e) {
            System.out.println("No se Encuentra Imagen de Zombi");
        }
        label.setOpaque(false);
        label.setLocation(x, y);

        main.PanelControl_Zombi.add(label, new org.netbeans.lib.awtextra.AbsoluteConstraints(x, y, -1, -1));
        label.setText(" ");
    }

    @Override
    public void run() {
        // System.out.println(partida.getfilaZombis(fila));
        while (vida > 0) {
            if (!pause) {

                try {
                    Thread.sleep(0);
                } catch (InterruptedException ex) {
                    Logger.getLogger(ZombiNormal.class.getName()).log(Level.SEVERE, null, ex);
                }
                int test = TestNear();
                if (test != -1) {
                    Clip effect = playMusic("./GameMusic\\SoundEffects\\ZombieEat2.wav");
                    effect.start();
                    partida.getfilaPlanta(fila)[test].getPlanta().reducirVida(dano);
                    try {
                        Thread.sleep((long) (tiempoDeAtaque * partida.multiplicador));
                    } catch (InterruptedException ex) {
                        ex.printStackTrace();
                    }
                } else {
                    try {
                        x--;
                        label.setLocation(x, y);

                        main.PanelControl_Zombi.add(label, new org.netbeans.lib.awtextra.AbsoluteConstraints(x, y, -1, -1));

                        try {
                            Rzombihitbox.setLocation(x, y);

                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                        if (x < -10) {
                            partida.perdida = true;
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
            try {
                Thread.sleep((long) (velocidad * partida.multiplicador));
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }/*
        label.setVisible(false);
        Rzombihitbox = null;
        // if (partida.getfilaZombis(fila).get(0) != null) {
        int numeliminar = partida.getfilaZombis(fila).indexOf(this);
        partida.getfilaZombis(fila).set(numeliminar, null);
        partida.getfilaZombis(fila).remove(numeliminar);
        //}*/

    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getDano() {
        return dano;
    }

    public void setDano(int dano) {
        this.dano = dano;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public int getTiempoDeAtaque() {
        return tiempoDeAtaque;
    }

    public void setTiempoDeAtaque(int tiempoDeAtaque) {
        this.tiempoDeAtaque = tiempoDeAtaque;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public JLabel getLabel() {
        return label;
    }

    public void setLabel(JLabel label) {
        this.label = label;
    }

    private int TestNear() {
        int temp = -1;
        for (int i = 0; i < 9; i++) {
            try {
                if (partida.getfilaPlanta(fila)[i].getPlanta().getRPlantaHitbox().intersects(Rzombihitbox)) {
                    temp = i;
                }
            } catch (NullPointerException e) {
            }
        }
        return temp;
    }

    public void Parpadear() {
        if (vida > 0) {

            ParpadeoDeLabels a = new ParpadeoDeLabels(label, 1, 4000, 50);
            a.start();

        } else {

            ParpadeoDeLabels a = new ParpadeoDeLabels(label, 0, 0, 0, true, true);
            a.start();

        }

    }

    public void reload(AdministracionDeRecursos administracionDeRecursos) {
        this.main = administracionDeRecursos;
        main.PanelControl_Zombi.add(label, new org.netbeans.lib.awtextra.AbsoluteConstraints(x, y, -1, -1));
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
}
