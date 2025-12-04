Jawaban Percobaan 3

1. Fungsi membutuhkan return value ketika kita butuh hasil perhitungan atau data untuk dipakai kembali di tempat lain. c
contoh:
public static int hitungTotalHarga23 (int pilihanMenu, int banyakItem) {
    int [] hargaItems = {15000, 20000, 22000, 12000, 10000, 18000};
    int hargaTotal = hargaItems[pilihanMenu - 1] * banyakItem;
    return hargaTotal;   
} 
Fungsi ini harus mengembalikan nilai total harga agar bisa dipakai di main()

Fungsi tidak perlu return value jika tujuannya hanya melakukan aksi, misalnya menampilkan teks, menampilkan menu, atau hanya mencetak ke layar, tanpa harus memberikan data kembali.
contoh:
public static void Menu(String namaPelanggan, boolean isMember, String kodePromo) {
    System.out.println("Selamat datang, " + namaPelanggan + "!");
    // menampilkan informasi dan daftar menu
}
Fungsi Menu() hanya menampilkan teks ke layar. Tidak ada nilai yang perlu dihitung atau dikembalikan ke program utama. Karena itu, tipe datanya void.
2. Tipe data nilai kembalian fungsi: int
(karena fungsi hitungTotalHarga23 mengembalikan total harga dalam bentuk bilangan bulat)
Dua parameter pada fungsi tersebut:

int pilihanMenu → digunakan untuk menentukan menu mana yang dipilih pelanggan. Nilai ini digunakan sebagai indeks untuk mengambil harga dari array hargaItems.

int banyakItem → menunjukkan jumlah pesanan dari menu yang dipilih, sehingga total harga bisa dihitung dengan mengalikan harga satuan dengan jumlah item.

Arti parameter:
pilihanMenu mewakili nomor menu yang dipilih pelanggan (misalnya 1 = Kopi Hitam, 2 = Cappuccino), sedangkan banyakItem menunjukkan berapa porsi atau berapa banyak pelanggan memesan menu tersebut. Kedua parameter ini digunakan untuk menghitung total biaya pesanan pelanggan.
3. 