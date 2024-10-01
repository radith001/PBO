import java.util.Scanner;

public class Kalkulator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Memasukkan angka pertama
        System.out.print("Masukkan angka pertama: ");
        double angka1 = scanner.nextDouble();

        // Memasukkan angka kedua
        System.out.print("Masukkan angka kedua: ");
        double angka2 = scanner.nextDouble();

        // Memilih operasi
        System.out.print("Pilih operasi (+, -, *, /): ");
        char operasi = scanner.next().charAt(0);

        // Deklarasi variabel hasil
        double hasil = 0;

        // Melakukan operasi sesuai pilihan
        switch (operasi) {
            case '+':
                hasil = angka1 + angka2;
                break;
            case '-':
                hasil = angka1 - angka2;
                break;
            case '*':
                hasil = angka1 * angka2;
                break;
            case '/':
                if (angka2 != 0) {
                    hasil = angka1 / angka2;
                } else {
                    System.out.println("Error: Pembagian dengan nol tidak diperbolehkan!");
                    scanner.close();
                    return;
                }
                break;
            default:
                System.out.println("Operasi tidak valid!");
                scanner.close();
                return;
        }

        // Menampilkan hasil
        System.out.println("Hasil: " + hasil);
        scanner.close();
    }
}
