/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author USER
 */
public class ViewLogin extends javax.swing.JFrame {

    public ViewLogin() {
        initComponents();
    }

    public JButton getBtnCerrar() {
        return btnCerrar;
    }

    public void setBtnCerrar(JButton btnCerrar) {
        this.btnCerrar = btnCerrar;
    }

    public JButton getBtnIngresar() {
        return btnIngresar;
    }

    public void setBtnIngresar(JButton btnIngresar) {
        this.btnIngresar = btnIngresar;
    }

    public JPanel getjPanel1() {
        return jPanel1;
    }

    public void setjPanel1(JPanel jPanel1) {
        this.jPanel1 = jPanel1;
    }

    public JPasswordField getPwsClave() {
        return pwsClave;
    }

    public void setPwsClave(JPasswordField pwsClave) {
        this.pwsClave = pwsClave;
    }

    public JTextField getTxtUsuario() {
        return txtUsuario;
    }

    public void setTxtUsuario(JTextField txtUsuario) {
        this.txtUsuario = txtUsuario;
    }
    

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        btnIngresar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        pwsClave = new javax.swing.JPasswordField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        btnCerrar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(222, 214, 224));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Logo.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 170, 90));

        jLabel4.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(47, 62, 70));
        jLabel4.setText("USUARIO");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, -1, -1));

        jLabel5.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(47, 62, 70));
        jLabel5.setText("CONTRASEÑA");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, -1, -1));

        txtUsuario.setBackground(new java.awt.Color(222, 214, 224));
        txtUsuario.setFont(new java.awt.Font("Leelawadee UI", 0, 12)); // NOI18N
        txtUsuario.setBorder(null);
        jPanel1.add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, 260, 30));

        btnIngresar.setBackground(new java.awt.Color(222, 214, 224));
        btnIngresar.setText(" INGRESAR");
        btnIngresar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(btnIngresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 460, 130, 30));

        jLabel6.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 21, 36));
        jLabel6.setText(" INICIO DE SESIÓN");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, 220, -1));

        pwsClave.setBackground(new java.awt.Color(222, 214, 224));
        pwsClave.setFont(new java.awt.Font("Leelawadee UI", 0, 12)); // NOI18N
        pwsClave.setBorder(null);
        jPanel1.add(pwsClave, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, 260, 30));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, 260, 10));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 360, 260, 10));

        btnCerrar.setBackground(new java.awt.Color(222, 214, 224));
        btnCerrar.setForeground(new java.awt.Color(222, 214, 224));
        btnCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/boton-cerrar.png"))); // NOI18N
        btnCerrar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(btnCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 0, 40, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/FondoInicio.jpeg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 0, 340, 530));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnIngresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JPasswordField pwsClave;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
