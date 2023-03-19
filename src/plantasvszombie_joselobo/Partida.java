package plantasvszombie_joselobo;

import Niveles.Nivel_1;
import Plantas_Pack.CoordenadasPlanta;
import Plantas_Pack.Girasol;
import Plantas_Pack.Planta;
import Plantas_Pack.Sol;
import Plantas_Pack.Zombi;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Partida extends Thread {

    public Main main;
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
    public int Cantsoles = 9999;
    public ArrayList<Sol> soles = new ArrayList();
    public boolean ganada = false;
    public boolean perdida = false;

    public Partida(Main main) {
        this.main = main;
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
        PFila2[0] = new CoordenadasPlanta(main, 25, 145, 2, this);
        PFila2[1] = new CoordenadasPlanta(main, 90, 145, 2, this);
        PFila2[2] = new CoordenadasPlanta(main, 155, 145, 2, this);
        PFila2[3] = new CoordenadasPlanta(main, 220, 145, 2, this);
        PFila2[4] = new CoordenadasPlanta(main, 285, 145, 2, this);
        PFila2[5] = new CoordenadasPlanta(main, 350, 145, 2, this);
        PFila2[6] = new CoordenadasPlanta(main, 415, 145, 2, this);
        PFila2[7] = new CoordenadasPlanta(main, 480, 145, 2, this);
        PFila2[8] = new CoordenadasPlanta(main, 545, 145, 2, this);
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
                        }
                    }
                    case 1 -> {
                        if (Cantsoles >= 100) {
                            getfilaPlanta(filas)[columnas].CreateLanzaguisante();
                            Cantsoles -= 100;
                        }
                    }
                    case 2 -> {
                        if (Cantsoles >= 50) {
                            getfilaPlanta(filas)[columnas].CreateNuez();
                            Cantsoles -= 50;
                        }

                    }
                    case 3 -> {
                        //falta la petacereza
                        if (Cantsoles >= 150) {
                            getfilaPlanta(filas)[columnas].CreateGirasol();
                            Cantsoles -= 150;

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

    public void Perdiste() {
        JOptionPane.showMessageDialog(main.JP_PatioFrontal, "Esta sin decorar pero Perdiste");
    }

    public void Ganaste() {
        JOptionPane.showMessageDialog(main.JP_PatioFrontal, "Esta sin decorar pero Ganaste");
    }
}
