package Plantas_Pack;

import Hilos.ParpadeoDeLabels;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.io.File;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import plantasvszombie_joselobo.*;

public class ZombiNormal extends Zombi {

    public ZombiNormal(Main main, Partida partida, int x, int y, int fila) {
        super(main, partida, x, y, fila);
        File archivo = null;
        Image img = null;
        label = new javax.swing.JLabel();
        try {
            archivo = new File("./GameImage\\ZombiNormal.gif");
            img = Toolkit.getDefaultToolkit().createImage(
                    archivo.getPath()).getScaledInstance(70, 70, 0);
            label.setIcon(new javax.swing.ImageIcon(img));
        } catch (Exception e) {
            System.out.println("No se Encuentra Imagen de Zombi");
        }
        label.setOpaque(false);
        label.setLocation(x, y);
        main.JP_PatioFrontal.add(label, new org.netbeans.lib.awtextra.AbsoluteConstraints(x, y, -1, -1));
        label.setText(" ");
    }

    @Override
    public void run() {
        // System.out.println(partida.getfilaZombis(fila));
        while (vida > 0) {
            try {
                Thread.sleep(0);
            } catch (InterruptedException ex) {
                Logger.getLogger(ZombiNormal.class.getName()).log(Level.SEVERE, null, ex);
            }
            int test = TestNear();
            if (test != -1) {
                partida.getfilaPlanta(fila)[test].getPlanta().reducirVida(dano);
                try {
                    Thread.sleep((long) (tiempoDeAtaque * partida.main.multiplicador));
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
            } else {
                x--;
                label.setLocation(x, y);
                main.JP_PatioFrontal.add(label, new org.netbeans.lib.awtextra.AbsoluteConstraints(x, y, -1, -1));
                Rzombihitbox.setLocation(x, y);
                if (x < -10) {
                    partida.perdida = true;
                }
            }

            try {
                Thread.sleep((long) (velocidad * partida.main.multiplicador));
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
        label.setVisible(false);
        Rzombihitbox = null;
        // if (partida.getfilaZombis(fila).get(0) != null) {
        int numeliminar = partida.getfilaZombis(fila).indexOf(this);
        partida.getfilaZombis(fila).set(numeliminar, null);
        partida.getfilaZombis(fila).remove(numeliminar);
        //}

    }

    public Main getMain() {
        return main;
    }

    public void setMain(Main main) {
        this.main = main;
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
}
