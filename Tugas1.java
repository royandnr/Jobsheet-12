import java.util.Scanner;

public class Tugas1 {

    // Fungsi menghitung volume kubus (bilangan bulat)
    public static int hitungVolume(int sisi) {
        return sisi * sisi * sisi;
    }

    // Fungsi menghitung luas permukaan kubus (bilangan bulat)
    public static int hitungLuasPermukaan(int sisi) {
        return 6 * sisi * sisi;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan panjang sisi kubus: ");
        int sisi = sc.nextInt();

        int volume = hitungVolume(sisi);
        int luasPermukaan = hitungLuasPermukaan(sisi);

        System.out.println("\n=== HASIL PERHITUNGAN KUBUS ===");
        System.out.println("Volume kubus: " + volume);
        System.out.println("Luas permukaan kubus: " + luasPermukaan);

        sc.close();
    }
}
