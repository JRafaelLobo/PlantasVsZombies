package plantasvszombie_joselobo;

import Niveles.Nivel_1;
import Plantas_Pack.CoordenadasPlanta;
import Plantas_Pack.Girasol;
import Plantas_Pack.Planta;
import Plantas_Pack.Sol;
import Plantas_Pack.Zombi;
import java.util.ArrayList;

public class Partida extends Thread {

    protected Main main;
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
                return PFila1;
            case 3:
                return PFila1;
            case 4:
                return PFila1;
            case 5:
                return PFila1;
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
        /* PFila2[2] = new Girasol(25, 140, 2, main, Nivel_1.this);
        PFila2[2].start();
        PFila2[3] = new Girasol(25, 140, 2, main, Nivel_1.this);
        PFila2[3].start();
        PFila2[4] = new Girasol(25, 140, 2, main, Nivel_1.this);
        PFila2[4].start();
        PFila2[5] = new Girasol(25, 140, 2, main, Nivel_1.this);
        PFila2[5].start();
        PFila2[6] = new Girasol(25, 140, 2, main, Nivel_1.this);
        PFila2[6].start();
        PFila2[7] = new Girasol(25, 140, 2, main, Nivel_1.this);
        PFila2[7].start();
        PFila2[8] = new Girasol(25, 140, 2, main, Nivel_1.this);
        PFila2[8].start();
        PFila2[9] = new Girasol(25, 140, 2, main, Nivel_1.this);
        PFila2[9].start();*/
    }
    
}
