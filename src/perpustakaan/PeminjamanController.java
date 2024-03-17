package perpustakaan;

import java.util.ArrayList;

public class PeminjamanController {

    public void showFormPencarian() {
        Perpustakaan.formPeminjaman = new FormPeminjaman();
        Perpustakaan.formPeminjaman.tampilkan();
    }

    public void cariBuku(String judul) {
        BukuProvider bukuProvider = new BukuProvider();
        try {
            ArrayList<Buku> listBuku = bukuProvider.selectBuku(judul);
            if (listBuku.isEmpty()) {
                DialogUI dialogUI = new DialogUI("Buku tidak terdaftar");
                dialogUI.pack();
                dialogUI.setLocationRelativeTo(null);
                dialogUI.setVisible(true);
            } else
                Perpustakaan.formPeminjaman.display(listBuku);
        } catch (Exception ex) {
            DialogUI dialogUI = new DialogUI("Connection Error");
            dialogUI.pack();
            dialogUI.setLocationRelativeTo(null);
            dialogUI.setVisible(true);
        }
    }

    public boolean save(ArrayList<Buku> bukuDipinjamCollection) {
        ArrayList<Buku> peminjaman = new ArrayList<>();

        if(!bukuDipinjamCollection.isEmpty()) {
            for (Buku bukuDipinjam : bukuDipinjamCollection) {
                peminjaman.add(bukuDipinjam);
            }
            return true;
        }

        return false;
    }

}
