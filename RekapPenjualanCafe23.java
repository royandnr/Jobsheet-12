import java.util.Scanner;

public class RekapPenjualanCafe23 {

    static Scanner sc = new Scanner(System.in);

    // Akan ditentukan oleh user
    static String[] menu;
    static int[][] penjualan;

    // Input data penjualan
    public static void inputData(int jmlMenu, int jmlHari) {

        menu = new String[jmlMenu];
        penjualan = new int[jmlMenu][jmlHari];

        sc.nextLine(); // bersihkan buffer

        System.out.println("=== INPUT NAMA MENU ===");
        for (int i = 0; i < jmlMenu; i++) {
            System.out.print("Nama menu ke-" + (i + 1) + ": ");
            menu[i] = sc.nextLine();
        }

        System.out.println("\n=== INPUT DATA PENJUALAN ===");
        for (int i = 0; i < jmlMenu; i++) {
            System.out.println("Menu: " + menu[i]);
            for (int j = 0; j < jmlHari; j++) {
                System.out.print("  Hari " + (j + 1) + ": ");
                penjualan[i][j] = sc.nextInt();
            }
            System.out.println();
        }
    }

    // Tampilkan tabel penjualan
    public static void tampilData(int jmlMenu, int jmlHari) {
        System.out.println("\n=== TABEL PENJUALAN ===");
        System.out.print("Menu/Hari\t");
        for (int h = 1; h <= jmlHari; h++) {
            System.out.print("H" + h + "\t");
        }
        System.out.println();

        for (int i = 0; i < jmlMenu; i++) {
            System.out.print(menu[i] + "\t");
            for (int j = 0; j < jmlHari; j++) {
                System.out.print(penjualan[i][j] + "\t");
            }
            System.out.println();
        }
    }

    // Menu dengan total penjualan tertinggi
    public static void menuTertinggi(int jmlMenu, int jmlHari) {
        int maxTotal = -1;
        int idxMenuMax = -1;

        for (int i = 0; i < jmlMenu; i++) {
            int total = 0;
            for (int j = 0; j < jmlHari; j++) {
                total += penjualan[i][j];
            }
            if (total > maxTotal) {
                maxTotal = total;
                idxMenuMax = i;
            }
        }

        System.out.println("\n=== MENU DENGAN PENJUALAN TERTINGGI ===");
        System.out.println("Menu: " + menu[idxMenuMax]);
        System.out.println("Total Penjualan: " + maxTotal);
    }

    // Rata-rata setiap menu
    public static void rataRata(int jmlMenu, int jmlHari) {
        System.out.println("\n=== RATA-RATA PENJUALAN MENU ===");
        for (int i = 0; i < jmlMenu; i++) {
            int total = 0;
            for (int j = 0; j < jmlHari; j++) {
                total += penjualan[i][j];
            }
            double rata = total / (double) jmlHari;

            System.out.println(menu[i] + " : " + rata);
        }
    }

    // MAIN
    public static void main(String[] args) {

        System.out.print("Masukkan jumlah menu: ");
        int jmlMenu = sc.nextInt();

        System.out.print("Masukkan jumlah hari penjualan: ");
        int jmlHari = sc.nextInt();

        inputData(jmlMenu, jmlHari);
        tampilData(jmlMenu, jmlHari);
        menuTertinggi(jmlMenu, jmlHari);
        rataRata(jmlMenu, jmlHari);

    }
}
