package Praktikum.sesi2;

import java.util.Scanner;

public class tugas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int apasaja;
        int karakter;
        int pilihan;
        int health;
        int healthmusuh;
        int kondisiPermainan;
        int subMenu;
        
        Game:
        while (true) {
            health = 100;
            healthmusuh = 100;

            System.out.print("\033[H\033[2J");
            System.out.flush();
            System.out.println(" ____      _       _ _____ ____  __        ___    ____  ____  ___ ___  ____");
            System.out.println("|  _ \\    / \\     | | ____/ ___| \\ \\      / / \\  |  _ \\|  _ \\|_ _/ _ \\|  _ \\ ");
            System.out.println("| |_) |  / _ \\ _  | |  _|| |  _   \\ \\ /\\ / / _ \\ | |_) | |_) || | | | | |_) |");
            System.out.println("|  _ <  / ___ \\ |_| | |__| |_| |   \\ V  V / ___ \\|  _ <|  _ < | | |_| |  _ < ");
            System.out.println("|_| \\_\\/_/   \\_\\___/|______\\____|    \\_/\\_/_/   \\_\\_| \\_\\_| \\_\\___\\___/|_| \\_\\");
            System.out.println("====================================================================================");
            System.out.println("\nSelamat datang di Rajeg Warrior!!");
            System.out.println("Kalahkan Raja Hytam untuk memenangkan permainan ini.\n");
            System.out.println("Tekan 1 untuk melanjutkan");
            apasaja = input.nextInt();

            Balik1:
            while (true) {
                System.out.print("\033[H\033[2J");
                System.out.flush();

                System.out.println("Pilih karakter Anda:");
                System.out.println("1. Kesatria");
                System.out.println("2. Pemanah");
                System.out.println("3. Medis");
                System.out.print("Pilihan: ");
                karakter = input.nextInt();

                switch (karakter) {
                    case 1:
                        System.out.println("Anda memilih Kesatria.");
                        break Balik1;
                    case 2:
                        System.out.println("Anda memilih Pemanah.");
                        break Balik1;
                    case 3:
                        System.out.println("Anda memilih Medis.");
                        break Balik1;
                    default:
                        System.out.println("Pilihan tidak valid.");
                }
            }

            do {
                System.out.print("\033[H\033[2J");
                System.out.flush();

                System.out.println("\nPilihan tindakan:");
                System.out.println("1. Serang (-10 HP)");
                System.out.println("2. Memulihkan (+30 HP)");
                System.out.println("3. Beli Senjata");
                System.out.print("Pilihan: ");
                pilihan = input.nextInt();

                if (pilihan == 1) {
                    health -= 20;
                    healthmusuh -= 10;
                    System.out.println("Anda telah menyerang Raja Hytam dan Raja Hytam menyerang balik Anda");
                    System.out.println("Sisa HP Anda: " + health);
                    System.out.println("Sisa HP Raja Hytam: " + healthmusuh);
                } else if (pilihan == 2) {
                    health += 30;
                    System.out.println("Anda berhasil memulihkan diri. HP Anda sekarang: " + health);
                } else if (pilihan == 3) {
                    Balik3:
                    while (true) {
                        System.out.print("\033[H\033[2J");
                        System.out.flush();

                        System.out.println("List senjata yang tersedia:");
                        
                        String[] senjataList = {"Panah", "Pedang", "Catalyst"};
                        for (int i = 0; i < senjataList.length; i++) {
                            System.out.println((i + 1) + ". " + senjataList[i]);
                        }

                        System.out.print("Pilihan senjata: ");
                        int senjata = input.nextInt();

                        // Switch statement untuk pemilihan senjata
                        switch (senjata) {
                            case 1:
                                System.out.println("Anda membeli panah.");
                                break Balik3;
                            case 2:
                                System.out.println("Anda membeli pedang.");
                                break Balik3;
                            case 3:
                                System.out.println("Anda membeli catalyst.");
                                break Balik3;
                            default:
                                System.out.println("Pilihan senjata tidak valid.");
                        }
                    }
                } else {
                    System.out.println("Pilihan tidak valid.");
                }
            } while (health > 0 && healthmusuh > 0); 

            System.out.print("\033[H\033[2J");
            System.out.flush();

            // Cek kondisi permainan
            if (health <= 0 && healthmusuh > 0) {
                kondisiPermainan = 0;
            } else if (healthmusuh <= 0 && health > 0) {
                kondisiPermainan = 1;
            } else {
                kondisiPermainan = 2;
            }

            // Tampilkan hasil permainan
            if (kondisiPermainan == 0) {
                System.out.println("GAME OVER\nKamu telah dikalahkan oleh Raja Hytam");
            } else if (kondisiPermainan == 1) {
                System.out.println("MISSION COMPLETE\nRaja Hytam telah dikalahkan dan game selesai.");
            } else if (kondisiPermainan == 2) {
                System.out.println("DRAW\nKamu dan Raja Hytam telah mati bersama.");
            }

            // Menu setelah game selesai
            Balik4:
            while (true) {
                System.out.println("Pilihan Menu");
                System.out.println("1. Kembali ke awal");
                System.out.println("2. Keluar dari aplikasi");
                System.out.print("Pilihan: ");
                subMenu = input.nextInt();

                if (subMenu == 1) {
                    continue Game;
                } else if (subMenu == 2) {
                    System.out.println("Terima kasih telah Bermain Rajeg Warrior!\n");
                    input.close();
                    return;
                } else {
                    System.out.println("Pilihan tidak valid.");
                }
            }
        }
    }
}
