package interfaz;

import java.awt.Color;
import java.awt.Image;
import javax.swing.ImageIcon;
import obligatorio.*;

public class CrearRestaurante extends javax.swing.JPanel {

    public CrearRestaurante(Sistema s) {
        initComponents();
        ImageIcon iconoError = new ImageIcon(getClass().getResource("/Imagenes/error.png"));
        ImageIcon iconoConfir = new ImageIcon(getClass().getResource("/Imagenes/confirmar.png"));
        ImageIcon iconoGuardar = new ImageIcon(getClass().getResource("/Imagenes/guardar.png"));
        error = new ImageIcon(iconoError.getImage().getScaledInstance(22, -1, Image.SCALE_DEFAULT));
        ImageIcon confirmar = new ImageIcon(iconoConfir.getImage().getScaledInstance(50, -1, Image.SCALE_DEFAULT));
        ImageIcon guardar = new ImageIcon(iconoGuardar.getImage().getScaledInstance(50, -1, Image.SCALE_DEFAULT));
        miSistema = s;
        mh = new ManejadorHorario();
        cbxDias.removeAllItems();
        cargarIconos();
        llenarDias();
        lblCorrecto.setVisible(false);
        btnCrearRest.setIcon(confirmar);
        btnGuardar.setIcon(guardar);

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
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(500, 500));
        setMinimumSize(new java.awt.Dimension(500, 500));
        setPreferredSize(new java.awt.Dimension(500, 500));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Nombre (3 - 20)(*)");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, -1));

        add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 40, 200, 20));

        jLabel2.setText("Dirección (7 - 20) (*)");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, -1));

        add(txtDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 100, 200, -1));

        jLabel3.setText("Horarios:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, -1, -1));

        cbxDias.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cbxDias.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        add(cbxDias, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 190, -1, -1));

        jLabel4.setText("Dia");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 170, -1, -1));

        jLabel5.setText("Hora apertura");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 170, -1, -1));
        add(txtHabertura, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 190, 20, 20));

        jLabel6.setText("Hora cierre");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 170, -1, -1));
        add(txtHcierre, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 190, 20, -1));

        jLabel7.setText("Tipo de comida (4 - 50) (*)");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, -1, -1));

        add(txtTipoComida, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 280, 200, -1));

        btnCrearRest.setBorderPainted(false);
        btnCrearRest.setContentAreaFilled(false);
        btnCrearRest.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCrearRest.setFocusable(false);
        btnCrearRest.setRolloverEnabled(false);
        btnCrearRest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearRestActionPerformed(evt);
            }
        });
        add(btnCrearRest, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 310, 79, 58));

        jLabel8.setText(" :");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 190, -1, -1));
        add(txtHabertura2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 190, 20, -1));

        jLabel9.setText(" :");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 190, 20, 20));

        btnGuardar.setBorderPainted(false);
        btnGuardar.setContentAreaFilled(false);
        btnGuardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGuardar.setFocusable(false);
        btnGuardar.setRolloverEnabled(false);
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 170, 60, 60));
        add(txtHcierre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 190, 20, -1));
        add(lblErrorDir, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 100, 22, 19));
        add(lblErrorNom1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 40, 22, 19));
        add(lblErrorHCierre, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 190, 22, 19));
        add(lblErrorHAber1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 190, 22, 19));
        add(lblErrorTipoC, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 280, 20, 19));

        lblCorrecto.setForeground(new java.awt.Color(255, 0, 0));
        lblCorrecto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        add(lblCorrecto, new org.netbeans.lib.awtextra.AbsoluteConstraints(-1, 380, 510, 17));

        jLabel10.setText("00 : 00 - 23  : 59");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 220, -1, -1));

        jLabel12.setText("Horas validas entre");
        add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 220, -1, -1));
    }// </editor-fold>//GEN-END:initComponents


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

        if (miSistema.validarStringNoVacio(txtNombre.getText(), 2, 21)) {
            nombreOk = true;
            lblErrorNom1.setVisible(false);
        } else {
            nombreOk = false;
            lblErrorNom1.setVisible(true);
        }
        if (miSistema.validarStringNoVacio(txtDireccion.getText(), 6, 21)) {
            direccionOk = true;
            lblErrorDir.setVisible(false);
        } else {
            direccionOk = false;
            lblErrorDir.setVisible(true);
        }
        if (miSistema.validarStringNoVacio(txtTipoComida.getText(), 3, 51)) {
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

        if (mh.validarHorario(abertura)) {
            horaAberOk = true;
            lblErrorHAber1.setVisible(false);
        } else {
            horaAberOk = false;
            lblErrorHAber1.setVisible(true);
        }
        if (mh.validarHorario(cierre)) {
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

  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCrearRest;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JComboBox cbxDias;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
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
