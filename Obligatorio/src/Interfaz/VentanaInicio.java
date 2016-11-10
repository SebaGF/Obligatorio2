package Interfaz;

import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import obligatorio.Restaurante;
import obligatorio.Sistema;
import javax.swing.JOptionPane;

public class VentanaInicio extends javax.swing.JFrame {

    public VentanaInicio(Sistema s) {
        this.miSistema = s;
        initComponents();
        cargarRestaurantes();
    }

    public void cargarRestaurantes() {
        DefaultListModel modelo = new DefaultListModel();
        Iterator it = miSistema.getLstRestaurantes().iterator();
        while (it.hasNext()) {

            modelo.addElement(it.next());
        }
        lstRestaurantes.setModel(modelo);
    }

    public void cargarListaHorarios(Restaurante r) {
        DefaultListModel modelo = new DefaultListModel();
        Iterator it = r.getHorarios().getHorarios().iterator();
        while (it.hasNext()) {
            modelo.addElement(it.next());
        }
        lstHorarios.setModel(modelo);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator6 = new javax.swing.JSeparator();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPaneFichaRestaurante = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstRestaurantes = new javax.swing.JList<String>();
        txtNombre = new javax.swing.JTextField();
        txtDireccion = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        txtApertura = new javax.swing.JTextField();
        txtCierre = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        txtTipoDeComida = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        btnEditar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        lstHorarios = new javax.swing.JList();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        btnCargarHorarioModificado = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        txtNombreNuevo = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtDireccionNuevo = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel12 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel16 = new javax.swing.JLabel();
        txtTipoDeComidaNuevo = new javax.swing.JTextField();
        btnAgregarRestaurante = new javax.swing.JButton();
        jSeparator7 = new javax.swing.JSeparator();
        cmbDias = new javax.swing.JComboBox();
        cmbHorarioInicio = new javax.swing.JComboBox();
        cmbHorarioFinal = new javax.swing.JComboBox();
        jLabel13 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        btnCargarHorario = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTabbedPane1.setTabPlacement(javax.swing.JTabbedPane.LEFT);
        jTabbedPane1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTabbedPane1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Restaurantes");

        lstRestaurantes.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lstRestaurantesValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(lstRestaurantes);

        txtNombre.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtNombreCaretUpdate(evt);
            }
        });

        jLabel3.setText("Dirección");

        jLabel2.setText("Nombre");

        jLabel4.setText("Horarios");

        jLabel5.setText("Tipo de comida");

        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        lstHorarios.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lstHorariosValueChanged(evt);
            }
        });
        jScrollPane2.setViewportView(lstHorarios);

        jLabel6.setText("Apertura");

        jLabel7.setText("Cierre");

        jLabel8.setText("h");

        jLabel14.setText("h");

        btnCargarHorarioModificado.setText("Cargar");
        btnCargarHorarioModificado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCargarHorarioModificadoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPaneFichaRestauranteLayout = new javax.swing.GroupLayout(jPaneFichaRestaurante);
        jPaneFichaRestaurante.setLayout(jPaneFichaRestauranteLayout);
        jPaneFichaRestauranteLayout.setHorizontalGroup(
            jPaneFichaRestauranteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPaneFichaRestauranteLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnEditar)
                .addContainerGap())
            .addComponent(jSeparator3)
            .addGroup(jPaneFichaRestauranteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPaneFichaRestauranteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPaneFichaRestauranteLayout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(16, 16, 16)
                        .addComponent(txtTipoDeComida, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPaneFichaRestauranteLayout.createSequentialGroup()
                        .addGroup(jPaneFichaRestauranteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addGroup(jPaneFichaRestauranteLayout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPaneFichaRestauranteLayout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPaneFichaRestauranteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPaneFichaRestauranteLayout.createSequentialGroup()
                                        .addGap(40, 40, 40)
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtApertura, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel8)
                                        .addGap(37, 37, 37)
                                        .addComponent(jLabel7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtCierre, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel14))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPaneFichaRestauranteLayout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 500, Short.MAX_VALUE)
                                        .addComponent(btnCargarHorarioModificado)))))
                        .addContainerGap())))
        );
        jPaneFichaRestauranteLayout.setVerticalGroup(
            jPaneFichaRestauranteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPaneFichaRestauranteLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(jPaneFichaRestauranteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPaneFichaRestauranteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPaneFichaRestauranteLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(jPaneFichaRestauranteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtApertura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCierre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel14))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPaneFichaRestauranteLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPaneFichaRestauranteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPaneFichaRestauranteLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btnCargarHorarioModificado))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE))
                        .addGap(18, 18, 18)))
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPaneFichaRestauranteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTipoDeComida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56)
                .addComponent(btnEditar)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Fichas de restaurantes", jPaneFichaRestaurante);

        jLabel9.setText("Nombre");

        jLabel10.setText("Dirección");

        txtDireccionNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDireccionNuevoActionPerformed(evt);
            }
        });

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Crear una nueva ficha de restaurante");

        jLabel12.setText("Horarios");

        jLabel16.setText("Tipo de Comida");

        btnAgregarRestaurante.setText("Agregar Restaurante");
        btnAgregarRestaurante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarRestauranteActionPerformed(evt);
            }
        });

        cmbDias.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sabado", "Domingo" }));

        cmbHorarioInicio.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "00h", "01h", "02h", "03h", "04h", "05h", "06h", "07h", "08h", "09h", "10h", "11h", "12h", "13h", "14h", "15h", "16h", "17h", "18h", "19h", "20h", "21h", "22h", "23h" }));

        cmbHorarioFinal.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "00h", "01h", "02h", "03h", "04h", "05h", "06h", "07h", "08h", "09h", "10h", "11h", "12h", "13h", "14h", "15h", "16h", "17h", "18h", "19h", "20h", "21h", "22h", "23h" }));

        jLabel13.setText("Apertura");

        jLabel17.setText("Cierre");

        btnCargarHorario.setText("Cargar Horario");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator4)
            .addComponent(jSeparator5)
            .addComponent(jSeparator7)
            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtNombreNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(65, 65, 65)
                                .addComponent(jLabel10)
                                .addGap(41, 41, 41)
                                .addComponent(txtDireccionNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cmbDias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cmbHorarioInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel17)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cmbHorarioFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(143, 143, 143))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel16)
                                .addGap(60, 60, 60)
                                .addComponent(txtTipoDeComidaNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAgregarRestaurante, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnCargarHorario, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11)
                .addGap(33, 33, 33)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtNombreNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(txtDireccionNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(cmbDias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbHorarioInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbHorarioFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(jLabel17))
                .addGap(22, 22, 22)
                .addComponent(btnCargarHorario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTipoDeComidaNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16))
                .addGap(21, 21, 21)
                .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 180, Short.MAX_VALUE)
                .addComponent(btnAgregarRestaurante)
                .addGap(23, 23, 23))
        );

        txtNombreNuevo.getAccessibleContext().setAccessibleName("txtNombreNuevo");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Crear nueva ficha", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 971, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 543, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarRestauranteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarRestauranteActionPerformed
