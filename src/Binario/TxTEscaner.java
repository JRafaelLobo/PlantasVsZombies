/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Binario;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import plantasvszombie_joselobo.Usuario;

/**
 *
 * @author Rafael Jr
 */
public class TxTEscaner {

    File archivo;
    ArrayList<Usuario> usuarios = new ArrayList();

    public TxTEscaner(String ruta) {
        this.archivo = new File(ruta);
    }

    public void escribirArchivo() throws IOException {
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(archivo, false);
            bw = new BufferedWriter(fw);
            for (Usuario t : usuarios) {
                bw.write("#####################################");
                bw.write("Nombre: '" + t.getNombre() + "'");
                bw.write("\n");
                bw.write("Nivel: '" + t.getLvl() + "'");
                bw.write("\n");
                bw.write("#####################################");
            }
            bw.flush();
        } catch (Exception ex) {
        }
        bw.close();
        fw.close();
    }

    public void cargarArchivo() {
        Scanner sc = null;
        if (archivo.exists()) {
            try {
                sc = new Scanner(archivo);
                while (sc.hasNext()) {
                    String[] linea = sc.nextLine().split("'");
                    if (linea[0].contains("Nombre")) {
                        String nombre = linea[1];
                        String[] linea2 = sc.nextLine().split("'");
                        if (linea2[0].contains("Nivel")) {
                            int nivel = Integer.parseInt(linea2[1]);
                            usuarios.add(new Usuario(nombre, nivel));
                        }
                    }

                }
            } catch (Exception ex) {
            }
            sc.close();
        }//FIN IF
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    public ArrayList<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(ArrayList<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

}
