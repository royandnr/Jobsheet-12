Jawaban Percobaan 4

1. String... namaPengunjung digunakan agar method dapat menerima jumlah parameter String yang tidak terbatas, sehingga memudahkan saat memanggilnya.
2. done
3. Tidak bisa menggunakan dua varargs dalam satu fungsi, bolehnya satu varargs, dan harus menjadi parameter terakhir.
contoh salah:
void contoh(String... nama, int... usia) { } 
// ada 2 varargs

contoh benar:
void contoh(String pesan, int... angka) { } 
// hanya ada 1 varargs dan harus di taruh di parameter yang akhir klo di taruhh di depan salah, alasannya karena varargs bisa menerima jumlah argumen tak terbatas, Java tidak bisa tahu kapan varargs berakhir dan kapan argumen berikutnya dimulai
4. Tidak ada error kompilasi maupun error saat dijalankan. Ini karena varargs (String...) memperbolehkan jumlah argumen 0, 1, atau lebih. outputnya hanya "daftar nama pengunjung: " tidak ada daftar nama setelahnya karena arraynya kosong

