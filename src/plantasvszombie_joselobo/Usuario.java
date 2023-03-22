package plantasvszombie_joselobo;

import java.io.Serializable;

public class Usuario implements Serializable {

    private String nombre;
    private int lvl;

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


    @Override
    public String toString() {
        return "Usuario{" + "nombre=" + nombre + ", lvl=" + lvl + '}';
    }

}
