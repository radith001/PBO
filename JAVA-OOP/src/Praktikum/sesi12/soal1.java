package Praktikum.sesi12;

// Superclass: Dosen
class Dosen {
    private String nik;
    private String nama;

    // Konstruktor
    public Dosen(String nik, String nama) {
        this.nik = nik;
        this.nama = nama;
    }

    // Getter untuk nik
    public String getNik() {
        return nik;
    }

    // Getter untuk nama
    public String getNama() {
        return nama;
    }

    // Method untuk menampilkan data Dosen
    public void view() {
        System.out.println("NIK: " + nik);
        System.out.println("Nama: " + nama);
    }
}

// Subclass: Rektor
class Rektor extends Dosen {
    private int tahunMasuk;

    // Konstruktor
    public Rektor(String nik, String nama, int tahunMasuk) {
        super(nik, nama); // Memanggil konstruktor superclass
        this.tahunMasuk = tahunMasuk;
    }

    // Getter untuk tahunMasuk
    public int getTahunMasuk() {
        return tahunMasuk;
    }

    // Method tambahan untuk menampilkan data Rektor
    public void viewRektor() {
        super.view(); // Memanggil method view() dari superclass
        System.out.println("Tahun Masuk: " + tahunMasuk);
    }
}

// Subclass: Dekan
class Dekan extends Dosen {
    private String fakultas;

    // Konstruktor
    public Dekan(String nik, String nama, String fakultas) {
        super(nik, nama); // Memanggil konstruktor superclass
        this.fakultas = fakultas;
    }

    // Getter untuk fakultas
    public String getFakultas() {
        return fakultas;
    }

    // Method tambahan untuk menampilkan data Dekan
    public void viewDekan() {
        super.view(); // Memanggil method view() dari superclass
        System.out.println("Fakultas: " + fakultas);
    }
}

// Class Main untuk menguji program
public class soal1 {
    public static void main(String[] args) {
        // Membuat objek Dosen
        Dosen dosen1 = new Dosen("123", "Mochamad Naufal");
        System.out.println("Data Dosen:");
        dosen1.view();

        System.out.println();

        // Membuat objek Rektor
        Rektor rektor1 = new Rektor("456", "Kiana Kaslana", 2015);
        System.out.println("Data Rektor:");
        rektor1.viewRektor();

        System.out.println();

        // Membuat objek Dekan
        Dekan dekan1 = new Dekan("789", "Bronya Zaychik", "Teknik");
        System.out.println("Data Dekan:");
        dekan1.viewDekan();
    }
}