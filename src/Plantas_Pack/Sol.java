package Plantas_Pack;

import Hilos.ParpadeoDeLabels;
import static Plantas_Pack.LanzaGuizantes.playMusic;
import com.sun.source.tree.CatchTree;
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
import javax.swing.Timer;
import plantasvszombie_joselobo.AdministracionDeRecursos;
import plantasvszombie_joselobo.Main;
import plantasvszombie_joselobo.Partida;

public class Sol extends Thread implements Serializable {

    protected javax.swing.JLabel sol;
    protected int x, y;
    protected AdministracionDeRecursos main;
    protected Partida partida;
    protected boolean esdeGirasol = false;
    ParpadeoDeLabels P;

    public Sol(int x, int y, AdministracionDeRecursos main, Partida partida) {
        this.x = x;
        this.y = y;
        this.main = main;
        this.partida = partida;
        constructor();
    }

    public Sol(int x, int y, AdministracionDeRecursos main, Partida partida, boolean esdeGirasol) {
        this.x = x;
        this.y = y;
        this.main = main;
        this.partida = partida;
        this.esdeGirasol = esdeGirasol;
        constructor();
    }

    public void constructor() {
        sol = new javax.swing.JLabel();
        sol.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                solMouseClicked(evt);
            }
        });
        try {
            File archivo = new File("./GameImage\\sun.png");
            Image img = Toolkit.getDefaultToolkit().createImage(
                    archivo.getPath()).getScaledInstance(55, 55, 0);
            sol.setIcon(new javax.swing.ImageIcon(img));
        } catch (Exception e) {
            System.out.println("No encontro Imagen girasol");
        }
        sol.setOpaque(false);
        sol.setLocation(x, y);
        partida.main.JP_Soles.add(sol, new org.netbeans.lib.awtextra.AbsoluteConstraints(x, y, -1, -1));
        sol.setText(" ");
    }

    @Override
    public void run() {
        if (esdeGirasol) {
            for (int i = 0; i < 45; i++) {
                y++;
                //el error de aqui es cuando se agarra antes el sol, se solucionaria 
                if (sol != null) {
                    sol.setLocation(x, y);
                    main.PanelControl_Soles.add(sol, new org.netbeans.lib.awtextra.AbsoluteConstraints(x, y, -1, -1));
                    try {
                        Thread.sleep(1);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Sol.class.getName()).log(Level.SEVERE, null, ex);
                    }
                } else {
                    break;
                }
                try {
                    Thread.sleep((long) (50 * partida.multiplicador));
                } catch (InterruptedException ex) {
                    Logger.getLogger(Sol.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        } else {
            while (y < 250) {
                y++;
                if (sol != null) {
                    sol.setLocation(x, y);
                    main.PanelControl_Soles.add(sol, new org.netbeans.lib.awtextra.AbsoluteConstraints(x, y, -1, -1));
                }
                try {
                    Thread.sleep((long) (30 * partida.multiplicador));
                } catch (InterruptedException ex) {
                    Logger.getLogger(Sol.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        Timer T = new Timer((int) (8000 * partida.multiplicador), null);//25
        T.start();
        T.addActionListener(
                new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent e
            ) {
                if (sol != null) {
                    //P = new ParpadeoDeLabels(sol, 4, 500, 500, true, true);
                    //P.start();
                    sol.setVisible(false);
                    sol = null;
                    partida.soles.remove(this);
                }
            }
        }
        );
        try {
            Thread.sleep(0);
        } catch (InterruptedException ex) {
            Logger.getLogger(Sol.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//run

    private void solMouseClicked(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
        if (sol != null) {
            Clip effect = playMusic("./GameMusic\\SoundEffects\\SunCollected1.wav");
            effect.start();
            partida.Cantsoles += 25;
            main.getMain().SetTextCantSoles(Integer.toString(partida.Cantsoles));
            sol.setVisible(false);
            sol = null;
            partida.soles.remove(this);
            try {
                Thread.sleep(0);
            } catch (InterruptedException ex) {
                Logger.getLogger(Sol.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
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

    public void SolDisapear(boolean RemoveDelArrayList) {
        sol.setVisible(false);
        sol = null;
        if (RemoveDelArrayList) {
            partida.soles.remove(this);
        }
    }

    public void reload() {
        main.PanelControl_Soles.add(sol, new org.netbeans.lib.awtextra.AbsoluteConstraints(x, y, -1, -1));
    }
}
