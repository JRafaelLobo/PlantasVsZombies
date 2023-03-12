package plantasvszombie_joselobo;

import java.util.ArrayList;

public class Partida {

    protected Main main;
    protected ArrayList<Thread> hilosDeZombis1 = new ArrayList();
    protected ArrayList<Thread> hilosDeZombis2 = new ArrayList();
    protected ArrayList<Thread> hilosDeZombis3 = new ArrayList();
    protected ArrayList<Thread> hilosDeZombis4 = new ArrayList();
    protected ArrayList<Thread> hilosDeZombis5 = new ArrayList();

    public Partida(Main main) {
        this.main = main;
    }

}
