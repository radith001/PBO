package Praktikum.sesi10.soal.soal2;

public class OperasiPerkalian extends OperasiBilangan {
    @Override
    public void tampil() {
        setC(getA() * getB());
        System.out.println("Hasil Perkalian   : " + getC());
    }
}
