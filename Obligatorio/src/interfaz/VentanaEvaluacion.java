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
        amarilla = new ImageIcon(estrellaAmarilla.getImage().getScaledInstance(35, -1, Image.SCALE_DEFAULT));
        vacia = new ImageIcon(estrellaVacia.getImage().getScaledInstance(35, -1, Image.SCALE_DEFAULT));
        error = new ImageIcon(iconoError.getImage().getScaledInstance(35, -1, Image.SCALE_DEFAULT));
        btnEvaluar.setIcon(evaluar);
        cargarIconos();
        cargarRestaurantes();
        this.jPDatosOpcionales.setVisible(false);
        jCNo.setSelected(true);
        cantEstrellas = 0;
        datosOpcionales = false;
    }

    private JRadioButton getSelection(ButtonGroup group) {
        for (Enumeration e = group.getElements(); e.hasMoreElements();) {
            JRadioButton b = (JRadioButton) e.nextElement();
            if (b.getModel() == group.getSelection()) {
                return b;
            }
        }
        return null;
    }

    private void cargarRestaurantes() {
        DefaultListModel modelo = new DefaultListModel();
        Iterator it = miSistema.getLstRestaurantes().iterator();
        while (it.hasNext()) {

            modelo.addElement(it.next());
        }
        lstRestaurantes.setModel(modelo);
    }

    public final void cargarIconos() {

        lblErrorEstrella.setIcon(error);
        lblErrorLista.setIcon(error);
        lblErrorEmail.setIcon(error);
        lblErrorNombre.setIcon(error);
        lblErrorResenia.setIcon(error);
        lblErrorEstrella.setVisible(false);
        lblErrorLista.setVisible(false);
        lblErrorEmail.setVisible(false);
        lblErrorNombre.setVisible(false);
        lblErrorResenia.setVisible(false);
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
        tipoDeEvaluacion = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstRestaurantes = new javax.swing.JList<>();
        btnEstrella1 = new javax.swing.JRadioButton();
        btnEstrella2 = new javax.swing.JRadioButton();
        btnEstrella3 = new javax.swing.JRadioButton();
        btnEstrella4 = new javax.swing.JRadioButton();
        btnEstrella5 = new javax.swing.JRadioButton();
        lblErrorLista = new javax.swing.JLabel();
        lblErrorEstrella = new javax.swing.JLabel();
        btnEvaluar = new javax.swing.JButton();
        jPDatosOpcionales = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtAReseña = new javax.swing.JTextArea();
        txtNombre = new javax.swing.JTextField();
        txtMail = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        lbResenia = new javax.swing.JLabel();
        cmbDominio = new javax.swing.JComboBox<>();
        lblErrorResenia = new javax.swing.JLabel();
        lblErrorNombre = new javax.swing.JLabel();
        lblErrorEmail = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jCSi = new javax.swing.JCheckBox();
        jCNo = new javax.swing.JCheckBox();
        lblResultado = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(500, 500));
        setMinimumSize(new java.awt.Dimension(500, 500));
        setPreferredSize(new java.awt.Dimension(500, 500));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setViewportView(lstRestaurantes);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, 290, 83));

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
        add(btnEvaluar, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 350, 100, 90));

        jPDatosOpcionales.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jPDatosOpcionales.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Nombre (4 - 20)");
        jPDatosOpcionales.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, -1));

        txtAReseña.setColumns(10);
        txtAReseña.setLineWrap(true);
        txtAReseña.setRows(5);
        jScrollPane2.setViewportView(txtAReseña);

        jPDatosOpcionales.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, 188, 57));
        jPDatosOpcionales.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 90, 100, 20));
        jPDatosOpcionales.add(txtMail, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, 100, 20));

        jLabel2.setText("Email (6 - 20)");
        jPDatosOpcionales.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, -1));

        lbResenia.setText("Reseña (6 - 200)");
        jPDatosOpcionales.add(lbResenia, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, -1, -1));

        cmbDominio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "@Hotmail.com", "@Gmail.com" }));
        jPDatosOpcionales.add(cmbDominio, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 120, -1, -1));
        jPDatosOpcionales.add(lblErrorResenia, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 30, -1, -1));
        jPDatosOpcionales.add(lblErrorNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 80, 40, 30));
        jPDatosOpcionales.add(lblErrorEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 120, -1, -1));

        add(jPDatosOpcionales, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 430, 160));

        jLabel4.setText("Restaurantes (*)");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, -1, -1));

        jLabel5.setText("Estrellas (*)");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, -1, -1));

        jLabel6.setText("Datos Opcionales ");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, -1, -1));

        tipoDeEvaluacion.add(jCSi);
        jCSi.setText("Si");
        jCSi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCSiActionPerformed(evt);
            }
        });
        add(jCSi, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 160, -1, -1));

        tipoDeEvaluacion.add(jCNo);
        jCNo.setText("No");
        jCNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCNoActionPerformed(evt);
            }
        });
        add(jCNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 160, -1, -1));

        lblResultado.setForeground(java.awt.Color.green);
        lblResultado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        add(lblResultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 450, 430, 10));
    }// </editor-fold>//GEN-END:initComponents

    private void btnEvaluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEvaluarActionPerformed
        boolean listaRestaurantesOk;
        boolean estrellasOk;
        boolean terminoEval;
        boolean nombreOk;
        boolean mailOk;
        boolean reseniaOk;
        JRadioButton jrb = getSelection(grupoEstrellas);
        listaRestaurantesOk = false;
        estrellasOk = false;
        terminoEval = false;
        nombreOk = false;
        mailOk = false;
        reseniaOk = false;
        lblResultado.setText("");

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
        if (datosOpcionales) {
            if (miSistema.validarStringNoVacio(txtNombre.getText(), 2, 21)) {
                lblErrorNombre.setVisible(false);
                nombreOk = true;
            } else {
                lblErrorNombre.setVisible(true);
                nombreOk = false;
            }
            if (miSistema.validarStringNoVacio(txtAReseña.getText(), 5, 201)) {
                lblErrorResenia.setVisible(false);
                reseniaOk = true;
            } else {
                lblErrorResenia.setVisible(true);
                reseniaOk = false;
            }
            if (miSistema.validarStringNoVacio(txtMail.getText(), 5, 21)) {
                if (listaRestaurantesOk) {
                    Restaurante r = miSistema.getLstRestaurantes().get(lstRestaurantes.getSelectedIndex());
                    System.out.println(miSistema.estaEvaluacionSorteo(txtMail.getText(), r.getDireccion()));
                    if (!miSistema.estaEvaluacionSorteo(txtMail.getText(), r.getDireccion())) {
                        mailOk = true;
                        lblErrorEmail.setVisible(false);
                    } else {
                        lblErrorEmail.setVisible(true);
                        mailOk = false;
                    }
                }
            } else {
                lblErrorEmail.setVisible(true);
                mailOk = false;
            }
        }
        if (estrellasOk && listaRestaurantesOk) {
            Restaurante r = miSistema.getLstRestaurantes().get(lstRestaurantes.getSelectedIndex());
            Evaluacion ev = new Evaluacion();
            ev.setUnRestaurante(r);
            if (ev.validarCantidadEstrellas(cantEstrellas)) {
                ev.setCatnidadEstrellas(cantEstrellas);

                if (datosOpcionales) {

                    if (nombreOk && reseniaOk && mailOk) {

                        ev.setResenia(txtAReseña.getText());
                        ev.setNombre(txtNombre.getText());
                        ev.setMail(txtMail.getText());
                        miSistema.getLstEvaluacion().add(ev);
                        miSistema.getLstEvaluacionSorteo().add(ev);
                        terminoEval = true;
                        jCNo.setSelected(true);
                        this.jPDatosOpcionales.setVisible(false);

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
            grupoEstrellas.clearSelection();
            txtAReseña.setText("");
            txtNombre.setText("");
            txtMail.setText("");
            cmbDominio.setSelectedItem(0);
            lblResultado.setText("Evaluacion realizada con éxito");
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

    private void jCSiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCSiActionPerformed
        jPDatosOpcionales.setVisible(true);
        datosOpcionales = true;
        lblErrorNombre.setVisible(false);
        lblErrorResenia.setVisible(false);
        lblErrorEmail.setVisible(false);
    }//GEN-LAST:event_jCSiActionPerformed

    private void jCNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCNoActionPerformed
        jPDatosOpcionales.setVisible(false);
        datosOpcionales = false;
    }//GEN-LAST:event_jCNoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton btnEstrella1;
    private javax.swing.JRadioButton btnEstrella2;
    private javax.swing.JRadioButton btnEstrella3;
    private javax.swing.JRadioButton btnEstrella4;
    private javax.swing.JRadioButton btnEstrella5;
    private javax.swing.JButton btnEvaluar;
    private javax.swing.JComboBox<String> cmbDominio;
    private javax.swing.ButtonGroup grupoEstrellas;
    private javax.swing.JCheckBox jCNo;
    private javax.swing.JCheckBox jCSi;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPDatosOpcionales;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbResenia;
    private javax.swing.JLabel lblErrorEmail;
    private javax.swing.JLabel lblErrorEstrella;
    private javax.swing.JLabel lblErrorLista;
    private javax.swing.JLabel lblErrorNombre;
    private javax.swing.JLabel lblErrorResenia;
    private javax.swing.JLabel lblResultado;
    private javax.swing.JList<String> lstRestaurantes;
    private javax.swing.ButtonGroup tipoDeEvaluacion;
    private javax.swing.JTextArea txtAReseña;
    private javax.swing.JTextField txtMail;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
    private Sistema miSistema;
    private ImageIcon amarilla;
    private ImageIcon vacia;
    private ImageIcon error;
    private int cantEstrellas;
    private boolean datosOpcionales;
}
