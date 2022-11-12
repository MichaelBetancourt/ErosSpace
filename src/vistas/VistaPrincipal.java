package vistas;

import controlador.ControladorPedidos;
import javax.swing.*;

/**
 * Proyecto estructuras de datos implementando Listas, Pilas y Colas Genéricas
 * con bases de datos.
 *
 * @author Michael González
 * @author Michael Betancourt
 */
public class VistaPrincipal extends JFrame {

    ControladorPedidos controlador;
    private float precioTotal = 0;
    private String concepto = "";

    /**
     * Constructor que crea la vista principal.
     */
    public VistaPrincipal() {
        this.controlador = new ControladorPedidos();
        //formatoVista();
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * Código auto generado de la vista.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fSGradientPanel2 = new LIB.FSGradientPanel();
        jEImagePanel2 = new LIB.JEImagePanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jEImagePanel1 = new LIB.JEImagePanel();
        jLabel22 = new javax.swing.JLabel();
        jEImagePanel3 = new LIB.JEImagePanel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel30 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel29 = new javax.swing.JLabel();
        jCheckBox2 = new javax.swing.JCheckBox();
        jLabel34 = new javax.swing.JLabel();
        next2 = new javax.swing.JButton();
        jCheckBox11 = new javax.swing.JCheckBox();
        jLabel31 = new javax.swing.JLabel();
        jCheckBox7 = new javax.swing.JCheckBox();
        jLabel35 = new javax.swing.JLabel();
        jCheckBox8 = new javax.swing.JCheckBox();
        back1 = new javax.swing.JButton();
        jLabel27 = new javax.swing.JLabel();
        jCheckBox6 = new javax.swing.JCheckBox();
        next1 = new javax.swing.JButton();
        jLabel32 = new javax.swing.JLabel();
        jCheckBox3 = new javax.swing.JCheckBox();
        jCheckBox9 = new javax.swing.JCheckBox();
        jCheckBox12 = new javax.swing.JCheckBox();
        jLabel33 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jCheckBox5 = new javax.swing.JCheckBox();
        back2 = new javax.swing.JButton();
        next3 = new javax.swing.JButton();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox4 = new javax.swing.JCheckBox();
        jCheckBox10 = new javax.swing.JCheckBox();
        cantidadPersonas = new javax.swing.JTextField();
        jEImagePanel4 = new LIB.JEImagePanel();
        next = new javax.swing.JButton();
        jLabel36 = new javax.swing.JLabel();
        precio = new javax.swing.JTextField();
        jEImagePanel5 = new LIB.JEImagePanel();
        logAdmin = new javax.swing.JButton();
        log = new javax.swing.JButton();
        regist = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("EROS SPACE");
        setResizable(false);

        fSGradientPanel2.setFSEndColor(new java.awt.Color(0, 0, 51));
        fSGradientPanel2.setFSStartColor(new java.awt.Color(0, 0, 204));

        jEImagePanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("- Mojito, ron");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("azucar, limon,");

        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("CERVEZAS");

        jLabel26.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setText("- Precio");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("BEBIDAS");

        jLabel24.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("- Precio");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("yebabuena");

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("- Precio c/u");

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("- Tinto - precio");

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("- Poker");

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("- Mocca - precio");

        jLabel25.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("- Finca las cabras");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("hielo.");

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("- Latte - precio");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("- Precio");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("- Red label");

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("- Precio 24 pack");

        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("- Expreso - precio");

        jLabel23.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("- Casillero del diablo");

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("- Precio sixpack");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("blanco, soda,");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("- Whisky");

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("COCTELES");

        jLabel17.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("CAFE - BAR");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("- Precio");

        jEImagePanel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pics/LogoErosSpaceDef.png"))); // NOI18N

        javax.swing.GroupLayout jEImagePanel1Layout = new javax.swing.GroupLayout(jEImagePanel1);
        jEImagePanel1.setLayout(jEImagePanel1Layout);
        jEImagePanel1Layout.setHorizontalGroup(
            jEImagePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 134, Short.MAX_VALUE)
        );
        jEImagePanel1Layout.setVerticalGroup(
            jEImagePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 128, Short.MAX_VALUE)
        );

        jLabel22.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("VINOS");

        javax.swing.GroupLayout jEImagePanel2Layout = new javax.swing.GroupLayout(jEImagePanel2);
        jEImagePanel2.setLayout(jEImagePanel2Layout);
        jEImagePanel2Layout.setHorizontalGroup(
            jEImagePanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jEImagePanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jEImagePanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jEImagePanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jEImagePanel2Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(jEImagePanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel7)
                            .addGroup(jEImagePanel2Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(jEImagePanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel1))))))
                .addGap(101, 101, 101)
                .addGroup(jEImagePanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jEImagePanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jEImagePanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addGroup(jEImagePanel2Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(jEImagePanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel13)
                                    .addComponent(jLabel14)
                                    .addComponent(jLabel15)
                                    .addComponent(jLabel16))))
                        .addGroup(jEImagePanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel26)
                            .addComponent(jLabel24)
                            .addComponent(jLabel25)
                            .addComponent(jLabel22)
                            .addComponent(jLabel23)))
                    .addGroup(jEImagePanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jEImagePanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel18)
                            .addComponent(jLabel19)
                            .addComponent(jLabel20)
                            .addComponent(jLabel21))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jEImagePanel2Layout.setVerticalGroup(
            jEImagePanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jEImagePanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jEImagePanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jEImagePanel2Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(jEImagePanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jEImagePanel2Layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(jLabel18)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel19))
                            .addGroup(jEImagePanel2Layout.createSequentialGroup()
                                .addComponent(jLabel17)
                                .addGap(47, 47, 47)
                                .addComponent(jLabel20)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel21)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jEImagePanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jEImagePanel2Layout.createSequentialGroup()
                                .addGap(136, 136, 136)
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel15)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel16))
                            .addGroup(jEImagePanel2Layout.createSequentialGroup()
                                .addComponent(jLabel22)
                                .addGap(0, 0, 0)
                                .addComponent(jLabel23)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel24)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel25)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel26))))
                    .addGroup(jEImagePanel2Layout.createSequentialGroup()
                        .addComponent(jEImagePanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1)))
                .addContainerGap())
        );

        jEImagePanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel30.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel30.setForeground(java.awt.Color.white);
        jLabel30.setText("OTRAS OPCIONES DE COMPRA");

        jSeparator3.setForeground(java.awt.Color.white);

        jLabel29.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel29.setForeground(java.awt.Color.white);
        jLabel29.setText("APERITIVOS");

        jCheckBox2.setBackground(new java.awt.Color(0, 0, 102));
        jCheckBox2.setForeground(java.awt.Color.white);
        jCheckBox2.setText("Buchana's");

        jLabel34.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel34.setForeground(java.awt.Color.white);
        jLabel34.setText("Cantidad de personas");

        next2.setBackground(new java.awt.Color(51, 51, 51));
        next2.setForeground(java.awt.Color.white);
        next2.setText("Siguiente");
        next2.setEnabled(false);
        next2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                next2ActionPerformed(evt);
            }
        });

        jCheckBox11.setBackground(new java.awt.Color(0, 0, 102));
        jCheckBox11.setForeground(java.awt.Color.white);
        jCheckBox11.setText("Si");
        jCheckBox11.setEnabled(false);

        jLabel31.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel31.setForeground(java.awt.Color.white);
        jLabel31.setText("Menaje");

        jCheckBox7.setBackground(new java.awt.Color(0, 0, 102));
        jCheckBox7.setForeground(java.awt.Color.white);
        jCheckBox7.setText("Si");
        jCheckBox7.setEnabled(false);

        jLabel35.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel35.setForeground(java.awt.Color.white);
        jLabel35.setText("¿Tu dirección es la de siempre?");

        jCheckBox8.setBackground(new java.awt.Color(0, 0, 102));
        jCheckBox8.setForeground(java.awt.Color.white);
        jCheckBox8.setText("No");
        jCheckBox8.setEnabled(false);

        back1.setBackground(new java.awt.Color(51, 51, 51));
        back1.setForeground(java.awt.Color.white);
        back1.setText("Anterior");
        back1.setEnabled(false);
        back1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back1ActionPerformed(evt);
            }
        });

        jLabel27.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel27.setForeground(java.awt.Color.white);
        jLabel27.setText("FIESTA EN CASA");

        jCheckBox6.setBackground(new java.awt.Color(0, 0, 102));
        jCheckBox6.setForeground(java.awt.Color.white);
        jCheckBox6.setText("Martini");
        jCheckBox6.setEnabled(false);

        next1.setBackground(new java.awt.Color(51, 51, 51));
        next1.setForeground(java.awt.Color.white);
        next1.setText("Siguiente");
        next1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                next1ActionPerformed(evt);
            }
        });

        jLabel32.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel32.setForeground(java.awt.Color.white);
        jLabel32.setText("Animador");

        jCheckBox3.setBackground(new java.awt.Color(0, 0, 102));
        jCheckBox3.setForeground(java.awt.Color.white);
        jCheckBox3.setText("Chivas");

        jCheckBox9.setBackground(new java.awt.Color(0, 0, 102));
        jCheckBox9.setForeground(java.awt.Color.white);
        jCheckBox9.setText("Si");
        jCheckBox9.setEnabled(false);

        jCheckBox12.setBackground(new java.awt.Color(0, 0, 102));
        jCheckBox12.setForeground(java.awt.Color.white);
        jCheckBox12.setText("No");
        jCheckBox12.setEnabled(false);

        jLabel33.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel33.setForeground(java.awt.Color.white);
        jLabel33.setText("¡Estas a un paso de terminar tu solucitud!");

        jLabel28.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel28.setForeground(java.awt.Color.white);
        jLabel28.setText("LICORES (seleccione minimo uno)");

        jSeparator2.setForeground(java.awt.Color.white);

        jCheckBox5.setBackground(new java.awt.Color(0, 0, 102));
        jCheckBox5.setForeground(java.awt.Color.white);
        jCheckBox5.setText("Margarita");
        jCheckBox5.setEnabled(false);

        back2.setBackground(new java.awt.Color(51, 51, 51));
        back2.setForeground(java.awt.Color.white);
        back2.setText("Anterior");
        back2.setEnabled(false);
        back2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back2ActionPerformed(evt);
            }
        });

        next3.setBackground(new java.awt.Color(51, 51, 51));
        next3.setForeground(java.awt.Color.white);
        next3.setText("Siguiente");
        next3.setEnabled(false);
        next3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                next3ActionPerformed(evt);
            }
        });

        jCheckBox1.setBackground(new java.awt.Color(0, 0, 102));
        jCheckBox1.setForeground(java.awt.Color.white);
        jCheckBox1.setText("Red label");

        jCheckBox4.setBackground(new java.awt.Color(0, 0, 102));
        jCheckBox4.setForeground(java.awt.Color.white);
        jCheckBox4.setText("Mojito");
        jCheckBox4.setEnabled(false);

        jCheckBox10.setBackground(new java.awt.Color(0, 0, 102));
        jCheckBox10.setForeground(java.awt.Color.white);
        jCheckBox10.setText("No");
        jCheckBox10.setEnabled(false);

        cantidadPersonas.setBackground(new java.awt.Color(51, 51, 51));
        cantidadPersonas.setForeground(new java.awt.Color(255, 255, 255));
        cantidadPersonas.setEnabled(false);

        javax.swing.GroupLayout jEImagePanel3Layout = new javax.swing.GroupLayout(jEImagePanel3);
        jEImagePanel3.setLayout(jEImagePanel3Layout);
        jEImagePanel3Layout.setHorizontalGroup(
            jEImagePanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jEImagePanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jEImagePanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jEImagePanel3Layout.createSequentialGroup()
                        .addGroup(jEImagePanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jEImagePanel3Layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addGroup(jEImagePanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jEImagePanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel27, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel28, javax.swing.GroupLayout.Alignment.TRAILING))
                                    .addGroup(jEImagePanel3Layout.createSequentialGroup()
                                        .addGroup(jEImagePanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jCheckBox2)
                                            .addComponent(jCheckBox3)
                                            .addComponent(jCheckBox1))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(next1))))
                            .addGroup(jEImagePanel3Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel35)
                                .addGap(49, 49, 49)
                                .addComponent(jCheckBox11)
                                .addGap(18, 18, 18)
                                .addComponent(jCheckBox12)))
                        .addGap(54, 54, 54))
                    .addGroup(jEImagePanel3Layout.createSequentialGroup()
                        .addGroup(jEImagePanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1)
                            .addComponent(jSeparator2)
                            .addComponent(jSeparator3, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addContainerGap())
                    .addGroup(jEImagePanel3Layout.createSequentialGroup()
                        .addComponent(jLabel33)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jEImagePanel3Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(jEImagePanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel29)
                            .addGroup(jEImagePanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jCheckBox5)
                                .addComponent(jCheckBox6)
                                .addComponent(jCheckBox4)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jEImagePanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(next2)
                            .addComponent(back1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(64, 64, 64))
                    .addGroup(jEImagePanel3Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jEImagePanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jEImagePanel3Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(jEImagePanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jEImagePanel3Layout.createSequentialGroup()
                                        .addComponent(jLabel34)
                                        .addGap(18, 18, 18)
                                        .addComponent(cantidadPersonas))
                                    .addGroup(jEImagePanel3Layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(jLabel31)
                                        .addGap(80, 80, 80)
                                        .addComponent(jLabel32))
                                    .addGroup(jEImagePanel3Layout.createSequentialGroup()
                                        .addComponent(jCheckBox7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jCheckBox8)
                                        .addGap(57, 57, 57)
                                        .addComponent(jCheckBox9)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jCheckBox10)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jEImagePanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(next3)
                                    .addComponent(back2, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(41, 41, 41))
                            .addGroup(jEImagePanel3Layout.createSequentialGroup()
                                .addComponent(jLabel30)
                                .addGap(0, 0, Short.MAX_VALUE))))))
        );
        jEImagePanel3Layout.setVerticalGroup(
            jEImagePanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jEImagePanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel27)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel28)
                .addGroup(jEImagePanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jEImagePanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jCheckBox1)
                        .addGap(3, 3, 3)
                        .addComponent(jCheckBox2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jCheckBox3)
                        .addGap(20, 20, 20)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jEImagePanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jEImagePanel3Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel29)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jCheckBox4)
                                .addGap(3, 3, 3)
                                .addComponent(jCheckBox5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jCheckBox6))
                            .addGroup(jEImagePanel3Layout.createSequentialGroup()
                                .addGap(44, 44, 44)
                                .addComponent(back1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(next2))))
                    .addGroup(jEImagePanel3Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(next1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel30)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jEImagePanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel34)
                    .addComponent(cantidadPersonas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jEImagePanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jEImagePanel3Layout.createSequentialGroup()
                        .addGroup(jEImagePanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel31)
                            .addComponent(jLabel32))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jEImagePanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jCheckBox7)
                            .addComponent(jCheckBox8)
                            .addComponent(jCheckBox9)
                            .addComponent(jCheckBox10)))
                    .addGroup(jEImagePanel3Layout.createSequentialGroup()
                        .addComponent(back2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(next3)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(jLabel33)
                .addGap(8, 8, 8)
                .addGroup(jEImagePanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel35)
                    .addComponent(jCheckBox11)
                    .addComponent(jCheckBox12))
                .addContainerGap())
        );

        jEImagePanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        next.setBackground(new java.awt.Color(51, 51, 51));
        next.setForeground(new java.awt.Color(255, 255, 255));
        next.setText("Siguiente");
        next.setEnabled(false);
        next.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextActionPerformed(evt);
            }
        });

        jLabel36.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(255, 255, 255));
        jLabel36.setText("Valor hasta el momento es de");

        precio.setBackground(new java.awt.Color(51, 51, 51));
        precio.setForeground(new java.awt.Color(255, 255, 255));
        precio.setEnabled(false);

        javax.swing.GroupLayout jEImagePanel4Layout = new javax.swing.GroupLayout(jEImagePanel4);
        jEImagePanel4.setLayout(jEImagePanel4Layout);
        jEImagePanel4Layout.setHorizontalGroup(
            jEImagePanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jEImagePanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jEImagePanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jEImagePanel4Layout.createSequentialGroup()
                        .addComponent(precio, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(next))
                    .addComponent(jLabel36))
                .addContainerGap(80, Short.MAX_VALUE))
        );
        jEImagePanel4Layout.setVerticalGroup(
            jEImagePanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jEImagePanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel36)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jEImagePanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(next)
                    .addComponent(precio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jEImagePanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        logAdmin.setBackground(new java.awt.Color(51, 51, 51));
        logAdmin.setForeground(new java.awt.Color(255, 255, 255));
        logAdmin.setText("Inicio sesión como administrador");
        logAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logAdminActionPerformed(evt);
            }
        });

        log.setBackground(new java.awt.Color(51, 51, 51));
        log.setForeground(new java.awt.Color(255, 255, 255));
        log.setText("Inicio sesion");
        log.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logActionPerformed(evt);
            }
        });

        regist.setBackground(new java.awt.Color(51, 51, 51));
        regist.setForeground(new java.awt.Color(255, 255, 255));
        regist.setText("Registro");
        regist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jEImagePanel5Layout = new javax.swing.GroupLayout(jEImagePanel5);
        jEImagePanel5.setLayout(jEImagePanel5Layout);
        jEImagePanel5Layout.setHorizontalGroup(
            jEImagePanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jEImagePanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jEImagePanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(logAdmin, javax.swing.GroupLayout.DEFAULT_SIZE, 386, Short.MAX_VALUE)
                    .addComponent(regist, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(log, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jEImagePanel5Layout.setVerticalGroup(
            jEImagePanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jEImagePanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(regist)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(log)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(logAdmin)
                .addGap(23, 23, 23))
        );

        javax.swing.GroupLayout fSGradientPanel2Layout = new javax.swing.GroupLayout(fSGradientPanel2);
        fSGradientPanel2.setLayout(fSGradientPanel2Layout);
        fSGradientPanel2Layout.setHorizontalGroup(
            fSGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fSGradientPanel2Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(fSGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jEImagePanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jEImagePanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addGroup(fSGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jEImagePanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jEImagePanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
        );
        fSGradientPanel2Layout.setVerticalGroup(
            fSGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fSGradientPanel2Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(fSGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(fSGradientPanel2Layout.createSequentialGroup()
                        .addComponent(jEImagePanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(jEImagePanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(fSGradientPanel2Layout.createSequentialGroup()
                        .addComponent(jEImagePanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jEImagePanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(163, 163, 163))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fSGradientPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(fSGradientPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 688, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void logActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logActionPerformed
        new VistaLogIn().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_logActionPerformed

    private void registActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registActionPerformed
        new VistaRegistro().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_registActionPerformed

    private void logAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logAdminActionPerformed
        new VistaLogIn().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_logAdminActionPerformed

    private void back1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back1ActionPerformed
        //Acciones del botón
        jCheckBox1.setEnabled(true);
        jCheckBox2.setEnabled(true);
        jCheckBox3.setEnabled(true);
        next1.setEnabled(true);
        jCheckBox4.setEnabled(false);
        jCheckBox5.setEnabled(false);
        jCheckBox6.setEnabled(false);
        back1.setEnabled(false);
        next2.setEnabled(false);
        //Fin acciones del botón
    }//GEN-LAST:event_back1ActionPerformed

    private void back2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back2ActionPerformed
        //Acciones del botón
        cantidadPersonas.setEnabled(false);
        jCheckBox7.setEnabled(false);
        jCheckBox8.setEnabled(false);
        jCheckBox9.setEnabled(false);
        jCheckBox10.setEnabled(false);
        back2.setEnabled(false);
        next3.setEnabled(false);
        next.setEnabled(false);
        jCheckBox4.setEnabled(true);
        jCheckBox5.setEnabled(true);
        jCheckBox6.setEnabled(true);
        back1.setEnabled(true);
        next2.setEnabled(true);
        //Fin acciones del botón
    }//GEN-LAST:event_back2ActionPerformed

    private void next1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_next1ActionPerformed
        //Acciones del botón
        jCheckBox1.setEnabled(false);
        jCheckBox2.setEnabled(false);
        jCheckBox3.setEnabled(false);
        next1.setEnabled(false);
        jCheckBox4.setEnabled(true);
        jCheckBox5.setEnabled(true);
        jCheckBox6.setEnabled(true);
        back1.setEnabled(true);
        next2.setEnabled(true);
        //Fin acciones del botón

        if (jCheckBox1.isSelected()) {
            precioTotal += 80000;
            concepto += "Red Label \n";
        }
        if (jCheckBox2.isSelected()) {
            precioTotal += 185000;
            concepto += "Buchana´s \n";
        }
        if (jCheckBox3.isSelected()) {
            precioTotal += 205000;
            concepto += "Chivas \n";
        }

        precio.setText(String.valueOf(precioTotal));
    }//GEN-LAST:event_next1ActionPerformed

    private void next2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_next2ActionPerformed
        //Acciones del botón
        jCheckBox4.setEnabled(false);
        jCheckBox5.setEnabled(false);
        jCheckBox6.setEnabled(false);
        back1.setEnabled(false);
        next2.setEnabled(false);
        cantidadPersonas.setEnabled(true);
        jCheckBox7.setEnabled(true);
        jCheckBox8.setEnabled(true);
        jCheckBox9.setEnabled(true);
        jCheckBox10.setEnabled(true);
        back2.setEnabled(true);
        next3.setEnabled(true);
        //Fin acciones del botón

        if (jCheckBox4.isSelected()) {
            precioTotal += 20000;
            concepto += "Mojito \n";
        }
        if (jCheckBox5.isSelected()) {
            precioTotal += 25000;
            concepto += "Margarita \n";
        }
        if (jCheckBox6.isSelected()) {
            precioTotal += 28000;
            concepto += "Martini \n";
        }

        precio.setText(String.valueOf(precioTotal));
    }//GEN-LAST:event_next2ActionPerformed

    private void next3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_next3ActionPerformed
        //Acciones del botón
        cantidadPersonas.setEnabled(false);
        jCheckBox7.setEnabled(false);
        jCheckBox8.setEnabled(false);
        jCheckBox9.setEnabled(false);
        jCheckBox10.setEnabled(false);
        next3.setEnabled(false);
        jCheckBox11.setEnabled(true);
        jCheckBox12.setEnabled(true);
        next.setEnabled(true);
        //Fin acciones del botón

        if (jCheckBox7.isSelected()) {
            precioTotal += 400000;
            concepto += "Menaje \n";
        }
        if (jCheckBox9.isSelected()) {
            precioTotal += 800000;
            concepto += "Animador \n";
        }
        for (int i = 1; i <= Integer.parseInt(cantidadPersonas.getText()); i++) {
            precioTotal += 10000;
        }
        concepto += cantidadPersonas.getText() + " personas \n";

        precio.setText(String.valueOf(precioTotal));
    }//GEN-LAST:event_next3ActionPerformed

    private void nextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextActionPerformed
        controlador.agregarPedido();
    }//GEN-LAST:event_nextActionPerformed

    /**
     * Metodo principal que ejecutará el código.
     *
     */
    //public static void formatoVista() {
    public static void main(String[] args) {
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

        /* Crear y mostrar la interfaz */
        java.awt.EventQueue.invokeLater(() -> {
            new VistaPrincipal().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back1;
    private javax.swing.JButton back2;
    private javax.swing.JTextField cantidadPersonas;
    private LIB.FSGradientPanel fSGradientPanel2;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox10;
    private javax.swing.JCheckBox jCheckBox11;
    private javax.swing.JCheckBox jCheckBox12;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JCheckBox jCheckBox5;
    private javax.swing.JCheckBox jCheckBox6;
    private javax.swing.JCheckBox jCheckBox7;
    private javax.swing.JCheckBox jCheckBox8;
    private javax.swing.JCheckBox jCheckBox9;
    private LIB.JEImagePanel jEImagePanel1;
    private LIB.JEImagePanel jEImagePanel2;
    private LIB.JEImagePanel jEImagePanel3;
    private LIB.JEImagePanel jEImagePanel4;
    private LIB.JEImagePanel jEImagePanel5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JButton log;
    private javax.swing.JButton logAdmin;
    private javax.swing.JButton next;
    private javax.swing.JButton next1;
    private javax.swing.JButton next2;
    private javax.swing.JButton next3;
    private javax.swing.JTextField precio;
    private javax.swing.JButton regist;
    // End of variables declaration//GEN-END:variables

    public float getPrecioTotal() {
        return precioTotal;
    }

    public String getConcepto() {
        return concepto;
    }

    public JButton getNext() {
        return next;
    }
}
