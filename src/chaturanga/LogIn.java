/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chaturanga;

import javax.swing.JOptionPane;

/**
 *
 * @author Frances
 */
public class LogIn extends javax.swing.JFrame {

    /**
     * Creates new form LogIn
     */
    public LogIn() {
        initComponents();
    }
    Usuarios users = new Usuarios();

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtloginnombre = new javax.swing.JTextField();
        txtlogincontraseña = new javax.swing.JPasswordField();
        btnloginguardar = new javax.swing.JButton();
        btnlogincancelar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(102, 0, 0));
        setMaximumSize(new java.awt.Dimension(900, 900));
        setMinimumSize(new java.awt.Dimension(900, 800));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Cooper Black", 2, 24)); // NOI18N
        jLabel1.setText("Usuario");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(140, 290, 110, 28);

        jLabel2.setFont(new java.awt.Font("Cooper Black", 0, 24)); // NOI18N
        jLabel2.setText("Contraseña");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(140, 370, 139, 28);

        txtloginnombre.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtloginnombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtloginnombreActionPerformed(evt);
            }
        });
        getContentPane().add(txtloginnombre);
        txtloginnombre.setBounds(320, 280, 180, 40);

        txtlogincontraseña.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtlogincontraseña.setName(""); // NOI18N
        getContentPane().add(txtlogincontraseña);
        txtlogincontraseña.setBounds(320, 360, 180, 40);

        btnloginguardar.setBackground(new java.awt.Color(0, 0, 0));
        btnloginguardar.setFont(new java.awt.Font("Cooper Black", 0, 24)); // NOI18N
        btnloginguardar.setForeground(new java.awt.Color(255, 255, 255));
        btnloginguardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iniciar1.png"))); // NOI18N
        btnloginguardar.setText("ACEPTAR");
        btnloginguardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnloginguardarMouseClicked(evt);
            }
        });
        getContentPane().add(btnloginguardar);
        btnloginguardar.setBounds(190, 560, 230, 50);

        btnlogincancelar.setBackground(new java.awt.Color(0, 0, 0));
        btnlogincancelar.setFont(new java.awt.Font("Cooper Black", 0, 24)); // NOI18N
        btnlogincancelar.setForeground(new java.awt.Color(255, 255, 255));
        btnlogincancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cancel.png"))); // NOI18N
        btnlogincancelar.setText("CANCELAR");
        btnlogincancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnlogincancelarMouseClicked(evt);
            }
        });
        btnlogincancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlogincancelarActionPerformed(evt);
            }
        });
        getContentPane().add(btnlogincancelar);
        btnlogincancelar.setBounds(550, 560, 213, 50);

        jLabel3.setFont(new java.awt.Font("Cooper Black", 3, 48)); // NOI18N
        jLabel3.setText("LOGIN");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(360, 80, 210, 57);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo3.jpg"))); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(-7, -1, 900, 800);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtloginnombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtloginnombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtloginnombreActionPerformed

    private void btnloginguardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnloginguardarMouseClicked
          
        Usuario u = users.buscar(txtloginnombre.getText());
        
        if(u!=null){
            if(u.getContraseña().equals(String.valueOf(txtlogincontraseña.getPassword()))){
                Menu_principal obj = new Menu_principal();
                obj.setVisible(true);
                dispose();
            }
            else{
                JOptionPane.showMessageDialog(null,"Contraseña Incorrecta, Intente Nuevamente","Error",JOptionPane.ERROR_MESSAGE);
                }
            }
            else{
              JOptionPane.showMessageDialog(null,"Usuario No Existe, Intente Nuevamente o Cree un Usuario","Error",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnloginguardarMouseClicked

//    public boolean loginUser(String username, String password){
//        Player p =buscarUser(username);
//        if (p!=null){
//            if(p.getPassword().equals(password)){
//                JOptionPane.showMessageDialog(null, "¡Bienvenido: "+username+"!");
//                return true;
//            }
//        }
//        JOptionPane.showMessageDialog(null, "¡El usuario: "+username+" no existe por favor cree el nuevo jugador!");
//        return false;
//    }
    private void btnlogincancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlogincancelarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnlogincancelarActionPerformed

    private void btnlogincancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnlogincancelarMouseClicked
        Menu_inicio obj = new Menu_inicio();
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnlogincancelarMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LogIn().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnlogincancelar;
    private javax.swing.JButton btnloginguardar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPasswordField txtlogincontraseña;
    private javax.swing.JTextField txtloginnombre;
    // End of variables declaration//GEN-END:variables
}
