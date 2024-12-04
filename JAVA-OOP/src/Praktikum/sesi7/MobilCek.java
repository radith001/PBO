package Praktikum.sesi7;

import java.text.NumberFormat;
import java.util.Locale;

class Mobil {
    public String merk; 
    protected int tahunProduksi; 
    private double harga; 

    public Mobil(String merk, int tahunProduksi, double harga) {
        this.merk = merk;
        this.tahunProduksi = tahunProduksi;
        this.harga = harga;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double hargaBaru) {
        if (hargaBaru > 0) { 
            this.harga = hargaBaru;
        } else {
            System.out.println("Harga harus lebih besar dari 0.");
        }
    }

    public void tampilkanInfoMobil() {
        NumberFormat formatter = NumberFormat.getNumberInstance(Locale.US); 
        System.out.println("Merk: " + merk);
        System.out.println("Tahun Produksi: " + tahunProduksi);
        System.out.println("Harga: " + formatter.format(harga));
    }
}

public class MobilCek {
    public static void main(String[] args) {
        Mobil mobil1 = new Mobil("Toyota", 2022, 30000000);

        System.out.println("Merk Mobil: " + mobil1.merk); 
        System.out.println("Tahun Produksi Mobil: " + mobil1.tahunProduksi); 
        System.out.println("Harga Mobil: " + NumberFormat.getNumberInstance(Locale.US).format(mobil1.getHarga()));

        mobil1.setHarga(35000000);
        System.out.println("Harga Mobil Setelah Diubah: " + NumberFormat.getNumberInstance(Locale.US).format(mobil1.getHarga())); 

        mobil1.tampilkanInfoMobil();
    }
}
