package plantasvszombie_joselobo;

public class AdministracionDeRecursos {
    // javax.swing.JPanel() PanelControl_Soles;

    javax.swing.JPanel PanelControl_Soles;
    javax.swing.JPanel PanelControl_Proyectiles;
    javax.swing.JPanel PanelControl_Zombi;

    Main main;

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
    }

}
