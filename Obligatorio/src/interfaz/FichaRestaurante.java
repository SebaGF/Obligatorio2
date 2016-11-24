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
        ImageIcon confirmar = new ImageIcon(iconoConfir.getImage().getScaledInstance(50, -1, Image.SCALE_DEFAULT));
        ImageIcon guardar = new ImageIcon(iconoGuardar.getImage().getScaledInstance(50, -1, Image.SCALE_DEFAULT));
        cargarIconos();
        cargarRestaurantes();
        btnConfimarCambiar.setIcon(confirmar);
        btnGuardarCambiar.setIcon(guardar);

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

        setMaximumSize(new java.awt.Dimension(500, 500));
        setPreferredSize(new java.awt.Dimension(500, 500));

        jLabel1.setText("Nombre");

        jLabel2.setText("Direccion");

        txtDireccionCambiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDireccionCambiarActionPerformed(evt);
            }
        });

        jLabel3.setText("Horarios:");

        jLabel4.setText("Dia");

        jLabel5.setText("Hora apertura");

        jLabel6.setText(":");

        jLabel7.setText("Hora cierre");

        jLabel8.setText(":");

        jLabel10.setText("Tipo de Comida");

        jLabel12.setText("Resaurantes");

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

        btnGuardarCambiar.setBorderPainted(false);
        btnGuardarCambiar.setContentAreaFilled(false);
        btnGuardarCambiar.setFocusable(false);
        btnGuardarCambiar.setRolloverEnabled(false);

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

        lstHorariosCambiar.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lstHorariosCambiarValueChanged(evt);
            }
        });
        jScrollPane2.setViewportView(lstHorariosCambiar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())))
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel1)
                .addGap(12, 12, 12)
                .addComponent(txtNombreCambiar, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblNomError)
                .addGap(27, 27, 27)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtDireccionCambiar, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblDirecError)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(141, 141, 141)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtHoraAperturaCambiar, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtMinutoAperturaCambiar, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblAperturaError))))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtHoraCierreCambiar, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtMinutoCierreCambiar, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblCierreError)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 87, Short.MAX_VALUE)
                                .addComponent(btnGuardarCambiar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(42, 42, 42))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(48, 48, 48)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtTipoComidaCambiar, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblTipoError))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(87, 87, 87)
                                        .addComponent(btnConfimarCambiar))))
                            .addComponent(jLabel4))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel1))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtNombreCambiar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2)
                        .addComponent(txtDireccionCambiar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblDirecError)
                        .addComponent(lblNomError)))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblAperturaError))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel6)
                                    .addComponent(txtHoraAperturaCambiar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtMinutoAperturaCambiar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(1, 1, 1)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(txtTipoComidaCambiar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblTipoError))
                        .addGap(34, 34, 34)
                        .addComponent(btnConfimarCambiar))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel8)
                                .addComponent(txtHoraCierreCambiar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtMinutoCierreCambiar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblCierreError)
                            .addComponent(btnGuardarCambiar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(65, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtDireccionCambiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDireccionCambiarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDireccionCambiarActionPerformed

    private void btnConfimarCambiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfimarCambiarActionPerformed
        if (lstRestaurantesCambiar.getSelectedIndex() > -1) {

            Restaurante r;
            r = miSistema.getLstRestaurantes().get(lstRestaurantesCambiar.getSelectedIndex());
            boolean cambio;

            cambio = false;
            if (!(r.getNombre().equalsIgnoreCase(txtNombreCambiar.getText()))
                    || !(r.getDireccion().equalsIgnoreCase(txtDireccionCambiar.getText()))
                    || !(r.getHorarios().getHorarios().get(0).equals(txtHoraAperturaCambiar.getText()))
                    || !(r.getHorarios().getHorarios().get(1).equals(txtHoraCierreCambiar.getText()))
                    || !(r.getTipoComida().equalsIgnoreCase(txtTipoComidaCambiar.getText()))) {
                cambio = true;
            }
            if (miSistema.validarStringNoVacio(txtNombreCambiar.getText(), 1, Integer.MAX_VALUE)) {
                if (miSistema.validarStringNoVacio(txtDireccionCambiar.getText(), 1, Integer.MAX_VALUE)) {
                    if (miSistema.validarFecha(txtHoraAperturaCambiar.getText())) {
                        if (miSistema.validarFecha(txtHoraCierreCambiar.getText())) {
                            if (miSistema.validarStringNoVacio(txtTipoComidaCambiar.getText(), 1, Integer.MAX_VALUE)) {
                                r.setNombre(txtNombreCambiar.getText());
                                r.setDireccion(txtDireccionCambiar.getText());
                                //r.getHorarios().cargarHorario((String) cmbDiaCambiar.getSelectedItem(), txtHoraAperturaCambiar.getText(), txtHoraCierreCambiar.getText());
                                r.setTipoComida(txtTipoComidaCambiar.getText());

                                if (cambio) {

                                    txtNombreCambiar.setText("");
                                    txtDireccionCambiar.setText("");
                                    txtHoraAperturaCambiar.setText("");
                                    txtHoraCierreCambiar.setText("");
                                    txtTipoComidaCambiar.setText("");
                                }
                            }
                        }
                    }
                }
            }
        }

    }//GEN-LAST:event_btnConfimarCambiarActionPerformed

    private void lstRestaurantesCambiarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lstRestaurantesCambiarMouseClicked

    }//GEN-LAST:event_lstRestaurantesCambiarMouseClicked

    private void lstRestaurantesCambiarValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lstRestaurantesCambiarValueChanged
        Restaurante r;
        r = miSistema.getLstRestaurantes().get(lstRestaurantesCambiar.getSelectedIndex());
        txtNombreCambiar.setText(r.getNombre());
        txtDireccionCambiar.setText(r.getDireccion());
        txtTipoComidaCambiar.setText(r.getTipoComida());
        cargarHorarios(r);


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

            System.out.println("Hora inicio" + splitHoraInicio[0]);
            System.out.println("minuto inicio" + splitHoraInicio[1]);
            System.out.println("Hora cierre" + splitHoraFin[0]);
            System.out.println("minutos cierre" + splitHoraFin[1]);
            txtHoraAperturaCambiar.setText(splitHoraInicio[0]);
            txtMinutoAperturaCambiar.setText(splitHoraInicio[1]);
            txtHoraCierreCambiar.setText(splitHoraFin[0]);
            txtMinutoCierreCambiar.setText(splitHoraFin[1]);

        }
    }//GEN-LAST:event_lstHorariosCambiarValueChanged


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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblAperturaError;
    private javax.swing.JLabel lblCierreError;
    private javax.swing.JLabel lblDirecError;
    private javax.swing.JLabel lblNomError;
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
    private ImageIcon vacia;
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
        lblNomError.setVisible(false);
        lblDirecError.setVisible(false);
        lblAperturaError.setVisible(false);
        lblCierreError.setVisible(false);
        lblTipoError.setVisible(false);
    }

    public void cargarHorarios(Restaurante r) {
        DefaultListModel modelo = new DefaultListModel();
        Iterator it = r.getHorarios().getHorarios().iterator();
        while (it.hasNext()) {
            modelo.addElement(it.next());
        }
        lstHorariosCambiar.setModel(modelo);
    }

}
