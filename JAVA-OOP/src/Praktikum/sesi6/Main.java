package Praktikum.sesi6;

class Mahasiswa {
    String nama;
    int umur;
    String jurusan;

    Mahasiswa(String nama, int umur, String jurusan) {
        this.nama = nama;
        this.umur = umur;
        this.jurusan = jurusan;
    }

    void tampilkanInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("Umur: " + umur + " tahun");
        System.out.println("Jurusan: " + jurusan);
    }
}

public class Main {
    public static void main(String[] args) {
        Mahasiswa mahasiswa1 = new Mahasiswa("Aulia Amanda", 19, "Teknik Informatika");
        mahasiswa1.tampilkanInfo();
    }
}

