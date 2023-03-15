package Hilos;

import javax.swing.JLabel;

public class ParpadeoDeLabels extends Thread {

    private javax.swing.JLabel label;
    int cantidad, Tiempoprendido, Tiempoapagado;
    boolean Ocultar = false, SetNull = false;

    public ParpadeoDeLabels(JLabel label, int cantidad, int Tiempoprendido, int Tiempoapagado) {
        this.label = label;
        this.cantidad = cantidad;
        this.Tiempoprendido = Tiempoprendido;
        this.Tiempoapagado = Tiempoapagado;
    }

    public ParpadeoDeLabels(JLabel label, int cantidad, int Tiempoprendido, int Tiempoapagado, boolean Ocultar) {
        this.label = label;
        this.cantidad = cantidad;
        this.Tiempoprendido = Tiempoprendido;
        this.Tiempoapagado = Tiempoapagado;
        this.Ocultar = Ocultar;
    }

    public ParpadeoDeLabels(JLabel label, int cantidad, int Tiempoprendido, int Tiempoapagado, boolean Ocultar, boolean SetNull) {
        this.label = label;
        this.cantidad = cantidad;
        this.Tiempoprendido = Tiempoprendido;
        this.Tiempoapagado = Tiempoapagado;
        this.Ocultar = Ocultar;
        this.SetNull = SetNull;
    }

    @Override
    public void run() {
        for (int i = 0; i < cantidad; i++) {
            CambiarVisible(false, Tiempoapagado);
            CambiarVisible(true, Tiempoprendido);
        }
        if (Ocultar) {
            label.setVisible(false);
        }
        if (SetNull) {
            label = null;
        }
    }

    private void CambiarVisible(boolean visible, int tiempo) {
        this.label.setVisible(visible);
        try {
            Thread.sleep(tiempo);
        } catch (InterruptedException ex) {
        }
    }
}
