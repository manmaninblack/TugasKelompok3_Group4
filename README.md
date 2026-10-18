### Mata Kuliah
Data Structures and Algorithm Analysis (DSAA)
# Tugas Kelompok 3 — Group 4

Amelia Rizqi Fadila - 2902824546
Rismanto - 2902811940
Primaaditya Redyananda - 2902814450
Putri Puspita Kartini Rahman - 2902820314

## Playlist Rekursif

Repository ini berisi project Java untuk tugas Data Structures and Algorithm Analysis (DSAA), dengan implementasi fungsi rekursif untuk memproses playlist lagu.

### Fitur

- Menghitung total durasi seluruh lagu menggunakan `totalDurasi()`.
- Menampilkan daftar lagu dalam urutan terbalik menggunakan `tampilkanMundur()`.
- Menentukan durasi lagu terpanjang menggunakan `cariDurasiTerpanjang()`.
- Mengukur waktu eksekusi fungsi menggunakan `System.nanoTime()`.

### Struktur Program

- `src/playlist/Lagu.java` — class untuk menyimpan data lagu, meliputi judul, artis, dan durasi.
- `src/playlist/PlaylistRekursif.java` — class utama yang berisi fungsi rekursif dan method `main()` untuk menjalankan pengujian.

### Persyaratan

- Java Development Kit (JDK)
- Eclipse IDE atau IDE Java lain

### Cara Menjalankan di Eclipse

1. Clone atau download repository ini.
2. Buka Eclipse.
3. Pilih **File → Import → General → Existing Projects into Workspace**.
4. Pilih folder project hasil clone/download.
5. Buka `src/playlist/PlaylistRekursif.java`.
6. Jalankan dengan **Run As → Java Application**.

### Pengujian

Program diuji dengan variasi jumlah data playlist sebanyak 3, 5, dan 10 lagu. Hasil yang diamati meliputi total durasi, lagu dengan durasi terpanjang, tampilan lagu secara terbalik, dan waktu eksekusi fungsi.

> Catatan: waktu eksekusi dapat berbeda pada setiap komputer dan setiap kali program dijalankan. Pengukuran yang sangat singkat dapat tercatat sebagai `0 ms` karena hasil dikonversi ke milidetik.



