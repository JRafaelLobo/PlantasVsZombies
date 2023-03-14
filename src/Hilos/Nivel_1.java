package Hilos;

import Plantas_Pack.LanzaGuizantes;
import Plantas_Pack.Zombi;
import Plantas_Pack.ZombiNormal;
import java.util.ArrayList;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JPanel;
import plantasvszombie_joselobo.Main;
import plantasvszombie_joselobo.Partida;

public class Nivel_1 extends Partida {

    Random random = new Random();

    public Nivel_1(Main main) {
        super(main);
    }

    public void run() {
        try {
            Thread.sleep((long) (200 * main.multiplicador));//35000
        } catch (InterruptedException ex) {
        }
        LanzaGuizantes LG = new LanzaGuizantes(100, 130, 2, main);
        LG.start();
        for (int i = 0; i < 12; i++) {
            switch (((random.nextInt(3)))) {
                case 0 -> {
                    main.ZFilas2.add(new ZombiNormal(main, 650, 140));
                    main.ZFilas2.get(main.ZFilas2.size() - 1).start();
                }
                case 1 -> {
                    main.ZFilas3.add(new ZombiNormal(main, 650, 210));
                    main.ZFilas3.get(main.ZFilas3.size() - 1).start();

                }
                case 2 -> {
                    main.ZFilas4.add(new ZombiNormal(main, 650, 280));
                    main.ZFilas4.get(main.ZFilas4.size() - 1).start();

                }
            }
            if (i == 0) {
                try {
                    Thread.sleep((long) (12000 * main.multiplicador));
                } catch (InterruptedException ex) {
                }
            }
            if (i == 1) {
                try {
                    Thread.sleep((long) (12000 * main.multiplicador));
                } catch (InterruptedException ex) {
                }
            }
            if (i == 2) {
                try {
                    Thread.sleep((long) (10000 * main.multiplicador));
                } catch (InterruptedException ex) {
                }
            }
            if (i == 3) {
                try {
                    Thread.sleep((long) (2000 * main.multiplicador));
                } catch (InterruptedException ex) {
                }
            }
            if (i == 4) {
                try {
                    Thread.sleep((long) (5000 * main.multiplicador));
                } catch (InterruptedException ex) {
                }
            }
            if (i == 5) {
                try {
                    Thread.sleep((long) (10000 * main.multiplicador));
                } catch (InterruptedException ex) {
                }
            }
            if (i == 6) {
                try {
                    Thread.sleep((long) (10000 * main.multiplicador));
                } catch (InterruptedException ex) {
                }
            }
            if (i == 7) {
                try {
                    Thread.sleep((long) (5000 * main.multiplicador));
                } catch (InterruptedException ex) {
                }
            }
            if (i == 8) {
                try {
                    Thread.sleep((long) (10000 * main.multiplicador));
                } catch (InterruptedException ex) {
                }
            }
            if (i > 8) {
                try {
                    Thread.sleep((long) (3000 * main.multiplicador));
                } catch (InterruptedException ex) {
                }
            }

        }//fin for i
    }
}
