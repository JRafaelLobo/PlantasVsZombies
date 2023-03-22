package plantasvszombie_joselobo;

import Binario.TxTEscaner;
import Niveles.*;
import Hilos.*;
import Plantas_Pack.*;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.io.*;
import java.util.ArrayList;
import java.util.TimerTask;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.sampled.*;
import javax.swing.*;
//import javafx.event.*;

public class Main extends javax.swing.JFrame {

    public Main() {
        initComponents();
        this.setLocationRelativeTo(null);
        Music = playMusic("./GameMusic\\Main.wav");
        Music.start();
        Music.loop(Clip.LOOP_CONTINUOUSLY);
        CambiarPantallaTiempo CPT = new CambiarPantallaTiempo(Jf_MenuPrincipal, this, 4000);
        CPT.start();
        BarraDeCarga BDC = new BarraDeCarga(0, 4000, JPB_CargaInicio);
        BDC.start();
        JP_DetectorMouse.setVisible(false);
        JP_DetectorMouse.setEnabled(false);
        JP_PanelBlancoSeleccionPlantas.setBackground(new Color(0, 0, 0, 110));
        JP_PanelBlancoSeleccionPlantas.setVisible(false);
        JP_PatioFrontal.setOpaque(false);
        FondoNormal.setOpaque(false);
        FondoTuto.setOpaque(false);
        escanerTxT = new TxTEscaner("./GameData");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Jf_MenuPrincipal = new javax.swing.JFrame();
        AbsoluteLayout_MenuPrincipal = new javax.swing.JPanel();
        tb_Nombre = new javax.swing.JTextField();
        P_TopBar2 = new javax.swing.JPanel();
        P_X2 = new javax.swing.JPanel();
        X2 = new javax.swing.JLabel();
        FondoMenuPrincipal = new javax.swing.JLabel();
        B_Adventure = new javax.swing.JButton();
        B_QUIT = new javax.swing.JButton();
        Jf_VideoIntro = new javax.swing.JFrame();
        jPanel5 = new javax.swing.JPanel();
        P_VideoIntro = new javax.swing.JPanel();
        P_TopBar4 = new javax.swing.JPanel();
        P_X4 = new javax.swing.JPanel();
        X4 = new javax.swing.JLabel();
        JF_PatioFrontal = new javax.swing.JFrame();
        lb_PauseButton = new javax.swing.JLabel();
        JP_PanelPlantas = new javax.swing.JPanel();
        lb_CantSoles = new javax.swing.JLabel();
        P_CartaLanzaguisantes = new Fondo("./GameImage\\card_peashooter.png");
        P_CartaNuez = new Fondo("./GameImage\\card_wallnut.png");
        P_CartaGirasol = new Fondo("./GameImage\\card_sunflower.png");
        P_CartaPetacereza = new Fondo("./GameImage\\card_cherrybomb.png");
        JP_ImagenCartas = new Fondo("./GameImage\\PanelPlantas.png");
        lb_Palita = new javax.swing.JLabel();
        P_TopBar3 = new javax.swing.JPanel();
        P_X3 = new javax.swing.JPanel();
        X3 = new javax.swing.JLabel();
        JP_PanelBlancoSeleccionPlantas = new javax.swing.JPanel();
        JP_Soles = new javax.swing.JPanel();
        JP_Proyectiles = new javax.swing.JPanel();
        JP_PatioFrontal = new javax.swing.JPanel();
        FondoTuto = new Fondo("./GameImage\\backlvl2reajustada.jpeg");
        FondoNormal = new Fondo("./GameImage\\FondoPatioRecortada.png");
        JP_DetectorMouse = new javax.swing.JPanel();
        jFrame1 = new javax.swing.JFrame();
        JP_PanelPlantastest = new Fondo("/.GameImage\\PanelPlantas.png");
        P_Carta3 = new javax.swing.JPanel();
        lb_Pause = new javax.swing.JLabel();
        JDialog_Pause = new javax.swing.JDialog();
        Icon_Pause = new javax.swing.JLabel();
        B_Cancelar = new javax.swing.JButton();
        B_Reanudar = new javax.swing.JButton();
        B_Reiniciar = new javax.swing.JButton();
        JDialog_Ganaste = new javax.swing.JDialog();
        jLabel1 = new javax.swing.JLabel();
        JPB_CargaInicio = new javax.swing.JProgressBar();
        jPanel1 = new javax.swing.JPanel();
        P_TopBar = new javax.swing.JPanel();
        P_X = new javax.swing.JPanel();
        X = new javax.swing.JLabel();
        Portada = new javax.swing.JLabel();

        Jf_MenuPrincipal.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        Jf_MenuPrincipal.setTitle("Plantas VS Zombies");
        Jf_MenuPrincipal.setLocationByPlatform(true);
        Jf_MenuPrincipal.setMinimumSize(new java.awt.Dimension(640, 430));
        Jf_MenuPrincipal.setName("MainFrame"); // NOI18N
        Jf_MenuPrincipal.setUndecorated(true);
        Jf_MenuPrincipal.setSize(new java.awt.Dimension(640, 430));

        AbsoluteLayout_MenuPrincipal.setMaximumSize(new java.awt.Dimension(640, 430));
        AbsoluteLayout_MenuPrincipal.setMinimumSize(new java.awt.Dimension(640, 460));
        AbsoluteLayout_MenuPrincipal.setPreferredSize(new java.awt.Dimension(640, 460));
        AbsoluteLayout_MenuPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tb_Nombre.setBackground(new java.awt.Color(77, 69, 48));
        tb_Nombre.setForeground(new java.awt.Color(255, 255, 255));
        AbsoluteLayout_MenuPrincipal.add(tb_Nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 200, 30));

