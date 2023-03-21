package plantasvszombie_joselobo;

import Plantas_Pack.CoordenadasPlanta;
import Plantas_Pack.Sol;
import Plantas_Pack.Zombi;
import java.io.File;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

public class Partida extends Thread {

    public Main main;
    public AdministracionDeRecursos A;
    public ArrayList<Zombi> ZFilas1 = new ArrayList();
    public ArrayList<Zombi> ZFilas2 = new ArrayList();
    public ArrayList<Zombi> ZFilas3 = new ArrayList();
    public ArrayList<Zombi> ZFilas4 = new ArrayList();
    public ArrayList<Zombi> ZFilas5 = new ArrayList();
    public CoordenadasPlanta[] PFila1 = new CoordenadasPlanta[9];
    public CoordenadasPlanta[] PFila2 = new CoordenadasPlanta[9];
    public CoordenadasPlanta[] PFila3 = new CoordenadasPlanta[9];
    public CoordenadasPlanta[] PFila4 = new CoordenadasPlanta[9];
    public CoordenadasPlanta[] PFila5 = new CoordenadasPlanta[9];
    public int Cantsoles = 50;
    public ArrayList<Sol> soles = new ArrayList();
    public boolean ganada = false;
    public boolean perdida = false;
    public double multiplicador = 1;
    public int control = 0;
    public boolean pause = false;

    public Partida(Main main) {
        this.main = main;
        A = new AdministracionDeRecursos(main);
        Generar();
    }

    public ArrayList<Zombi> getfilaZombis(int fila) {
        switch (fila) {
            case 1:
                return ZFilas1;
            case 2:
                return ZFilas2;
            case 3:
                return ZFilas3;
            case 4:
                return ZFilas4;
            case 5:
                return ZFilas5;
            default:
                return null;
        }
    }

    public CoordenadasPlanta[] getfilaPlanta(int fila) {
        switch (fila) {
            case 1:
                return PFila1;
            case 2:
                return PFila2;
            case 3:
                return PFila3;
            case 4:
                return PFila4;
            case 5:
                return PFila5;
            default:
                return null;
        }
    }

    public void Generar() {
        SwingUtilities.invokeLater(new Runnable(){
            public void run(){
                
            }
        });
        PFila2[0] = new CoordenadasPlanta(A, 25, 145, 2, this);
        PFila2[1] = new CoordenadasPlanta(A, 90, 145, 2, this);
        PFila2[2] = new CoordenadasPlanta(A, 155, 145, 2, this);
        PFila2[3] = new CoordenadasPlanta(A, 220, 145, 2, this);
        PFila2[4] = new CoordenadasPlanta(A, 285, 145, 2, this);
        PFila2[5] = new CoordenadasPlanta(A, 350, 145, 2, this);
        PFila2[6] = new CoordenadasPlanta(A, 415, 145, 2, this);
        PFila2[7] = new CoordenadasPlanta(A, 480, 145, 2, this);
        PFila2[8] = new CoordenadasPlanta(A, 545, 145, 2, this);
    }

    public int GetFilasAnalisis(int y) {
        return -1;
    }

    public int GetColumnaAnalisis(int x) {
        return -1;
    }

    public void Plantar(int filas, int columnas, int tipoDePlanta) {
        try {
            if (getfilaPlanta(filas)[columnas].getPlanta() == null && tipoDePlanta != -1) {
                switch (tipoDePlanta) {
                    case 0 -> {
                        if (Cantsoles >= 50) {
                            getfilaPlanta(filas)[columnas].CreateGirasol();
                            Cantsoles -= 50;
                            Clip effect = playMusic("./GameMusic\\SoundEffects\\BeingPlanted2.wav");
                            effect.start();
                        }
                    }
                    case 1 -> {
                        if (Cantsoles >= 100) {
                            getfilaPlanta(filas)[columnas].CreateLanzaguisante();
                            Cantsoles -= 100;
                            Clip effect = playMusic("./GameMusic\\SoundEffects\\BeingPlanted2.wav");
                            effect.start();
                        }
                    }
                    case 2 -> {
                        if (Cantsoles >= 50) {
                            getfilaPlanta(filas)[columnas].CreateNuez();
                            Cantsoles -= 50;
                            Clip effect = playMusic("./GameMusic\\SoundEffects\\BeingPlanted2.wav");
                            effect.start();
                        }

                    }
                    case 3 -> {
                        //falta la petacereza
                        if (Cantsoles >= 150) {
                            getfilaPlanta(filas)[columnas].CreatePetaCereza();
                            Cantsoles -= 150;
                            Clip effect = playMusic("./GameMusic\\SoundEffects\\BeingPlanted2.wav");
                            effect.start();
                        }
                    }
                }

            }
        } catch (Exception e) {
        }
        main.lb_CantSoles.setText(Integer.toString(Cantsoles));
        main.plantaSelecionada = -1;
        main.JP_PanelBlancoSeleccionPlantas.setVisible(false);
    }

    public void EliminarPlanta(int filas, int columnas) {
        try {
            getfilaPlanta(filas)[columnas].DeletePlant();
        } catch (Exception e) {
        }
        //main.JP_PanelBlancoSeleccionPlantas.setVisible(false);
        //main.eliminarPlanta = false;
    }

    public void pala(int filas, int columnas) {
        try {
            getfilaPlanta(filas)[columnas].remover();
        } catch (Exception e) {
        }
    }

    public void pause() {
        pause = true;
        if (main.JDialog_Pause.isVisible()) {
            for (int i = 1; i <= 5; i++) {
                for (int j = 0; j < 9; j++) {
                    getfilaPlanta(i)[j].stop();
                }
            }
            for (int i = 1; i <= 5; i++) {
                ArrayList<Zombi> f = getfilaZombis(i);
                for (int j = 0; j < f.size(); j++) {
                    try {
                        f.get(i).suspend();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
            for (int i = 0; i < soles.size(); i++) {
                try {
                    soles.get(i).suspend();
                } catch (Exception e) {
                    System.out.println("Ups Soles");
                }
            }
            main.Music.stop();
        }
        try {
            Thread.sleep(100);
        } catch (InterruptedException ex) {
            Logger.getLogger(Partida.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void Continue() {

        for (int i = 1; i <= 5; i++) {
            for (int j = 0; j < 9; j++) {
                getfilaPlanta(i)[j].resume();
            }
        }
        for (int i = 1; i <= 5; i++) {
            ArrayList<Zombi> f = getfilaZombis(i);
            for (int j = 0; j < f.size(); j++) {
                try {
                    f.get(i).start();
                } catch (Exception e) {
                }
            }
        }
        for (int i = 0; i < soles.size(); i++) {
            try {
                soles.get(i).start();
            } catch (Exception e) {
            }
        }
        main.Music.start();
        this.start();
    }

    public void Perdiste() {
        JOptionPane.showMessageDialog(main.JP_PatioFrontal, "Esta sin decorar pero Perdiste");
    }

    public void Ganaste() {
        main.JDialog_Ganaste.pack();
        main.JDialog_Ganaste.setLocationRelativeTo(main.JP_PatioFrontal);
        main.JDialog_Ganaste.setVisible(true);
        main.JDialog_Ganaste.setModal(true);
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
}
