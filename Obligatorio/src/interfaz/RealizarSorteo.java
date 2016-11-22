/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import java.awt.Image;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import obligatorio.*;

/**
 *
 * @author Seba
 */
public class RealizarSorteo extends javax.swing.JPanel {

    /**
     * Creates new form RealizarSorteo
     */
    public RealizarSorteo(Sistema s) {
        initComponents();
        miSistema = s;
        ImageIcon iconoConfir = new ImageIcon(getClass().getResource("/Imagenes/confirmar.png"));
        ImageIcon iconoError = new ImageIcon(getClass().getResource("/Imagenes/error.png"));
        ImageIcon error = new ImageIcon(iconoError.getImage().getScaledInstance(22, -1, Image.SCALE_DEFAULT));
        ImageIcon confirmar = new ImageIcon(iconoConfir.getImage().getScaledInstance(50, -1, Image.SCALE_DEFAULT));
        btnSortear.setIcon(confirmar);
        lblError.setIcon(error);
        lblError.setVisible(false);
        cargarSorteos();
        pnlGanadores.setVisible(false);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstSorteos = new javax.swing.JList();
        btnSortear = new javax.swing.JButton();
        pnlGanadores = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        lstGanadores = new javax.swing.JList();
        lblError = new javax.swing.JLabel();

        jLabel2.setText("jLabel2");

        jLabel3.setText("jLabel3");

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Sorteos");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jScrollPane1.setViewportView(lstSorteos);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 270, 100));

        btnSortear.setBorderPainted(false);
        btnSortear.setContentAreaFilled(false);
        btnSortear.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSortear.setFocusable(false);
        btnSortear.setRolloverEnabled(false);
        btnSortear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSortearActionPerformed(evt);
            }
        });
        add(btnSortear, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 110, 70, 70));

        jLabel4.setText("Ganadores:");

        jScrollPane2.setViewportView(lstGanadores);

        javax.swing.GroupLayout pnlGanadoresLayout = new javax.swing.GroupLayout(pnlGanadores);
        pnlGanadores.setLayout(pnlGanadoresLayout);
        pnlGanadoresLayout.setHorizontalGroup(
            pnlGanadoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlGanadoresLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlGanadoresLayout.setVerticalGroup(
            pnlGanadoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlGanadoresLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlGanadoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        add(pnlGanadores, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 330, 160));
        add(lblError, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 40, 40, 40));
    }// </editor-fold>//GEN-END:initComponents

    private void btnSortearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSortearActionPerformed
        ArrayList<Evaluacion> aSortear = new ArrayList();
        Sorteo s = new Sorteo();
        s = miSistema.getLstSorteos().get(lstSorteos.getSelectedIndex());
        listaParaSortear(aSortear, s);
        
        if (lstSorteos.getSelectedIndex() > -1 && aSortear.size()>=s.getCantGanadores()) {
            Evaluacion[] ganadores = new Evaluacion[s.getCantGanadores()];
            ganadores = obtenerGanadores(s.getCantGanadores(), s);
            cargarGanadores(ganadores);
            pnlGanadores.setVisible(true);
            miSistema.getLstSorteos().remove(s);
            lblError.setVisible(false);
            cargarSorteos();

        }else{
            lblError.setVisible(true);
        }

    }//GEN-LAST:event_btnSortearActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSortear;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblError;
    private javax.swing.JList lstGanadores;
    private javax.swing.JList lstSorteos;
    private javax.swing.JPanel pnlGanadores;
    // End of variables declaration//GEN-END:variables
public void cargarSorteos() {
        DefaultListModel modelo = new DefaultListModel();
        Iterator it = miSistema.getLstSorteos().iterator();
        while (it.hasNext()) {

            modelo.addElement(it.next());
        }
        lstSorteos.setModel(modelo);
    }

    public Evaluacion[] obtenerGanadores(int num, Sorteo s) {
        ArrayList<Evaluacion> aSortear = new ArrayList();
        Evaluacion[] ganadores = new Evaluacion[num];
        Random ran = new Random();
        int[] cant = new int[num];
                    
        listaParaSortear(aSortear, s);

        for (int i = 0; i < cant.length; i++) {
            cant[i] = -1;
        }

        for (int i = 0; i < cant.length; i++) {

            int a = ran.nextInt(aSortear.size());

            while (yaEsta(cant, a)) {
                a = ran.nextInt(aSortear.size());
            }

            cant[i] = a;

        }

        for (int i = 0; i < ganadores.length; i++) {
            ganadores[i] = aSortear.get(cant[i]);
        }

        return ganadores;
    }

    public void cargarGanadores(Evaluacion[] e) {
        DefaultListModel modelo = new DefaultListModel();
        for (int i = 0; i < e.length; i++) {
            modelo.addElement(e[i]);
        }
        lstGanadores.setModel(modelo);
    }

    public boolean yaEsta(int[] a, int b) {

        boolean ok = false;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == b) {
                ok = true;
            }
        }
        return ok;
    }
    
    public void listaParaSortear(ArrayList<Evaluacion> aSortear, Sorteo s){
        
        for (int i = 0; i < miSistema.getLstEvaluacionSorteo().size(); i++) {
            if (miSistema.comparaFechas(s.getFechaInicio(), miSistema.getLstEvaluacionSorteo().get(i).getFecha())
                    && miSistema.comparaFechas(miSistema.getLstEvaluacionSorteo().get(i).getFecha(), s.getFechaCierre())) {
                aSortear.add(miSistema.getLstEvaluacionSorteo().get(i));
            }
        }
    }
    
    Sistema miSistema;

}
