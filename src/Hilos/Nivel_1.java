package Hilos;

import Plantas_Pack.Zombi;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JPanel;
import plantasvszombie_joselobo.Main;

public class Nivel_1 implements Runnable {

    Main main;

    public void run() {
        try {
            Thread.sleep(35000);
        } catch (InterruptedException ex) {
        }
        for (int i = 0; i < 12; i++) {
            switch ((int) (Math.random() * 2)) {
                case 0 -> {
                    main.ZFilas2.add(new Zombi(main, 660, 190));
                }
                case 1 -> {
                    main.ZFilas3.add(new Zombi(main, 660, 250));
                }
                case 2 -> {
                    main.ZFilas4.add(new Zombi(main, 660, 330));
                }
            }
            if (i == 1) {
                try {
                    Thread.sleep(12000);
                } catch (InterruptedException ex) {
                }

            }
            if (i == 2) {
                try {
                    Thread.sleep(10000);
                } catch (InterruptedException ex) {
                }
            }
            if (i == 3) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException ex) {
                }
            }
            if (i == 4) {
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException ex) {
                }
            }
            if (i == 5) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException ex) {
                }
            }
            if (i == 6) {
                try {
                    Thread.sleep(10000);
                } catch (InterruptedException ex) {
                }
            }
            if (i == 7) {
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException ex) {
                }
            }
            if (i == 8) {
                try {
                    Thread.sleep(10000);
                } catch (InterruptedException ex) {
                }
            }
            if (i > 8) {
                try {
                    Thread.sleep(250);
                } catch (InterruptedException ex) {
                }
            }

        }//fin for i
    }
}
