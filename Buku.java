/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package maintokobuku;

public class Buku {
    // Atribut parent class
    protected String judul;
    protected String nama_pengarang;
    protected String penerbit;
    protected int tahun_cetak;

    // Constructor
    public Buku(String judul, String nama_pengarang, String penerbit, int tahun_cetak) {
        this.judul = judul;
        this.nama_pengarang = nama_pengarang;
        this.penerbit = penerbit;
        this.tahun_cetak = tahun_cetak;
    }

    // Method untuk menampilkan informasi
    public void displayInfo() {
        System.out.println("Judul Buku    : " + judul);
        System.out.println("Pengarang     : " + nama_pengarang);
        System.out.println("Penerbit      : " + penerbit);
        System.out.println("Tahun Cetak   : " + tahun_cetak);
    }
}
