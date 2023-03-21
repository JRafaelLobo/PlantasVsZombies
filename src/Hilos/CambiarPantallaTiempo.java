package Hilos;

import java.io.File;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JFrame;
import plantasvszombie_joselobo.*;

/**
 *
 * @author rinal
 */
public class CambiarPantallaTiempo extends Thread {

    private JFrame Cambio, Anterior;
    private int milisegundos;
    private Clip Music;

    public CambiarPantallaTiempo(JFrame Cambio, JFrame Anterior, int milisegundos) {
        this.Cambio = Cambio;
        this.Anterior = Anterior;
        this.milisegundos = milisegundos;

    }

    @Override
    public void run() {
        try {
            Thread.sleep(milisegundos);
        } catch (InterruptedException ex) {
        }
        Cambio.pack();
        Cambio.setLocationRelativeTo(Anterior);
        Cambio.setVisible(true);
        Anterior.setVisible(false);

    }

    public void playMusic(String filepath) {
        try {
            File music = new File(filepath);
            AudioInputStream AudioImput = AudioSystem.getAudioInputStream(music);
            Music = AudioSystem.getClip();
            Music.open(AudioImput);
        } catch (Exception e) {
            System.out.println("El Archivo no Existe");
            e.printStackTrace();
        }
    }
}
