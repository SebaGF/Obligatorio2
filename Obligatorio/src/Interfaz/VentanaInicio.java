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

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator6 = new javax.swing.JSeparator();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPaneFichaRestaurante = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstRestaurantes = new javax.swing.JList<>();
        txtNombre = new javax.swing.JTextField();
        txtDireccion = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        txtHoraInicio = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtHoraFin = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        txtTipoDeComida = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        btnEditar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        txtNombreNuevo = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtDireccionNuevo = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel12 = new javax.swing.JLabel();
        txtHoraInicioNuevo = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtHoraFinalNuevo = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel16 = new javax.swing.JLabel();
        txtTipoDeComidaNuevo = new javax.swing.JTextField();
        btnAgregarRestaurante = new javax.swing.JButton();
        jSeparator7 = new javax.swing.JSeparator();

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

        jLabel6.setText("-");

        jLabel8.setText("HH:MM");

        jLabel7.setText("HH:MM");

        jLabel5.setText("Tipo de comida");

        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPaneFichaRestauranteLayout = new javax.swing.GroupLayout(jPaneFichaRestaurante);
        jPaneFichaRestaurante.setLayout(jPaneFichaRestauranteLayout);
        jPaneFichaRestauranteLayout.setHorizontalGroup(
            jPaneFichaRestauranteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jSeparator3)
            .addGroup(jPaneFichaRestauranteLayout.createSequentialGroup()
                .addGap(41, 412, Short.MAX_VALUE)
                .addComponent(btnEditar)
                .addGap(41, 41, 41))
            .addGroup(jPaneFichaRestauranteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPaneFichaRestauranteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPaneFichaRestauranteLayout.createSequentialGroup()
                        .addGroup(jPaneFichaRestauranteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addGroup(jPaneFichaRestauranteLayout.createSequentialGroup()
                                .addGroup(jPaneFichaRestauranteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPaneFichaRestauranteLayout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPaneFichaRestauranteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPaneFichaRestauranteLayout.createSequentialGroup()
                                                .addComponent(txtHoraInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jLabel6))
                                            .addComponent(jLabel7))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPaneFichaRestauranteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtHoraFin, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel8)))
                                    .addGroup(jPaneFichaRestauranteLayout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 131, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(jPaneFichaRestauranteLayout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(16, 16, 16)
                        .addComponent(txtTipoDeComida, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
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
                .addGap(15, 15, 15)
                .addGroup(jPaneFichaRestauranteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtHoraInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(txtHoraFin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPaneFichaRestauranteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPaneFichaRestauranteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTipoDeComida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnEditar)
                .addContainerGap(19, Short.MAX_VALUE))
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

        jLabel13.setText("-");

        jLabel14.setText("HH:MM");

        jLabel15.setText("HH:MM");

        jLabel16.setText("Tipo de Comida");

        btnAgregarRestaurante.setText("Agregar Restaurante");
        btnAgregarRestaurante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarRestauranteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator4)
            .addComponent(jSeparator5)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                                .addGap(18, 18, 18)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtHoraInicioNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel14))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtHoraFinalNuevo)))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel16)
                                .addGap(60, 60, 60)
                                .addComponent(txtTipoDeComidaNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 2, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnAgregarRestaurante)))
                .addContainerGap())
            .addComponent(jSeparator7)
            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                    .addComponent(txtHoraInicioNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(txtHoraFinalNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(jLabel15))
                .addGap(31, 31, 31)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTipoDeComidaNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16))
                .addGap(21, 21, 21)
                .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
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
        // TODO add your handling code here:
//        Restaurante r1 = miSistema.getLstRestaurantes().get(lstRestaurantes.getSelectedIndex());
//
//        txtNombre.setText(r1.getNombre().toUpperCase());
//        txtDireccion.setText(r1.getDireccion().toUpperCase());
//        txtHoraInicio.setText(r1.getHorarioInicio());
//        txtHoraFin.setText(r1.getHorarioFin());
//        txtTipoDeComida.setText(r1.getTipoComida().toUpperCase());
    }//GEN-LAST:event_lstRestaurantesValueChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarRestaurante;
    private javax.swing.JButton btnEditar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
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
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JList<String> lstRestaurantes;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtDireccionNuevo;
    private javax.swing.JTextField txtHoraFin;
    private javax.swing.JTextField txtHoraFinalNuevo;
    private javax.swing.JTextField txtHoraInicio;
    private javax.swing.JTextField txtHoraInicioNuevo;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNombreNuevo;
    private javax.swing.JTextField txtTipoDeComida;
    private javax.swing.JTextField txtTipoDeComidaNuevo;
    // End of variables declaration//GEN-END:variables
Sistema miSistema;
}
