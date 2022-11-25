/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

/**
 *
 * @author romaf
 */
public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form PemilihanKendaraan
     */
    public Menu() {
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

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        BusButton = new javax.swing.JButton();
        MiniBusButton = new javax.swing.JButton();
        TaxiButton = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Mini Bus ");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("   Bus");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("   Taxi");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(206, 230, 255));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 36)); // NOI18N
        jLabel1.setText("Menu Kendaraan");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(150, 120, 280, 40);

        BusButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        BusButton.setText("Bus");
        BusButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BusButtonMouseClicked(evt);
            }
        });
        jPanel1.add(BusButton);
        BusButton.setBounds(340, 290, 180, 28);

        MiniBusButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        MiniBusButton.setText("Mini Bus");
        MiniBusButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MiniBusButtonMouseClicked(evt);
            }
        });
        MiniBusButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MiniBusButtonActionPerformed(evt);
            }
        });
        jPanel1.add(MiniBusButton);
        MiniBusButton.setBounds(190, 190, 180, 28);

        TaxiButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        TaxiButton.setText("Taxi");
        TaxiButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TaxiButtonMouseClicked(evt);
            }
        });
        TaxiButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TaxiButtonActionPerformed(evt);
            }
        });
        jPanel1.add(TaxiButton);
        TaxiButton.setBounds(50, 290, 180, 28);

        jLabel6.setFont(new java.awt.Font("Wide Latin", 1, 40)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(153, 102, 0));
        jLabel6.setText("CV.CPP");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(130, 40, 300, 50);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/5.jpeg"))); // NOI18N
        jLabel5.setText("jLabel5");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(0, 0, 580, 410);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 571, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 406, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MiniBusButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MiniBusButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MiniBusButtonActionPerformed

    private void MiniBusButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MiniBusButtonMouseClicked
    PesanMiniBus minibus = new PesanMiniBus();
    minibus.setVisible(true);
    dispose();
    }//GEN-LAST:event_MiniBusButtonMouseClicked

    private void TaxiButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TaxiButtonMouseClicked
    PesanTaksi taxi = new PesanTaksi();
    taxi.setVisible(true);
    dispose();
    }//GEN-LAST:event_TaxiButtonMouseClicked

    private void BusButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BusButtonMouseClicked
    PesanBuss bus = new PesanBuss();
    bus.setVisible(true);
    dispose();
    }//GEN-LAST:event_BusButtonMouseClicked

    private void TaxiButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TaxiButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TaxiButtonActionPerformed

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BusButton;
    private javax.swing.JButton MiniBusButton;
    private javax.swing.JButton TaxiButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
