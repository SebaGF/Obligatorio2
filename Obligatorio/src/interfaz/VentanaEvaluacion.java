package interfaz;

import java.awt.*;
import javax.swing.*;
import obligatorio.Sistema;

public class VentanaEvaluacion extends javax.swing.JPanel {

    public VentanaEvaluacion(Sistema s) {
        initComponents();
        miSistema = s;
        ImageIcon estrellaAmarilla = new ImageIcon(getClass().getResource("/imagenes/estrella.png"));
        ImageIcon estrellaVacia = new ImageIcon(getClass().getResource("/imagenes/estrellav.png"));
        ImageIcon IconoError = new ImageIcon(getClass().getResource("/imagenes/error.png"));
        amarilla = new ImageIcon(estrellaAmarilla.getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT));
        vacia = new ImageIcon(estrellaVacia.getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT));
        error = new ImageIcon(IconoError.getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT));
        cargarIconos();
    }

    public void cargarIconos() {
        
        lblErrorEstrella.setIcon(error);
        lblErrorLista.setIcon(error);
        lbEstrellas.setVisible(false);
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
        jTextArea1 = new javax.swing.JTextArea();
        lbRestaurantes = new javax.swing.JLabel();
        lbEstrellas = new javax.swing.JLabel();
        lbResenia = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtMail = new javax.swing.JTextField();
        cmbDominio = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        jScrollPane1.setViewportView(lstRestaurantes);

        grupoEstrellas.add(btnEstrella1);
        btnEstrella1.setText("1");

        grupoEstrellas.add(btnEstrella2);
        btnEstrella2.setText("2");

        grupoEstrellas.add(btnEstrella3);
        btnEstrella3.setText("3");

        grupoEstrellas.add(btnEstrella4);
        btnEstrella4.setText("4");

        grupoEstrellas.add(btnEstrella5);
        btnEstrella5.setText("5");

        lblErrorLista.setText("Lista");

        lblErrorEstrella.setText("Estrella");

        jTextArea1.setColumns(10);
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        lbRestaurantes.setText("Restaurantes");

        lbEstrellas.setText("Estrellas");

        lbResenia.setText("Reseña");

        cmbDominio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "@Hotmail.com", "@Gmail.com" }));

        jLabel1.setText("Nombre");

        jLabel2.setText("Email");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbRestaurantes)
                    .addComponent(lbEstrellas)
                    .addComponent(lbResenia)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane2)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnEstrella1)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnEstrella2)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnEstrella3)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnEstrella4)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnEstrella5)
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addGap(18, 18, 18)
                                .addComponent(lblErrorEstrella))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lblErrorLista)))
                        .addGap(63, 63, 63))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtMail, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                            .addComponent(txtNombre, javax.swing.GroupLayout.Alignment.LEADING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbDominio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(lbRestaurantes))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(lblErrorLista))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEstrella1)
                    .addComponent(btnEstrella2)
                    .addComponent(btnEstrella3)
                    .addComponent(btnEstrella4)
                    .addComponent(btnEstrella5)
                    .addComponent(lbEstrellas)
                    .addComponent(lblErrorEstrella))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(lbResenia)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbDominio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addContainerGap(23, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton btnEstrella1;
    private javax.swing.JRadioButton btnEstrella2;
    private javax.swing.JRadioButton btnEstrella3;
    private javax.swing.JRadioButton btnEstrella4;
    private javax.swing.JRadioButton btnEstrella5;
    private javax.swing.JComboBox<String> cmbDominio;
    private javax.swing.ButtonGroup grupoEstrellas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel lbEstrellas;
    private javax.swing.JLabel lbResenia;
    private javax.swing.JLabel lbRestaurantes;
    private javax.swing.JLabel lblErrorEstrella;
    private javax.swing.JLabel lblErrorLista;
    private javax.swing.JList<String> lstRestaurantes;
    private javax.swing.JTextField txtMail;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
Sistema miSistema;
    ImageIcon amarilla;
    ImageIcon vacia;
    ImageIcon error;
}
