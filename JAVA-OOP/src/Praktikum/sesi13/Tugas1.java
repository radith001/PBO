package Praktikum.sesi13;

import java.util.ArrayList;
import java.util.List;

public class Tugas1 {
    public static void main(String[] args) {
        // Membuat list warna
        List<String> warna = new ArrayList<>();
        warna.add("MAGENTA");
        warna.add("RED");
        warna.add("WHITE");
        warna.add("BLUE");
        warna.add("CYAN");

        // Membuat list warna yang akan dihapus
        List<String> warnaDihapus = new ArrayList<>();
        warnaDihapus.add("RED");
        warnaDihapus.add("WHITE");
        warnaDihapus.add("BLUE");

        // Menghapus warna yang ada di list warnaDihapus dari list warna
        warna.removeAll(warnaDihapus);

        // Menampilkan hasil
        System.out.println("Warna :");
        System.out.println(warna);
    }
}

