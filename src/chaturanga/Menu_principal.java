/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chaturanga;

/**
 *
 * @author Frances
 */
public class Menu_principal extends javax.swing.JFrame {

    /**
     * Creates new form Menu_principal
     */
    public Menu_principal() {
        initComponents();
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
        jMenuBar1 = new javax.swing.JMenuBar();
        mjugarchaturanga = new javax.swing.JMenu();
        mnuevapartida = new javax.swing.JMenu();
        mcargarpartida = new javax.swing.JMenu();
        meliminarpartida = new javax.swing.JMenu();
        mmicuenta = new javax.swing.JMenu();
        mvermiinformacion = new javax.swing.JMenu();
        mreportes = new javax.swing.JMenu();
        jMenu11 = new javax.swing.JMenu();
        jMenu12 = new javax.swing.JMenu();
        mlogout = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 153, 0));

        jLabel1.setForeground(new java.awt.Color(204, 102, 0));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/imagmesa2.jpg"))); // NOI18N

        mjugarchaturanga.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgmenuprincipal/animated-gifs-elephants-029.gif"))); // NOI18N
        mjugarchaturanga.setText("Jugar Chaturanga ");
        mjugarchaturanga.setFont(new java.awt.Font("Shonar Bangla", 0, 24)); // NOI18N

        mnuevapartida.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgmenuprincipal/-pawns.gif"))); // NOI18N
        mnuevapartida.setText("Nueva Partida");
        mnuevapartida.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                mnuevapartidaMousePressed(evt);
            }
        });
        mjugarchaturanga.add(mnuevapartida);

        mcargarpartida.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgmenuprincipal/loading.gif"))); // NOI18N
        mcargarpartida.setText("Cargar Partida");
        mjugarchaturanga.add(mcargarpartida);

        meliminarpartida.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgmenuprincipal/trash-icon-52520.png"))); // NOI18N
        meliminarpartida.setText("Eliminar Partida");
        mjugarchaturanga.add(meliminarpartida);

        jMenuBar1.add(mjugarchaturanga);

        mmicuenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgmenuprincipal/default.jpg"))); // NOI18N
        mmicuenta.setText("Mi Cuenta");
        mmicuenta.setFont(new java.awt.Font("Shonar Bangla", 0, 24)); // NOI18N

        mvermiinformacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgmenuprincipal/edit_profile.png"))); // NOI18N
        mvermiinformacion.setText("Ver Mi Información");
        mvermiinformacion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                mvermiinformacionMousePressed(evt);
            }
        });
        mmicuenta.add(mvermiinformacion);

        jMenuBar1.add(mmicuenta);

        mreportes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgmenuprincipal/Document-icon.png"))); // NOI18N
        mreportes.setText("Reportes");
        mreportes.setFont(new java.awt.Font("Shonar Bangla", 0, 24)); // NOI18N

        jMenu11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgmenuprincipal/icon-280316191442.png"))); // NOI18N
        jMenu11.setText("Ranking Jugadores");
        jMenu11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jMenu11MousePressed(evt);
            }
        });
        mreportes.add(jMenu11);

        jMenu12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgmenuprincipal/daily-logs-32.png"))); // NOI18N
        jMenu12.setText("Logs de mis últimos juegos");
        jMenu12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jMenu12MousePressed(evt);
            }
        });
        mreportes.add(jMenu12);

        jMenuBar1.add(mreportes);

        mlogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgmenuprincipal/logout-512.png"))); // NOI18N
        mlogout.setText("LOG OUT");
        mlogout.setFont(new java.awt.Font("Shonar Bangla", 0, 24)); // NOI18N
        mlogout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                mlogoutMousePressed(evt);
            }
        });
        jMenuBar1.add(mlogout);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 651, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenu11MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu11MousePressed
        RankingJugadores obj = new RankingJugadores();
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_jMenu11MousePressed

    private void jMenu12MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu12MousePressed
        LogsDeMisUltimosJuegos obj = new LogsDeMisUltimosJuegos();
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_jMenu12MousePressed

    private void mlogoutMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mlogoutMousePressed
        Menu_inicio obj = new Menu_inicio();
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_mlogoutMousePressed

    private void mvermiinformacionMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mvermiinformacionMousePressed
        VerMiInformacion obj = new VerMiInformacion();
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_mvermiinformacionMousePressed

    private void mnuevapartidaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnuevapartidaMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_mnuevapartidaMousePressed

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
            java.util.logging.Logger.getLogger(Menu_principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu_principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu_principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu_principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu_principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu11;
    private javax.swing.JMenu jMenu12;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu mcargarpartida;
    private javax.swing.JMenu meliminarpartida;
    private javax.swing.JMenu mjugarchaturanga;
    private javax.swing.JMenu mlogout;
    private javax.swing.JMenu mmicuenta;
    private javax.swing.JMenu mnuevapartida;
    private javax.swing.JMenu mreportes;
    private javax.swing.JMenu mvermiinformacion;
    // End of variables declaration//GEN-END:variables
}
