Jawaban Percobaan 5

1. Saat program Percobaan 5 dijalankan, eksekusi dimulai dari method main, kemudian program membuat objek Scanner untuk membaca input dari pengguna dan mendeklarasikan variabel yang diperlukan. Setelah itu, program meminta pengguna memasukkan panjang balok dan menyimpannya ke variabel p, lalu meminta lebar balok dan menyimpannya ke l, serta meminta tinggi balok yang disimpan pada variabel t. Setelah semua data dimasukkan, program menghitung luas persegi panjang dengan rumus p * l dan menampilkan hasilnya. Selanjutnya, program menghitung volume balok menggunakan rumus p * l * t dan mencetak hasil perhitungannya ke layar, kemudian program menutup scanner dan eksekusi selesai.
2. outputnya luas persegi panjang adalah 12 kemudian volume balok adalah 60, program meminta input panjang: 4, lalu input lebar: 3, dan input tinggi: 5. lalu untuk menampilkan luas persegi panjang akan mengeksekusi perhitungan 4 * 3 = 12, kemudian untuk menampilkan volume balok akan mengekseskusi perhitungan 4 * 3 * 5 = 60.
3. outputnya adalah 12345567, 
Alur:
Program dimulai dari fungsi main, yang pertama-tama memanggil fungsi Jumlah(1,1) sehingga menghasilkan nilai 2 dan disimpan ke variabel temp. Selanjutnya program memanggil TampilJumlah(temp, 5), yang berarti memanggil TampilJumlah(2,5). Di dalam fungsi tersebut, program kembali memanggil Jumlah(2,5) sehingga menghasilkan nilai 7, lalu nilai 7 tersebut dikirim ke fungsi TampilHinggaKe(7). Fungsi ini melakukan perulangan dari angka 1 hingga 7 dan mencetak setiap angkanya secara berurutan, sehingga output akhir yang muncul adalah 1234567.
4. Fungsi harus menggunakan parameter pada saat fungsi membutuhkan data dari luar agar bisa menjalankan tugasnya dan fungsi tidak perlu parameter pada saat semua data yang dibutuhkan sudah tersedia di dalam fungsi itu sendiri, bukan berasal dari luar

Fungsi harus memiliki nilai kembalian pada saat hasil dari fungsi itu masih dibutuhkan oleh bagian program lain, misalnya untuk disimpan ke variabel, dihitung lagi, atau dipakai di proses berikutnya dan fungsi tidak perlu nilai kembalian (menggunakan void) pada saat fungsi hanya melakukan aksi, bukan menghasilkan nilai.
5. hitungLuas() memakai parameter → karena perlu panjang dan lebar dari pengguna.
hitungVolume() memakai parameter → karena perlu tinggi, panjang, dan lebar yang juga ditentukan oleh pengguna.
Fungsi boleh tanpa parameter jika semua data yang dibutuhkan sudah tersedia di dalam fungsi, atau jika fungsi hanya melakukan aksi tanpa membutuhkan input apa pun, namun di percobaan 5 tidak ada fungsi parameter.
6. ketika fungsi tersebut menghasilkan suatu nilai yang masih diperlukan oleh bagian program lain untuk proses berikutnya. Fungsi ini menghasilkan nilai luas, dan nilai tersebut dibutuhkan kembali oleh main untuk ditampilkan, serta digunakan lagi oleh fungsi hitungVolume.
Fungsi tidak perlu nilai kembalian (gunakan void) ketika fungsi hanya melakukan aksi, misalnya menampilkan teks, membaca input, atau sekadar menjalankan proses, tanpa harus menghasilkan nilai untuk dipakai di luar fungsi.

