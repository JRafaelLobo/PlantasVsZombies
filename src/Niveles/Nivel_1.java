package Niveles;

import Hilos.GeneraSoles;
import Plantas_Pack.CoordenadasPlanta;
import Plantas_Pack.Girasol;
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

    protected Random random = new Random();

    public Nivel_1(Main main) {
        super(main);

    }

    public void Generar() {
        //fila 2
        PFila2[0] = new CoordenadasPlanta(A, 25, 150, 2, this);
        PFila2[1] = new CoordenadasPlanta(A, 90, 150, 2, this);
        PFila2[2] = new CoordenadasPlanta(A, 155, 150, 2, this);
        PFila2[3] = new CoordenadasPlanta(A, 220, 150, 2, this);
        PFila2[4] = new CoordenadasPlanta(A, 285, 150, 2, this);
        PFila2[5] = new CoordenadasPlanta(A, 350, 150, 2, this);
        PFila2[6] = new CoordenadasPlanta(A, 415, 150, 2, this);
        PFila2[7] = new CoordenadasPlanta(A, 480, 150, 2, this);
        PFila2[8] = new CoordenadasPlanta(A, 545, 150, 2, this);
        //fila 3
        PFila3[0] = new CoordenadasPlanta(A, 25, 220, 3, this);
        PFila3[1] = new CoordenadasPlanta(A, 90, 220, 3, this);
        PFila3[2] = new CoordenadasPlanta(A, 155, 220, 3, this);
        PFila3[3] = new CoordenadasPlanta(A, 220, 220, 3, this);
        PFila3[4] = new CoordenadasPlanta(A, 285, 220, 3, this);
        PFila3[5] = new CoordenadasPlanta(A, 350, 220, 3, this);
        PFila3[6] = new CoordenadasPlanta(A, 415, 220, 3, this);
        PFila3[7] = new CoordenadasPlanta(A, 480, 220, 3, this);
        PFila3[8] = new CoordenadasPlanta(A, 545, 220, 3, this);

        PFila4[0] = new CoordenadasPlanta(A, 25, 290, 4, this);
        PFila4[1] = new CoordenadasPlanta(A, 90, 290, 4, this);
        PFila4[2] = new CoordenadasPlanta(A, 155, 290, 4, this);
        PFila4[3] = new CoordenadasPlanta(A, 220, 290, 4, this);
        PFila4[4] = new CoordenadasPlanta(A, 285, 290, 4, this);
        PFila4[5] = new CoordenadasPlanta(A, 350, 290, 4, this);
        PFila4[6] = new CoordenadasPlanta(A, 415, 290, 4, this);
        PFila4[7] = new CoordenadasPlanta(A, 480, 290, 4, this);
        PFila4[8] = new CoordenadasPlanta(A, 545, 290, 4, this);
    }

    //filas 70
    //fila 2=130,3=210,3=280/lanzaguisantes
    public void run() {
        try {
            Thread.sleep((long) (200 * multiplicador));//35000
        } catch (InterruptedException ex) {
        }
        main.lb_CantSoles.setText(Integer.toString(Cantsoles));
        GeneraSoles GeneSol = new GeneraSoles(10000, A, Nivel_1.this);
        GeneSol.start();
        try {
            Thread.sleep((long) (15000 * multiplicador));
        } catch (InterruptedException ex) {
            Logger.getLogger(Nivel_1.class.getName()).log(Level.SEVERE, null, ex);
        }
        for (int i = 0; i < 13; i++) {
            switch (((random.nextInt(3)))) {
                case 0 -> {
                    ZFilas2.add(new ZombiNormal(A, Nivel_1.this, 640, 140, 2));
                    ZFilas2.get(ZFilas2.size() - 1).start();
                }
                case 1 -> {
                    ZFilas3.add(new ZombiNormal(A, Nivel_1.this, 640, 210, 3));
                    ZFilas3.get(ZFilas3.size() - 1).start();

                }
                case 2 -> {
                    ZFilas4.add(new ZombiNormal(A, Nivel_1.this, 640, 280, 4));
                    ZFilas4.get(ZFilas4.size() - 1).start();

                }
            }
            if (i == 0) {
                try {
                    Thread.sleep((long) (12000 * multiplicador));
                } catch (InterruptedException ex) {
                }
            }
            if (i == 1) {
                try {
                    Thread.sleep((long) (12000 * multiplicador));
                } catch (InterruptedException ex) {
                }
            }
            if (i == 2) {
                try {
                    Thread.sleep((long) (10000 * multiplicador));
                } catch (InterruptedException ex) {
                }
            }
            if (i == 3) {
                try {
                    Thread.sleep((long) (2000 * multiplicador));
                } catch (InterruptedException ex) {
                }
            }
            if (i == 4) {
                try {
                    Thread.sleep((long) (5000 * multiplicador));
                } catch (InterruptedException ex) {
                }
            }
            if (i == 5) {
                try {
                    Thread.sleep((long) (10000 * multiplicador));
                } catch (InterruptedException ex) {
                }
            }
            if (i == 6) {
                try {
                    Thread.sleep((long) (10000 * multiplicador));
                } catch (InterruptedException ex) {
                }
            }
            if (i == 7) {
                try {
                    Thread.sleep((long) (5000 * multiplicador));
                } catch (InterruptedException ex) {
                }
            }
            if (i == 8) {
                try {
                    Thread.sleep((long) (10000 * multiplicador));
                } catch (InterruptedException ex) {
                }
            }
            if (i > 8) {
                try {
                    Thread.sleep((long) (3000 * multiplicador));
                } catch (InterruptedException ex) {
                }
            }

        }//fin for i
        while (ganada == false) {
            if (ZFilas1.isEmpty()
                    && ZFilas2.isEmpty()
                    && ZFilas3.isEmpty()
                    && ZFilas4.isEmpty()
                    && ZFilas5.isEmpty()) {
                Ganaste();
                ganada = true;
            }
            try {
                Thread.sleep((long) (5000 * multiplicador));
            } catch (InterruptedException ex) {
            }
        }
    }

    @Override
    public int GetFilasAnalisis(int y) {
        if (y > 115 && y < 178) {
            return 2;
        }
        if (y > 180 && y < 248) {
            return 3;

        }
        if (y > 250 && y < 324) {
            return 4;
        }
        return -1;
    }

    @Override
    public int GetColumnaAnalisis(int x) {
        if (x > 23 && x < 90) {
            return 0;
        }
        if (x > 90 && x < 151) {
            return 1;
        }
        if (x > 153 && x < 215) {
            return 2;
        }
        if (x > 216 && x < 282) {
            return 3;
        }
        if (x > 282 && x < 345) {
            return 4;
        }
        if (x > 347 && x < 415) {
            return 5;
        }
        if (x > 415 && x < 469) {
            return 6;
        }
        if (x > 469 && x < 537) {
            return 7;
        }
        if (x > 541 && x < 615) {
            return 8;
        }
        return -1;
    }

}
