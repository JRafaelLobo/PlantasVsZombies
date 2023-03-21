package Hilos;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JProgressBar;

/**
 *
 * @author Rafael Jr
 */
public class BarraDeCarga extends Thread {

    int tiempoInicio, tiempoFinal;
    private javax.swing.JProgressBar jProgressBar1;

    public BarraDeCarga(int tiempoInicio, int tiempoFinal, JProgressBar jProgressBar1) {
        this.tiempoInicio = tiempoInicio;
        this.tiempoFinal = tiempoFinal;
        this.jProgressBar1 = jProgressBar1;
    }

    @Override
    public void run() {
        Random random = new Random();
        while (tiempoInicio < tiempoFinal) {
            jProgressBar1.setMaximum(tiempoFinal);
            if (tiempoInicio + 100 >= tiempoFinal) {
            } else {
                int porcentaje = random.nextInt(5);
                if (porcentaje < 2) {
                    jProgressBar1.setValue(tiempoInicio);
                }
            }
            tiempoInicio += 50;
            try {
                Thread.sleep(50);
            } catch (InterruptedException ex) {
                Logger.getLogger(BarraDeCarga.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
