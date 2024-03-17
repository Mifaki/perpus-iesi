/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package perpustakaan;

import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Asus
 */
public class FormPeminjaman extends javax.swing.JFrame {

    /**
     * Creates new form FormPeminjaman
     */
    public FormPeminjaman() {
        initComponents();
    }

    public void tampilkan() {
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonCari = new javax.swing.JButton();
        jButtonKonfirmasi = new javax.swing.JButton();
        jButtonBatal = new javax.swing.JButton();
        jButtonPinjam = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtBuku = new javax.swing.JTable();
        jtPinjaman = new javax.swing.JTable();
        jTextFieldPencarian = new javax.swing.JTextField();
        jTextFieldDurasi = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTextFieldPencarian.setToolTipText("Cari");

        jButtonCari.setText("Cari");
        jButtonCari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCariActionPerformed(evt);
            }
        });

        jtBuku.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][] {},
                new String[] {
                        "Judul",
                }));
        jScrollPane1.setViewportView(jtBuku);

        jButtonKonfirmasi.setText("Konfirmasi");
        jButtonKonfirmasi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonKonfirmasiActionPerformed(evt);
            }
        });

        jButtonBatal.setText("Batal");
        jButtonBatal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBatalActionPerformed(evt);
            }
        });

        jButtonPinjam.setText("Pinjam");
        jButtonPinjam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPinjamActionPerformed(evt);
            }
        });

        jtPinjaman.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][] {},
                new String[] {
                        "Judul",
                        "Durasi"
                }));
        jScrollPane2.setViewportView(jtPinjaman);

        jTextFieldDurasi.setToolTipText("Durasi");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(jTextFieldPencarian, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                        222, Short.MAX_VALUE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(68, 68, 68)
                                                .addComponent(jButtonCari, javax.swing.GroupLayout.PREFERRED_SIZE, 101,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0,
                                                        Short.MAX_VALUE)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jButtonBatal, javax.swing.GroupLayout.DEFAULT_SIZE, 117,
                                                Short.MAX_VALUE)
                                        .addComponent(jButtonPinjam, javax.swing.GroupLayout.DEFAULT_SIZE, 117,
                                                Short.MAX_VALUE)
                                        .addComponent(jTextFieldDurasi))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 222,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(12, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jButtonKonfirmasi, javax.swing.GroupLayout.PREFERRED_SIZE, 117,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(66, 66, 66)));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addComponent(jTextFieldPencarian, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonCari)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jTextFieldDurasi, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(64, 64, 64)
                                                .addComponent(jButtonPinjam)
                                                .addGap(18, 18, 18)
                                                .addComponent(jButtonBatal))
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 272,
                                                Short.MAX_VALUE)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 258,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButtonKonfirmasi)
                                .addContainerGap(12, Short.MAX_VALUE)));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonPinjamActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButtonBatalActionPerformed
        int bukuPinjam = jtBuku.getSelectedRow();
        String durasiString = jTextFieldDurasi.getText();
        int durasiInt = 0;
        if (!durasiString.isEmpty()){
            if (!durasiString.matches("[0-9]+")) { 
                DialogUI dialogUI = new DialogUI("Durasi harus berupa angka");
                dialogUI.pack();
                dialogUI.setLocationRelativeTo(null);
                dialogUI.setVisible(true);
                return;
            }
            durasiInt = Integer.parseInt(durasiString);
        }

        if (bukuPinjam == -1) {
            DialogUI dialogUI = new DialogUI("Silahkan pilih buku yang ingin dipinjam.");
            dialogUI.pack();
            dialogUI.setLocationRelativeTo(null);
            dialogUI.setVisible(true);
            return;
        }

        if (durasiString.isEmpty()) {
            DialogUI dialogUI = new DialogUI("Silahkan masukkan durasi pinjaman");
            dialogUI.pack();
            dialogUI.setLocationRelativeTo(null);
            dialogUI.setVisible(true);
            return;
        } else if (durasiInt > 3) {
            DialogUI dialogUI = new DialogUI("Lama peminjaman maksimal 3 hari");
            dialogUI.pack();
            dialogUI.setLocationRelativeTo(null);
            dialogUI.setVisible(true);
            return;
        }

        tambahBuku(bukuPinjam, durasiInt);

    }// GEN-LAST:event_jButtonBatalActionPerformed

    private void jButtonBatalActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButtonBatalActionPerformed
        int barisBuku = jtPinjaman.getSelectedRow();
        if (barisBuku == -1) {
            DialogUI dialogUI = new DialogUI("Pilih buku yang ingin dihapus.");
            dialogUI.pack();
            dialogUI.setLocationRelativeTo(null);
            dialogUI.setVisible(true);
            return;
        }

        hapusBuku(barisBuku);
    }// GEN-LAST:event_jButtonBatalActionPerformed

    private void jButtonCariActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButtonCariActionPerformed
        String judul = jTextFieldPencarian.getText();
        Perpustakaan.controllerPeminjaman.cariBuku(judul);
    }// GEN-LAST:event_jButton1ActionPerformed

    private void jButtonKonfirmasiActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButtonCariActionPerformed
        DefaultTableModel model = (DefaultTableModel) jtPinjaman.getModel();
        pinjam(model);
    }// GEN-LAST:event_jButton1ActionPerformed

    public void display(ArrayList<Buku> bukuList) {
        Object[] kolom = { "Judul" };
        DefaultTableModel model = new DefaultTableModel(kolom, 0);

        for (Buku buku : bukuList) {
            Object[] baris = { buku.judul };
            model.addRow(baris);
        }

        jtBuku.setModel(model);
    }

    public void tambahBuku(int bukuIndex, int durasi) {
        Object[] baris = { jtBuku.getValueAt(bukuIndex, 0), durasi };
        tampilPinjamBuku(baris);
    }

    public void hapusBuku(int barisBuku) {
        DefaultTableModel model = (DefaultTableModel) jtPinjaman.getModel();
        model.removeRow(barisBuku);
    }

    public void tampilPinjamBuku(Object[] baris) {
        DefaultTableModel model = (DefaultTableModel) jtPinjaman.getModel();
        model.addRow(baris);
    }

    public void pinjam(DefaultTableModel model) {
        if (model.getRowCount() <= 10) {

            ArrayList<Buku> bukuList = new ArrayList<>();
            for (int i = 0; i < model.getRowCount(); i++) {
                String judul = (String) model.getValueAt(i, 0);
                bukuList.add(new Buku(judul));
            }

            boolean status = Perpustakaan.controllerPeminjaman.save(bukuList);

            if (status) {
                DialogUI dialogUI = new DialogUI("Berhasil meminjam buku.");
                dialogUI.pack();
                dialogUI.setLocationRelativeTo(null);
                dialogUI.setVisible(true);
            } else {
                DialogUI dialogUI = new DialogUI("Gagal melakukan peminjaman buku.");
                dialogUI.pack();
                dialogUI.setLocationRelativeTo(null);
                dialogUI.setVisible(true);
            }
        } else {
            DialogUI dialogUI = new DialogUI("Jumlah buku yang dipinjam melebihi batas 10 buku.");
            dialogUI.pack();
            dialogUI.setLocationRelativeTo(null);
            dialogUI.setVisible(true);
        }
    }

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCari;
    private javax.swing.JButton jButtonKonfirmasi;
    private javax.swing.JButton jButtonBatal;
    private javax.swing.JButton jButtonPinjam;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jtBuku;
    private javax.swing.JTable jtPinjaman;
    private javax.swing.JTextField jTextFieldPencarian;
    private javax.swing.JTextField jTextFieldDurasi;
    // End of variables declaration//GEN-END:variables
}
