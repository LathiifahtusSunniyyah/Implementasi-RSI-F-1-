package controller;

import model.Buku;
import java.util.*;

public class PencarianController {
    private List<Buku> daftarBuku = new ArrayList<>(); // Simpan daftar buku di sini

    public void tambahBuku(Buku buku) {
        daftarBuku.add(buku);
    }
    
    public Buku cariBuku(String judulBuku) {
        for (Buku buku : daftarBuku) {
            if (buku.getJudul_buku().equalsIgnoreCase(judulBuku)) {
                return buku;
            }
        }
        return null; // Buku tidak ditemukan
    }
}