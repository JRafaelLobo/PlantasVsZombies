package Hilos;

import javax.swing.JFrame;

/**
 *
 * @author rinal
 */
public class CambiarPantallaTiempo implements Runnable {

    private JFrame MainMenu, Anterior;
    int numero;

    public CambiarPantallaTiempo(JFrame MainMenu, JFrame Anterior, int numero) {
        this.MainMenu = MainMenu;
        this.Anterior = Anterior;
        this.numero = numero;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(numero);
        } catch (InterruptedException ex) {
        }
        MainMenu.pack();
        MainMenu.setLocationRelativeTo(Anterior);
        MainMenu.setVisible(true);
        Anterior.setVisible(false);
    }

}
