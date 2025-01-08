package Praktikum.sesi13;

import java.util.*;

class Mahasiswa {
    private String nrp;
    private String nama;
    private float nilai;

    // Constructor
    public Mahasiswa(String nrp, String nama, float nilai) {
        this.nrp = nrp;
        this.nama = nama;
        this.nilai = nilai;
    }

    // Getter methods
    public String getNrp() {
        return nrp;
    }

    public String getNama() {
        return nama;
    }

    public float getNilai() {
        return nilai;
    }

    @Override
    public String toString() {
        return "NRP: " + nrp + ", Nama: " + nama + ", Nilai: " + nilai;
    }
}

public class Latihan2 {
    public static void main(String[] args) {
        // Array nama mahasiswa
        String[] namaManusia = {
            "Aulia Amanda", "Hendra Wijaya", "Budi Santoso", 
            "Indah Lestari", "Dedi Pratama", "Gina Safitri", 
            "Andi Setiawan", "Fajar Hidayat", "Joko Supriyadi", 
            "Cindy Permata"
        };

        // Array nilai mahasiswa (disesuaikan dengan output)
        float[] nilaiMahasiswa = {
            95.23f, 72.34f, 90.45f, 
            68.23f, 85.67f, 75.12f, 
            80.34f, 78.45f, 65.89f, 
            89.56f
        };

        // Membuat queue mahasiswa
        Queue<Mahasiswa> queue = new LinkedList<>();

        // Menambahkan data mahasiswa ke queue
        for (int i = 0; i < 10; i++) {
            String nrp = "NRP" + String.format("%03d", i + 1);
            queue.add(new Mahasiswa(nrp, namaManusia[i], nilaiMahasiswa[i]));
        }

        // Menyalin data dari queue ke list untuk pengurutan
        List<Mahasiswa> mahasiswaList = new ArrayList<>(queue);

        // Mengurutkan data berdasarkan nilai (descending)
        mahasiswaList.sort((m1, m2) -> Float.compare(m2.getNilai(), m1.getNilai()));

        // Menampilkan data mahasiswa setelah pengurutan
        System.out.println("Data Mahasiswa setelah pengurutan berdasarkan nilai:");
        for (Mahasiswa m : mahasiswaList) {
            System.out.println(m);
        }
    }
}
