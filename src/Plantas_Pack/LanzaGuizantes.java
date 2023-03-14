package Plantas_Pack;

import java.awt.Image;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.io.File;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import plantasvszombie_joselobo.Main;

/**
 *
 * @author rinal
 */
public class LanzaGuizantes extends Planta {

    javax.swing.JLabel lanzaguisante;

    boolean test = true;

    public LanzaGuizantes(int x, int y, int fila, Main main) {
        super(x, y, fila, main);

        lanzaguisante = new javax.swing.JLabel();
        try {
            File archivo = new File("./GameImage\\lanzaguisantes.gif");
            Image img = Toolkit.getDefaultToolkit().createImage(
                    archivo.getPath()).getScaledInstance(70, 70, 0);
            lanzaguisante.setIcon(new javax.swing.ImageIcon(img));
        } catch (Exception e) {
            System.out.println("No encontro Imagen Lanzaguisantes");
        }
        lanzaguisante.setLocation(x, y);
        main.JP_PatioFrontal.add(lanzaguisante, new org.netbeans.lib.awtextra.AbsoluteConstraints(x, y, -1, -1));//aqui el error
        lanzaguisante.setText(" ");
        lanzaguisante.setOpaque(false);

    }

    @Override
    public void Attack() {
        System.out.println("Ataque");
        Guizante M = new Guizante(main, fila, x + 10, y);
        M.start();
    }

    @Override
    public void run() {

        switch (fila) {
            case 1 -> {
                while (test) {
                    if (!main.ZFilas1.isEmpty()) {
                        try {
                            Thread.sleep((long) (tiempoDeAtaque * main.multiplicador));
                        } catch (InterruptedException ex) {
                        }
                        Attack();

                    }
                }
            }//case 1
            case 2 -> {
                while (test) {
                    if (!main.ZFilas2.isEmpty()) {
                        try {
                            Thread.sleep((long) (tiempoDeAtaque * main.multiplicador));
                        } catch (InterruptedException ex) {
                        }
                        Attack();

                    }
                }
            }//case 2
            case 3 -> {
                while (test) {
                    if (!main.ZFilas3.isEmpty()) {
                        try {
                            Thread.sleep((long) (tiempoDeAtaque * main.multiplicador));
                        } catch (InterruptedException ex) {
                        }
                        Attack();

                    }
                }
            }//case 3
            case 4 -> {
                while (test) {
                    if (!main.ZFilas4.isEmpty()) {
                        try {
                            Thread.sleep((long) (tiempoDeAtaque * main.multiplicador));
                        } catch (InterruptedException ex) {
                        }
                        Attack();

                    }
                }
            }//case 4
            case 5 -> {
                while (test) {
                    if (!main.ZFilas5.isEmpty()) {
                        try {
                            Thread.sleep((long) (tiempoDeAtaque * main.multiplicador));
                        } catch (InterruptedException ex) {
                        }
                        Attack();

                    }
                }
            }//case 5
            }//switch
        try {
            Thread.sleep(0);
        } catch (InterruptedException ex) {
        }
    }//run
}
