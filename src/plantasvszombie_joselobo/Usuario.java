package plantasvszombie_joselobo;

public class Usuario {

    private String nombre;
    private int lvl;
    private Partida partida;
    private boolean PrimeraVez;

    public Usuario(String nombre, int lvl, Partida partida, boolean PrimeraVez) {
        this.nombre = nombre;
        this.lvl = lvl;
        this.partida = partida;
        this.PrimeraVez = PrimeraVez;
    }

    public Usuario(String nombre, int lvl, boolean PrimeraVez) {
        this.nombre = nombre;
        this.lvl = lvl;
        this.PrimeraVez = PrimeraVez;
    }

    public Usuario() {
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

    public Partida getPartida() {
        return partida;
    }

    public void setPartida(Partida partida) {
        this.partida = partida;
    }

    public boolean isPrimeraVez() {
        return PrimeraVez;
    }

    public void setPrimeraVez(boolean PrimeraVez) {
        this.PrimeraVez = PrimeraVez;
    }

    @Override
    public String toString() {
        return "Usuario{" + "nombre=" + nombre + ", lvl=" + lvl + ", partida=" + partida + ", PrimeraVez=" + PrimeraVez + '}';
    }

}
