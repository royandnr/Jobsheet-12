package Pertemuan14;

import java.util.Scanner;

public class Kafe23 {

    public static void Menu() {
        System.out.println("===== MENU RESTO KAFE =====");
        System.out.println("1. Kopi Hitam - Rp 15,000");
        System.out.println("2. Cappuccino - Rp 20,000");
        System.out.println("3. Latte - Rp 22,000");
        System.out.println("4. Teh Tarik - Rp 12,000");
        System.out.println("5. Roti Bakar - Rp 10,000");
        System.out.println("6. Mie Goreng - Rp 18,000");
        System.out.println("===========================");
    }

    public static int hitungHargaMenu(int pilihanMenu, int banyakItem) {
        int[] hargaItems = {15000, 20000, 22000, 12000, 10000, 18000};
        return hargaItems[pilihanMenu - 1] * banyakItem;
    }

    public static int hitungDiskon(int total, String kodePromo) {
        int diskon = 0;

        if (kodePromo.equalsIgnoreCase("DISKON50")) {
            diskon = total * 50 / 100;
            System.out.println("Diskon 50%: Rp" + diskon);
        } else if (kodePromo.equalsIgnoreCase("DISKON30")) {
            diskon = total * 30 / 100;
            System.out.println("Diskon 30%: Rp" + diskon);
        } else {
            System.out.println("Kode promo invalid, tidak ada diskon.");
        }

        return diskon;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Menu();

        int totalKeseluruhan = 0;
        char lanjut;

        do {
            System.out.print("Pilih nomor menu: ");
            int pilihan = sc.nextInt();

            System.out.print("Jumlah item: ");
            int jumlah = sc.nextInt();

            int totalMenu = hitungHargaMenu(pilihan, jumlah);
            totalKeseluruhan += totalMenu;

            System.out.println("Total menu ini: Rp" + totalMenu);

            System.out.print("Apakah ingin memesan menu lain? (y/n): ");
            lanjut = sc.next().charAt(0);

        } while (lanjut == 'y' || lanjut == 'Y');

        System.out.println("===============================");
        System.out.println("Total keseluruhan pesanan: Rp" + totalKeseluruhan);

        // Kode promo
        System.out.print("Masukkan kode promo (jika ada): ");
        String kodePromo = sc.next();

        int diskon = hitungDiskon(totalKeseluruhan, kodePromo);
        int totalSetelahDiskon = totalKeseluruhan - diskon;

        System.out.println("Total setelah diskon: Rp" + totalSetelahDiskon);
    }
}

