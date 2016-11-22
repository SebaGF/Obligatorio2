package interfaz;

import java.awt.Image;
import java.util.Iterator;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import obligatorio.*;

public class VentanaSorteo extends javax.swing.JPanel {

    public VentanaSorteo(Sistema s) {
        initComponents();
        miSistema = s;
        ImageIcon iconoError = new ImageIcon(getClass().getResource("/Imagenes/error.png"));
        error = new ImageIcon(iconoError.getImage().getScaledInstance(22, -1, Image.SCALE_DEFAULT));
        cargarIconos();
        cargarRestaurantes();
        ImageIcon iconoConfir = new ImageIcon(getClass().getResource("/Imagenes/confirmar.png"));
        ImageIcon confirmar = new ImageIcon(iconoConfir.getImage().getScaledInstance(50, -1, Image.SCALE_DEFAULT));
        btnSorteo.setIcon(confirmar);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblRestaurante = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstRestaurantes = new javax.swing.JList();
        lblCantGanadores = new javax.swing.JLabel();
        txtCantGanadores = new javax.swing.JTextField();
        lblFechaCie = new javax.swing.JLabel();
        txtFechaCi = new javax.swing.JFormattedTextField();
        lblFechaIn = new javax.swing.JLabel();
        txtFechaIn = new javax.swing.JFormattedTextField();
        lblPremio = new javax.swing.JLabel();
        txtPremio = new javax.swing.JTextField();
        btnSorteo = new javax.swing.JButton();
        lblHCierreError = new javax.swing.JLabel();
        lblFInicioError = new javax.swing.JLabel();
        lblCantGanadError = new javax.swing.JLabel();
        lblRestError = new javax.swing.JLabel();
        lblPremioError = new javax.swing.JLabel();
        lblRespuesta = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblRestaurante.setText("Restaurantes (*)");
        add(lblRestaurante, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, -1, -1));

