package Binario;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import plantasvszombie_joselobo.Partida;

public class GuardadoDePartida {

    Partida P;
    File archivo;

    public GuardadoDePartida(String ruta) {
        archivo = new File(ruta);
    }

    public GuardadoDePartida(Partida P) {
        this.P = P;
    }

    public Partida getP() {
        return P;
    }

    public void setP(Partida P) {
        this.P = P;
    }

    public void cargarArchivo() {
        try {
            if (archivo.exists()) {
                FileInputStream entrada = new FileInputStream(archivo);
                ObjectInputStream objeto = new ObjectInputStream(entrada);
                try {
                    P = (Partida) objeto.readObject();
                } catch (EOFException e) {
                    //encontro el final del archivo
                }
                objeto.close();
                entrada.close();
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void escribirArchivo(Partida P) {
        this.P = P;
        FileOutputStream fw = null;
        ObjectOutputStream bw = null;
        try {
            fw = new FileOutputStream(archivo);
            bw = new ObjectOutputStream(fw);
            bw.writeObject(P);
            bw.flush();
        } catch (Exception ex) {
        } finally {
            try {
                bw.close();
                fw.close();
            } catch (Exception ex) {
            }
        }
    }

    public boolean FileExist() {
        return archivo.exists();

    }
}
