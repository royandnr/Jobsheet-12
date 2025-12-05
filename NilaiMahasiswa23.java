import java.util.Scanner;

public class NilaiMahasiswa23 {

    // Fungsi isianArray
    // Mengisi elemen-elemen array dengan nilai dari input user
    public static void isianArray(int[] nilai) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < nilai.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilai[i] = sc.nextInt();
        }
    }

    // Fungsi tampilArray
    // Menampilkan seluruh nilai dalam array
    public static void tampilArray(int[] nilai) {
        System.out.println("\n=== Daftar Nilai Mahasiswa ===");
        for (int i = 0; i < nilai.length; i++) {
            System.out.println("Mahasiswa " + (i + 1) + ": " + nilai[i]);
        }
    }

    // Fungsi hitTot
    // Menghitung total nilai seluruh mahasiswa
    public static int hitTot(int[] nilai) {
        int total = 0;
        for (int i = 0; i < nilai.length; i++) {
            total += nilai[i];
        }
        return total;
    }

    // Fungsi main
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa (N): ");
        int N = sc.nextInt();

        // Membuat array ukuran N
        int[] nilaiMhs = new int[N];

        // Memanggil fungsi-fungsi
        isianArray(nilaiMhs);
        tampilArray(nilaiMhs);

        int totalNilai = hitTot(nilaiMhs);

        System.out.println("\nTotal nilai seluruh mahasiswa: " + totalNilai);

        sc.close();
    }
}
