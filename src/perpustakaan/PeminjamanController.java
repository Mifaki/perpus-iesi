package perpustakaan;

public class PeminjamanController {

    public void showFormPencarian() {
        Perpustakaan.formPeminjaman = new FormPeminjaman();
        Perpustakaan.formPeminjaman.tampilkan();
    }
    
}
