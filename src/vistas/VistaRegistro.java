package vistas;

import controlador.ControladorRegistro;
import javax.swing.*;

/**
 *
 * @author Michael González
 * @author Michael Betancourt
 */
public class VistaRegistro extends JFrame {

    ControladorRegistro controlador;

    /**
     * Creates new form Registro
     */
    public VistaRegistro() {
        this.controlador = new ControladorRegistro();
        initComponents();
        formatoVista();
        this.setLocationRelativeTo(null);
    }

    /**
     * Método auto generado que crea la interfaz
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fSGradientPanel1 = new LIB.FSGradientPanel();
        jLabel12 = new javax.swing.JLabel();
        confClave = new javax.swing.JPasswordField();
        jLabel13 = new javax.swing.JLabel();
        direccion = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        ciudad = new javax.swing.JTextField();
        volver = new javax.swing.JButton();
        registrarse = new javax.swing.JButton();
        campoMes = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        campoAnio = new javax.swing.JTextField();
        limpiar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        telefono = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        medioPago = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        usuario = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        nombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        cedula = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        campoDia = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        clave = new javax.swing.JPasswordField();
        jEImagePanel1 = new LIB.JEImagePanel();
        modificar = new javax.swing.JButton();
        buscar = new javax.swing.JButton();
        mostrar = new javax.swing.JButton();
        borrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Registro");

        fSGradientPanel1.setFSEndColor(new java.awt.Color(0, 0, 51));
        fSGradientPanel1.setFSStartColor(new java.awt.Color(0, 0, 204));

        jLabel12.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        jLabel12.setForeground(java.awt.Color.white);
        jLabel12.setText("Confirmar contraseña");

        confClave.setBackground(new java.awt.Color(51, 51, 51));
        confClave.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        confClave.setForeground(java.awt.Color.white);

        jLabel13.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        jLabel13.setForeground(java.awt.Color.white);
        jLabel13.setText("Dirección");

        direccion.setBackground(new java.awt.Color(51, 51, 51));
        direccion.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        direccion.setForeground(java.awt.Color.white);

        jLabel14.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        jLabel14.setForeground(java.awt.Color.white);
        jLabel14.setText("Ciudad");

        ciudad.setBackground(new java.awt.Color(51, 51, 51));
        ciudad.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        ciudad.setForeground(java.awt.Color.white);

        volver.setBackground(new java.awt.Color(51, 51, 51));
        volver.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        volver.setForeground(java.awt.Color.white);
        volver.setText("Volver");

        registrarse.setBackground(new java.awt.Color(51, 51, 51));
        registrarse.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        registrarse.setForeground(java.awt.Color.white);
        registrarse.setText("Registrarse");

        campoMes.setBackground(new java.awt.Color(51, 51, 51));
        campoMes.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        campoMes.setForeground(java.awt.Color.white);

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        jLabel6.setForeground(java.awt.Color.white);
        jLabel6.setText("Año:");

        jLabel7.setForeground(java.awt.Color.white);
        jLabel7.setText("Día:");

        campoAnio.setBackground(new java.awt.Color(51, 51, 51));
        campoAnio.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        campoAnio.setForeground(java.awt.Color.white);

        limpiar.setBackground(new java.awt.Color(51, 51, 51));
        limpiar.setForeground(java.awt.Color.white);
        limpiar.setText("Limpiar");

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        jLabel8.setForeground(java.awt.Color.white);
        jLabel8.setText("Teléfono");

        telefono.setBackground(new java.awt.Color(51, 51, 51));
        telefono.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        telefono.setForeground(java.awt.Color.white);

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        jLabel9.setForeground(java.awt.Color.white);
        jLabel9.setText("Medio de pago");

        medioPago.setBackground(new java.awt.Color(51, 51, 51));
        medioPago.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        medioPago.setForeground(java.awt.Color.white);
        medioPago.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "(Seleccione)", "Visa", "Mastercard", "Maestro", "American Express", "PSE", "Efectivo" }));

        jLabel10.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        jLabel10.setForeground(java.awt.Color.white);
        jLabel10.setText("Usuario");

        usuario.setBackground(new java.awt.Color(51, 51, 51));
        usuario.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        usuario.setForeground(java.awt.Color.white);

        jLabel1.setFont(new java.awt.Font("Elephant", 1, 36)); // NOI18N
        jLabel1.setForeground(java.awt.Color.white);
        jLabel1.setText("EROS SPACE");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        jLabel2.setForeground(java.awt.Color.white);
        jLabel2.setText("Nombre completo");

        nombre.setBackground(new java.awt.Color(51, 51, 51));
        nombre.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        nombre.setForeground(java.awt.Color.white);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        jLabel3.setForeground(java.awt.Color.white);
        jLabel3.setText("Identificación");

        cedula.setBackground(new java.awt.Color(51, 51, 51));
        cedula.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        cedula.setForeground(java.awt.Color.white);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        jLabel4.setForeground(java.awt.Color.white);
        jLabel4.setText("Fecha de nacimiento (DD/MM/AAAA)");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        jLabel5.setForeground(java.awt.Color.white);
        jLabel5.setText("Mes:");

        campoDia.setBackground(new java.awt.Color(51, 51, 51));
        campoDia.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        campoDia.setForeground(java.awt.Color.white);

        jLabel11.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        jLabel11.setForeground(java.awt.Color.white);
        jLabel11.setText("Contraseña");

        clave.setBackground(new java.awt.Color(51, 51, 51));
        clave.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        clave.setForeground(java.awt.Color.white);

        modificar.setBackground(new java.awt.Color(51, 51, 51));
        modificar.setForeground(java.awt.Color.white);
        modificar.setText("Modificar");

        buscar.setBackground(new java.awt.Color(51, 51, 51));
        buscar.setForeground(java.awt.Color.white);
        buscar.setText("Buscar(por cedula)");

        mostrar.setBackground(new java.awt.Color(51, 51, 51));
        mostrar.setForeground(java.awt.Color.white);
        mostrar.setText("Mostrar registros");

        borrar.setBackground(new java.awt.Color(51, 51, 51));
        borrar.setForeground(java.awt.Color.white);
        borrar.setText("Borrar");

        javax.swing.GroupLayout jEImagePanel1Layout = new javax.swing.GroupLayout(jEImagePanel1);
        jEImagePanel1.setLayout(jEImagePanel1Layout);
        jEImagePanel1Layout.setHorizontalGroup(
            jEImagePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jEImagePanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jEImagePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(buscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(modificar, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jEImagePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(borrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(mostrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jEImagePanel1Layout.setVerticalGroup(
            jEImagePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jEImagePanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jEImagePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buscar)
                    .addComponent(mostrar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jEImagePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(modificar)
                    .addComponent(borrar))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout fSGradientPanel1Layout = new javax.swing.GroupLayout(fSGradientPanel1);
        fSGradientPanel1.setLayout(fSGradientPanel1Layout);
        fSGradientPanel1Layout.setHorizontalGroup(
            fSGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fSGradientPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(fSGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jEImagePanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(fSGradientPanel1Layout.createSequentialGroup()
                        .addGroup(fSGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2)
                            .addGroup(fSGradientPanel1Layout.createSequentialGroup()
                                .addGroup(fSGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(confClave)
                                    .addComponent(clave)
                                    .addComponent(usuario)
                                    .addGroup(fSGradientPanel1Layout.createSequentialGroup()
                                        .addGroup(fSGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel10)
                                            .addComponent(jLabel11)
                                            .addComponent(jLabel12)
                                            .addGroup(fSGradientPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel7)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(campoDia, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel5)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(campoMes, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel6)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(campoAnio, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(0, 23, Short.MAX_VALUE))
                                    .addComponent(cedula))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(fSGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(telefono)
                                    .addComponent(medioPago, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(direccion)
                                    .addComponent(ciudad)
                                    .addGroup(fSGradientPanel1Layout.createSequentialGroup()
                                        .addGroup(fSGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel8)
                                            .addComponent(jLabel9)
                                            .addComponent(jLabel13)
                                            .addComponent(jLabel14))
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(fSGradientPanel1Layout.createSequentialGroup()
                                        .addComponent(volver, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                                        .addComponent(registrarse))))
                            .addComponent(nombre)
                            .addGroup(fSGradientPanel1Layout.createSequentialGroup()
                                .addGap(69, 69, 69)
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(limpiar)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        fSGradientPanel1Layout.setVerticalGroup(
            fSGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fSGradientPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(fSGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(fSGradientPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabel1))
                    .addComponent(limpiar))
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(1, 1, 1)
                .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(fSGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(fSGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(telefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(fSGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(fSGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(campoDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(campoMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(campoAnio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(direccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(fSGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(fSGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ciudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(fSGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(fSGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(clave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(medioPago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(fSGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(fSGradientPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(confClave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fSGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(volver, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(registrarse, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jEImagePanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fSGradientPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fSGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
    public javax.swing.JButton borrar;
    public javax.swing.JButton buscar;
    public javax.swing.JTextField campoAnio;
    public javax.swing.JTextField campoDia;
    public javax.swing.JTextField campoMes;
    public javax.swing.JTextField cedula;
    public javax.swing.JTextField ciudad;
    public javax.swing.JPasswordField clave;
    public javax.swing.JPasswordField confClave;
    public javax.swing.JTextField direccion;
    private LIB.FSGradientPanel fSGradientPanel1;
    private LIB.JEImagePanel jEImagePanel1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    public javax.swing.JButton limpiar;
    public javax.swing.JComboBox<String> medioPago;
    public javax.swing.JButton modificar;
    public javax.swing.JButton mostrar;
    public javax.swing.JTextField nombre;
    public javax.swing.JButton registrarse;
    public javax.swing.JTextField telefono;
    public javax.swing.JTextField usuario;
    public javax.swing.JButton volver;
    // End of variables declaration//GEN-END:variables
//
//    public JTextField getCedula() {
//        return cedula;
//    }
//
//    public JTextField getCiudad() {
//        return ciudad;
//    }
//
//    public JPasswordField getClave() {
//        return clave;
//    }
//
//    public JTextField getDireccion() {
//        return direccion;
//    }
//
//    public JTextField getNombre() {
//        return nombre;
//    }
//
//    public JTextField getTelefono() {
//        return telefono;
//    }
//
//    public JTextField getUsuario() {
//        return usuario;
//    }

}
