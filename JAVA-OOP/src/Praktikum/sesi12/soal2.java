package Praktikum.sesi12;

// Interface transportasi
interface transportasi {
    int idz = 0; // atribut idz

    void tampil();      // method tampil()
    void setData();     // method setData()
    int getId();        // method getId()
}

// Subclass Gojek mengimplementasikan interface transportasi
class Gojek implements transportasi {
    private int harga;
    private int id;

    @Override
    public void tampil() {
        System.out.println("Gojek ID: " + id + ", Harga: " + harga);
    }

    @Override
    public void setData() {
        this.id = 1; // contoh data
        this.harga = 50000; // contoh harga
    }

    @Override
    public int getId() {
        return id;
    }
}

// Class bayar
class bayar {
    private int jarak;
    private int total;
    private String nama;

    // Constructor default
    public bayar() {
        this.jarak = 0;
        this.total = 0;
        this.nama = "Unknown";
    }

    // Constructor dengan parameter id
    public bayar(int id) {
        this.jarak = 10; // contoh jarak
        this.total = id * 10000; // contoh total dihitung
        this.nama = "Bayar Gojek";
    }

    public void tampil() {
        System.out.println("Nama: " + nama + ", Jarak: " + jarak + ", Total: " + total);
    }

    public void setData() {
        this.nama = "Bayar Transportasi";
        this.jarak = 15; // contoh jarak
        this.total = 150000; // contoh total
    }

    public int getId() {
        return total;
    }
}

// Main class untuk menjalankan program
public class soal2 {
    public static void main(String[] args) {
        // Objek Gojek
        Gojek gojek = new Gojek();
        gojek.setData();
        gojek.tampil();
        System.out.println("ID Gojek: " + gojek.getId());

        // Objek bayar
        bayar pembayaran1 = new bayar();
        pembayaran1.setData();
        pembayaran1.tampil();

        bayar pembayaran2 = new bayar(2);
        pembayaran2.tampil();
    }
}
