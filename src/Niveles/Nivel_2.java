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
        PFila1[0] = new CoordenadasPlanta(A, 81, 81, 1, this);//81
        PFila1[1] = new CoordenadasPlanta(A, 139, 81, 1, this);
        PFila1[2] = new CoordenadasPlanta(A, 197, 81, 1, this);
        PFila1[3] = new CoordenadasPlanta(A, 258, 81, 1, this);
        PFila1[4] = new CoordenadasPlanta(A, 315, 81, 1, this);
        PFila1[5] = new CoordenadasPlanta(A, 374, 81, 1, this);
        PFila1[6] = new CoordenadasPlanta(A, 437, 81, 1, this);
        PFila1[7] = new CoordenadasPlanta(A, 496, 81, 1, this);
        PFila1[8] = new CoordenadasPlanta(A, 559, 81, 1, this);
        //fila 2
        PFila2[0] = new CoordenadasPlanta(A, 81, 152, 2, this);
        PFila2[1] = new CoordenadasPlanta(A, 139, 152, 2, this);
        PFila2[2] = new CoordenadasPlanta(A, 197, 152, 2, this);
        PFila2[3] = new CoordenadasPlanta(A, 258, 152, 2, this);
        PFila2[4] = new CoordenadasPlanta(A, 315, 152, 2, this);
        PFila2[5] = new CoordenadasPlanta(A, 374, 152, 2, this);
        PFila2[6] = new CoordenadasPlanta(A, 437, 152, 2, this);
        PFila2[7] = new CoordenadasPlanta(A, 496, 152, 2, this);
        PFila2[8] = new CoordenadasPlanta(A, 559, 152, 2, this);
        //fila 3
        PFila3[0] = new CoordenadasPlanta(A, 81, 216, 3, this);
        PFila3[1] = new CoordenadasPlanta(A, 139, 216, 3, this);
        PFila3[2] = new CoordenadasPlanta(A, 197, 216, 3, this);
        PFila3[3] = new CoordenadasPlanta(A, 258, 216, 3, this);
        PFila3[4] = new CoordenadasPlanta(A, 315, 216, 3, this);
        PFila3[5] = new CoordenadasPlanta(A, 374, 216, 3, this);
        PFila3[6] = new CoordenadasPlanta(A, 437, 216, 3, this);
        PFila3[7] = new CoordenadasPlanta(A, 496, 216, 3, this);
        PFila3[8] = new CoordenadasPlanta(A, 559, 216, 3, this);
        //fila 4
        PFila4[0] = new CoordenadasPlanta(A, 81, 282, 4, this);
        PFila4[1] = new CoordenadasPlanta(A, 139, 282, 4, this);
        PFila4[2] = new CoordenadasPlanta(A, 197, 282, 4, this);
        PFila4[3] = new CoordenadasPlanta(A, 258, 282, 4, this);
        PFila4[4] = new CoordenadasPlanta(A, 315, 282, 4, this);
        PFila4[5] = new CoordenadasPlanta(A, 374, 282, 4, this);
        PFila4[6] = new CoordenadasPlanta(A, 437, 282, 4, this);
        PFila4[7] = new CoordenadasPlanta(A, 496, 282, 4, this);
        PFila4[8] = new CoordenadasPlanta(A, 559, 282, 4, this);
        //fila 5
        PFila5[0] = new CoordenadasPlanta(A, 81, 351, 5, this);
        PFila5[1] = new CoordenadasPlanta(A, 139, 351, 5, this);
        PFila5[2] = new CoordenadasPlanta(A, 197, 351, 5, this);
        PFila5[3] = new CoordenadasPlanta(A, 258, 351, 5, this);
        PFila5[4] = new CoordenadasPlanta(A, 315, 351, 5, this);
        PFila5[5] = new CoordenadasPlanta(A, 374, 351, 5, this);
        PFila5[6] = new CoordenadasPlanta(A, 437, 351, 5, this);
        PFila5[7] = new CoordenadasPlanta(A, 496, 351, 5, this);
        PFila5[8] = new CoordenadasPlanta(A, 559, 351, 5, this);
    }

    //filas 70
    //fila 2=130,3=210,3=280/lanzaguisantes
    public void run() {
        try {
            Thread.sleep((long) (200 * multiplicador));//35000
        } catch (InterruptedException ex) {
        }
        main.lb_CantSoles.setText(Integer.toString(Cantsoles));
        GeneraSoles GeneSol = new GeneraSoles(4000, A, Nivel_2.this);
        GeneSol.start();
        try {
            Thread.sleep((long) (22000*multiplicador));
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        for (int i = 0; i < 10; i++) {
            //1 minuto y 31 segundos
            int R = random.nextInt(5) + 1;
            int porcentaje = random.nextInt(100);
            if (porcentaje > 60) {
                getfilaZombis(R).add(new ZombiNormal(A, this, 640, ZombiCordenadas(R), R));
                getfilaZombis(R).get(getfilaZombis(R).size() - 1).start();
            } else {
                getfilaZombis(R).add(new ZombiCono(A, this, 640, ZombiCordenadas(R), R));
                getfilaZombis(R).get(getfilaZombis(R).size() - 1).start();
            }
            try {
                Thread.sleep(0);
            } catch (InterruptedException ex) {
                Logger.getLogger(Nivel_2.class.getName()).log(Level.SEVERE, null, ex);
            }
            switch (i) {
                case 1 -> {
                    try {
                        Thread.sleep((long) (5000 * multiplicador));
                    } catch (InterruptedException ex) {
                    }
                }
                case 2 -> {
                    try {
                        Thread.sleep((long) (5000 * multiplicador));
                    } catch (InterruptedException ex) {
                    }
                }
                case 3 -> {
                    try {
                        Thread.sleep((long) (5000 * multiplicador));
                    } catch (InterruptedException ex) {
                    }
                }
                case 4 -> {
                    try {
                        Thread.sleep((long) (5000 * multiplicador));
                    } catch (InterruptedException ex) {
                    }
                }
                case 5 -> {
                    try {
                        Thread.sleep((long) (5000 * multiplicador));
                    } catch (InterruptedException ex) {
                    }
                }
                case 6 -> {
                    try {
                        Thread.sleep((long) (5000 * multiplicador));
                    } catch (InterruptedException ex) {
                    }
                }
                case 7 -> {
                    try {
                        Thread.sleep((long) (5000 * multiplicador));
                    } catch (InterruptedException ex) {
                    }
                }
                case 8 -> {
                    try {
                        Thread.sleep((long) (5000 * multiplicador));
                    } catch (InterruptedException ex) {
                    }
                }
                case 9 -> {
                    try {
                        Thread.sleep((long) (5000 * multiplicador));
                    } catch (InterruptedException ex) {
                    }
                }
                case 10 -> {
                    try {
                        Thread.sleep((long) (5000 * multiplicador));
                    } catch (InterruptedException ex) {
                    }
                }
                case 11 -> {
                    try {
                        Thread.sleep((long) (5000 * multiplicador));
                    } catch (InterruptedException ex) {
                    }
                }
                case 12 -> {
                    try {
                        Thread.sleep((long) (5000 * multiplicador));
                    } catch (InterruptedException ex) {
                    }
                }
                case 13 -> {
                    try {
                        Thread.sleep((long) (5000 * multiplicador));
                    } catch (InterruptedException ex) {
                    }
                }
                case 14 -> {
                    try {
                        Thread.sleep((long) (5000 * multiplicador));
                    } catch (InterruptedException ex) {
                    }
                }
                case 15 -> {
                    try {
                        Thread.sleep((long) (5000 * multiplicador));
                    } catch (InterruptedException ex) {
                    }
                }
                case 16 -> {
                    try {
                        Thread.sleep((long) (5000 * multiplicador));
                    } catch (InterruptedException ex) {
                    }
                }
                case 17 -> {
                    try {
                        Thread.sleep((long) (5000 * multiplicador));
                    } catch (InterruptedException ex) {
                    }
                }
                case 18 -> {
                    try {
                        Thread.sleep((long) (5000 * multiplicador));
                    } catch (InterruptedException ex) {
                    }
                }
                case 19 -> {
                    try {
                        Thread.sleep((long) (5000 * multiplicador));
                    } catch (InterruptedException ex) {
                    }
                }
                case 20 -> {
                    try {
                        Thread.sleep((long) (5000 * multiplicador));
                    } catch (InterruptedException ex) {
                    }
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
