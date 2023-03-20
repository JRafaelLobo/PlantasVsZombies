package Niveles;

import Hilos.GeneraSoles;
import Plantas_Pack.CoordenadasPlanta;
import Plantas_Pack.ZombiCono;
import Plantas_Pack.ZombiNormal;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import plantasvszombie_joselobo.Main;
import plantasvszombie_joselobo.Partida;

public class Nivel_2 extends Partida {

    protected Random random = new Random();

    public Nivel_2(Main main) {
        super(main);

    }

    @Override
    public void Generar() {
        //fila 1
        PFila1[0] = new CoordenadasPlanta(A, 25, 42, 1, this);
        PFila1[1] = new CoordenadasPlanta(A, 90, 42, 1, this);
        PFila1[2] = new CoordenadasPlanta(A, 155, 42, 1, this);
        PFila1[3] = new CoordenadasPlanta(A, 220, 42, 1, this);
        PFila1[4] = new CoordenadasPlanta(A, 285, 42, 1, this);
        PFila1[5] = new CoordenadasPlanta(A, 350, 42, 1, this);
        PFila1[6] = new CoordenadasPlanta(A, 415, 42, 1, this);
        PFila1[7] = new CoordenadasPlanta(A, 480, 42, 1, this);
        PFila1[8] = new CoordenadasPlanta(A, 545, 42, 1, this);
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
        //fila 4
        PFila4[0] = new CoordenadasPlanta(A, 25, 290, 4, this);
        PFila4[1] = new CoordenadasPlanta(A, 90, 290, 4, this);
        PFila4[2] = new CoordenadasPlanta(A, 155, 290, 4, this);
        PFila4[3] = new CoordenadasPlanta(A, 220, 290, 4, this);
        PFila4[4] = new CoordenadasPlanta(A, 285, 290, 4, this);
        PFila4[5] = new CoordenadasPlanta(A, 350, 290, 4, this);
        PFila4[6] = new CoordenadasPlanta(A, 415, 290, 4, this);
        PFila4[7] = new CoordenadasPlanta(A, 480, 290, 4, this);
        PFila4[8] = new CoordenadasPlanta(A, 545, 290, 4, this);
        //fila 5
        PFila5[0] = new CoordenadasPlanta(A, 25, 150, 5, this);
        PFila5[1] = new CoordenadasPlanta(A, 90, 150, 5, this);
        PFila5[2] = new CoordenadasPlanta(A, 155, 150, 5, this);
        PFila5[3] = new CoordenadasPlanta(A, 220, 150, 5, this);
        PFila5[4] = new CoordenadasPlanta(A, 285, 150, 5, this);
        PFila5[5] = new CoordenadasPlanta(A, 350, 150, 5, this);
        PFila5[6] = new CoordenadasPlanta(A, 415, 150, 5, this);
        PFila5[7] = new CoordenadasPlanta(A, 480, 150, 5, this);
        PFila5[8] = new CoordenadasPlanta(A, 545, 150, 5, this);
    }

    //filas 70
    //fila 2=130,3=210,3=280/lanzaguisantes
    public void run() {
        try {
            Thread.sleep((long) (200 * multiplicador));//35000
        } catch (InterruptedException ex) {
        }
        main.lb_CantSoles.setText(Integer.toString(Cantsoles));
        GeneraSoles GeneSol = new GeneraSoles(10000, A, Nivel_2.this);
        GeneSol.start();
        try {
            Thread.sleep(0);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        for (int i = 0; i < 10; i++) {
            int R = random.nextInt(5) + 1;
            System.out.println("R:" + R);
            int porcentaje = random.nextInt(100);
            /*if (porcentaje > 60) {
                getfilaZombis(R).add(new ZombiNormal(A, this, 640, ZombiCordenadas(R), R));
                getfilaZombis(R).get(getfilaZombis(R).size() - 1).start();
            } else */
            {
                getfilaZombis(R).add(new ZombiCono(A, this, 640, ZombiCordenadas(R), R));
                getfilaZombis(R).get(getfilaZombis(R).size() - 1).start();
            }
            try {
                Thread.sleep(0);
            } catch (InterruptedException ex) {
                Logger.getLogger(Nivel_2.class.getName()).log(Level.SEVERE, null, ex);
            }
            /*
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
             */

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
        if (y > 42 && y < 120) {
            return 1;
        }
        if (y > 120 && y < 183) {
            return 2;
        }
        if (y > 184 && y < 249) {
            return 3;
        }
        if (y > 250 && y < 315) {
            return 4;
        }
        if (y > 316 && y < 386) {
            return 5;
        }
        return -1;
    }

    @Override
    public int GetColumnaAnalisis(int x) {
        if (x > 73 && x < 135) {
            return 0;
        }
        if (x > 135 && x < 188) {
            return 1;
        }
        if (x > 188 && x < 251) {
            return 2;
        }
        if (x > 251 && x < 311) {
            return 3;
        }
        if (x > 311 && x < 365) {
            return 4;
        }
        if (x > 367 && x < 429) {
            return 5;
        }
        if (x > 429 && x < 490) {
            return 6;
        }
        if (x > 490 && x < 548) {
            return 7;
        }
        if (x > 548 && x < 616) {
            return 8;
        }
        return -1;
    }

    public int ZombiCordenadas(int d) {

        switch (d) {
            case 1 -> {
                return 80;
            }
            case 2 -> {
                return 145;
            }
            case 3 -> {
                return 210;
            }
            case 4 -> {
                return 275;
            }
            case 5 -> {
                return 340;
            }
        }
        return -1;
    }

}
