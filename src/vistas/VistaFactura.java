package vistas;

import controlador.ControladorPedidos;
import javax.swing.*;

/**
 *
 * @author Michael González
 * @author Michael Betancourt
 */
public class VistaFactura extends JFrame {

    ControladorPedidos controlador;

    /**
     * Creates new form Factura
     */
    public VistaFactura() {
        this.controlador  = new ControladorPedidos();
        initComponents();
        lblConcepto.setText(new VistaPrincipal().getConcepto());
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
        volverBtn = new javax.swing.JButton();
        jEImagePanel2 = new LIB.JEImagePanel();
        modificarPedido = new javax.swing.JButton();
        eliminarPedido = new javax.swing.JButton();
        mostrarCola = new javax.swing.JButton();
        mostrarMiPedido = new javax.swing.JButton();
        buscarPedido = new javax.swing.JButton();
        jEImagePanel1 = new LIB.JEImagePanel();
        lblConcepto = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        fSGradientPanel1.setFSEndColor(new java.awt.Color(0, 0, 51));
        fSGradientPanel1.setFSStartColor(new java.awt.Color(0, 0, 204));

        volverBtn.setBackground(new java.awt.Color(51, 51, 51));
        volverBtn.setForeground(new java.awt.Color(255, 255, 255));
        volverBtn.setText("Atras");
        volverBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volverBtnActionPerformed(evt);
            }
        });

        jEImagePanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        modificarPedido.setBackground(new java.awt.Color(51, 51, 51));
        modificarPedido.setForeground(new java.awt.Color(255, 255, 255));
        modificarPedido.setText("Modificar pedido");
        modificarPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarPedidoActionPerformed(evt);
            }
        });

        eliminarPedido.setBackground(new java.awt.Color(51, 51, 51));
        eliminarPedido.setForeground(new java.awt.Color(255, 255, 255));
        eliminarPedido.setText("Eliminar pedido");
        eliminarPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarPedidoActionPerformed(evt);
            }
        });

        mostrarCola.setBackground(new java.awt.Color(51, 51, 51));
        mostrarCola.setForeground(new java.awt.Color(255, 255, 255));
        mostrarCola.setText("Mostrar cola de pedidos pendientes");
        mostrarCola.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostrarColaActionPerformed(evt);
            }
        });

        mostrarMiPedido.setBackground(new java.awt.Color(51, 51, 51));
        mostrarMiPedido.setForeground(new java.awt.Color(255, 255, 255));
        mostrarMiPedido.setText("Mostrar mi pedido");
        mostrarMiPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostrarMiPedidoActionPerformed(evt);
            }
        });

        buscarPedido.setBackground(new java.awt.Color(51, 51, 51));
        buscarPedido.setForeground(new java.awt.Color(255, 255, 255));
        buscarPedido.setText("Buscar mi pedido");
        buscarPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarPedidoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jEImagePanel2Layout = new javax.swing.GroupLayout(jEImagePanel2);
        jEImagePanel2.setLayout(jEImagePanel2Layout);
        jEImagePanel2Layout.setHorizontalGroup(
            jEImagePanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jEImagePanel2Layout.createSequentialGroup()
                .addGroup(jEImagePanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jEImagePanel2Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(mostrarCola))
                    .addGroup(jEImagePanel2Layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addGroup(jEImagePanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(mostrarMiPedido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(eliminarPedido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(modificarPedido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(buscarPedido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jEImagePanel2Layout.setVerticalGroup(
            jEImagePanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jEImagePanel2Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(modificarPedido)
                .addGap(37, 37, 37)
                .addComponent(eliminarPedido)
                .addGap(28, 28, 28)
                .addComponent(mostrarMiPedido)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(buscarPedido)
                .addGap(18, 18, 18)
                .addComponent(mostrarCola)
                .addGap(24, 24, 24))
        );

        jEImagePanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        jEImagePanel1.setForeground(new java.awt.Color(255, 255, 255));
        jEImagePanel1.setToolTipText("Factura");

        lblConcepto.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblConcepto.setForeground(new java.awt.Color(255, 255, 255));
        lblConcepto.setText("CONCEPTO");

        javax.swing.GroupLayout jEImagePanel1Layout = new javax.swing.GroupLayout(jEImagePanel1);
        jEImagePanel1.setLayout(jEImagePanel1Layout);
        jEImagePanel1Layout.setHorizontalGroup(
            jEImagePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jEImagePanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(lblConcepto, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );
        jEImagePanel1Layout.setVerticalGroup(
            jEImagePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jEImagePanel1Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(lblConcepto, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(326, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout fSGradientPanel1Layout = new javax.swing.GroupLayout(fSGradientPanel1);
        fSGradientPanel1.setLayout(fSGradientPanel1Layout);
        fSGradientPanel1Layout.setHorizontalGroup(
            fSGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fSGradientPanel1Layout.createSequentialGroup()
                .addGroup(fSGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(fSGradientPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(volverBtn))
                    .addGroup(fSGradientPanel1Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jEImagePanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addComponent(jEImagePanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44))
        );
        fSGradientPanel1Layout.setVerticalGroup(
            fSGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fSGradientPanel1Layout.createSequentialGroup()
                .addGroup(fSGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(fSGradientPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(volverBtn)
                        .addGap(42, 42, 42)
                        .addComponent(jEImagePanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(fSGradientPanel1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jEImagePanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fSGradientPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fSGradientPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void volverBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverBtnActionPerformed
        new VistaPrincipal().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_volverBtnActionPerformed

    private void mostrarMiPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostrarMiPedidoActionPerformed
        JOptionPane.showMessageDialog(null, controlador.mostrarPedidos(1), "Mi pedido", 1);
    }//GEN-LAST:event_mostrarMiPedidoActionPerformed

    private void modificarPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarPedidoActionPerformed
        controlador.modificarPedido();
    }//GEN-LAST:event_modificarPedidoActionPerformed

    private void eliminarPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarPedidoActionPerformed
        controlador.borrarPedido();
    }//GEN-LAST:event_eliminarPedidoActionPerformed

    private void mostrarColaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostrarColaActionPerformed
        JOptionPane.showMessageDialog(null, controlador.mostrarPedidos(0), "Mostrar", -1);
    }//GEN-LAST:event_mostrarColaActionPerformed

    private void buscarPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarPedidoActionPerformed
        controlador.buscarPedido();
    }//GEN-LAST:event_buscarPedidoActionPerformed

    /**
     * Método para seleccionar el formato de la vista
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
    private javax.swing.JButton buscarPedido;
    private javax.swing.JButton eliminarPedido;
    private LIB.FSGradientPanel fSGradientPanel1;
    private LIB.JEImagePanel jEImagePanel1;
    private LIB.JEImagePanel jEImagePanel2;
    private javax.swing.JLabel lblConcepto;
    private javax.swing.JButton modificarPedido;
    private javax.swing.JButton mostrarCola;
    private javax.swing.JButton mostrarMiPedido;
    private javax.swing.JButton volverBtn;
    // End of variables declaration//GEN-END:variables
}
