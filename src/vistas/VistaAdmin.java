package vistas;

import controlador.ControladorProductos;
import javax.swing.*;

/**
 *
 * @author Michael González
 * @author Michael Betancourt
 */
public class VistaAdmin extends JFrame {

    ControladorProductos controlador;

    /**
     * Creates new form Admin
     */
    public VistaAdmin() {
        this.controlador  = new ControladorProductos();
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
        jLabel1 = new javax.swing.JLabel();
        volver = new javax.swing.JButton();
        jEImagePanel1 = new LIB.JEImagePanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        nameField = new javax.swing.JTextField();
        priceField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        desciptionArea = new javax.swing.JTextArea();
        idProField = new javax.swing.JTextField();
        limpiar = new javax.swing.JButton();
        insertar = new javax.swing.JButton();
        jEImagePanel2 = new LIB.JEImagePanel();
        buscar = new javax.swing.JButton();
        modificar = new javax.swing.JButton();
        borrar = new javax.swing.JButton();
        mostrarPila = new javax.swing.JButton();
        mostrarPeek = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Administrador");
        setResizable(false);

        fSGradientPanel1.setFSEndColor(new java.awt.Color(0, 0, 51));
        fSGradientPanel1.setFSStartColor(new java.awt.Color(0, 0, 204));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Control de Inventario");

        volver.setBackground(new java.awt.Color(51, 51, 51));
        volver.setForeground(new java.awt.Color(255, 255, 255));
        volver.setText("Volver");
        volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volverActionPerformed(evt);
            }
        });

        jEImagePanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Registro producto", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 0, 12), new java.awt.Color(255, 255, 255))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Id producto");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Nombre");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Precio");

        nameField.setBackground(new java.awt.Color(51, 51, 51));
        nameField.setForeground(new java.awt.Color(255, 255, 255));

        priceField.setBackground(new java.awt.Color(51, 51, 51));
        priceField.setForeground(new java.awt.Color(255, 255, 255));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Descripción");

        desciptionArea.setBackground(new java.awt.Color(51, 51, 51));
        desciptionArea.setColumns(20);
        desciptionArea.setForeground(new java.awt.Color(255, 255, 255));
        desciptionArea.setRows(5);
        jScrollPane1.setViewportView(desciptionArea);

        idProField.setBackground(new java.awt.Color(51, 51, 51));
        idProField.setForeground(new java.awt.Color(255, 255, 255));

        limpiar.setBackground(new java.awt.Color(51, 51, 51));
        limpiar.setForeground(new java.awt.Color(255, 255, 255));
        limpiar.setText("Limpiar");
        limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpiarActionPerformed(evt);
            }
        });

        insertar.setBackground(new java.awt.Color(51, 51, 51));
        insertar.setForeground(new java.awt.Color(255, 255, 255));
        insertar.setText("Insertar");
        insertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jEImagePanel1Layout = new javax.swing.GroupLayout(jEImagePanel1);
        jEImagePanel1.setLayout(jEImagePanel1Layout);
        jEImagePanel1Layout.setHorizontalGroup(
            jEImagePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jEImagePanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jEImagePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jEImagePanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jEImagePanel1Layout.createSequentialGroup()
                        .addGroup(jEImagePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(idProField, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nameField)
                            .addComponent(priceField, javax.swing.GroupLayout.Alignment.LEADING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jEImagePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jEImagePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel6)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jEImagePanel1Layout.createSequentialGroup()
                                .addComponent(insertar, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(limpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())))
        );
        jEImagePanel1Layout.setVerticalGroup(
            jEImagePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jEImagePanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jEImagePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jEImagePanel1Layout.createSequentialGroup()
                        .addComponent(idProField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jEImagePanel1Layout.createSequentialGroup()
                        .addGroup(jEImagePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(limpiar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(insertar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(jEImagePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jEImagePanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(priceField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(12, Short.MAX_VALUE))
                    .addGroup(jEImagePanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15))))
        );

        jEImagePanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Más opciones", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 0, 12), new java.awt.Color(255, 255, 255))); // NOI18N

        buscar.setBackground(new java.awt.Color(51, 51, 51));
        buscar.setForeground(new java.awt.Color(255, 255, 255));
        buscar.setText("Buscar");
        buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarActionPerformed(evt);
            }
        });

        modificar.setBackground(new java.awt.Color(51, 51, 51));
        modificar.setForeground(new java.awt.Color(255, 255, 255));
        modificar.setText("Modificar");
        modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarActionPerformed(evt);
            }
        });

        borrar.setBackground(new java.awt.Color(51, 51, 51));
        borrar.setForeground(new java.awt.Color(255, 255, 255));
        borrar.setText("Borrar");
        borrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jEImagePanel2Layout = new javax.swing.GroupLayout(jEImagePanel2);
        jEImagePanel2.setLayout(jEImagePanel2Layout);
        jEImagePanel2Layout.setHorizontalGroup(
            jEImagePanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jEImagePanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(modificar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(borrar, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                .addContainerGap())
        );
        jEImagePanel2Layout.setVerticalGroup(
            jEImagePanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jEImagePanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jEImagePanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(borrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(modificar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        mostrarPila.setBackground(new java.awt.Color(51, 51, 51));
        mostrarPila.setForeground(new java.awt.Color(255, 255, 255));
        mostrarPila.setText("Mostrar pila");
        mostrarPila.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostrarPilaActionPerformed(evt);
            }
        });

        mostrarPeek.setBackground(new java.awt.Color(51, 51, 51));
        mostrarPeek.setForeground(new java.awt.Color(255, 255, 255));
        mostrarPeek.setText("Mostrar último");
        mostrarPeek.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostrarPeekActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout fSGradientPanel1Layout = new javax.swing.GroupLayout(fSGradientPanel1);
        fSGradientPanel1.setLayout(fSGradientPanel1Layout);
        fSGradientPanel1Layout.setHorizontalGroup(
            fSGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fSGradientPanel1Layout.createSequentialGroup()
                .addGroup(fSGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(fSGradientPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(volver)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(mostrarPeek)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(mostrarPila))
                    .addGroup(fSGradientPanel1Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(fSGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jEImagePanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jEImagePanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 43, Short.MAX_VALUE)))
                .addContainerGap())
        );
        fSGradientPanel1Layout.setVerticalGroup(
            fSGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fSGradientPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(fSGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(volver)
                    .addComponent(mostrarPila)
                    .addComponent(mostrarPeek))
                .addGap(13, 13, 13)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jEImagePanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jEImagePanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(fSGradientPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fSGradientPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void insertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertarActionPerformed
        controlador.agregarProducto(Integer.parseInt(idProField.getText()), nameField.getText(), Float.parseFloat(priceField.getText()), desciptionArea.getText());
    }//GEN-LAST:event_insertarActionPerformed

    private void modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarActionPerformed
        controlador.modificarProducto(Integer.parseInt(idProField.getText()));
    }//GEN-LAST:event_modificarActionPerformed

    private void borrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borrarActionPerformed
        controlador.borrarProducto(Integer.parseInt(idProField.getText()));
    }//GEN-LAST:event_borrarActionPerformed

    private void buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarActionPerformed
        controlador.buscarProducto(Integer.parseInt(idProField.getText()));
    }//GEN-LAST:event_buscarActionPerformed

    private void limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiarActionPerformed
        this.limpiar();
    }//GEN-LAST:event_limpiarActionPerformed

    private void volverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverActionPerformed
        new VistaLogIn().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_volverActionPerformed

    private void mostrarPilaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostrarPilaActionPerformed
        JOptionPane.showMessageDialog(null, controlador.mostrarProductos(0), "PILA", -1);
    }//GEN-LAST:event_mostrarPilaActionPerformed

    private void mostrarPeekActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostrarPeekActionPerformed
        JOptionPane.showMessageDialog(null, controlador.mostrarProductos(1), "Peek", -1);
    }//GEN-LAST:event_mostrarPeekActionPerformed

    /**
     * Método para limpiar los campos de la interfaz.
     */
    public void limpiar() {
        this.idProField.setText(null);
        this.nameField.setText(null);
        this.priceField.setText(null);
        this.desciptionArea.setText(null);
        this.idProField.setEnabled(true);
    }

    /**
     * Método para seleccionar el formato de la vista.
     */
    private void formatoVista() {
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
    private javax.swing.JButton borrar;
    private javax.swing.JButton buscar;
    private javax.swing.JTextArea desciptionArea;
    private LIB.FSGradientPanel fSGradientPanel1;
    private javax.swing.JTextField idProField;
    private javax.swing.JButton insertar;
    private LIB.JEImagePanel jEImagePanel1;
    private LIB.JEImagePanel jEImagePanel2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton limpiar;
    private javax.swing.JButton modificar;
    private javax.swing.JButton mostrarPeek;
    private javax.swing.JButton mostrarPila;
    private javax.swing.JTextField nameField;
    private javax.swing.JTextField priceField;
    private javax.swing.JButton volver;
    // End of variables declaration//GEN-END:variables

    public JTextArea getDesciptionArea() {
        return desciptionArea;
    }

    public JTextField getIdProField() {
        return idProField;
    }

    public JTextField getNameField() {
        return nameField;
    }

    public JTextField getPriceField() {
        return priceField;
    }

}
