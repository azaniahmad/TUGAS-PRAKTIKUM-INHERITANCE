/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package maintokobuku;


public class MainTokoBuku {
    public static void main(String[] args) {
        
      
        try (java.util.Scanner scanner = new java.util.Scanner(System.in)) {
            
            BukuToko[] daftarBuku = new BukuToko[3]; 

            System.out.println("=== APLIKASI ENTRI DATA TOKO BUKU ===");
            
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
                

                daftarBuku[i] = new BukuToko(judul, pengarang, penerbit, tahun, kat);
            }

            System.out.println("\n\n=== DAFTAR ISI BUKU TOKO ===");
            System.out.println("=========================================");
            for (int i = 0; i < 3; i++) {
                System.out.println("Data Buku ke-" + (i + 1));
                daftarBuku[i].displayInfo(); 
            }
            
        } catch (Exception e) {
           
            System.out.println("Terjadi kesalahan input: " + e.getMessage());
        }
       
    }
}
