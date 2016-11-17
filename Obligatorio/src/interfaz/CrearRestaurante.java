package interfaz;

import java.awt.Color;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import obligatorio.*;

public class CrearRestaurante extends javax.swing.JPanel {

    public CrearRestaurante(Sistema s) {
        initComponents();
        ImageIcon iconoError = new ImageIcon(getClass().getResource("/Imagenes/error.png"));
        error = new ImageIcon(iconoError.getImage().getScaledInstance(22, 19, Image.SCALE_DEFAULT));
        miSistema = s;
        mh = new ManejadorHorario();
        cbxDias.removeAllItems();
        cargarIconos();
        llenarDias();
        lblCorrecto.setVisible(false);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtDireccion = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        cbxDias = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtHabertura = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtHcierre = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtTipoComida = new javax.swing.JTextField();
        btnCrearRest = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        txtHabertura2 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        btnGuardar = new javax.swing.JButton();
        txtHcierre1 = new javax.swing.JTextField();
        lblErrorDir = new javax.swing.JLabel();
        lblErrorNom1 = new javax.swing.JLabel();
        lblErrorHCierre = new javax.swing.JLabel();
        lblErrorHAber1 = new javax.swing.JLabel();
        lblErrorTipoC = new javax.swing.JLabel();
        lblCorrecto = new javax.swing.JLabel();

        jLabel1.setText("Nombre");

        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });

        jLabel2.setText("Direccion");

        jLabel3.setText("Horarios:");

        cbxDias.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel4.setText("Dia");

        jLabel5.setText("Hora abertura");

        jLabel6.setText("Hora cierre");

        jLabel7.setText("Tipo de comida");

        btnCrearRest.setText("Crear Restarurante");
        btnCrearRest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearRestActionPerformed(evt);
            }
        });

        jLabel8.setText(" :");

        jLabel9.setText(" :");

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        lblCorrecto.setForeground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(lblErrorNom1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblErrorDir, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addGap(34, 34, 34)
                                    .addComponent(jLabel4))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(56, 56, 56)
                                    .addComponent(cbxDias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel5)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(8, 8, 8)
                                    .addComponent(txtHabertura, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(2, 2, 2)
                                    .addComponent(jLabel8)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtHabertura2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(lblErrorHAber1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel6)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(txtHcierre, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel9)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtHcierre1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(lblErrorHCierre, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(btnGuardar))))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(btnCrearRest)
                            .addGap(148, 148, 148))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel7)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblCorrecto, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(txtTipoComida, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(lblErrorTipoC, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addComponent(lblErrorDir, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblErrorNom1, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(cbxDias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtHabertura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8)
                                    .addComponent(txtHabertura2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblErrorHAber1, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnGuardar))))
                    .addComponent(lblErrorHCierre, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(txtHcierre1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtHcierre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblErrorTipoC, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtTipoComida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel7)))
                .addGap(36, 36, 36)
                .addComponent(btnCrearRest)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblCorrecto, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(48, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
    public void Imagen(ImageIcon i) {
        this.setSize(200, 200);
    }

    private void btnCrearRestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearRestActionPerformed
        Restaurante r = new Restaurante();
        boolean nombreOk;
        boolean direccionOk;
        boolean tipoComidaOk;
        boolean estaRest;
        nombreOk = false;
        direccionOk = false;
        tipoComidaOk = false;
        estaRest = false;

        if (miSistema.validarStringNoVacio(txtNombre.getText(), 0, 20)) {
            nombreOk = true;
            lblErrorNom1.setVisible(false);
        } else {
            nombreOk = false;
            lblErrorNom1.setVisible(true);
        }
        if (miSistema.validarStringNoVacio(txtDireccion.getText(), 0, 20)) {
            direccionOk = true;
            lblErrorDir.setVisible(false);
        } else {
            direccionOk = false;
            lblErrorDir.setVisible(true);
        }
        if (miSistema.validarStringNoVacio(txtTipoComida.getText(), 0, 30)) {
            tipoComidaOk = true;
            lblErrorTipoC.setVisible(false);
        } else {
            tipoComidaOk = false;
            lblErrorTipoC.setVisible(true);
        }
        if (miSistema.estaRestaurante(txtDireccion.getText())) {
            estaRest = true;
            lblCorrecto.setForeground(Color.red);
            lblCorrecto.setText("Ya existe este restaurante");
        } else {
            estaRest = false;
        }

        if (nombreOk && direccionOk && tipoComidaOk && !estaRest) {

            r.setNombre(txtNombre.getText());
            r.setDireccion(txtDireccion.getText());
            r.setTipoComida(txtTipoComida.getText());
            r.setHorarios(mh);
            lblCorrecto.setText(txtNombre.getText() + " creado correctamente");
            lblCorrecto.setForeground(Color.green);
            lblCorrecto.setVisible(true);
            txtNombre.setText(null);
            txtDireccion.setText(null);
            txtTipoComida.setText(null);
            miSistema.getLstRestaurantes().add(r);

            

        }


    }//GEN-LAST:event_btnCrearRestActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        // TODO add your handling code here:
        boolean horaAberOk;
        boolean horaCierreOk;
        horaAberOk = false;
        horaCierreOk = false;
        String abertura;
        String cierre;
        abertura = "";
        cierre = "";
        String dia;
        dia = "";

        dia = "" + cbxDias.getSelectedItem();
        abertura = txtHabertura.getText() + ":" + txtHabertura2.getText();
        cierre = txtHcierre.getText() + ":" + txtHcierre1.getText();

        if (mh.validarHorario(abertura) /*&& !txtHabertura.getText().equals("") && !txtHabertura2.getText().equals("")*/) {
            horaAberOk = true;
            lblErrorHAber1.setVisible(false);
        } else {
            horaAberOk = false;
            lblErrorHAber1.setVisible(true);
        }
        if (mh.validarHorario(cierre) && !txtHcierre.getText().equals("") && !txtHcierre1.getText().equals("")) {
            horaCierreOk = true;
            lblErrorHCierre.setVisible(false);
        } else {
            horaCierreOk = false;
            lblErrorHCierre.setVisible(true);
        }

        if (horaCierreOk && horaAberOk) {
            mh.cargarHorario(dia, abertura, cierre);
            txtHabertura.setText(null);
            txtHabertura2.setText(null);
            txtHcierre.setText(null);
            txtHcierre1.setText(null);
        }


    }//GEN-LAST:event_btnGuardarActionPerformed

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCrearRest;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JComboBox cbxDias;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lblCorrecto;
    private javax.swing.JLabel lblErrorDir;
    private javax.swing.JLabel lblErrorHAber1;
    private javax.swing.JLabel lblErrorHCierre;
    private javax.swing.JLabel lblErrorNom1;
    private javax.swing.JLabel lblErrorTipoC;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtHabertura;
    private javax.swing.JTextField txtHabertura2;
    private javax.swing.JTextField txtHcierre;
    private javax.swing.JTextField txtHcierre1;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTipoComida;
    // End of variables declaration//GEN-END:variables

    public void llenarDias() {
        for (int i = 0; i < mh.getDias().length; i++) {
            cbxDias.addItem(mh.getDias()[i]);
        }
    }

    public void cargarIconos() {
        lblErrorNom1.setIcon(error);
        lblErrorDir.setIcon(error);
        lblErrorHAber1.setIcon(error);
        lblErrorHCierre.setIcon(error);
        lblErrorTipoC.setIcon(error);
        lblErrorNom1.setVisible(false);
        lblErrorDir.setVisible(false);
        lblErrorHAber1.setVisible(false);
        lblErrorHCierre.setVisible(false);
        lblErrorTipoC.setVisible(false);
    }

    private ImageIcon error;
    private Sistema miSistema;
    private ManejadorHorario mh;

}
