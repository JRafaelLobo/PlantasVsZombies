package Plantas_Pack;

import java.awt.Image;
import java.awt.Toolkit;
import java.io.File;
import javax.swing.JLabel;
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
        System.out.println(partida.getfilaZombis(fila));
        while (vida > 0) {
            int test = TestNear();
            if (test != -1) {
                partida.getfilaPlanta(fila)[test].getPlanta().recucirVida(dano);
            } else {
                x--;
                label.setLocation(x, y);
                Rzombihitbox.setLocation(x, y);
            }

            try {
                Thread.sleep((long) (velocidad * main.multiplicador));
            } catch (InterruptedException ex) {
            }
        }
        try {
            partida.getfilaZombis(fila).set(0, null);
            partida.getfilaZombis(fila).remove(0);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Ya no hay mas zombies en la fila: " + fila);
        }

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
            System.out.println(partida.getfilaPlanta(fila)[i].getPlanta());
            try {
                if (partida.getfilaPlanta(fila)[i].getPlanta().getRPlantaHitbox().intersects(Rzombihitbox)) {
                    temp = i;
                }
                System.out.println("Pasa");
            } catch (NullPointerException e) {
            }
        }
        return temp;
    }
}
