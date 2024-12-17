package Praktikum.sesi11.SoalSendiri;

// Interface Buku
interface Buku {
    void baca(); // Metode untuk membaca buku
    void deskripsi(); // Deskripsi buku
}

// Kelas abstrak sebagai dasar untuk item di toko buku
abstract class Item {
    protected String judul;
    protected double harga;

    public Item(String judul, double harga) {
        this.judul = judul;
        this.harga = harga;
    }

    // Metode abstrak untuk menampilkan informasi
    public abstract void tampilkanInfo();
}

// Kelas konkret untuk Novel
class Novel extends Item implements Buku {
    private String penulis;

    public Novel(String judul, double harga, String penulis) {
        super(judul, harga);
        this.penulis = penulis;
    }

    @Override
    public void baca() {
        System.out.println("Membaca novel: " + judul + " karya " + penulis);
    }

    @Override
    public void deskripsi() {
        System.out.println("Novel ini adalah karya penulis terkenal, " + penulis);
    }

    @Override
    public void tampilkanInfo() {
        System.out.println("Novel - ");
        System.out.println("Judul: " + judul);
        System.out.println("Harga: Rp" + harga);
        System.out.println("Penulis: " + penulis);
    }
}

// Kelas konkret untuk Komik
class Komik extends Item implements Buku {
    private String ilustrator;

    public Komik(String judul, double harga, String ilustrator) {
        super(judul, harga);
        this.ilustrator = ilustrator;
    }

    @Override
    public void baca() {
        System.out.println("Membaca komik: " + judul + " dengan ilustrasi oleh " + ilustrator);
    }

    @Override
    public void deskripsi() {
        System.out.println("Komik ini memiliki ilustrasi yang dibuat oleh " + ilustrator);
    }

    @Override
    public void tampilkanInfo() {
        System.out.println("Komik - ");
        System.out.println("Judul: " + judul);
        System.out.println("Harga: Rp" + harga);
        System.out.println("Ilustrator: " + ilustrator);
    }
}

// Main Class
public class TokoBuku {
    public static void main(String[] args) {
        Novel novel = new Novel("Laskar Pelangi", 85000, "Andrea Hirata");
        Komik komik = new Komik("One Piece", 40000, "Eiichiro Oda");

        // Menampilkan informasi dan menggunakan metode
        novel.tampilkanInfo();
        novel.baca();
        novel.deskripsi();

        System.out.println();

        komik.tampilkanInfo();
        komik.baca();
        komik.deskripsi();
    }
}
