/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import java.awt.*;
import java.util.Iterator;
import java.util.Map;
import javax.swing.*;
import obligatorio.*;

/**
 *
 * @author alejo_000
 */
public class FichaRestaurante extends javax.swing.JPanel {

    /**
     * Creates new form FichaRestaurante
     */
    public FichaRestaurante(Sistema s) {
        initComponents();
        miSistema = s;
        ImageIcon iconoConfir = new ImageIcon(getClass().getResource("/Imagenes/confirmar.png"));
        ImageIcon iconoGuardar = new ImageIcon(getClass().getResource("/Imagenes/guardar.png"));
        ImageIcon iconoError = new ImageIcon(getClass().getResource("/Imagenes/error.png"));
        ImageIcon confirmar = new ImageIcon(iconoConfir.getImage().getScaledInstance(50, -1, Image.SCALE_DEFAULT));
        ImageIcon guardar = new ImageIcon(iconoGuardar.getImage().getScaledInstance(50, -1, Image.SCALE_DEFAULT));
        error = new ImageIcon(iconoError.getImage().getScaledInstance(22, -1, Image.SCALE_DEFAULT));
        cargarIconos();
        cargarRestaurantes();
        btnConfimarCambiar.setIcon(confirmar);
        btnGuardarCambiar.setIcon(guardar);
       lblEditadoCorrecto.setForeground(Color.green);
       lblEditadoCorrecto.setVisible(false);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtNombreCambiar = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtDireccionCambiar = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtHoraAperturaCambiar = new javax.swing.JTextField();
        txtMinutoAperturaCambiar = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtMinutoCierreCambiar = new javax.swing.JTextField();
        txtHoraCierreCambiar = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtTipoComidaCambiar = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstRestaurantesCambiar = new javax.swing.JList();
        btnGuardarCambiar = new javax.swing.JButton();
        btnConfimarCambiar = new javax.swing.JButton();
        lblDirecError = new javax.swing.JLabel();
        lblNomError = new javax.swing.JLabel();
        lblAperturaError = new javax.swing.JLabel();
        lblCierreError = new javax.swing.JLabel();
        lblTipoError = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        lstHorariosCambiar = new javax.swing.JList();
        lblRestauranteError = new javax.swing.JLabel();
        lblErrorHorarios = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        lblEditadoCorrecto = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(500, 500));
        setPreferredSize(new java.awt.Dimension(500, 500));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Nombre (3-20)(*)");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, -1, -1));
        add(txtNombreCambiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 150, 61, -1));

        jLabel2.setText("Direccion (7-20)(*)");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 150, -1, -1));

        txtDireccionCambiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDireccionCambiarActionPerformed(evt);
            }
        });
        add(txtDireccionCambiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 150, 85, -1));

        jLabel3.setText("Horarios:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 177, -1, -1));

        jLabel4.setText("Dia");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(72, 177, -1, -1));

        jLabel5.setText("Hora apertura");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 220, -1, -1));

        jLabel6.setText(":");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 240, 10, -1));
        add(txtHoraAperturaCambiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 240, 30, -1));

        txtMinutoAperturaCambiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMinutoAperturaCambiarActionPerformed(evt);
            }
        });
        add(txtMinutoAperturaCambiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 240, 30, -1));

        jLabel7.setText("Hora cierre");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 220, 84, -1));
        add(txtMinutoCierreCambiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 240, 30, -1));
        add(txtHoraCierreCambiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 240, 30, -1));

        jLabel8.setText(":");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 240, 20, -1));

        jLabel10.setText("Tipo de Comida (4-50)(*)");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 355, -1, -1));
        add(txtTipoComidaCambiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 360, 107, -1));

        jLabel12.setText("Resaurantes");
        add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 0, -1, -1));

        lstRestaurantesCambiar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lstRestaurantesCambiarMouseClicked(evt);
            }
        });
        lstRestaurantesCambiar.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lstRestaurantesCambiarValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(lstRestaurantesCambiar);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 23, 455, 119));

        btnGuardarCambiar.setBorderPainted(false);
        btnGuardarCambiar.setContentAreaFilled(false);
        btnGuardarCambiar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGuardarCambiar.setFocusable(false);
        btnGuardarCambiar.setRolloverEnabled(false);
        btnGuardarCambiar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnGuardarCambiarMouseClicked(evt);
            }
        });
        btnGuardarCambiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarCambiarActionPerformed(evt);
            }
        });
        add(btnGuardarCambiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 210, 60, 80));

        btnConfimarCambiar.setBorderPainted(false);
        btnConfimarCambiar.setContentAreaFilled(false);
        btnConfimarCambiar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnConfimarCambiar.setFocusable(false);
        btnConfimarCambiar.setRolloverEnabled(false);
        btnConfimarCambiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfimarCambiarActionPerformed(evt);
            }
        });
        add(btnConfimarCambiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 380, -1, -1));

        lblDirecError.setFocusable(false);
        add(lblDirecError, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 150, 22, 19));

        lblNomError.setFocusable(false);
        add(lblNomError, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 150, 22, 19));

        lblAperturaError.setFocusable(false);
        add(lblAperturaError, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 240, 22, 19));
        add(lblCierreError, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 240, 22, 19));

        lblTipoError.setFocusable(false);
        add(lblTipoError, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 360, 22, 19));

        lstHorariosCambiar.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lstHorariosCambiarValueChanged(evt);
            }
        });
        jScrollPane2.setViewportView(lstHorariosCambiar);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 205, 130, 140));
        add(lblRestauranteError, new org.netbeans.lib.awtextra.AbsoluteConstraints(472, 57, 22, 19));
        add(lblErrorHorarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 270, 22, 19));

        jLabel9.setText("Horas validas entre 00:00 23:59");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 270, -1, -1));

        lblEditadoCorrecto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblEditadoCorrecto.setText("Se edito correctamente");
        add(lblEditadoCorrecto, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 430, 380, 20));
    }// </editor-fold>//GEN-END:initComponents

    private void txtDireccionCambiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDireccionCambiarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDireccionCambiarActionPerformed

    private void btnConfimarCambiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfimarCambiarActionPerformed
        Restaurante r;
        boolean nombreOk;
        boolean direccionOk;
        boolean tipoComidaOk;
        boolean restauranteOk;
        nombreOk = false;
        direccionOk = false;
        tipoComidaOk = false;
        restauranteOk = false;
        if (lstRestaurantesCambiar.getSelectedIndex() > -1) {
            r = miSistema.getLstRestaurantes().get(lstRestaurantesCambiar.getSelectedIndex());
            restauranteOk = true;
            lblRestauranteError.setVisible(false);
        } else {
            restauranteOk = false;
            lblRestauranteError.setVisible(true);

        }

        if (miSistema.validarStringNoVacio(txtNombreCambiar.getText(), 1, Integer.MAX_VALUE) && restauranteOk) {
            r = miSistema.getLstRestaurantes().get(lstRestaurantesCambiar.getSelectedIndex());

            r.setNombre(txtNombreCambiar.getText());
            nombreOk = true;
            lblNomError.setVisible(false);
        } else {
            nombreOk = false;
            lblNomError.setVisible(true);
        }

        if (miSistema.validarStringNoVacio(txtDireccionCambiar.getText(), 1, Integer.MAX_VALUE) && restauranteOk) {
            r = miSistema.getLstRestaurantes().get(lstRestaurantesCambiar.getSelectedIndex());

            if (miSistema.estaRestaurante(txtDireccionCambiar.getText())) {
                if (txtDireccionCambiar.getText().equalsIgnoreCase(r.getDireccion())) {
                    r.setDireccion(txtDireccionCambiar.getText());
                    direccionOk = true;
                    lblDirecError.setVisible(false);
                } else {
                    lblDirecError.setVisible(true);
                    direccionOk = false;
                }
            } else {
                r.setDireccion(txtDireccionCambiar.getText());
                lblDirecError.setVisible(false);
                direccionOk = true;
            }
        } else {
            lblDirecError.setVisible(true);

        }

        if (miSistema.validarStringNoVacio(txtTipoComidaCambiar.getText(), 1, Integer.MAX_VALUE) && restauranteOk) {
            r = miSistema.getLstRestaurantes().get(lstRestaurantesCambiar.getSelectedIndex());

            r.setTipoComida(txtTipoComidaCambiar.getText());
            tipoComidaOk = true;
            lblTipoError.setVisible(false);
        } else {
            tipoComidaOk = false;
            lblTipoError.setVisible(true);
        }

        if (nombreOk && direccionOk && tipoComidaOk && restauranteOk) {
            txtNombreCambiar.setText("");
            txtDireccionCambiar.setText("");
            txtHoraAperturaCambiar.setText("");
            txtMinutoAperturaCambiar.setText("");
            txtHoraCierreCambiar.setText("");
            txtMinutoCierreCambiar.setText("");
            txtTipoComidaCambiar.setText("");
            cargarRestaurantes();
            cargarIconos();
            lblEditadoCorrecto.setVisible(true);

        }else{
            lblEditadoCorrecto.setVisible(false);
        }


    }//GEN-LAST:event_btnConfimarCambiarActionPerformed

    private void lstRestaurantesCambiarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lstRestaurantesCambiarMouseClicked

    }//GEN-LAST:event_lstRestaurantesCambiarMouseClicked

    private void lstRestaurantesCambiarValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lstRestaurantesCambiarValueChanged
        Restaurante r;

        try {

            r = (Restaurante) lstRestaurantesCambiar.getSelectedValue();

            txtNombreCambiar.setText(r.getNombre());
            txtDireccionCambiar.setText(r.getDireccion());
            txtTipoComidaCambiar.setText(r.getTipoComida());
            cargarHorarios(r);
        } catch (Exception e) {

        }


    }//GEN-LAST:event_lstRestaurantesCambiarValueChanged

    private void lstHorariosCambiarValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lstHorariosCambiarValueChanged

        if (lstHorariosCambiar.getSelectedIndex() > -1) {
            Restaurante r;
            r = miSistema.getLstRestaurantes().get(lstRestaurantesCambiar.getSelectedIndex());
            Map.Entry<String, String> horario;
            String[] splitHorario = new String[2];
            String[] splitHoraInicio = new String[2];
            String[] splitHoraFin = new String[2];
            for (int i = 0; i < r.getHorarios().getHorarios().size(); i++) {
                horario = r.getHorarios().getHorarios().get(lstHorariosCambiar.getSelectedIndex());
                splitHorario = horario.getValue().split(" - ");
                splitHoraInicio = splitHorario[0].split(":");
                splitHoraFin = splitHorario[1].split(":");
            }

            txtHoraAperturaCambiar.setText(splitHoraInicio[0]);
            txtMinutoAperturaCambiar.setText(splitHoraInicio[1]);
            txtHoraCierreCambiar.setText(splitHoraFin[0]);
            txtMinutoCierreCambiar.setText(splitHoraFin[1]);

        }
    }//GEN-LAST:event_lstHorariosCambiarValueChanged

    private void btnGuardarCambiarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGuardarCambiarMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnGuardarCambiarMouseClicked

    private void btnGuardarCambiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarCambiarActionPerformed
        Restaurante r = new Restaurante("", "", new ManejadorHorario(), "");
        boolean restauranteOk;
        boolean horariosOk;
        boolean horaAperturaOk;
        boolean horaCierreOk;
        restauranteOk = false;
        horaAperturaOk = false;
        horaCierreOk = false;
        horariosOk = false;

        if (lstRestaurantesCambiar.getSelectedIndex() > -1) {
            restauranteOk = true;
            lblRestauranteError.setVisible(false);
        } else {
            restauranteOk = false;
            lblRestauranteError.setVisible(true);
        }
        if (lstHorariosCambiar.getSelectedIndex() > -1 && restauranteOk) {
            horariosOk = true;
            lblErrorHorarios.setVisible(false);
        } else {
            horariosOk = false;
            lblErrorHorarios.setVisible(true);
        }

        if (r.getHorarios().validarHorario(txtHoraAperturaCambiar.getText() + ":" + txtMinutoAperturaCambiar.getText()) && restauranteOk && horariosOk) {
            horaAperturaOk = true;
            lblAperturaError.setVisible(false);
        } else {
            lblAperturaError.setVisible(true);
            horaAperturaOk = false;
        }

        if (r.getHorarios().validarHorario(txtHoraCierreCambiar.getText() + ":" + txtMinutoCierreCambiar.getText()) && restauranteOk && horariosOk) {
            lblCierreError.setVisible(false);
            horaCierreOk = true;
        } else {
            lblCierreError.setVisible(true);
            horaCierreOk = false;
        }

        if (horaCierreOk && horaAperturaOk) {
            r = miSistema.getLstRestaurantes().get(lstRestaurantesCambiar.getSelectedIndex());
            Map.Entry<String, String> horario = r.getHorarios().getHorarios().get(lstHorariosCambiar.getSelectedIndex());

            String horaInicial = txtHoraAperturaCambiar.getText() + ":" + txtMinutoAperturaCambiar.getText();
            String horaCierre = txtHoraCierreCambiar.getText() + ":" + txtMinutoCierreCambiar.getText();
            r.getHorarios().cargarHorario(horario.getKey(), horaInicial, horaCierre);
            cargarHorarios(r);
        }
    }//GEN-LAST:event_btnGuardarCambiarActionPerformed

    private void txtMinutoAperturaCambiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMinutoAperturaCambiarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMinutoAperturaCambiarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConfimarCambiar;
    private javax.swing.JButton btnGuardarCambiar;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblAperturaError;
    private javax.swing.JLabel lblCierreError;
    private javax.swing.JLabel lblDirecError;
    private javax.swing.JLabel lblEditadoCorrecto;
    private javax.swing.JLabel lblErrorHorarios;
    private javax.swing.JLabel lblNomError;
    private javax.swing.JLabel lblRestauranteError;
    private javax.swing.JLabel lblTipoError;
    private javax.swing.JList lstHorariosCambiar;
    private javax.swing.JList lstRestaurantesCambiar;
    private javax.swing.JTextField txtDireccionCambiar;
    private javax.swing.JTextField txtHoraAperturaCambiar;
    private javax.swing.JTextField txtHoraCierreCambiar;
    private javax.swing.JTextField txtMinutoAperturaCambiar;
    private javax.swing.JTextField txtMinutoCierreCambiar;
    private javax.swing.JTextField txtNombreCambiar;
    private javax.swing.JTextField txtTipoComidaCambiar;
    // End of variables declaration//GEN-END:variables
    private Sistema miSistema;
    private ImageIcon error;

    public void cargarRestaurantes() {
        DefaultListModel modelo = new DefaultListModel();
        Iterator it = miSistema.getLstRestaurantes().iterator();
        while (it.hasNext()) {
            modelo.addElement(it.next());
        }
        lstRestaurantesCambiar.setModel(modelo);
    }

    public void cargarIconos() {
        lblNomError.setIcon(error);
        lblDirecError.setIcon(error);
        lblAperturaError.setIcon(error);
        lblCierreError.setIcon(error);
        lblTipoError.setIcon(error);
        lblRestauranteError.setIcon(error);
        lblErrorHorarios.setIcon(error);
        lblNomError.setVisible(false);
        lblDirecError.setVisible(false);
        lblAperturaError.setVisible(false);
        lblCierreError.setVisible(false);
        lblTipoError.setVisible(false);
        lblRestauranteError.setVisible(false);
        lblErrorHorarios.setVisible(false);
    }

    public void cargarHorarios(Restaurante r) {
        lstHorariosCambiar.removeAll();
        DefaultListModel modelo = new DefaultListModel();
        Iterator it = r.getHorarios().getHorarios().iterator();
        while (it.hasNext()) {
            modelo.addElement(it.next());
        }
        lstHorariosCambiar.setModel(modelo);
    }

}
