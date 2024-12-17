package Praktikum.sesi10.polymorfisme;

public class polymorphtester {
    public static void main(String[] args) {
        Polymorph p = new Polymorph();
        System.out.println("2 + 3 = " + p.tambah(2, 3));
        System.out.println("1 + 2 = " + p.tambah("1", "2"));
    }   
}
