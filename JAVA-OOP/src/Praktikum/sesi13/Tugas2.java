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

public class Tugas2 {
    public static void main(String[] args) {
        // Membuat queue untuk menyimpan data mahasiswa
        Queue<Mahasiswa> queue = new LinkedList<>();

        // Daftar nama mahasiswa
        String[] namaMahasiswa = {
            "Aulia Amanda", "Budi Santoso", "Cindy Permata", "Dedi Pratama", 
            "Eka Wulandari", "Fajar Hidayat", "Gina Safitri", "Hendra Wijaya", 
            "Indah Lestari", "Joko Supriyadi"
        };

        // Membuat objek Random untuk menghasilkan nilai acak
        Random random = new Random();

        // Menambahkan data mahasiswa ke dalam queue
        for (int i = 0; i < 10; i++) {
            String nrp = "NRP" + String.format("%03d", i + 1);
            String nama = namaMahasiswa[i];
            float nilai = 60 + random.nextFloat() * 40;  // Nilai acak antara 60 hingga 100
            queue.add(new Mahasiswa(nrp, nama, nilai));
        }

        // Menampilkan data mahasiswa sebelum diurutkan
        System.out.println("Data Mahasiswa Sebelum Diurutkan:");
        for (Mahasiswa mhs : queue) {
            System.out.println(mhs);
        }

        // Mengurutkan data mahasiswa berdasarkan nilai
        List<Mahasiswa> mahasiswaList = new ArrayList<>(queue);
        mahasiswaList.sort(Comparator.comparingDouble(Mahasiswa::getNilai).reversed());

        // Menampilkan data mahasiswa setelah diurutkan
        System.out.println("\nData Mahasiswa Setelah Diurutkan Berdasarkan Nilai:");
        for (Mahasiswa mhs : mahasiswaList) {
            System.out.println(mhs);
        }
    }
}