        jScrollPane1.setViewportView(lstRestaurantes);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, 240, 90));

        lblCantGanadores.setText("Cantidad de ganadores (*)");
        add(lblCantGanadores, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, -1, -1));

        txtCantGanadores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCantGanadoresActionPerformed(evt);
            }
        });
        add(txtCantGanadores, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 110, 30, -1));

        lblFechaCie.setText("Fecha cierre sorteo (*)");
        add(lblFechaCie, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, -1, -1));

        try {
            txtFechaCi.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##-##-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        add(txtFechaCi, new org.netbeans.lib.awtextra.AbsoluteConstraints(138, 180, 80, -1));

        lblFechaIn.setText("Fecha inicio sorteo (*)");
        add(lblFechaIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, -1, -1));

        try {
            txtFechaIn.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##-##-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtFechaIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFechaInActionPerformed(evt);
            }
        });
        add(txtFechaIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(138, 150, 80, -1));

        lblPremio.setText("Premio (*)");
        add(lblPremio, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, -1, -1));
        add(txtPremio, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 210, 280, 20));

        btnSorteo.setBorderPainted(false);
        btnSorteo.setContentAreaFilled(false);
        btnSorteo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSorteo.setFocusable(false);
        btnSorteo.setRolloverEnabled(false);
        btnSorteo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSorteoActionPerformed(evt);
            }
        });
        add(btnSorteo, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 240, 58, 78));
        add(lblHCierreError, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 180, 22, 20));
        add(lblFInicioError, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 150, 22, 20));
        add(lblCantGanadError, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 110, 22, 20));
        add(lblRestError, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 10, 22, 20));
        add(lblPremioError, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 210, 22, 20));
        add(lblRespuesta, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 320, 200, 20));
    }// </editor-fold>//GEN-END:initComponents

    private void btnSorteoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSorteoActionPerformed
        Sorteo sor = new Sorteo();
        boolean restauranteOk;
        boolean fInicioOk;
        boolean fCierreOk;
        boolean premioOk;
        boolean cantGanadoresOk;
        boolean fechasOk;
        restauranteOk = false;
        fInicioOk = false;
        fCierreOk = false;
        premioOk = false;
        cantGanadoresOk = false;
        fechasOk = false;

        if (miSistema.validarStringNoVacio(txtPremio.getText(), 0, 200)) {
            premioOk = true;
            lblPremioError.setVisible(false);
        } else {
            premioOk = false;
            lblPremioError.setVisible(true);
        }
        if (lstRestaurantes.getSelectedIndex() > -1) {
            restauranteOk = true;
            lblRestError.setVisible(false);
        } else {
            restauranteOk = false;
            lblRestError.setVisible(true);
        }
        if (miSistema.validarFecha(txtFechaIn.getText())) {
            fInicioOk = true;
            lblFInicioError.setVisible(false);
        } else {
            fInicioOk = false;
            lblFInicioError.setVisible(true);
        }
        if (miSistema.validarFecha(txtFechaCi.getText())) {
            fCierreOk = true;
            lblHCierreError.setVisible(false);
        } else {
            fCierreOk = false;
            lblHCierreError.setVisible(true);
        }
        try {

            int cantGanadores;
            cantGanadores = Integer.parseInt(txtCantGanadores.getText());
            if (miSistema.validarNumero(cantGanadores, 0, 10000)) {
                cantGanadoresOk = true;
                lblCantGanadError.setVisible(false);
            } else {
                cantGanadoresOk = false;
                lblCantGanadError.setVisible(true);
            }
        } catch (NumberFormatException e) {
            cantGanadoresOk = false;
            lblCantGanadError.setVisible(true);
        }
        if (miSistema.comparaFechas(txtFechaIn.getText(), txtFechaCi.getText())) {
            fechasOk = true;
            lblRespuesta.setText("");
            lblFInicioError.setVisible(false);
            lblHCierreError.setVisible(false);
        } else {
            fechasOk = false;
            lblRespuesta.setText("Las fechas son invalidas.");
            lblFInicioError.setVisible(true);
            lblHCierreError.setVisible(true);
        }

        if (restauranteOk && fInicioOk && fCierreOk && premioOk && cantGanadoresOk && fechasOk) {
            sor.setRestaurante(miSistema.getLstRestaurantes().get(lstRestaurantes.getSelectedIndex()));
            sor.setPremio(txtPremio.getText());
            sor.setFechaInicio(txtFechaIn.getText());
            sor.setFechaCierre(txtFechaCi.getText());
            sor.setCantGanadores(Integer.parseInt(txtCantGanadores.getText()));
            miSistema.getLstSorteos().add(sor);
            lstRestaurantes.setSelectedIndex(0);
            txtFechaIn.setText("");
            txtFechaCi.setText("");
            txtPremio.setText("");
            txtCantGanadores.setText("");
            lblRespuesta.setText("Sorteo definido con exito");

        }


    }//GEN-LAST:event_btnSorteoActionPerformed

    private void txtCantGanadoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCantGanadoresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCantGanadoresActionPerformed

    private void txtFechaInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFechaInActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFechaInActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSorteo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCantGanadError;
    private javax.swing.JLabel lblCantGanadores;
    private javax.swing.JLabel lblFInicioError;
    private javax.swing.JLabel lblFechaCie;
    private javax.swing.JLabel lblFechaIn;
    private javax.swing.JLabel lblHCierreError;
    private javax.swing.JLabel lblPremio;
    private javax.swing.JLabel lblPremioError;
    private javax.swing.JLabel lblRespuesta;
    private javax.swing.JLabel lblRestError;
    private javax.swing.JLabel lblRestaurante;
    private javax.swing.JList lstRestaurantes;
    private javax.swing.JTextField txtCantGanadores;
    private javax.swing.JFormattedTextField txtFechaCi;
    private javax.swing.JFormattedTextField txtFechaIn;
    private javax.swing.JTextField txtPremio;
    // End of variables declaration//GEN-END:variables
    private Sistema miSistema;
    private ImageIcon error;

    public void cargarIconos() {
        lblRestError.setIcon(error);
        lblFInicioError.setIcon(error);
        lblHCierreError.setIcon(error);
        lblPremioError.setIcon(error);
        lblCantGanadError.setIcon(error);
        lblRestError.setVisible(false);
        lblFInicioError.setVisible(false);
        lblHCierreError.setVisible(false);
        lblPremioError.setVisible(false);
        lblCantGanadError.setVisible(false);
    }

    public void cargarRestaurantes() {
        DefaultListModel modelo = new DefaultListModel();
        Iterator it = miSistema.getLstRestaurantes().iterator();
        while (it.hasNext()) {

            modelo.addElement(it.next());
        }
        lstRestaurantes.setModel(modelo);
    }

}
