package Plantas_Pack;

import Hilos.ParpadeoDeLabels;
import com.sun.source.tree.CatchTree;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.File;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.Timer;
import plantasvszombie_joselobo.Main;
import plantasvszombie_joselobo.Partida;

public class Sol extends Thread {

    private javax.swing.JLabel sol;
    private int x, y;
    private Main main;
    private Partida partida;
    private boolean esdeGirasol = false;
    ParpadeoDeLabels P;

    public Sol(int x, int y, Main main, Partida partida) {
        this.x = x;
        this.y = y;
        this.main = main;
        this.partida = partida;
        constructor();
    }

    public Sol(int x, int y, Main main, Partida partida, boolean esdeGirasol) {
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
                    archivo.getPath()).getScaledInstance(50, 50, 0);
            sol.setIcon(new javax.swing.ImageIcon(img));
        } catch (Exception e) {
            System.out.println("No encontro Imagen girasol");
        }
        sol.setOpaque(false);
        sol.setLocation(x, y);
        main.JP_Soles.add(sol, new org.netbeans.lib.awtextra.AbsoluteConstraints(x, y, -1, -1));
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
                    main.JP_Soles.add(sol, new org.netbeans.lib.awtextra.AbsoluteConstraints(x, y, -1, -1));
                    try {
                        Thread.sleep(1);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Sol.class.getName()).log(Level.SEVERE, null, ex);
                    }
                } else {
                    break;
                }
                try {
                    Thread.sleep((long) (50 * main.multiplicador));
                } catch (InterruptedException ex) {
                    Logger.getLogger(Sol.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        } else {
            while (y < 250) {
                y++;
                if (sol != null) {
                    sol.setLocation(x, y);
                    main.JP_Soles.add(sol, new org.netbeans.lib.awtextra.AbsoluteConstraints(x, y, -1, -1));
                }
                try {
                    Thread.sleep((long) (50 * main.multiplicador));
                } catch (InterruptedException ex) {
                    Logger.getLogger(Sol.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        Timer T = new Timer((int) (18000 * main.multiplicador), null);//25
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
            partida.Cantsoles += 25;
            main.SetTextCantSoles(Integer.toString(partida.Cantsoles));
            sol.setVisible(false);
            sol = null;
            try {
                Thread.sleep(0);

            } catch (InterruptedException ex) {
                Logger.getLogger(Sol.class
                        .getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

}
