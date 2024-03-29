package Hilos;

import Plantas_Pack.Sol;
import java.io.Serializable;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import plantasvszombie_joselobo.AdministracionDeRecursos;
import plantasvszombie_joselobo.Main;
import plantasvszombie_joselobo.Partida;

public class GeneraSoles extends Thread implements Serializable {

    private int x, y = -10;
    private int TiempoPorCaida;
    private AdministracionDeRecursos main;
    private Partida partida;
    private boolean resume = true;
    private boolean primera_vez = true;

    public GeneraSoles(int TiempoPorCaida, AdministracionDeRecursos main, Partida partida) {
        this.TiempoPorCaida = TiempoPorCaida;
        this.main = main;
        this.partida = partida;
    }

    public boolean isResume() {
        return resume;
    }

    public void setResume(boolean resume) {
        this.resume = resume;
    }

    @Override
    public void run() {
        Random random = new Random();
        try {
            Thread.sleep((long) (TiempoPorCaida * 2 * partida.multiplicador));
        } catch (InterruptedException ex) {
            Logger.getLogger(GeneraSoles.class.getName()).log(Level.SEVERE, null, ex);
        }
        x = random.nextInt(301) + 100;
        partida.soles.add(new Sol(x, y, main, partida));
        partida.soles.get(partida.soles.size() - 1).start();
        try {
            Thread.sleep((long) (TiempoPorCaida * partida.multiplicador));
        } catch (InterruptedException ex) {
            Logger.getLogger(GeneraSoles.class.getName()).log(Level.SEVERE, null, ex);
        }
        while (resume) {
            x = random.nextInt(301) + 100;
            partida.soles.add(new Sol(x, y, main, partida));
            partida.soles.get(partida.soles.size() - 1).start();
            try {
                Thread.sleep((long) (TiempoPorCaida * partida.multiplicador));
            } catch (InterruptedException ex) {
                Logger.getLogger(GeneraSoles.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public void reload(AdministracionDeRecursos administracionDeRecursos) {
        this.main = administracionDeRecursos;
        this.start();
    }

}
