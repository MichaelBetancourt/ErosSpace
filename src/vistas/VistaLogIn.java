package vistas;

import controlador.ControladorLogueos;
import javax.swing.*;

public class VistaLogIn extends JFrame {

    ControladorLogueos controlador;
    private final String USUARIO_ADMINISRADOR;
    private final String CLAVE_ADMINISTRADOR;

    /**
     * Creates new form LogIn
     */
    public VistaLogIn() {
        this.controlador  = new ControladorLogueos();
        this.USUARIO_ADMINISRADOR = "Admin";
        this.CLAVE_ADMINISTRADOR = "pass123";
        initComponents();
        formatoVista();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fSGradientPanel1 = new LIB.FSGradientPanel();
        jEImagePanel1 = new LIB.JEImagePanel();
        jLabel1 = new javax.swing.JLabel();
        registrarse = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        userField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        passField = new javax.swing.JPasswordField();
        volver = new javax.swing.JButton();
        continuar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        AdminLogIn = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Eros Space Log In");
        setResizable(false);

        fSGradientPanel1.setFSEndColor(new java.awt.Color(0, 0, 51));
        fSGradientPanel1.setFSStartColor(new java.awt.Color(0, 0, 204));

        jEImagePanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Iniciar Sesión");

        registrarse.setBackground(new java.awt.Color(51, 51, 51));
        registrarse.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        registrarse.setForeground(new java.awt.Color(255, 255, 255));
        registrarse.setText("Registrarse");
        registrarse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jEImagePanel1Layout = new javax.swing.GroupLayout(jEImagePanel1);
        jEImagePanel1.setLayout(jEImagePanel1Layout);
        jEImagePanel1Layout.setHorizontalGroup(
            jEImagePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jEImagePanel1Layout.createSequentialGroup()
                .addContainerGap(59, Short.MAX_VALUE)
                .addGroup(jEImagePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jEImagePanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(56, 56, 56))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jEImagePanel1Layout.createSequentialGroup()
                        .addComponent(registrarse)
                        .addContainerGap())))
        );
        jEImagePanel1Layout.setVerticalGroup(
            jEImagePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jEImagePanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(registrarse)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Usuario");

        userField.setBackground(new java.awt.Color(102, 102, 102));
        userField.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        userField.setForeground(new java.awt.Color(255, 255, 255));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Contraseña");

        passField.setBackground(new java.awt.Color(102, 102, 102));
        passField.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        passField.setForeground(new java.awt.Color(255, 255, 255));

        volver.setBackground(new java.awt.Color(51, 51, 51));
        volver.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        volver.setForeground(new java.awt.Color(255, 255, 255));
        volver.setText("Volver");
        volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volverActionPerformed(evt);
            }
        });

        continuar.setBackground(new java.awt.Color(51, 51, 51));
        continuar.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        continuar.setForeground(new java.awt.Color(255, 255, 255));
        continuar.setText("Continuar");
        continuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                continuarActionPerformed(evt);
            }
        });

        AdminLogIn.setFont(new java.awt.Font("Times New Roman", 0, 11)); // NOI18N
        AdminLogIn.setForeground(new java.awt.Color(255, 255, 255));
        AdminLogIn.setText("Iniciar Sesión como Administrador");
        AdminLogIn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        AdminLogIn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AdminLogInMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout fSGradientPanel1Layout = new javax.swing.GroupLayout(fSGradientPanel1);
        fSGradientPanel1.setLayout(fSGradientPanel1Layout);
        fSGradientPanel1Layout.setHorizontalGroup(
            fSGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jEImagePanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jSeparator1)
            .addGroup(fSGradientPanel1Layout.createSequentialGroup()
                .addGroup(fSGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(fSGradientPanel1Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(fSGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(fSGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(userField)
                            .addComponent(passField, javax.swing.GroupLayout.DEFAULT_SIZE, 227, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fSGradientPanel1Layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(volver, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(fSGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(continuar, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(AdminLogIn))))
                .addContainerGap())
        );
        fSGradientPanel1Layout.setVerticalGroup(
            fSGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fSGradientPanel1Layout.createSequentialGroup()
                .addComponent(jEImagePanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(fSGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(userField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(38, 38, 38)
                .addGroup(fSGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(passField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(fSGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(volver, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(continuar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(AdminLogIn, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fSGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fSGradientPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void continuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_continuarActionPerformed
        controlador.agregarLogueo();
    }//GEN-LAST:event_continuarActionPerformed

    private void volverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverActionPerformed
        int c = JOptionPane.showConfirmDialog(null, "¿Está seguro(a) que desea salir?", "Confimación", JOptionPane.YES_NO_OPTION, 3);
        if (c == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_volverActionPerformed

    private void AdminLogInMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AdminLogInMouseClicked
        controlador.agregarLogueoAdmin(USUARIO_ADMINISRADOR, CLAVE_ADMINISTRADOR);
    }//GEN-LAST:event_AdminLogInMouseClicked

    private void registrarseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarseActionPerformed
        new VistaRegistro().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_registrarseActionPerformed

    /**
     * Método para seleccionar el formato de la vista.
     */
    public static void formatoVista() {
        try {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Metal".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                } else {
                    UIManager.setLookAndFeel("Windows");
                }
            }
        } catch (ClassNotFoundException | InstantiationException
                | IllegalAccessException | UnsupportedLookAndFeelException ex) {
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AdminLogIn;
    private javax.swing.JButton continuar;
    private LIB.FSGradientPanel fSGradientPanel1;
    private LIB.JEImagePanel jEImagePanel1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPasswordField passField;
    private javax.swing.JButton registrarse;
    private javax.swing.JTextField userField;
    private javax.swing.JButton volver;
    // End of variables declaration//GEN-END:variables

    public String getCLAVE_ADMINISTRADOR() {
        return CLAVE_ADMINISTRADOR;
    }

    public JPasswordField getPassField() {
        return passField;
    }

    public JTextField getUserField() {
        return userField;
    }

}
