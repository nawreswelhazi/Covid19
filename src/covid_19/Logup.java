/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package covid_19;

/**
 *
 * @author asus
 */
public class Logup extends javax.swing.JFrame {

    /**
     * Creates new form Logup
     */
    public Logup() {
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

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        signup = new javax.swing.JLabel();
        connect = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        user1 = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        mdp1 = new javax.swing.JPasswordField();
        jSeparator2 = new javax.swing.JSeparator();
        mdp2 = new javax.swing.JPasswordField();
        jSeparator4 = new javax.swing.JSeparator();
        mail = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel2.setBackground(new java.awt.Color(35, 39, 67));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(35, 39, 67));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 380, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/covid_19/93022933_530459457907368_2234383850148986880_n.jpg"))); // NOI18N
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 460, 650));
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(495, 132, -1, -1));
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(495, 215, -1, -1));

        jPanel5.setBackground(new java.awt.Color(35, 39, 67));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        signup.setBackground(new java.awt.Color(204, 204, 204));
        signup.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        signup.setForeground(new java.awt.Color(231, 229, 229));
        signup.setText("      SIGN UP");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 128, Short.MAX_VALUE)
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel5Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(signup, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 38, Short.MAX_VALUE)
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel5Layout.createSequentialGroup()
                    .addGap(10, 10, 10)
                    .addComponent(signup, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        jPanel2.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 450, -1, -1));

        connect.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        connect.setForeground(new java.awt.Color(231, 229, 229));
        connect.setText("Connectez-vous.");
        connect.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                connectMouseClicked(evt);
            }
        });
        jPanel2.add(connect, new org.netbeans.lib.awtextra.AbsoluteConstraints(702, 568, 140, 20));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(231, 229, 229));
        jLabel5.setText("Vous avez déjà un compte?");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 570, 180, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel6.setText("X");
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 10, 30, 20));

        user1.setBackground(new java.awt.Color(35, 39, 67));
        user1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        user1.setForeground(new java.awt.Color(204, 204, 204));
        user1.setText("Username");
        user1.setBorder(null);
        user1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                user1FocusGained(evt);
            }
        });
        jPanel2.add(user1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 70, 230, 30));

        jSeparator3.setForeground(new java.awt.Color(204, 204, 204));
        jPanel2.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 100, 230, 10));

        mdp1.setBackground(new java.awt.Color(35, 39, 67));
        mdp1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        mdp1.setForeground(new java.awt.Color(204, 204, 204));
        mdp1.setText("Password");
        mdp1.setBorder(null);
        mdp1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                mdp1FocusGained(evt);
            }
        });
        mdp1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mdp1ActionPerformed(evt);
            }
        });
        jPanel2.add(mdp1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 150, 230, 28));

        jSeparator2.setForeground(new java.awt.Color(204, 204, 204));
        jPanel2.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 180, 230, 10));

        mdp2.setBackground(new java.awt.Color(35, 39, 67));
        mdp2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        mdp2.setForeground(new java.awt.Color(204, 204, 204));
        mdp2.setText("Password");
        mdp2.setBorder(null);
        mdp2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                mdp2FocusGained(evt);
            }
        });
        mdp2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mdp2ActionPerformed(evt);
            }
        });
        jPanel2.add(mdp2, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 230, 230, 28));

        jSeparator4.setForeground(new java.awt.Color(204, 204, 204));
        jPanel2.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 260, 230, 10));

        mail.setBackground(new java.awt.Color(35, 39, 67));
        mail.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        mail.setForeground(new java.awt.Color(204, 204, 204));
        mail.setText("E-mail");
        mail.setBorder(null);
        mail.setName("mail"); // NOI18N
        mail.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                mailFocusGained(evt);
            }
        });
        mail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mailActionPerformed(evt);
            }
        });
        jPanel2.add(mail, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 310, 230, 30));

        jSeparator5.setForeground(new java.awt.Color(204, 204, 204));
        jPanel2.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 340, 230, 10));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 900, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 900, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void connectMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_connectMouseClicked
        Login2 l = new Login2();
        l.show();
        this.hide();
        // TODO add your handling code here:
    }//GEN-LAST:event_connectMouseClicked

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        System.exit(0);    // TODO add your handling code here:
    }//GEN-LAST:event_jLabel6MouseClicked

    private void user1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_user1FocusGained
        user1.setText("");        // TODO add your handling code here:
    }//GEN-LAST:event_user1FocusGained

    private void mdp1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_mdp1FocusGained
        mdp1.setText("");          // TODO add your handling code here:
    }//GEN-LAST:event_mdp1FocusGained

    private void mdp1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mdp1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mdp1ActionPerformed

    private void mdp2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_mdp2FocusGained
        mdp2.setText("");          // TODO add your handling code here:
    }//GEN-LAST:event_mdp2FocusGained

    private void mdp2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mdp2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mdp2ActionPerformed

    private void mailFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_mailFocusGained
        mail.setText("");          // TODO add your handling code here:
    }//GEN-LAST:event_mailFocusGained

    private void mailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mailActionPerformed

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
            java.util.logging.Logger.getLogger(Logup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Logup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Logup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Logup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Logup().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel connect;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JTextField mail;
    private javax.swing.JPasswordField mdp1;
    private javax.swing.JPasswordField mdp2;
    private javax.swing.JLabel signup;
    private javax.swing.JTextField user1;
    // End of variables declaration//GEN-END:variables
}
