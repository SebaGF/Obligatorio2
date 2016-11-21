package interfaz;

import java.awt.*;
import java.util.*;
import javax.swing.*;
import obligatorio.*;

public class VentanaEvaluacion extends javax.swing.JPanel {

    public VentanaEvaluacion(Sistema s) {
        initComponents();
        miSistema = s;
        ImageIcon estrellaAmarilla = new ImageIcon(getClass().getResource("/imagenes/estrella.png"));
        ImageIcon estrellaVacia = new ImageIcon(getClass().getResource("/imagenes/estrellav.png"));
        ImageIcon iconoError = new ImageIcon(getClass().getResource("/imagenes/error.png"));
        ImageIcon iconoEvaluar = new ImageIcon(getClass().getResource("/imagenes/confirmar.png"));
        ImageIcon evaluar = new ImageIcon(iconoEvaluar.getImage().getScaledInstance(50, -1, Image.SCALE_DEFAULT));
        amarilla = new ImageIcon(estrellaAmarilla.getImage().getScaledInstance(40, -1, Image.SCALE_DEFAULT));
        vacia = new ImageIcon(estrellaVacia.getImage().getScaledInstance(40, -1, Image.SCALE_DEFAULT));
        error = new ImageIcon(iconoError.getImage().getScaledInstance(40, -1, Image.SCALE_DEFAULT));
        btnEvaluar.setIcon(evaluar);
        cargarIconos();
        cargarRestaurantes();
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

    public void cargarRestaurantes() {
        DefaultListModel modelo = new DefaultListModel();
        Iterator it = miSistema.getLstRestaurantes().iterator();
        while (it.hasNext()) {

            modelo.addElement(it.next());
        }
        lstRestaurantes.setModel(modelo);
    }

    public void cargarIconos() {

        lblErrorEstrella.setIcon(error);
        lblErrorLista.setIcon(error);
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
        lbResenia = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtMail = new javax.swing.JTextField();
        cmbDominio = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnEvaluar = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();

        setMaximumSize(new java.awt.Dimension(500, 500));
        setMinimumSize(new java.awt.Dimension(500, 500));
        setPreferredSize(new java.awt.Dimension(500, 500));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setViewportView(lstRestaurantes);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 290, 83));

        grupoEstrellas.add(btnEstrella1);
        btnEstrella1.setFont(new java.awt.Font("Tahoma", 0, 5)); // NOI18N
        btnEstrella1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEstrella1ActionPerformed(evt);
            }
        });
        add(btnEstrella1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, -1, -1));

        grupoEstrellas.add(btnEstrella2);
        btnEstrella2.setFont(new java.awt.Font("Tahoma", 0, 5)); // NOI18N
        btnEstrella2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEstrella2ActionPerformed(evt);
            }
        });
        add(btnEstrella2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 110, -1, -1));

        grupoEstrellas.add(btnEstrella3);
        btnEstrella3.setFont(new java.awt.Font("Tahoma", 0, 5)); // NOI18N
        btnEstrella3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEstrella3ActionPerformed(evt);
            }
        });
        add(btnEstrella3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 110, -1, -1));

        grupoEstrellas.add(btnEstrella4);
        btnEstrella4.setFont(new java.awt.Font("Tahoma", 0, 5)); // NOI18N
        btnEstrella4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEstrella4ActionPerformed(evt);
            }
        });
        add(btnEstrella4, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 110, -1, -1));

        grupoEstrellas.add(btnEstrella5);
        btnEstrella5.setFont(new java.awt.Font("Tahoma", 0, 5)); // NOI18N
        btnEstrella5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEstrella5ActionPerformed(evt);
            }
        });
        add(btnEstrella5, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 110, -1, -1));
        add(lblErrorLista, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 30, 40, 40));
        add(lblErrorEstrella, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 110, 40, 40));

        txtAReseña.setColumns(10);
        txtAReseña.setLineWrap(true);
        txtAReseña.setRows(5);
        jScrollPane2.setViewportView(txtAReseña);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 200, 188, 57));

        lbResenia.setText("Reseña");
        add(lbResenia, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 210, -1, -1));
        add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 270, 100, -1));
        add(txtMail, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 300, 100, -1));

        cmbDominio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "@Hotmail.com", "@Gmail.com" }));
        add(cmbDominio, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 300, -1, -1));

        jLabel1.setText("Nombre");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 270, -1, -1));

        jLabel2.setText("Email");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 300, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Datos opcionales");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 430, -1));

        btnEvaluar.setBorderPainted(false);
        btnEvaluar.setContentAreaFilled(false);
        btnEvaluar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEvaluar.setFocusable(false);
        btnEvaluar.setMaximumSize(new java.awt.Dimension(128, 128));
        btnEvaluar.setPreferredSize(new java.awt.Dimension(128, 128));
        btnEvaluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEvaluarActionPerformed(evt);
            }
        });
        add(btnEvaluar, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 340, 100, 90));

        jSeparator2.setAlignmentX(0.0F);
        jSeparator2.setAlignmentY(0.0F);
        jSeparator2.setMaximumSize(new java.awt.Dimension(500, 500));
        jSeparator2.setName(""); // NOI18N
        jSeparator2.setPreferredSize(new java.awt.Dimension(500, 500));
        add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, 330, 10));

        jSeparator3.setAlignmentX(0.0F);
        jSeparator3.setAlignmentY(0.0F);
        jSeparator3.setMaximumSize(new java.awt.Dimension(500, 500));
        jSeparator3.setName(""); // NOI18N
        jSeparator3.setPreferredSize(new java.awt.Dimension(500, 500));
        add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 330, 330, 20));

        jSeparator4.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator4.setAlignmentX(0.0F);
        jSeparator4.setAlignmentY(0.0F);
        jSeparator4.setMaximumSize(new java.awt.Dimension(500, 500));
        jSeparator4.setName(""); // NOI18N
        jSeparator4.setPreferredSize(new java.awt.Dimension(500, 500));
        add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, 20, 170));

        jSeparator5.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator5.setAlignmentX(0.0F);
        jSeparator5.setAlignmentY(0.0F);
        jSeparator5.setMaximumSize(new java.awt.Dimension(500, 500));
        jSeparator5.setName(""); // NOI18N
        jSeparator5.setPreferredSize(new java.awt.Dimension(500, 500));
        add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 160, 20, 170));
    }// </editor-fold>//GEN-END:initComponents

    private void btnEvaluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEvaluarActionPerformed
        boolean listaRestaurantesOk;
        boolean estrellasOk;
        boolean terminoEval;
        JRadioButton jrb = getSelection(grupoEstrellas);
        listaRestaurantesOk = false;
        estrellasOk = false;
        terminoEval = false;

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
                            terminoEval = true;
                        }
                    }
                } else {
                    miSistema.getLstEvaluacion().add(ev);
                    terminoEval = true;
                }
            }
        }
        if (terminoEval) {
            cargarRestaurantes();
            cargarIconos();
            txtAReseña.setText("");
            txtNombre.setText("");
            txtMail.setText("");
            cmbDominio.setSelectedItem(0);
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
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JLabel lbResenia;
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
