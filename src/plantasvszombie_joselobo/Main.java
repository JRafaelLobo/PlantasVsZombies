package plantasvszombie_joselobo;

import Hilos.*;
import Plantas_Pack.*;
import java.awt.Color;
import java.io.*;
import javax.sound.sampled.*;
import javax.swing.*;

public class Main extends javax.swing.JFrame {
    
    public Main() {
        initComponents();
        this.setLocationRelativeTo(null);
        Music = playMusic("./GameMusic\\Main.wav");
        Music.start();
        Music.loop(Clip.LOOP_CONTINUOUSLY);
        CambiarPantallaTiempo CPT = new CambiarPantallaTiempo(Jf_MenuPrincipal, this, 4000);
        Thread CambiarMain = new Thread(CPT);
        CambiarMain.start();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Jf_MenuPrincipal = new javax.swing.JFrame();
        jPanel3 = new javax.swing.JPanel();
        tb_Nombre = new javax.swing.JTextField();
        P_TopBar2 = new javax.swing.JPanel();
        P_X2 = new javax.swing.JPanel();
        X2 = new javax.swing.JLabel();
        Fondo = new javax.swing.JLabel();
        B_Adventure = new javax.swing.JButton();
        JF_PatioFrontal = new javax.swing.JFrame();
        jPanel2 = new javax.swing.JPanel();
        P_TopBar1 = new javax.swing.JPanel();
        P_X1 = new javax.swing.JPanel();
        X1 = new javax.swing.JLabel();
        PatioFondo = new javax.swing.JLabel();
        Jf_VideoIntro = new javax.swing.JFrame();
        jPanel5 = new javax.swing.JPanel();
        P_TopBar4 = new javax.swing.JPanel();
        P_X4 = new javax.swing.JPanel();
        X4 = new javax.swing.JLabel();
        P_VideoIntro = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        P_TopBar = new javax.swing.JPanel();
        P_X = new javax.swing.JPanel();
        X = new javax.swing.JLabel();
        Portada = new javax.swing.JLabel();

        Jf_MenuPrincipal.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        Jf_MenuPrincipal.setTitle("Plantas VS Zombies");
        Jf_MenuPrincipal.setLocationByPlatform(true);
        Jf_MenuPrincipal.setMaximumSize(new java.awt.Dimension(640, 430));
        Jf_MenuPrincipal.setMinimumSize(new java.awt.Dimension(640, 430));
        Jf_MenuPrincipal.setName("MainFrame"); // NOI18N
        Jf_MenuPrincipal.setUndecorated(true);
        Jf_MenuPrincipal.setPreferredSize(new java.awt.Dimension(640, 430));
        Jf_MenuPrincipal.setSize(new java.awt.Dimension(640, 430));

        jPanel3.setMaximumSize(new java.awt.Dimension(640, 430));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tb_Nombre.setBackground(new java.awt.Color(77, 69, 48));
        tb_Nombre.setForeground(new java.awt.Color(255, 255, 255));
        jPanel3.add(tb_Nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 200, 30));

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

