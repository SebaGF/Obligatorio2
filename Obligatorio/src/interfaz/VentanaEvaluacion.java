package interfaz;

import java.awt.*;
import java.util.Enumeration;
import javax.swing.*;
import obligatorio.Evaluacion;
import obligatorio.Restaurante;
import obligatorio.Sistema;

public class VentanaEvaluacion extends javax.swing.JPanel {

    public VentanaEvaluacion(Sistema s) {
        initComponents();
        miSistema = s;
        ImageIcon estrellaAmarilla = new ImageIcon(getClass().getResource("/imagenes/estrella.png"));
        ImageIcon estrellaVacia = new ImageIcon(getClass().getResource("/imagenes/estrellav.png"));
        ImageIcon iconoError = new ImageIcon(getClass().getResource("/imagenes/error.png"));
        amarilla = new ImageIcon(estrellaAmarilla.getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT));
        vacia = new ImageIcon(estrellaVacia.getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT));
        error = new ImageIcon(iconoError.getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT));
        cargarIconos();
    }

    public JRadioButton getSelection(ButtonGroup group) {
        for (Enumeration e = group.getElements(); e.hasMoreElements();) {
            JRadioButton b = (JRadioButton) e.nextElement();
            if (b.getModel() == group.getSelection()) {
                return b;
            }
        }
        return null;
    }

    public void cargarIconos() {

        lblErrorEstrella.setIcon(error);
        lblErrorLista.setSize(50, 50);
        lblErrorLista.setIcon(error);
        lblErrorEstrella.setSize(50, 50);
        lblErrorEstrella.setVisible(false);
        lblErrorLista.setVisible(false);
        btnEstrella1.setIcon(vacia);
        btnEstrella2.setIcon(vacia);
        btnEstrella3.setIcon(vacia);
        btnEstrella4.setIcon(vacia);
        btnEstrella5.setIcon(vacia);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupoEstrellas = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstRestaurantes = new javax.swing.JList<>();
        btnEstrella1 = new javax.swing.JRadioButton();
        btnEstrella2 = new javax.swing.JRadioButton();
        btnEstrella3 = new javax.swing.JRadioButton();
        btnEstrella4 = new javax.swing.JRadioButton();
        btnEstrella5 = new javax.swing.JRadioButton();
        lblErrorLista = new javax.swing.JLabel();
        lblErrorEstrella = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtAReseña = new javax.swing.JTextArea();
        lbRestaurantes = new javax.swing.JLabel();
        lbEstrellas = new javax.swing.JLabel();
        lbResenia = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtMail = new javax.swing.JTextField();
        cmbDominio = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        btnEvaluar = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();

        jScrollPane1.setViewportView(lstRestaurantes);

        grupoEstrellas.add(btnEstrella1);
        btnEstrella1.setFont(new java.awt.Font("Tahoma", 0, 5)); // NOI18N
        btnEstrella1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEstrella1ActionPerformed(evt);
            }
        });

        grupoEstrellas.add(btnEstrella2);
        btnEstrella2.setFont(new java.awt.Font("Tahoma", 0, 5)); // NOI18N
        btnEstrella2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEstrella2ActionPerformed(evt);
            }
        });

        grupoEstrellas.add(btnEstrella3);
        btnEstrella3.setFont(new java.awt.Font("Tahoma", 0, 5)); // NOI18N
        btnEstrella3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEstrella3ActionPerformed(evt);
            }
        });

        grupoEstrellas.add(btnEstrella4);
        btnEstrella4.setFont(new java.awt.Font("Tahoma", 0, 5)); // NOI18N
        btnEstrella4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEstrella4ActionPerformed(evt);
            }
        });

        grupoEstrellas.add(btnEstrella5);
        btnEstrella5.setFont(new java.awt.Font("Tahoma", 0, 5)); // NOI18N
        btnEstrella5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEstrella5ActionPerformed(evt);
            }
        });

        txtAReseña.setColumns(10);
        txtAReseña.setLineWrap(true);
        txtAReseña.setRows(5);
        jScrollPane2.setViewportView(txtAReseña);

        lbRestaurantes.setText("Restaurantes");

        lbEstrellas.setText("Estrellas");

        lbResenia.setText("Reseña");

        cmbDominio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "@Hotmail.com", "@Gmail.com" }));

        jLabel1.setText("Nombre");

        jLabel2.setText("Email");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Datos opcionales");

        btnEvaluar.setText("Evaluar");
        btnEvaluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEvaluarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(54, 54, 54)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtNombre, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMail, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbDominio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbRestaurantes)
                            .addComponent(lbEstrellas)
                            .addComponent(lbResenia))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnEstrella1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnEstrella2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnEstrella3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnEstrella4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnEstrella5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(lblErrorEstrella, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addGap(0, 0, 0))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                                .addComponent(lblErrorLista, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jSeparator2)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnEvaluar))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(lbRestaurantes))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(lblErrorLista, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblErrorEstrella, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnEstrella1)
                            .addComponent(btnEstrella2)
                            .addComponent(btnEstrella3)
                            .addComponent(btnEstrella4)
                            .addComponent(btnEstrella5)
                            .addComponent(lbEstrellas))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(lbResenia)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtMail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbDominio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 7, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEvaluar)
                .addGap(16, 16, 16))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnEvaluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEvaluarActionPerformed
        boolean listaRestaurantesOk;
        boolean estrellasOk;
        JRadioButton jrb = getSelection(grupoEstrellas);
        listaRestaurantesOk = false;
        estrellasOk = false;
        new VentanaEvaluacion(miSistema);
        if (lstRestaurantes.getSelectedIndex() > -1) {
            listaRestaurantesOk = true;
            lblErrorLista.setVisible(false);
        } else {
            listaRestaurantesOk = false;
            lblErrorLista.setVisible(true);
        }
        try {
            if (jrb.isSelected()) {
                estrellasOk = true;
                lblErrorEstrella.setVisible(false);

            } else {
                estrellasOk = false;
                lblErrorEstrella.setVisible(true);
            }
        } catch (NullPointerException e) {
            estrellasOk = false;
            lblErrorEstrella.setVisible(true);
        }
        if (estrellasOk && listaRestaurantesOk) {
            Restaurante r = miSistema.getLstRestaurantes().get(lstRestaurantes.getSelectedIndex());
            Evaluacion ev = new Evaluacion();
            if (ev.validarCantidadEstrellas(cantEstrellas)) {
                ev.setCatnidadEstrellas(cantEstrellas);
                if (miSistema.validarStringNoVacio(txtAReseña.getText(), 0, 200)) {
                    if (miSistema.validarStringNoVacio(txtNombre.getText(), 3, 20)) {
                        if (miSistema.validarStringNoVacio(txtMail.getText(), 4, 20)) {

                            miSistema.getLstEvaluacion().add(ev);
                            miSistema.getLstEvaluacionSorteo().add(ev);
                            this.removeAll();
                            this.repaint();
                        }
                    }
                } else {
                    miSistema.getLstEvaluacion().add(ev);
                    this.removeAll();
                    this.repaint();
                }
            }
        }
    }//GEN-LAST:event_btnEvaluarActionPerformed

    private void btnEstrella1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEstrella1ActionPerformed
        btnEstrella1.setIcon(amarilla);
        btnEstrella2.setIcon(vacia);
        btnEstrella3.setIcon(vacia);
        btnEstrella4.setIcon(vacia);
        btnEstrella5.setIcon(vacia);
        cantEstrellas = 1;
    }//GEN-LAST:event_btnEstrella1ActionPerformed

    private void btnEstrella2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEstrella2ActionPerformed
        btnEstrella1.setIcon(amarilla);
        btnEstrella2.setIcon(amarilla);
        btnEstrella3.setIcon(vacia);
        btnEstrella4.setIcon(vacia);
        btnEstrella5.setIcon(vacia);
        cantEstrellas = 2;
    }//GEN-LAST:event_btnEstrella2ActionPerformed

    private void btnEstrella3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEstrella3ActionPerformed
        btnEstrella1.setIcon(amarilla);
        btnEstrella2.setIcon(amarilla);
        btnEstrella3.setIcon(amarilla);
        btnEstrella4.setIcon(vacia);
        btnEstrella5.setIcon(vacia);
        cantEstrellas = 3;
    }//GEN-LAST:event_btnEstrella3ActionPerformed

    private void btnEstrella4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEstrella4ActionPerformed
        btnEstrella1.setIcon(amarilla);
        btnEstrella2.setIcon(amarilla);
        btnEstrella3.setIcon(amarilla);
        btnEstrella4.setIcon(amarilla);
        btnEstrella5.setIcon(vacia);
        cantEstrellas = 4;
    }//GEN-LAST:event_btnEstrella4ActionPerformed

    private void btnEstrella5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEstrella5ActionPerformed
        btnEstrella1.setIcon(amarilla);
        btnEstrella2.setIcon(amarilla);
        btnEstrella3.setIcon(amarilla);
        btnEstrella4.setIcon(amarilla);
        btnEstrella5.setIcon(amarilla);
        cantEstrellas = 5;
    }//GEN-LAST:event_btnEstrella5ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton btnEstrella1;
    private javax.swing.JRadioButton btnEstrella2;
    private javax.swing.JRadioButton btnEstrella3;
    private javax.swing.JRadioButton btnEstrella4;
    private javax.swing.JRadioButton btnEstrella5;
    private javax.swing.JButton btnEvaluar;
    private javax.swing.JComboBox<String> cmbDominio;
    private javax.swing.ButtonGroup grupoEstrellas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lbEstrellas;
    private javax.swing.JLabel lbResenia;
    private javax.swing.JLabel lbRestaurantes;
    private javax.swing.JLabel lblErrorEstrella;
    private javax.swing.JLabel lblErrorLista;
    private javax.swing.JList<String> lstRestaurantes;
    private javax.swing.JTextArea txtAReseña;
    private javax.swing.JTextField txtMail;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
private Sistema miSistema;
    private ImageIcon amarilla;
    private ImageIcon vacia;
    private ImageIcon error;
    private int cantEstrellas = 0;
}
