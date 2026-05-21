
package maintokobuku;

public class Buku {

    protected String judul;
    protected String nama_pengarang;
    protected String penerbit;
    protected int tahun_cetak;


    public Buku(String judul, String nama_pengarang, String penerbit, int tahun_cetak) {
        this.judul = judul;
        this.nama_pengarang = nama_pengarang;
        this.penerbit = penerbit;
        this.tahun_cetak = tahun_cetak;
    }

    public void displayInfo() {
        System.out.println("Judul Buku    : " + judul);
        System.out.println("Pengarang     : " + nama_pengarang);
        System.out.println("Penerbit      : " + penerbit);
        System.out.println("Tahun Cetak   : " + tahun_cetak);
    }
}
