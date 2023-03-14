package Plantas_Pack;

import java.awt.Image;
import java.awt.Toolkit;
import java.io.File;
import javax.swing.JLabel;
import plantasvszombie_joselobo.Main;

public class ZombiNormal extends Zombi {

    public ZombiNormal() {
    }

    public ZombiNormal(Main main, int x, int y) {
        super(main, x, y);
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
        label.setLocation(x, y);
        main.JP_PatioFrontal.add(label, new org.netbeans.lib.awtextra.AbsoluteConstraints(x, y, -1, -1));//aqui el error
        label.setText(" ");
        label.setOpaque(false);

    }

    @Override
    public void run() {
        while (true) {
            x--;
            label.setLocation(x, y);
            try {
                Thread.sleep((long) (velocidad * main.multiplicador));
            } catch (InterruptedException ex) {
            }
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
    
}
