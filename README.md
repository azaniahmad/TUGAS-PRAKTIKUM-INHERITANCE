# 📚 TUGAS PRAKTIKUM INHERITANCE - TOKO BUKU

> **Mata Kuliah**: Pemrograman Berorientasi Objek (PBO)  
> **Tugas**: Implementasi Konsep Inheritance pada Java

---

## 👤 Identitas Mahasiswa

| Field | Keterangan |
|-------|-----------|
| **Nama** | M. Krisna Y.P |
| **Kelas** | Malam Karyawan - TI C |


---

## 📋 Deskripsi Proyek

Proyek ini merupakan tugas praktikum untuk mengimplementasikan konsep **Inheritance (Pewarisan)** dalam pemrograman Java. Aplikasi sederhana ini mengelola data buku di toko buku dengan memanfaatkan hubungan parent-child antara class.

### ✨ Fitur Utama
- ✅ Implementasi inheritance dengan `extends`
- ✅ Penggunaan `super()` untuk constructor chaining
- ✅ Method overriding dengan `@Override`
- ✅ Input interaktif menggunakan `Scanner`
- ✅ Validasi input dengan `try-catch`
- ✅ Switch expression (Java 14+) untuk mapping kategori

---

## 🗂️ Struktur Class

### 🧱 Diagram Inheritance

```mermaid
classDiagram
    class Buku {
        -String judul
        -String nama_pengarang
        -String penerbit
        -int tahun_cetak
        +Buku(String, String, String, int)
        +displayInfo() void
    }
    
    class BukuToko {
        -String kategori
        +BukuToko(String, String, String, int, String)
        +getDeskripsiKategori() String
        +displayInfo() void
    }
    
    Buku <|-- BukuToko : extends