        jPanel3.add(P_TopBar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 640, 30));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Fondos/Menu.jpg"))); // NOI18N
        jPanel3.add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, -1, -1));

        B_Adventure.setText("Adventure");
        B_Adventure.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B_AdventureMouseClicked(evt);
            }
        });
        jPanel3.add(B_Adventure, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 70, 260, 80));

        javax.swing.GroupLayout Jf_MenuPrincipalLayout = new javax.swing.GroupLayout(Jf_MenuPrincipal.getContentPane());
        Jf_MenuPrincipal.getContentPane().setLayout(Jf_MenuPrincipalLayout);
        Jf_MenuPrincipalLayout.setHorizontalGroup(
            Jf_MenuPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Jf_MenuPrincipalLayout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        Jf_MenuPrincipalLayout.setVerticalGroup(
            Jf_MenuPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        JF_PatioFrontal.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        JF_PatioFrontal.setTitle("Plantas VS Zombies");
        JF_PatioFrontal.setLocationByPlatform(true);
        JF_PatioFrontal.setMaximumSize(new java.awt.Dimension(640, 430));
        JF_PatioFrontal.setMinimumSize(new java.awt.Dimension(640, 430));
        JF_PatioFrontal.setName("MainFrame"); // NOI18N
        JF_PatioFrontal.setUndecorated(true);
        JF_PatioFrontal.setPreferredSize(new java.awt.Dimension(640, 430));
        JF_PatioFrontal.setResizable(false);
        JF_PatioFrontal.setSize(new java.awt.Dimension(640, 430));

        jPanel2.setMaximumSize(new java.awt.Dimension(640, 430));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        P_TopBar1.setBackground(new java.awt.Color(0, 0, 0));
        P_TopBar1.setForeground(new java.awt.Color(153, 255, 153));
        P_TopBar1.setPreferredSize(new java.awt.Dimension(640, 0));
        P_TopBar1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                P_TopBar1MouseDragged(evt);
            }
        });
        P_TopBar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                P_TopBar1MousePressed(evt);
            }
        });

        P_X1.setBackground(new java.awt.Color(0, 0, 0));
        P_X1.setName(""); // NOI18N
        P_X1.setPreferredSize(new java.awt.Dimension(58, 30));
        P_X1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                P_X1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                P_X1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                P_X1MouseExited(evt);
            }
        });

        X1.setBackground(new java.awt.Color(0, 0, 0));
        X1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        X1.setForeground(new java.awt.Color(255, 255, 255));
        X1.setText("X");
        X1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        X1.setMaximumSize(new java.awt.Dimension(46, 22));
        X1.setMinimumSize(new java.awt.Dimension(46, 22));
        X1.setName(""); // NOI18N
        X1.setPreferredSize(new java.awt.Dimension(58, 30));

        javax.swing.GroupLayout P_X1Layout = new javax.swing.GroupLayout(P_X1);
        P_X1.setLayout(P_X1Layout);
        P_X1Layout.setHorizontalGroup(
            P_X1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(P_X1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(X1, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );
        P_X1Layout.setVerticalGroup(
            P_X1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(X1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout P_TopBar1Layout = new javax.swing.GroupLayout(P_TopBar1);
        P_TopBar1.setLayout(P_TopBar1Layout);
        P_TopBar1Layout.setHorizontalGroup(
            P_TopBar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, P_TopBar1Layout.createSequentialGroup()
                .addGap(0, 582, Short.MAX_VALUE)
                .addComponent(P_X1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        P_TopBar1Layout.setVerticalGroup(
            P_TopBar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(P_X1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanel2.add(P_TopBar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 640, 30));

        PatioFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Fondos/FondoPatio.png"))); // NOI18N
        jPanel2.add(PatioFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(-60, 30, -1, -1));

        javax.swing.GroupLayout JF_PatioFrontalLayout = new javax.swing.GroupLayout(JF_PatioFrontal.getContentPane());
        JF_PatioFrontal.getContentPane().setLayout(JF_PatioFrontalLayout);
        JF_PatioFrontalLayout.setHorizontalGroup(
            JF_PatioFrontalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JF_PatioFrontalLayout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        JF_PatioFrontalLayout.setVerticalGroup(
            JF_PatioFrontalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        Jf_VideoIntro.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        Jf_VideoIntro.setTitle("Plantas VS Zombies");
        Jf_VideoIntro.setLocationByPlatform(true);
        Jf_VideoIntro.setMaximumSize(new java.awt.Dimension(640, 430));
        Jf_VideoIntro.setMinimumSize(new java.awt.Dimension(640, 430));
        Jf_VideoIntro.setName("MainFrame"); // NOI18N
        Jf_VideoIntro.setUndecorated(true);
        Jf_VideoIntro.setPreferredSize(new java.awt.Dimension(640, 430));
        Jf_VideoIntro.setResizable(false);
        Jf_VideoIntro.setSize(new java.awt.Dimension(640, 430));

        jPanel5.setMaximumSize(new java.awt.Dimension(640, 430));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Plantas VS Zombies");
        setLocationByPlatform(true);
        setMaximumSize(new java.awt.Dimension(640, 430));
        setMinimumSize(new java.awt.Dimension(640, 430));
        setName("MainFrame"); // NOI18N
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(640, 430));
        setResizable(false);
        setSize(new java.awt.Dimension(640, 430));

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

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

    private void P_X1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_P_X1MouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_P_X1MouseClicked

    private void P_X1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_P_X1MouseEntered
        // TODO add your handling code here
        P_X1.setBackground(Color.RED);

    }//GEN-LAST:event_P_X1MouseEntered

    private void P_X1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_P_X1MouseExited
        // TODO add your handling code here:
        P_X1.setBackground(Color.BLACK);
    }//GEN-LAST:event_P_X1MouseExited

    private void P_TopBar1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_P_TopBar1MouseDragged
        // TODO add your handling code here:
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        JF_PatioFrontal.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_P_TopBar1MouseDragged

    private void P_TopBar1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_P_TopBar1MousePressed
        // TODO add your handling code here:
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_P_TopBar1MousePressed

    private void B_AdventureMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B_AdventureMouseClicked
        // TODO add your handling code here:
        usuario.setPrimeraVez(true);
        if (usuario.isPrimeraVez()) {
            Music.stop();
            JF_PatioFrontal.pack();
            Jf_MenuPrincipal.setVisible(false);
            JF_PatioFrontal.setLocationRelativeTo(Jf_MenuPrincipal);
            Music.stop();
            Jf_VideoIntro.setVisible(true);
            try {
                video = new Reproductor();
                this.video.setJpanel(P_VideoIntro);
                this.video.setRuta("./GameVideo\\VideoIntro.mp4");
                this.video.mostrarVideo();
                this.video.reproducir();
            } catch (Exception e) {
            }
        } else {
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
        P_X1.setBackground(Color.RED);
    }//GEN-LAST:event_P_X4MouseEntered

    private void P_X4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_P_X4MouseExited
        // TODO add your handling code here:
        P_X1.setBackground(Color.BLACK);
    }//GEN-LAST:event_P_X4MouseExited

    private void P_TopBar4MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_P_TopBar4MouseDragged
        // TODO add your handling code here:
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        JF_PatioFrontal.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_P_TopBar4MouseDragged

    private void P_TopBar4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_P_TopBar4MousePressed
        // TODO add your handling code here:
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_P_TopBar4MousePressed

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
    private javax.swing.JButton B_Adventure;
    private javax.swing.JLabel Fondo;
    private javax.swing.JFrame JF_PatioFrontal;
    private javax.swing.JFrame Jf_MenuPrincipal;
    private javax.swing.JFrame Jf_VideoIntro;
    private javax.swing.JPanel P_TopBar;
    private javax.swing.JPanel P_TopBar1;
    private javax.swing.JPanel P_TopBar2;
    private javax.swing.JPanel P_TopBar4;
    private javax.swing.JPanel P_VideoIntro;
    private javax.swing.JPanel P_X;
    private javax.swing.JPanel P_X1;
    private javax.swing.JPanel P_X2;
    private javax.swing.JPanel P_X4;
    private javax.swing.JLabel PatioFondo;
    private javax.swing.JLabel Portada;
    private javax.swing.JLabel X;
    private javax.swing.JLabel X1;
    private javax.swing.JLabel X2;
    private javax.swing.JLabel X4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JTextField tb_Nombre;
    // End of variables declaration//GEN-END:variables
//mis variables
    private int xMouse, yMouse;
    private Clip Music;
    private Usuario usuario = new Usuario();
    private Reproductor video;
    
}
