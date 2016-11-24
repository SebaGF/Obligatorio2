package interfaz;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import obligatorio.Sistema;

public class VentanaPrincipal extends javax.swing.JFrame {

    public VentanaPrincipal(Sistema s) {
        initComponents();
        miSistema = s;
        this.setMinimumSize(new Dimension(500, 500));
        this.setResizable(false);
        cargarInicio();
    }

    public void cargarInicio() {
        VentanaPanelPrincipal vp = new VentanaPanelPrincipal();
        vp.setSize(this.jPMostrar.getWidth(), this.jPMostrar.getHeight());
        vp.setLocation(1, 1);
        jPMostrar.removeAll();
        jPMostrar.add(vp, BorderLayout.CENTER);
        jPMostrar.revalidate();
        jPMostrar.repaint();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnFichaRestaurante = new javax.swing.JButton();
        jPMostrar = new javax.swing.JPanel();
        btnCrearFicha = new javax.swing.JButton();
        btnEvaluacion = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        btnDefinicionSorteo = new javax.swing.JButton();
        btnRealizarSorteo = new javax.swing.JButton();
        btnInicio = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnFichaRestaurante.setText("Fichas de restaurante");
        btnFichaRestaurante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFichaRestauranteActionPerformed(evt);
            }
        });

        jPMostrar.setAlignmentX(0.0F);
        jPMostrar.setAlignmentY(0.0F);
        jPMostrar.setMaximumSize(new java.awt.Dimension(500, 500));
        jPMostrar.setPreferredSize(new java.awt.Dimension(500, 500));

        javax.swing.GroupLayout jPMostrarLayout = new javax.swing.GroupLayout(jPMostrar);
        jPMostrar.setLayout(jPMostrarLayout);
        jPMostrarLayout.setHorizontalGroup(
            jPMostrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
        );
        jPMostrarLayout.setVerticalGroup(
            jPMostrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 317, Short.MAX_VALUE)
        );

        btnCrearFicha.setText("Crear ficha de restaurante");
        btnCrearFicha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearFichaActionPerformed(evt);
            }
        });

        btnEvaluacion.setText("Evaluacion a restaurantes");
        btnEvaluacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEvaluacionActionPerformed(evt);
            }
        });

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        btnDefinicionSorteo.setText("Definicion de sorteo");
        btnDefinicionSorteo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDefinicionSorteoActionPerformed(evt);
            }
        });

        btnRealizarSorteo.setText("Realizar sorteo");
        btnRealizarSorteo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRealizarSorteoActionPerformed(evt);
            }
        });

        btnInicio.setText("Inicio");
        btnInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInicioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnFichaRestaurante, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCrearFicha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEvaluacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDefinicionSorteo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnRealizarSorteo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnInicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPMostrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPMostrar, javax.swing.GroupLayout.DEFAULT_SIZE, 317, Short.MAX_VALUE)
            .addComponent(jSeparator1)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addComponent(btnInicio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCrearFicha)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnFichaRestaurante)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEvaluacion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDefinicionSorteo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRealizarSorteo)
                .addContainerGap(131, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnFichaRestauranteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFichaRestauranteActionPerformed

        FichaRestaurante fr = new FichaRestaurante(miSistema);
        fr.setSize(this.jPMostrar.getWidth(), this.jPMostrar.getHeight());
        fr.setLocation(1, 1);
        jPMostrar.removeAll();
        jPMostrar.add(fr, BorderLayout.CENTER);
        jPMostrar.revalidate();
        jPMostrar.repaint();
    }//GEN-LAST:event_btnFichaRestauranteActionPerformed

    private void btnDefinicionSorteoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDefinicionSorteoActionPerformed
        //if (ae.getSource() == btnDefinicionSorteo) {
        //creo el panel de evaluar y lo cargo al panel local   
        VentanaSorteo vs = new VentanaSorteo(miSistema);
        vs.setSize(this.jPMostrar.getWidth(), this.jPMostrar.getHeight());
        vs.setLocation(1, 1);
        jPMostrar.removeAll();
        jPMostrar.add(vs, BorderLayout.CENTER);
        jPMostrar.revalidate();
        jPMostrar.repaint();
        //}
    }//GEN-LAST:event_btnDefinicionSorteoActionPerformed

    private void btnCrearFichaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearFichaActionPerformed
        //creo el panel de evaluar y lo cargo al panel local
        CrearRestaurante r = new CrearRestaurante(miSistema);
        r.setSize(this.jPMostrar.getWidth(), this.jPMostrar.getHeight());
        r.setLocation(1, 1);
        jPMostrar.removeAll();
        jPMostrar.add(r, BorderLayout.CENTER);
        jPMostrar.revalidate();
        jPMostrar.repaint();

    }//GEN-LAST:event_btnCrearFichaActionPerformed

    private void btnEvaluacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEvaluacionActionPerformed
        //creo el panel de evaluar y lo cargo al panel local
        VentanaEvaluacion e = new VentanaEvaluacion(miSistema);
        e.setSize(this.jPMostrar.getWidth(), this.jPMostrar.getHeight());
        e.setLocation(1, 1);
        jPMostrar.removeAll();
        jPMostrar.add(e, BorderLayout.CENTER);
        jPMostrar.revalidate();
        jPMostrar.repaint();

    }//GEN-LAST:event_btnEvaluacionActionPerformed

    private void btnRealizarSorteoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRealizarSorteoActionPerformed
        //creo el panel de evaluar y lo cargo al panel local
        RealizarSorteo rs = new RealizarSorteo(miSistema);
        rs.setSize(this.jPMostrar.getWidth(), this.jPMostrar.getHeight());
        rs.setLocation(1, 1);
        jPMostrar.removeAll();
        jPMostrar.add(rs, BorderLayout.CENTER);
        jPMostrar.revalidate();
        jPMostrar.repaint();

    }//GEN-LAST:event_btnRealizarSorteoActionPerformed

    private void btnInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInicioActionPerformed
        cargarInicio();
    }//GEN-LAST:event_btnInicioActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCrearFicha;
    private javax.swing.JButton btnDefinicionSorteo;
    private javax.swing.JButton btnEvaluacion;
    private javax.swing.JButton btnFichaRestaurante;
    private javax.swing.JButton btnInicio;
    private javax.swing.JButton btnRealizarSorteo;
    private javax.swing.JPanel jPMostrar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
Sistema miSistema;

}
