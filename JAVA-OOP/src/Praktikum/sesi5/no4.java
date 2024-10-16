package Praktikum.sesi5;

public class no4 {
    public static void main(String[] args) {
        int genap = 0;
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0) {
                genap++;
            }
        }
        System.out.println("Jumlah bilangan genap adalah = " + genap);
    }
}
