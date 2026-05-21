/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package maintokobuku;

class BukuToko extends Buku {
    // 1. Ditambahkan 'final' karena nilainya tidak diubah setelah constructor
    private final String kategori;

    public BukuToko(String judul, String nama_pengarang, String penerbit, int tahun_cetak, String kategori) {
        super(judul, nama_pengarang, penerbit, tahun_cetak);
        this.kategori = kategori;
    }

    // 2. Menggunakan Switch Expression (Java Modern) dengan tanda panah (->)
    public String getDeskripsiKategori() {
        // Pencegahan error jika kategori kosong (null)
        if (kategori == null) {
            return "Kategori Tidak Dikenal";
        }

        // Switch Expression (Lebih singkat dan rapi)
        return switch (kategori.toLowerCase()) {
            case "su" -> "Semua Umur";
            case "r"  -> "Remaja";
            case "d"  -> "Dewasa";
            case "a"  -> "Anak";
            default   -> "Kategori Tidak Dikenal";
        };
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Kategori      : " + getDeskripsiKategori());
        System.out.println("-----------------------------------------");
    }
}