//        Restaurante r = new Restaurante();
//        if (miSistema.validarStringNoVacio(txtNombreNuevo.getText(), 1, Integer.MAX_VALUE)) {
//            if (miSistema.validarStringNoVacio(txtDireccionNuevo.getText(), 1, Integer.MAX_VALUE)) {
//                if (miSistema.validarHorario(txtHoraInicioNuevo.getText())) {
//                    if (miSistema.validarHorario(txtHoraFinalNuevo.getText())) {
//                        if (miSistema.validarStringNoVacio(txtTipoDeComidaNuevo.getText(), 1, Integer.MAX_VALUE)) {
//                            r.setNombre(txtNombreNuevo.getText());
//                            r.setDireccion(txtDireccionNuevo.getText());
//                            r.setHorarioInicio(txtHoraInicioNuevo.getText());
//                            r.setHorarioFin(txtHoraFinalNuevo.getText());
//                            r.setTipoComida(txtTipoDeComidaNuevo.getText());
//                            miSistema.getLstRestaurantes().add(r);
//                            txtNombreNuevo.setText("");
//                            txtDireccionNuevo.setText("");
//                            txtHoraInicioNuevo.setText("");
//                            txtHoraFinalNuevo.setText("");
//                            txtTipoDeComidaNuevo.setText("");
//
//                            JOptionPane.showMessageDialog(this, "El restaurante se ha ingresado correctamente");
//                           
//                        } else {
//                            JOptionPane.showMessageDialog(this, "Tipo de comida ingresado no valido");
//
//                        }
//                    } else {
//                        JOptionPane.showMessageDialog(this, "Horario final ingresado no valido");
//
//                    }
//                } else {
//                    JOptionPane.showMessageDialog(this, "Horario inicial ingresado no valido");
//                }
//            } else {
//                JOptionPane.showMessageDialog(this, "Direccion de restaurante ingresad no valido");
//            }
//        } else {
//            JOptionPane.showMessageDialog(this, "Nombre de restaurante ingresado no valido");
//        }
    }//GEN-LAST:event_btnAgregarRestauranteActionPerformed

    private void txtDireccionNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDireccionNuevoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDireccionNuevoActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed

        //        if (lstRestaurantes.getSelectedIndex() > -1) {
        //
        //            Restaurante r;
        //            r = miSistema.getLstRestaurantes().get(lstRestaurantes.getSelectedIndex());
        //            boolean cambio;
        //            cambio = false;
        //            if (       !(r.getNombre().equalsIgnoreCase(txtNombre.getText()) )
        //                || !(r.getDireccion().equalsIgnoreCase(txtDireccion.getText()))
        //                || !(r.getHorarioInicio().equals(txtHoraInicio.getText()))
        //                || !(r.getHorarioFin().equals(txtHoraFin.getText()))
        //                || !(r.getTipoComida().equalsIgnoreCase(txtTipoDeComida.getText()))) {
        //                cambio = true;
        //            }
        //            if (miSistema.validarStringNoVacio(txtNombre.getText(), 1, Integer.MAX_VALUE)) {
        //                if (miSistema.validarStringNoVacio(txtDireccion.getText(), 1, Integer.MAX_VALUE)) {
        //                    if (miSistema.validarHorario(txtHoraInicio.getText())) {
        //                        if (miSistema.validarHorario(txtHoraFin.getText())) {
        //                            if (miSistema.validarStringNoVacio(txtTipoDeComida.getText(), 1, Integer.MAX_VALUE)) {
        //                                r.setNombre(txtNombre.getText());
        //                                r.setDireccion(txtDireccion.getText());
        //                                r.setHorarioInicio(txtHoraInicio.getText());
        //                                r.setHorarioFin(txtHoraFin.getText());
        //                                r.setTipoComida(txtTipoDeComida.getText());
        //
        //                                if (cambio) {
        //                                    JOptionPane.showMessageDialog(this, "El restaurante se ha editado correctamente");
        //                                    txtNombre.setText("");
        //                                    txtDireccion.setText("");
        //                                    txtHoraInicio.setText("");
        //                                    txtHoraFin.setText("");
        //                                    txtTipoDeComida.setText("");
        //
        //                                } else {
        //                                    JOptionPane.showMessageDialog(this, "Debe editar algun campo");
        //                                }
        //
        //                            } else {
        //                                JOptionPane.showMessageDialog(this, "Tipo de comida ingresado no valido");
        //
        //                            }
        //                        } else {
        //                            JOptionPane.showMessageDialog(this, "Horario final ingresado no valido");
        //
        //                        }
        //                    } else {
        //                        JOptionPane.showMessageDialog(this, "Horario inicial ingresado no valido");
        //                    }
        //                } else {
        //                    JOptionPane.showMessageDialog(this, "Direccion de restaurante ingresad no valido");
        //                }
        //            } else {
        //                JOptionPane.showMessageDialog(this, "Nombre de restaurante ingresado no valido");
        //            }
        //        }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void txtNombreCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtNombreCaretUpdate

    }//GEN-LAST:event_txtNombreCaretUpdate

    private void lstRestaurantesValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lstRestaurantesValueChanged