        P_TopBar2.setBackground(new java.awt.Color(0, 0, 0));
        P_TopBar2.setForeground(new java.awt.Color(153, 255, 153));
        P_TopBar2.setPreferredSize(new java.awt.Dimension(640, 0));
        P_TopBar2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                P_TopBar2MouseDragged(evt);
            }
        });
        P_TopBar2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                P_TopBar2MousePressed(evt);
            }
        });

        P_X2.setBackground(new java.awt.Color(0, 0, 0));
        P_X2.setName(""); // NOI18N
        P_X2.setPreferredSize(new java.awt.Dimension(58, 30));
        P_X2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                P_X2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                P_X2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                P_X2MouseExited(evt);
            }
        });

        X2.setBackground(new java.awt.Color(0, 0, 0));
        X2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        X2.setForeground(new java.awt.Color(255, 255, 255));
        X2.setText("X");
        X2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        X2.setMaximumSize(new java.awt.Dimension(46, 22));
        X2.setMinimumSize(new java.awt.Dimension(46, 22));
        X2.setName(""); // NOI18N
        X2.setPreferredSize(new java.awt.Dimension(58, 30));

        javax.swing.GroupLayout P_X2Layout = new javax.swing.GroupLayout(P_X2);
        P_X2.setLayout(P_X2Layout);
        P_X2Layout.setHorizontalGroup(
            P_X2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(P_X2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(X2, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );
        P_X2Layout.setVerticalGroup(
            P_X2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(X2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout P_TopBar2Layout = new javax.swing.GroupLayout(P_TopBar2);
        P_TopBar2.setLayout(P_TopBar2Layout);
        P_TopBar2Layout.setHorizontalGroup(
            P_TopBar2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, P_TopBar2Layout.createSequentialGroup()
                .addGap(0, 582, Short.MAX_VALUE)
                .addComponent(P_X2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        P_TopBar2Layout.setVerticalGroup(
            P_TopBar2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(P_X2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        AbsoluteLayout_MenuPrincipal.add(P_TopBar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 640, 30));

        FondoMenuPrincipal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Fondos/Menu.jpg"))); // NOI18N
        AbsoluteLayout_MenuPrincipal.add(FondoMenuPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, -1, -1));

        B_Adventure.setText("Adventure");
        B_Adventure.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B_AdventureMouseClicked(evt);
            }
        });
        AbsoluteLayout_MenuPrincipal.add(B_Adventure, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 70, 260, 80));

        B_QUIT.setText("QUIT");
        B_QUIT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B_QUITMouseClicked(evt);
            }
        });
        AbsoluteLayout_MenuPrincipal.add(B_QUIT, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 363, 70, 80));

        javax.swing.GroupLayout Jf_MenuPrincipalLayout = new javax.swing.GroupLayout(Jf_MenuPrincipal.getContentPane());
        Jf_MenuPrincipal.getContentPane().setLayout(Jf_MenuPrincipalLayout);
        Jf_MenuPrincipalLayout.setHorizontalGroup(
            Jf_MenuPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Jf_MenuPrincipalLayout.createSequentialGroup()
                .addComponent(AbsoluteLayout_MenuPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        Jf_MenuPrincipalLayout.setVerticalGroup(
            Jf_MenuPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(AbsoluteLayout_MenuPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        Jf_VideoIntro.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        Jf_VideoIntro.setTitle("Plantas VS Zombies");
        Jf_VideoIntro.setLocationByPlatform(true);
        Jf_VideoIntro.setMinimumSize(new java.awt.Dimension(640, 430));
        Jf_VideoIntro.setName("MainFrame"); // NOI18N
        Jf_VideoIntro.setUndecorated(true);
        Jf_VideoIntro.setResizable(false);
        Jf_VideoIntro.setSize(new java.awt.Dimension(640, 430));

        jPanel5.setMaximumSize(new java.awt.Dimension(640, 430));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        javax.swing.GroupLayout P_VideoIntroLayout = new javax.swing.GroupLayout(P_VideoIntro);
        P_VideoIntro.setLayout(P_VideoIntroLayout);
        P_VideoIntroLayout.setHorizontalGroup(
            P_VideoIntroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 640, Short.MAX_VALUE)
        );
        P_VideoIntroLayout.setVerticalGroup(
            P_VideoIntroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );

        jPanel5.add(P_VideoIntro, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 640, 400));

        P_TopBar4.setBackground(new java.awt.Color(0, 0, 0));
        P_TopBar4.setForeground(new java.awt.Color(153, 255, 153));
        P_TopBar4.setPreferredSize(new java.awt.Dimension(640, 0));
        P_TopBar4.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                P_TopBar4MouseDragged(evt);
            }
        });
        P_TopBar4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                P_TopBar4MousePressed(evt);
            }
        });

        P_X4.setBackground(new java.awt.Color(0, 0, 0));
        P_X4.setName(""); // NOI18N
        P_X4.setPreferredSize(new java.awt.Dimension(58, 30));
        P_X4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                P_X4MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                P_X4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                P_X4MouseExited(evt);
            }
        });

        X4.setBackground(new java.awt.Color(0, 0, 0));
        X4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        X4.setForeground(new java.awt.Color(255, 255, 255));
        X4.setText("X");
        X4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        X4.setMaximumSize(new java.awt.Dimension(46, 22));
        X4.setMinimumSize(new java.awt.Dimension(46, 22));
        X4.setName(""); // NOI18N
        X4.setPreferredSize(new java.awt.Dimension(58, 30));

        javax.swing.GroupLayout P_X4Layout = new javax.swing.GroupLayout(P_X4);
        P_X4.setLayout(P_X4Layout);
        P_X4Layout.setHorizontalGroup(
            P_X4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(P_X4Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(X4, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );
        P_X4Layout.setVerticalGroup(
            P_X4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(X4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout P_TopBar4Layout = new javax.swing.GroupLayout(P_TopBar4);
        P_TopBar4.setLayout(P_TopBar4Layout);
        P_TopBar4Layout.setHorizontalGroup(
            P_TopBar4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, P_TopBar4Layout.createSequentialGroup()
                .addGap(0, 582, Short.MAX_VALUE)
                .addComponent(P_X4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        P_TopBar4Layout.setVerticalGroup(
            P_TopBar4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(P_X4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanel5.add(P_TopBar4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 640, 30));

        javax.swing.GroupLayout Jf_VideoIntroLayout = new javax.swing.GroupLayout(Jf_VideoIntro.getContentPane());
        Jf_VideoIntro.getContentPane().setLayout(Jf_VideoIntroLayout);
        Jf_VideoIntroLayout.setHorizontalGroup(
            Jf_VideoIntroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Jf_VideoIntroLayout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        Jf_VideoIntroLayout.setVerticalGroup(
            Jf_VideoIntroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Jf_VideoIntroLayout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        JF_PatioFrontal.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        JF_PatioFrontal.setTitle("Plantas VS Zombies");
        JF_PatioFrontal.setLocationByPlatform(true);
        JF_PatioFrontal.setMinimumSize(new java.awt.Dimension(640, 430));
        JF_PatioFrontal.setName("MainFrame"); // NOI18N
        JF_PatioFrontal.setUndecorated(true);
        JF_PatioFrontal.setResizable(false);
        JF_PatioFrontal.setSize(new java.awt.Dimension(640, 430));
        JF_PatioFrontal.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lb_PauseButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Fondos/PausaButton.png"))); // NOI18N
        lb_PauseButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb_PauseButtonMouseClicked(evt);
            }
        });
        JF_PatioFrontal.getContentPane().add(lb_PauseButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 30, -1, -1));

        JP_PanelPlantas.setMaximumSize(new java.awt.Dimension(380, 70));
        JP_PanelPlantas.setMinimumSize(new java.awt.Dimension(380, 70));
        JP_PanelPlantas.setName(""); // NOI18N
        JP_PanelPlantas.setPreferredSize(new java.awt.Dimension(380, 70));
        JP_PanelPlantas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lb_CantSoles.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lb_CantSoles.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_CantSoles.setText("Soles");
        JP_PanelPlantas.add(lb_CantSoles, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 60, 20));

        P_CartaLanzaguisantes.setBackground(new java.awt.Color(255, 255, 255));
        P_CartaLanzaguisantes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                P_CartaLanzaguisantesMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout P_CartaLanzaguisantesLayout = new javax.swing.GroupLayout(P_CartaLanzaguisantes);
        P_CartaLanzaguisantes.setLayout(P_CartaLanzaguisantesLayout);
        P_CartaLanzaguisantesLayout.setHorizontalGroup(
            P_CartaLanzaguisantesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );
        P_CartaLanzaguisantesLayout.setVerticalGroup(
            P_CartaLanzaguisantesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );

        JP_PanelPlantas.add(P_CartaLanzaguisantes, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 0, 60, 70));

        P_CartaNuez.setBackground(new java.awt.Color(255, 255, 255));
        P_CartaNuez.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                P_CartaNuezMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout P_CartaNuezLayout = new javax.swing.GroupLayout(P_CartaNuez);
        P_CartaNuez.setLayout(P_CartaNuezLayout);
        P_CartaNuezLayout.setHorizontalGroup(
            P_CartaNuezLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );
        P_CartaNuezLayout.setVerticalGroup(
            P_CartaNuezLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );

        JP_PanelPlantas.add(P_CartaNuez, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 0, 60, 70));

        P_CartaGirasol.setBackground(new java.awt.Color(255, 255, 255));
        P_CartaGirasol.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                P_CartaGirasolMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout P_CartaGirasolLayout = new javax.swing.GroupLayout(P_CartaGirasol);
        P_CartaGirasol.setLayout(P_CartaGirasolLayout);
        P_CartaGirasolLayout.setHorizontalGroup(
            P_CartaGirasolLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );
        P_CartaGirasolLayout.setVerticalGroup(
            P_CartaGirasolLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );

        JP_PanelPlantas.add(P_CartaGirasol, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 0, 60, 70));

        P_CartaPetacereza.setBackground(new java.awt.Color(255, 255, 255));
        P_CartaPetacereza.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                P_CartaPetacerezaMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout P_CartaPetacerezaLayout = new javax.swing.GroupLayout(P_CartaPetacereza);
        P_CartaPetacereza.setLayout(P_CartaPetacerezaLayout);
        P_CartaPetacerezaLayout.setHorizontalGroup(
            P_CartaPetacerezaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );
        P_CartaPetacerezaLayout.setVerticalGroup(
            P_CartaPetacerezaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        JP_PanelPlantas.add(P_CartaPetacereza, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 0, 60, 70));

        javax.swing.GroupLayout JP_ImagenCartasLayout = new javax.swing.GroupLayout(JP_ImagenCartas);
        JP_ImagenCartas.setLayout(JP_ImagenCartasLayout);
        JP_ImagenCartasLayout.setHorizontalGroup(
            JP_ImagenCartasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 380, Short.MAX_VALUE)
        );
        JP_ImagenCartasLayout.setVerticalGroup(
            JP_ImagenCartasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );

        JP_PanelPlantas.add(JP_ImagenCartas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 380, 70));

        JF_PatioFrontal.getContentPane().add(JP_PanelPlantas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 380, 70));

        lb_Palita.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Fondos/Pala.png"))); // NOI18N
        lb_Palita.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb_PalitaMouseClicked(evt);
            }
        });
        JF_PatioFrontal.getContentPane().add(lb_Palita, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 35, -1, -1));

        P_TopBar3.setBackground(new java.awt.Color(0, 0, 0));
        P_TopBar3.setForeground(new java.awt.Color(153, 255, 153));
        P_TopBar3.setPreferredSize(new java.awt.Dimension(640, 0));
        P_TopBar3.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                P_TopBar3MouseDragged(evt);
            }
        });
        P_TopBar3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                P_TopBar3MousePressed(evt);
            }
        });

        P_X3.setBackground(new java.awt.Color(0, 0, 0));
        P_X3.setName(""); // NOI18N
        P_X3.setPreferredSize(new java.awt.Dimension(58, 30));
        P_X3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                P_X3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                P_X3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                P_X3MouseExited(evt);
            }
        });

        X3.setBackground(new java.awt.Color(0, 0, 0));
        X3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        X3.setForeground(new java.awt.Color(255, 255, 255));
        X3.setText("X");
        X3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        X3.setMaximumSize(new java.awt.Dimension(46, 22));
        X3.setMinimumSize(new java.awt.Dimension(46, 22));
        X3.setName(""); // NOI18N
        X3.setPreferredSize(new java.awt.Dimension(58, 30));

        javax.swing.GroupLayout P_X3Layout = new javax.swing.GroupLayout(P_X3);
        P_X3.setLayout(P_X3Layout);
        P_X3Layout.setHorizontalGroup(
            P_X3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(P_X3Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(X3, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );
        P_X3Layout.setVerticalGroup(
            P_X3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(X3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout P_TopBar3Layout = new javax.swing.GroupLayout(P_TopBar3);
        P_TopBar3.setLayout(P_TopBar3Layout);
        P_TopBar3Layout.setHorizontalGroup(
            P_TopBar3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, P_TopBar3Layout.createSequentialGroup()
                .addGap(0, 582, Short.MAX_VALUE)
                .addComponent(P_X3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        P_TopBar3Layout.setVerticalGroup(
            P_TopBar3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(P_X3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        JF_PatioFrontal.getContentPane().add(P_TopBar3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 640, 30));

        JP_PanelBlancoSeleccionPlantas.setBackground(new java.awt.Color(255, 255, 255));
        JP_PanelBlancoSeleccionPlantas.setForeground(new java.awt.Color(102, 102, 102));
        JP_PanelBlancoSeleccionPlantas.setMaximumSize(new java.awt.Dimension(640, 430));

        javax.swing.GroupLayout JP_PanelBlancoSeleccionPlantasLayout = new javax.swing.GroupLayout(JP_PanelBlancoSeleccionPlantas);
        JP_PanelBlancoSeleccionPlantas.setLayout(JP_PanelBlancoSeleccionPlantasLayout);
        JP_PanelBlancoSeleccionPlantasLayout.setHorizontalGroup(
            JP_PanelBlancoSeleccionPlantasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 640, Short.MAX_VALUE)
        );
        JP_PanelBlancoSeleccionPlantasLayout.setVerticalGroup(
            JP_PanelBlancoSeleccionPlantasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );

        JF_PatioFrontal.getContentPane().add(JP_PanelBlancoSeleccionPlantas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, -1, -1));

        JP_Soles.setOpaque(false);
        JP_Soles.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        JF_PatioFrontal.getContentPane().add(JP_Soles, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 640, 430));

        JP_Proyectiles.setOpaque(false);
        JP_Proyectiles.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        JF_PatioFrontal.getContentPane().add(JP_Proyectiles, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 640, 430));

        JP_PatioFrontal.setMaximumSize(new java.awt.Dimension(640, 430));
        JP_PatioFrontal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        JF_PatioFrontal.getContentPane().add(JP_PatioFrontal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 430));

        FondoTuto.setMaximumSize(new java.awt.Dimension(640, 400));
        FondoTuto.setMinimumSize(new java.awt.Dimension(640, 400));
        FondoTuto.setPreferredSize(new java.awt.Dimension(640, 400));

        javax.swing.GroupLayout FondoTutoLayout = new javax.swing.GroupLayout(FondoTuto);
        FondoTuto.setLayout(FondoTutoLayout);
        FondoTutoLayout.setHorizontalGroup(
            FondoTutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 640, Short.MAX_VALUE)
        );
        FondoTutoLayout.setVerticalGroup(
            FondoTutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );

        JF_PatioFrontal.getContentPane().add(FondoTuto, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 640, 400));

        javax.swing.GroupLayout FondoNormalLayout = new javax.swing.GroupLayout(FondoNormal);
        FondoNormal.setLayout(FondoNormalLayout);
        FondoNormalLayout.setHorizontalGroup(
            FondoNormalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 640, Short.MAX_VALUE)
        );
        FondoNormalLayout.setVerticalGroup(
            FondoNormalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );

        JF_PatioFrontal.getContentPane().add(FondoNormal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 640, 400));

        JP_DetectorMouse.setOpaque(false);
        JP_DetectorMouse.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JP_DetectorMouseMouseClicked(evt);
            }
        });
        JP_DetectorMouse.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        JF_PatioFrontal.getContentPane().add(JP_DetectorMouse, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 640, 430));

        JP_PanelPlantastest.setMaximumSize(new java.awt.Dimension(544, 100));
        JP_PanelPlantastest.setMinimumSize(new java.awt.Dimension(544, 100));
        JP_PanelPlantastest.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        P_Carta3.setBackground(new java.awt.Color(255, 255, 255));
        P_Carta3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        JP_PanelPlantastest.add(P_Carta3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 10, 40, 50));

        lb_Pause.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Fondos/Pause.png"))); // NOI18N

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JP_PanelPlantastest, javax.swing.GroupLayout.DEFAULT_SIZE, 553, Short.MAX_VALUE)
            .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jFrame1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(lb_Pause)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jFrame1Layout.createSequentialGroup()
                .addComponent(JP_PanelPlantastest, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 204, Short.MAX_VALUE))
            .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jFrame1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(lb_Pause)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        JDialog_Pause.setUndecorated(true);
        JDialog_Pause.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Icon_Pause.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Fondos/Pause.png"))); // NOI18N
        JDialog_Pause.getContentPane().add(Icon_Pause, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        B_Cancelar.setText("r");
        B_Cancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B_CancelarMouseClicked(evt);
            }
        });
        JDialog_Pause.getContentPane().add(B_Cancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 220, 110, -1));

        B_Reanudar.setText("r");
        B_Reanudar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B_ReanudarMouseClicked(evt);
            }
        });
        JDialog_Pause.getContentPane().add(B_Reanudar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 110, -1));

        B_Reiniciar.setText("r");
        B_Reiniciar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B_ReiniciarMouseClicked(evt);
            }
        });
        JDialog_Pause.getContentPane().add(B_Reiniciar, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 190, 110, -1));

        JDialog_Ganaste.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Ganaste yippe!");
        JDialog_Ganaste.getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 100, -1, -1));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Plantas VS Zombies");
        setLocationByPlatform(true);
        setMinimumSize(new java.awt.Dimension(640, 430));
        setName("MainFrame"); // NOI18N
        setUndecorated(true);
        setResizable(false);
        setSize(new java.awt.Dimension(640, 430));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JPB_CargaInicio.setBackground(new java.awt.Color(41, 0, 0));
        JPB_CargaInicio.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(JPB_CargaInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 370, 410, 30));

        jPanel1.setMaximumSize(new java.awt.Dimension(640, 430));
        jPanel1.setMinimumSize(new java.awt.Dimension(640, 430));
        jPanel1.setPreferredSize(new java.awt.Dimension(640, 430));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        P_TopBar.setBackground(new java.awt.Color(0, 0, 0));
        P_TopBar.setForeground(new java.awt.Color(153, 255, 153));
        P_TopBar.setPreferredSize(new java.awt.Dimension(640, 0));
        P_TopBar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                P_TopBarMouseDragged(evt);
            }
        });
        P_TopBar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                P_TopBarMousePressed(evt);
            }
        });

        P_X.setBackground(new java.awt.Color(0, 0, 0));
        P_X.setName(""); // NOI18N
        P_X.setPreferredSize(new java.awt.Dimension(58, 30));
        P_X.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                P_XMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                P_XMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                P_XMouseExited(evt);
            }
        });

        X.setBackground(new java.awt.Color(0, 0, 0));
        X.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        X.setForeground(new java.awt.Color(255, 255, 255));
        X.setText("X");
        X.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        X.setMaximumSize(new java.awt.Dimension(46, 22));
        X.setMinimumSize(new java.awt.Dimension(46, 22));
        X.setName(""); // NOI18N
        X.setPreferredSize(new java.awt.Dimension(58, 30));

        javax.swing.GroupLayout P_XLayout = new javax.swing.GroupLayout(P_X);
        P_X.setLayout(P_XLayout);
        P_XLayout.setHorizontalGroup(
            P_XLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(P_XLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(X, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );
        P_XLayout.setVerticalGroup(
            P_XLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(X, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout P_TopBarLayout = new javax.swing.GroupLayout(P_TopBar);
        P_TopBar.setLayout(P_TopBarLayout);
        P_TopBarLayout.setHorizontalGroup(
            P_TopBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, P_TopBarLayout.createSequentialGroup()
                .addGap(0, 582, Short.MAX_VALUE)
                .addComponent(P_X, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        P_TopBarLayout.setVerticalGroup(
            P_TopBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(P_X, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanel1.add(P_TopBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 640, 30));

        Portada.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Fondos/Portada.jpg"))); // NOI18N
        jPanel1.add(Portada, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void P_TopBarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_P_TopBarMousePressed
        // TODO add your handling code here:
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_P_TopBarMousePressed

    private void P_TopBarMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_P_TopBarMouseDragged
        // TODO add your handling code here:
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_P_TopBarMouseDragged

    private void P_XMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_P_XMouseClicked
        // TODO add your handling code here:4
        System.exit(0);
    }//GEN-LAST:event_P_XMouseClicked

    private void P_XMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_P_XMouseEntered
        // TODO add your handling code here:
        P_X.setBackground(Color.red);
    }//GEN-LAST:event_P_XMouseEntered

    private void P_XMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_P_XMouseExited
        // TODO add your handling code here:
        P_X.setBackground(Color.BLACK);
    }//GEN-LAST:event_P_XMouseExited

    private void P_X2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_P_X2MouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_P_X2MouseClicked

    private void P_X2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_P_X2MouseEntered
        P_X2.setBackground(Color.red);
    }//GEN-LAST:event_P_X2MouseEntered

    private void P_X2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_P_X2MouseExited
        P_X2.setBackground(Color.BLACK);
    }//GEN-LAST:event_P_X2MouseExited

    private void P_TopBar2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_P_TopBar2MouseDragged
        // TODO add your handling code here:
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        Jf_MenuPrincipal.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_P_TopBar2MouseDragged

    private void P_TopBar2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_P_TopBar2MousePressed
        // TODO add your handling code here:
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_P_TopBar2MousePressed

    private void B_AdventureMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B_AdventureMouseClicked
        // TODO add your handling code here:
        /*
        --module-path "C:\Users\rinal\Desktop\rafa tareas\Nuevos\Progra 2\PlantasVsZombie_JoseLobo\LibreriasPersonalizadas\javafx-sdk-19.0.2.1\lib" --add-modules javafx.controls,javafx.fxml
        --add-modules javafx.web,javafx.media,javafx.swing
         */
        boolean nuevo = true;
        for (Usuario usuario : escanerTxT.getUsuarios()) {
            if (usuario.getNombre().equals(tb_Nombre.getText())) {
                this.UserActual = usuario;
                nuevo = false;
                break;
            }
        }
        if (nuevo) {
            escanerTxT.getUsuarios().add(new Usuario(tb_Nombre.getText(), 0));
            this.UserActual = escanerTxT.getUsuarios().get(escanerTxT.getUsuarios().size() - 1);
        }

        if (UserActual.getLvl() == 0) {
            //PatioFondoTuto.setVisible(true);
            //PatioFondo.setVisible(false);
            Music.stop();
            //prueba

            try {
                Integer.parseInt("a");/*
                video = new Reproductor();
                this.video.setJpanel(P_VideoIntro);
                this.video.setRuta("GameVideo\\VideoIntro.mp4");
                this.video.mostrarVideo(1);
                this.video.reproducir();
                Jf_VideoIntro.pack();
                Jf_MenuPrincipal.setVisible(false);
                 */ //fin
                /*
                Jf_VideoIntro.setLocationRelativeTo(Jf_MenuPrincipal);
                Jf_VideoIntro.setVisible(true);
                
                CambiarPantallaTiempo CPT = new CambiarPantallaTiempo(JF_PatioFrontal, Jf_VideoIntro, 10000);//"./GameMusic\\Day_Stage.wav"
                Timer T = new Timer(10000, null);
                T.start();
                T.addActionListener(new java.awt.event.ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        Music = playMusic("./GameMusic\\Day_Stage.wav");
                        Music.start();
                        Music.loop(Clip.LOOP_CONTINUOUSLY);
                        Nivel_1 N1 = new Nivel_1(Main.this);
                        Thread TN1 = new Thread(N1);
                        TN1.start();
                        T.stop();
                    }
                });
                Thread CambiarMain = new Thread(CPT);
                CambiarMain.start();
                 */
            } catch (Exception e) {
                Music = playMusic("./GameMusic\\Day_Stage.wav");
                Music.start();
                Music.loop(Clip.LOOP_CONTINUOUSLY);
                JF_PatioFrontal.pack();
                JF_PatioFrontal.setLocationRelativeTo(Jf_MenuPrincipal);
                Jf_MenuPrincipal.setVisible(false);
                JF_PatioFrontal.setVisible(true);
                JP_PatioFrontal.setOpaque(false);
                FondoNormal.setVisible(false);
                FondoTuto.setVisible(true);
                partida = new Nivel_1(Main.this);
                partida.start();
                JF_PatioFrontal.setVisible(true);
                //JP_DetectorMouse.setVisible(true);
                //JP_DetectorMouse.setEnabled(true);
            }

        } else {
            //PatioFondoTuto.setVisible(true);
            //PatioFondo.setVisible(false);
            Music.stop();
            JF_PatioFrontal.pack();
            Jf_MenuPrincipal.setVisible(false);
            JF_PatioFrontal.setLocationRelativeTo(Jf_MenuPrincipal);
            Music.stop();
            JF_PatioFrontal.setVisible(true);

        }
    }//GEN-LAST:event_B_AdventureMouseClicked

    private void P_X4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_P_X4MouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_P_X4MouseClicked

    private void P_X4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_P_X4MouseEntered
        // TODO add your handling code here:
        P_X4.setBackground(Color.RED);
    }//GEN-LAST:event_P_X4MouseEntered

    private void P_X4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_P_X4MouseExited
        // TODO add your handling code here:
        P_X4.setBackground(Color.BLACK);
    }//GEN-LAST:event_P_X4MouseExited

    private void P_TopBar4MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_P_TopBar4MouseDragged
        // TODO add your handling code here:
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        Jf_VideoIntro.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_P_TopBar4MouseDragged

    private void P_TopBar4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_P_TopBar4MousePressed
        // TODO add your handling code here:
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_P_TopBar4MousePressed

    private void P_X3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_P_X3MouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_P_X3MouseClicked

    private void P_X3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_P_X3MouseEntered
        // TODO add your handling code here:
        P_X3.setBackground(Color.RED);
    }//GEN-LAST:event_P_X3MouseEntered

    private void P_X3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_P_X3MouseExited
        // TODO add your handling code here:
        P_X3.setBackground(Color.BLACK);
    }//GEN-LAST:event_P_X3MouseExited

    private void P_TopBar3MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_P_TopBar3MouseDragged
        // TODO add your handling code here:
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        JF_PatioFrontal.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_P_TopBar3MouseDragged

    private void P_TopBar3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_P_TopBar3MousePressed
        // TODO add your handling code here:
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_P_TopBar3MousePressed

    private void B_QUITMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B_QUITMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_B_QUITMouseClicked

    private void P_CartaGirasolMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_P_CartaGirasolMouseClicked
        // TODO add your handling code here:
        plantaSelecionada = 0;
        JP_PanelBlancoSeleccionPlantas.setVisible(true);
        JP_DetectorMouse.setVisible(true);
        JP_DetectorMouse.setEnabled(true);
    }//GEN-LAST:event_P_CartaGirasolMouseClicked

    private void P_CartaLanzaguisantesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_P_CartaLanzaguisantesMouseClicked
        // TODO add your handling code here:
        plantaSelecionada = 1;
        JP_PanelBlancoSeleccionPlantas.setVisible(true);
        JP_DetectorMouse.setVisible(true);
        JP_DetectorMouse.setEnabled(true);
    }//GEN-LAST:event_P_CartaLanzaguisantesMouseClicked

    private void P_CartaNuezMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_P_CartaNuezMouseClicked
        // TODO add your handling code here:
        plantaSelecionada = 2;
        JP_PanelBlancoSeleccionPlantas.setVisible(true);
        JP_DetectorMouse.setVisible(true);
        JP_DetectorMouse.setEnabled(true);
    }//GEN-LAST:event_P_CartaNuezMouseClicked

    private void P_CartaPetacerezaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_P_CartaPetacerezaMouseClicked
        // TODO add your handling code here:
        plantaSelecionada = 3;
        JP_PanelBlancoSeleccionPlantas.setVisible(true);
        JP_DetectorMouse.setVisible(true);
        JP_DetectorMouse.setEnabled(true);
    }//GEN-LAST:event_P_CartaPetacerezaMouseClicked

    private void JP_DetectorMouseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JP_DetectorMouseMouseClicked
        // TODO add your handling code here:
        if (plantaSelecionada != -1) {
            eliminarPlanta = false;
            int x = evt.getX();
            int y = evt.getY() - 30;
            System.out.println("x:" + x + " y:" + y);
            int fila = partida.GetFilasAnalisis(y);
            int columna = partida.GetColumnaAnalisis(x);
            partida.Plantar(fila, columna, plantaSelecionada);
        }
        if (eliminarPlanta) {
            int x = evt.getX();
            int y = evt.getY() - 30;
            //System.out.println("x:" + x + " y:" + y);
            int fila = partida.GetFilasAnalisis(y);
            int columna = partida.GetColumnaAnalisis(x);
            partida.pala(fila, columna);
            JP_PanelBlancoSeleccionPlantas.setVisible(false);
        }
        JP_DetectorMouse.setVisible(false);
        JP_DetectorMouse.setEnabled(false);
    }//GEN-LAST:event_JP_DetectorMouseMouseClicked

    private void lb_PalitaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_PalitaMouseClicked
        // TODO add your handling code here:
        JP_DetectorMouse.setVisible(true);
        JP_DetectorMouse.setEnabled(true);
        eliminarPlanta = true;
        JP_PanelBlancoSeleccionPlantas.setVisible(true);

    }//GEN-LAST:event_lb_PalitaMouseClicked

    private void lb_PauseButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_PauseButtonMouseClicked
        // TODO add your handling code here:ç
        Clip effecto = playMusic("./GameMusic\\SoundEffects\\PauseSound.wav");
        effecto.start();
        partida.pause();
        try {
            JDialog_Pause.pack();
            JDialog_Pause.setLocationRelativeTo(JF_PatioFrontal);
            JDialog_Pause.setVisible(true);
            JDialog_Pause.setModal(true);
        } catch (Exception e) {
        }
    }//GEN-LAST:event_lb_PauseButtonMouseClicked

    private void B_ReanudarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B_ReanudarMouseClicked
        // TODO add your handling code here:
        Clip effecto = playMusic("./GameMusic\\SoundEffects\\PauseSound.wav");
        effecto.start();
        partida.Continue();
        try {
            JDialog_Pause.setModal(false);
            JDialog_Pause.dispose();
        } catch (Exception e) {
        }
    }//GEN-LAST:event_B_ReanudarMouseClicked

    private void B_ReiniciarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B_ReiniciarMouseClicked
        // TODO add your handling code here:
        partida.Reiniciar();
        try {
            JDialog_Pause.setModal(false);
            JDialog_Pause.dispose();
        } catch (Exception e) {
        }
        switch (UserActual.getLvl()) {
            case 1:
                partida = new Nivel_1(this);
                break;
            case 2:
                partida = new Nivel_2(this);
                break;
            case 3:
                partida = new Nivel_3(this);
                break;
        }
        partida.start();
        Music.start();
    }//GEN-LAST:event_B_ReiniciarMouseClicked

    private void B_CancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B_CancelarMouseClicked
        Music.stop();
        //aqui pasa el guardar partida

        try {
            escanerTxT.escribirArchivo();
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        Music = playMusic("./GameMusic\\Main.wav");
        Music.start();
        Music.loop(Clip.LOOP_CONTINUOUSLY);

    }//GEN-LAST:event_B_CancelarMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
        //Aqui esta el main
    }

    public static Clip playMusic(String filepath) {
        try {
            File music = new File(filepath);
            AudioInputStream AudioImput = AudioSystem.getAudioInputStream(music);
            Clip clip = AudioSystem.getClip();
            clip.open(AudioImput);
            return clip;
        } catch (Exception e) {
            System.out.println("El Archivo no Existe");
            e.printStackTrace();
        }
        return null;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel AbsoluteLayout_MenuPrincipal;
    private javax.swing.JButton B_Adventure;
    private javax.swing.JButton B_Cancelar;
    private javax.swing.JButton B_QUIT;
    private javax.swing.JButton B_Reanudar;
    private javax.swing.JButton B_Reiniciar;
    private javax.swing.JLabel FondoMenuPrincipal;
    private javax.swing.JPanel FondoNormal;
    private javax.swing.JPanel FondoTuto;
    private javax.swing.JLabel Icon_Pause;
    public javax.swing.JDialog JDialog_Ganaste;
    public javax.swing.JDialog JDialog_Pause;
    private javax.swing.JFrame JF_PatioFrontal;
    private javax.swing.JProgressBar JPB_CargaInicio;
    public javax.swing.JPanel JP_DetectorMouse;
    private javax.swing.JPanel JP_ImagenCartas;
    public javax.swing.JPanel JP_PanelBlancoSeleccionPlantas;
    public javax.swing.JPanel JP_PanelPlantas;
    private javax.swing.JPanel JP_PanelPlantastest;
    public javax.swing.JPanel JP_PatioFrontal;
    public javax.swing.JPanel JP_Proyectiles;
    public javax.swing.JPanel JP_Soles;
    private javax.swing.JFrame Jf_MenuPrincipal;
    private javax.swing.JFrame Jf_VideoIntro;
    private javax.swing.JPanel P_Carta3;
    private javax.swing.JPanel P_CartaGirasol;
    private javax.swing.JPanel P_CartaLanzaguisantes;
    private javax.swing.JPanel P_CartaNuez;
    private javax.swing.JPanel P_CartaPetacereza;
    private javax.swing.JPanel P_TopBar;
    private javax.swing.JPanel P_TopBar2;
    private javax.swing.JPanel P_TopBar3;
    private javax.swing.JPanel P_TopBar4;
    private javax.swing.JPanel P_VideoIntro;
    private javax.swing.JPanel P_X;
    private javax.swing.JPanel P_X2;
    private javax.swing.JPanel P_X3;
    private javax.swing.JPanel P_X4;
    private javax.swing.JLabel Portada;
    private javax.swing.JLabel X;
    private javax.swing.JLabel X2;
    private javax.swing.JLabel X3;
    private javax.swing.JLabel X4;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel5;
    public javax.swing.JLabel lb_CantSoles;
    private javax.swing.JLabel lb_Palita;
    private javax.swing.JLabel lb_Pause;
    private javax.swing.JLabel lb_PauseButton;
    private javax.swing.JTextField tb_Nombre;
    // End of variables declaration//GEN-END:variables
//mis variables
    private int xMouse, yMouse;
    private Usuario UserActual;
    public Clip Music;
    public boolean eliminarPlanta;
    private TxTEscaner escanerTxT;
    //private Reproductor video = new Reproductor();
    int plantaSelecionada = -1;
    public Partida partida;
    public double VolumenMusica;
    public double VolumenEffectos;

    /*
    plantaSelecionada
    -1: null
    0: Girasol
    1: Lanzaguisante
    2: Nuez
    3: Petacereza
     */
    public javax.swing.JLabel getCantSoles() {
        return lb_CantSoles;
    }

    public void SetTextCantSoles(String text) {
        lb_CantSoles.setText(text);
    }

    //clase dentro de otra clase, nunca pense que lo iba a utilizar pero ya pos
    class Fondo extends JPanel {

        public Fondo(String direccion) {
            this.direccion = direccion;
        }

        private String direccion;
        private Image imagen;

        public void paint(Graphics g) {
            imagen = new ImageIcon(direccion).getImage();
            g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
            setOpaque(false);
            super.paint(g);
        }
    }
}
