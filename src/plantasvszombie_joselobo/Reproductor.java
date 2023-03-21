/*package plantasvszombie_joselobo;

import java.awt.BorderLayout;
import java.io.File;
import javafx.embed.swing.JFXPanel;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.media.*;
import javax.swing.JPanel;

public class Reproductor {

    private final JFXPanel jfxpanel;
    private JPanel jpanel;
    private MediaPlayer mediaPlayer;
    private Media media;
    private MediaView mediaView;
    private Scene escena;
    private File file;
    private String ruta;

    public Reproductor() {
        this.jfxpanel = new JFXPanel();
    }

    public void setJpanel(JPanel jpanel) {
        this.jpanel = jpanel;
    }

    public MediaPlayer getMediaPlayer() {
        return mediaPlayer;
    }


    public void setRuta(String ruta) {
        this.ruta = ruta;
    }

    public void reproducir() {
        try {
            this.getMediaPlayer().play();
        } catch (MediaException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public void pause() {
        try {
            this.getMediaPlayer().pause();
        } catch (MediaException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public void parar() {
        try {
            this.getMediaPlayer().stop();
        } catch (MediaException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public void setVolumen(double value) {
        try {
            this.getMediaPlayer().setVolume(value);
        } catch (MediaException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public void mostrarVideo(int veces) {
        try {
            int x = this.jpanel.getHeight();
            int y = this.jpanel.getWidth();

            this.file = new File(this.ruta);
            this.media = new Media(this.file.toURI().toString());
            this.mediaPlayer = new MediaPlayer(media);
            this.mediaView = new MediaView(mediaPlayer);

            this.mediaView.setFitHeight(x);
            this.mediaView.setFitWidth(y);

            this.escena = new Scene(new Group(this.mediaView));
            this.jpanel.setSize(this.jpanel.getSize());
            this.jfxpanel.setScene(this.escena);

            if (veces == -1) {
                this.getMediaPlayer().setCycleCount(MediaPlayer.INDEFINITE);
            } else {
                this.getMediaPlayer().setCycleCount(veces);
            }
            this.jpanel.add(this.jfxpanel, BorderLayout.CENTER);

        } catch (MediaException e) {
            System.out.println("Error: ");
        }
    }

}*/
