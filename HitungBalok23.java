import java.util.Scanner;
public class HitungBalok23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int p, l, t, L, Vol;

        System.out.print("Masukkan panjang: ");
         p = input.nextInt();

        System.out.print("Masukkan lebar: ");
         l = input.nextInt();

        System.out.print("Masukkan tinggi: ");
        t = input.nextInt();

        L = p * l;
        System.out.println("Luas persegi panjang adalah " + L);
        Vol = p * l * t;
        System.out.println("Volume balok adalah " + Vol);

        input.close();
    }
}
