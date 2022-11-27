/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import Class.Kendaraan;

/**
 * @author (Sofia-2108107010006)
 * @author (Ayu Aulia-2108107010038)
 * @author (Dhaifina Alifa Putri-2108107010018)
 * @author (Putri Ulfayani-2108107010004)
 * @author (Siti Nurrahmasit-2108107010015)
 */
public class TampilanStruk extends javax.swing.JFrame {
private String nama;
private String noKtp;
private String noHp;
private String asal;
private String tujuan;
private String waktu;
private String harga;
private Kendaraan jenis;
    /**
     * Creates new form DataHargaBus
     */
    public TampilanStruk() {
        initComponents();
    }
     
    /**
     * TampilanStruk
     * @param jenis
     * @param nama
     * @param noKtp
     * @param noHp
     * @param asal
     * @param tujuan
     * @param waktu
     * @param harga 
     */
    public TampilanStruk(Kendaraan jenis, String nama, String noKtp, String noHp, String asal, String tujuan, String waktu, String harga) {
        initComponents();
        this.nama= nama;
        this.noKtp= noKtp;
        this.noHp= noHp;
        this.asal= asal;
        this.tujuan= tujuan;
        this.waktu= waktu;
        this.harga= harga;
        this.jenis = jenis;
        
        AsalField.setText(this.asal);
        TujuanField.setText(this.tujuan);
        WaktuField.setText(this.waktu);
        HargaField.setText(this.harga);
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
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        ConfirmButton = new javax.swing.JButton();
        BackButton = new javax.swing.JButton();
        HargaField = new javax.swing.JTextField();
        Harga = new javax.swing.JLabel();
        Tujuan = new javax.swing.JLabel();
        TujuanField = new javax.swing.JTextField();
        AsalField = new javax.swing.JTextField();
        Asal = new javax.swing.JLabel();
        konfirm = new javax.swing.JLabel();
        WaktuField = new javax.swing.JTextField();
        Waktu = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jButton3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton3.setText("Mini Bus");

        jButton4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton4.setText("Taxi");

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton2.setText("Bus");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 221, 255));
        jPanel1.setLayout(null);

        ConfirmButton.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        ConfirmButton.setText("Confirm");
        ConfirmButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ConfirmButtonMouseClicked(evt);
            }
        });
        jPanel1.add(ConfirmButton);
        ConfirmButton.setBounds(240, 330, 100, 30);

        BackButton.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        BackButton.setText("Back");
        BackButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BackButtonMouseClicked(evt);
            }
        });
        jPanel1.add(BackButton);
        BackButton.setBounds(40, 330, 90, 30);

        HargaField.setEditable(false);
        jPanel1.add(HargaField);
        HargaField.setBounds(140, 190, 150, 22);

        Harga.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Harga.setText("Harga         :");
        jPanel1.add(Harga);
        Harga.setBounds(30, 190, 70, 20);

        Tujuan.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Tujuan.setText("Tujuan        :");
        jPanel1.add(Tujuan);
        Tujuan.setBounds(30, 110, 70, 20);

        TujuanField.setEditable(false);
        jPanel1.add(TujuanField);
        TujuanField.setBounds(140, 110, 150, 22);

        AsalField.setEditable(false);
        jPanel1.add(AsalField);
        AsalField.setBounds(140, 70, 150, 22);

        Asal.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Asal.setText("Asal            :");
        jPanel1.add(Asal);
        Asal.setBounds(30, 70, 70, 20);

        konfirm.setFont(new java.awt.Font("Segoe UI Semibold", 1, 24)); // NOI18N
        konfirm.setText("Konfirmasi Tiket");
        jPanel1.add(konfirm);
        konfirm.setBounds(80, 20, 190, 32);

        WaktuField.setEditable(false);
        jPanel1.add(WaktuField);
        WaktuField.setBounds(140, 150, 150, 22);

        Waktu.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Waktu.setText("Waktu        :");
        jPanel1.add(Waktu);
        Waktu.setBounds(30, 150, 70, 16);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/6.jpg"))); // NOI18N
        jPanel1.add(jLabel8);
        jLabel8.setBounds(0, 0, 370, 440);

        jLabel7.setText("jLabel7");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(0, 0, 380, 440);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 367, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 439, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BackButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackButtonMouseClicked
    Menu menu = new Menu();
    menu.setVisible(true);
    dispose();
    }//GEN-LAST:event_BackButtonMouseClicked

    private void ConfirmButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ConfirmButtonMouseClicked
    Ticket tiket = new Ticket(this.jenis, this.nama, this.noKtp, this.noHp, this.asal, this.tujuan, this.waktu, this.harga);
    tiket.setVisible(true);
    dispose();
    }//GEN-LAST:event_ConfirmButtonMouseClicked

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
            java.util.logging.Logger.getLogger(Kendaraan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Kendaraan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Kendaraan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Kendaraan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new TampilanStruk().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Asal;
    private javax.swing.JTextField AsalField;
    private javax.swing.JButton BackButton;
    private javax.swing.JButton ConfirmButton;
    private javax.swing.JLabel Harga;
    private javax.swing.JTextField HargaField;
    private javax.swing.JLabel Tujuan;
    private javax.swing.JTextField TujuanField;
    private javax.swing.JLabel Waktu;
    private javax.swing.JTextField WaktuField;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel konfirm;
    // End of variables declaration//GEN-END:variables
}
