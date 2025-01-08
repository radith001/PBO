package Praktikum.sesi13;

import java.util.*;

class Mahasiswa implements Comparable<Mahasiswa> {
    private String nrp;
    private String nama;

    // Constructor
    public Mahasiswa(String nrp, String nama) {
        this.nrp = nrp;
        this.nama = nama;
    }

    // Getter methods
    public String getNrp() {
        return nrp;
    }

    public String getNama() {
        return nama;
    }

    @Override
    public String toString() {
        return "NRP: " + nrp + ", Nama: " + nama;
    }

    // Implementasi Comparable untuk pengurutan berdasarkan nama
    @Override
    public int compareTo(Mahasiswa o) {
        return this.nama.compareTo(o.nama);
    }
}

public class Latihan3 {
    public static void main(String[] args) {
        // Membuat list mahasiswa
        List<Mahasiswa> mahasiswaList = new ArrayList<>();
        mahasiswaList.add(new Mahasiswa("NRP001", "Aulia Amanda"));
        mahasiswaList.add(new Mahasiswa("NRP002", "Budi Santoso"));
        mahasiswaList.add(new Mahasiswa("NRP003", "Cindy Permata"));
        mahasiswaList.add(new Mahasiswa("NRP004", "Dedi Pratama"));
        mahasiswaList.add(new Mahasiswa("NRP005", "Eka Wulandari"));

        // Tampilkan data yang terdapat pada list
        System.out.println("Data awal pada list:");
        mahasiswaList.forEach(System.out::println);

        // Balikkan data pada list
        Collections.reverse(mahasiswaList);
        System.out.println("\nData setelah dibalik:");
        mahasiswaList.forEach(System.out::println);

        // Acak data pada list
        Collections.shuffle(mahasiswaList);
        System.out.println("\nData setelah diacak:");
        mahasiswaList.forEach(System.out::println);

        // Urutkan data pada list
        Collections.sort(mahasiswaList);
        System.out.println("\nData setelah diurutkan berdasarkan nama:");
        mahasiswaList.forEach(System.out::println);
    }
}

