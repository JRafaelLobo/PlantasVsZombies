package Plantas_Pack;

import Hilos.ParpadeoDeLabels;
import java.awt.Rectangle;
import plantasvszombie_joselobo.Main;
import plantasvszombie_joselobo.Partida;

public class Planta extends Thread {

    protected int vida = 100, tiempoRecarga = 3000, dano = 20, tiempoDeAtaque = 1500, x, y, costo = 100, fila;
    protected Main main;
    Rectangle RPlantaHitbox;
    Partida partida;

    public Planta(int x, int y, int fila, Main main, Partida partida) {
        this.x = x;
        this.y = y;
        this.fila = fila;
        this.main = main;
        this.partida = partida;
        this.RPlantaHitbox = new Rectangle(x, y, 35, 70);

    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getTiempoRecarga() {
        return tiempoRecarga;
    }

    public void setTiempoRecarga(int tiempoRecarga) {
        this.tiempoRecarga = tiempoRecarga;
    }

    public int getDano() {
        return dano;
    }

    public void setDano(int dano) {
        this.dano = dano;
    }

    public int getTiempoDeAtaque() {
        return tiempoDeAtaque;
    }

    public void setTiempoDeAtaque(int tiempoDeAtaque) {
        this.tiempoDeAtaque = tiempoDeAtaque;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }

    public Main getMain() {
        return main;
    }

    public void setMain(Main main) {
        this.main = main;
    }

    public void Attack() {

    }

    public int getFila() {
        return fila;
    }

    public void setFila(int fila) {
        this.fila = fila;
    }

    public void reducirVida(int vida) {
        this.vida = this.vida - vida;
        Parpadear();
    }

    public Rectangle getRPlantaHitbox() {
        return RPlantaHitbox;
    }

    public void setRPlantaHitbox(Rectangle RPlantaHitbox) {
        this.RPlantaHitbox = RPlantaHitbox;
    }

    @Override
    public void run() {

    }

    public void build() {
    }

    public void Parpadear() {

    }
}
