package Praktikum.sesi7.Waktu;

public class Waktu {

    private int totalMenit;

    public Waktu(int totalMenit) {
        this.totalMenit = totalMenit;
    }

    public int getJumlahJam() {
        return totalMenit / 60;
    }

    public int getSisaMenit() {
        return totalMenit % 60;
    }

    public void aturJam(int jam) {
        totalMenit = (jam * 60) + (totalMenit % 60);
    }

    public void aturMenit(int menit) {
        totalMenit = ((totalMenit / 60) * 60) + menit;
    }

    public int hitungTotalMenit() {
        return totalMenit;
    }

    public static void main(String[] args) {
        Waktu waktu = new Waktu(125);

        System.out.println("Jam: " + waktu.getJumlahJam());
        System.out.println("Menit: " + waktu.getSisaMenit());

        waktu.aturJam(3);
        System.out.println("Setelah aturJam(3) - Total Menit: " + waktu.hitungTotalMenit());

        waktu.aturMenit(30);
        System.out.println("Setelah aturMenit(30) - Total Menit: " + waktu.hitungTotalMenit());
    }
}
