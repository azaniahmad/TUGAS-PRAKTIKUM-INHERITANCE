/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package maintokobuku;

// 3. MAIN CLASS (Hanya ini yang boleh 'public')
public class MainTokoBuku {
    public static void main(String[] args) {
        
        // Menggunakan Try-With-Resources (Scanner diletakkan di dalam kurung try)
        try (java.util.Scanner scanner = new java.util.Scanner(System.in)) {
            
            BukuToko[] daftarBuku = new BukuToko[3]; 

            System.out.println("=== APLIKASI ENTRI DATA TOKO BUKU ===");
            
            // Proses Input Data Sebanyak 3 Kali
            for (int i = 0; i < 3; i++) {
                System.out.println("\n--- Input Data Buku ke-" + (i + 1) + " ---");
                
                System.out.print("Judul Buku      : ");
                String judul = scanner.nextLine();
                
                System.out.print("Nama Pengarang  : ");
                String pengarang = scanner.nextLine();
                
                System.out.print("Penerbit        : ");
                String penerbit = scanner.nextLine();
                
                System.out.print("Tahun Cetak     : ");
                int tahun = Integer.parseInt(scanner.nextLine());
                
                System.out.print("Kategori (su/r/d/a) : ");
                String kat = scanner.nextLine();
                
                // Instansiasi objek child class
                daftarBuku[i] = new BukuToko(judul, pengarang, penerbit, tahun, kat);
            }

            // Proses Menampilkan Isi Buku
            System.out.println("\n\n=== DAFTAR ISI BUKU TOKO ===");
            System.out.println("=========================================");
            for (int i = 0; i < 3; i++) {
                System.out.println("Data Buku ke-" + (i + 1));
                daftarBuku[i].displayInfo(); 
            }
            
        } catch (Exception e) {
            // Menangkap error jika terjadi kesalahan input (misal: tahun cetak diisi huruf)
            System.out.println("Terjadi kesalahan input: " + e.getMessage());
        }
        // TIDAK PERLU lagi menulis scanner.close(); di sini, karena sudah ditutup otomatis oleh try()
    }
}