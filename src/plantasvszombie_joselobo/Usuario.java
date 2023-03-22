package plantasvszombie_joselobo;

import java.io.Serializable;

public class Usuario implements Serializable {

    private String nombre;
    private int lvl;
    private Partida partida;

    public Usuario(String nombre, int lvl) {
        this.nombre = nombre;
        this.lvl = lvl;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getLvl() {
        return lvl;
    }

    public void setLvl(int lvl) {
        this.lvl = lvl;
    }

    public void aumentarlvl() {
        this.lvl++;
    }

    public Partida getPartida() {
        return partida;
    }

    public void setPartida(Partida partida) {
        this.partida = partida;
    }

    @Override
    public String toString() {
        return "Usuario{" + "nombre=" + nombre + ", lvl=" + lvl + '}';
    }

}
