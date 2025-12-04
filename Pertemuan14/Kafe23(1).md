Jawaban Percobaan 2

1. Parameter pada fungsi berguna untuk mengirimkan data dari luar fungsi ke dalam fungsi, sehingga fungsi dapat bekerja dengan nilai yang berbeda-beda tanpa perlu mengubah isi kodenya
2. Fungsi Menu() menggunakan parameter namaPelanggan dan isMember karena fungsi tersebut membutuhkan data dari luar untuk menampilkan menu yang lebih personal. Parameter namaPelanggan dipakai agar program bisa menampilkan sapaan dengan nama pelanggan yang dipilih, sedangkan parameter isMember dipakai untuk mengecek apakah pelanggan tersebut adalah member sehingga program bisa menampilkan informasi diskon khusus member
3. Tidak, parameter tidak sama dengan variabel biasa, tetapi parameter adalah variabel khusus yang digunakan untuk menerima nilai yang dikirim saat fungsi dipanggil.
Parameter = variabel yang berada di dalam tanda kurung fungsi, fungsinya untuk menerima input dari luar.
Variabel biasa = variabel yang dibuat dan digunakan di dalam tubuh fungsi.
4. Parameter isMember berfungsi untuk mengontrol apakah pelanggan mendapatkan diskon.
Dengan nilai boolean yang dikirim saat pemanggilan fungsi, program dapat menampilkan output yang berbeda sesuai status pelanggan.
Jika isMember bernilai true, kondisi if (isMember) terpenuhi → maka pesan diskon akan ditampilkan.
Jika isMember bernilai false, kondisi tidak terpenuhi → pesan diskon tidak ditampilkan.
5. jika kamu memanggil fungsi Menu() tanpa parameter, maka program akan error (compile error)
6. done
7. done
8. menurut saya penggunaan parameter namaPelanggan dan isMember membuat program jauh lebih mudah dibaca dan dikembangkan dibandingkan jika nilainya ditulis langsung di dalam fungsi tanpa parameter, alasannya, parameter membuat fungsi menjadi lebih fleksibel dan dapat digunakan berkali-kali untuk pelanggan yang berbeda, tanpa perlu mengubah isi kode di dalam fungsi. Program juga menjadi lebih rapi, karena data yang berubah-ubah (nama pelanggan dan status member) tidak dicampur dengan logika program, melainkan dikirim dari luar melalui parameter