//         TODO add your handling code here:
        Restaurante r1 = miSistema.getLstRestaurantes().get(lstRestaurantes.getSelectedIndex());

        txtNombre.setText(r1.getNombre().toUpperCase());
        txtDireccion.setText(r1.getDireccion().toUpperCase());
        cargarListaHorarios(r1);

        txtTipoDeComida.setText(r1.getTipoComida().toUpperCase());
    }//GEN-LAST:event_lstRestaurantesValueChanged

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    //Cagadas Were made
    
    
    
    
    
    
    
    private void lstHorariosValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lstHorariosValueChanged
        if (lstRestaurantes.getSelectedIndex() >= 0) {
            Restaurante r1 = miSistema.getLstRestaurantes().get(lstRestaurantes.getSelectedIndex());

            for (int i = 0; i < r1.getHorarios().getHorarios().size(); i++) {
                if (r1.getHorarios().getHorarios().get(i).getKey().equals(r1.getHorarios().getDias()[lstHorarios.getSelectedIndex()])) {
                    String horarios[] = r1.getHorarios().getHorarios().get(i).getValue().split(" - ");
                    txtApertura.setText(horarios[0]);
                    txtCierre.setText(horarios[1]);

                }

            }
        }

    }//GEN-LAST:event_lstHorariosValueChanged

    private void btnCargarHorarioModificadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCargarHorarioModificadoActionPerformed
        if (!txtApertura.getText().equals("") || !txtCierre.getText().equals("")) {
            Restaurante r1 = miSistema.getLstRestaurantes().get(lstRestaurantes.getSelectedIndex());
            r1.getHorarios().cargarHorario(r1.getHorarios().getDias()[lstHorarios.getSelectedIndex()], txtApertura.getText(), txtCierre.getText());
            cargarListaHorarios(r1);
        }
    }//GEN-LAST:event_btnCargarHorarioModificadoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarRestaurante;
    private javax.swing.JButton btnCargarHorario;
    private javax.swing.JButton btnCargarHorarioModificado;
    private javax.swing.JButton btnEditar;
    private javax.swing.JComboBox cmbDias;
    private javax.swing.JComboBox cmbHorarioFinal;
    private javax.swing.JComboBox cmbHorarioInicio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPaneFichaRestaurante;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JList lstHorarios;
    private javax.swing.JList<String> lstRestaurantes;
    private javax.swing.JTextField txtApertura;
    private javax.swing.JTextField txtCierre;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtDireccionNuevo;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNombreNuevo;
    private javax.swing.JTextField txtTipoDeComida;
    private javax.swing.JTextField txtTipoDeComidaNuevo;
    // End of variables declaration//GEN-END:variables
Sistema miSistema;
}
