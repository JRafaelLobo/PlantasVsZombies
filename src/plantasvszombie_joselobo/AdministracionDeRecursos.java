package plantasvszombie_joselobo;

import java.io.Serializable;

public class AdministracionDeRecursos implements Serializable{
    // javax.swing.JPanel() PanelControl_Soles;

    //transient
    public transient javax.swing.JPanel PanelControl_Soles;
    public transient javax.swing.JPanel PanelControl_Proyectiles;
    public transient javax.swing.JPanel PanelControl_Zombi;
    public transient javax.swing.JPanel PanelControl_Plantas;
    public Usuario UsuarioActual ;

    private Main main;

    public AdministracionDeRecursos(Main main) {
        this.main = main;
        PanelControl_Soles = new javax.swing.JPanel();
        PanelControl_Soles.setOpaque(false);
        PanelControl_Soles.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        this.main.JP_Soles.add(PanelControl_Soles, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 640, 430));
        PanelControl_Proyectiles = new javax.swing.JPanel();
        PanelControl_Proyectiles.setOpaque(false);
        PanelControl_Proyectiles.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        this.main.JP_Proyectiles.add(PanelControl_Proyectiles, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 640, 430));
        PanelControl_Zombi = new javax.swing.JPanel();
        PanelControl_Zombi.setOpaque(false);
        PanelControl_Zombi.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        this.main.JP_PatioFrontal.add(PanelControl_Zombi, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 640, 430));
        PanelControl_Plantas = new javax.swing.JPanel();
        PanelControl_Plantas.setOpaque(false);
        PanelControl_Plantas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        this.main.JP_PatioFrontal.add(PanelControl_Plantas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 640, 430));
        UsuarioActual = this.main.UserActual;
    }

    public Main getMain() {
        return main;
    }

    public void setMain(Main main) {
        this.main = main;
    }

    public void EliminarTodo() {
        this.main.JP_PatioFrontal.remove(PanelControl_Plantas);
        this.main.JP_PatioFrontal.remove(PanelControl_Zombi);
        this.main.JP_Proyectiles.remove(PanelControl_Proyectiles);
        this.main.JP_Soles.remove(PanelControl_Soles);
    }

}
