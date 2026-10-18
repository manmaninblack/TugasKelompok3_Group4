package playlist;
//Tugas Kelompok ke-3
//Week 8
//Group - 4
//Amelia Rizqi Fadila - 2902824546
//Rismanto - 2902811940
//Primaaditya Redyananda - 2902814450
//Putri Puspita Kartini Rahman - 2902820314

public class PlaylistRekursif {
    static Lagu[] playlist;
    /*
     * Menghitung total durasi seluruh lagu dalam playlist
     * menggunakan rekursi.
     *
     * Base case:
     * Jika n == 0, tidak ada lagu yang dihitung,
     * fungsi mengembalikan 0.
     *
     * Recursive case:
     * Ambil durasi lagu ke-n (list[n - 1]), lalu tambahkan
     * dengan totalDurasi(list, n - 1) untuk lagu-lagu sebelumnya.
     *
     * Kompleksitas waktu: O(n)
     * Kompleksitas ruang: O(n)
     */


    static double totalDurasi(Lagu[] list, int n) {
        if (n == 0) {
            return 0;
        }
        return list[n - 1].getDurasi() + totalDurasi(list, n - 1);
    }


    /*
     * Menampilkan daftar lagu secara terbalik (reverse traversal)
     * menggunakan rekursi, dari lagu terakhir sampai lagu pertama.
     *
     * Base case:
     * Jika index < 0, tidak ada lagu lagi yang ditampilkan,
     * fungsi berhenti (return).
     *
     * Recursive case:
     * Tampilkan lagu pada posisi index, lalu panggil
     * tampilkanMundur(list, index - 1) untuk lagu sebelumnya.
     *
     * Kompleksitas waktu: O(n)
     * Kompleksitas ruang: O(n)
     */
    static void tampilkanMundur(Lagu[] list, int index) {
        if (index < 0) {
            return;
        }
        System.out.println((index + 1) + ". " + list[index].getJudul());
        tampilkanMundur(list, index - 1);
    }


    /*
     * Mencari durasi lagu terpanjang menggunakan rekursi.
     *
     * Base case:
     * Jika index == 0, kembalikan durasi lagu pertama.
     *
     * Recursive case:
     * Cari durasi terpanjang dari elemen sebelumnya,
     * kemudian bandingkan dengan durasi lagu saat ini.
     *
     * Kompleksitas waktu: O(n)
     * Kompleksitas ruang: O(n)
     */
    static double cariDurasiTerpanjang(Lagu[] list, int index) {
        if (index == 0) {
            return list[0].getDurasi();
        }


        double durasiSebelumnya =
                cariDurasiTerpanjang(list, index - 1);


        if (list[index].getDurasi() > durasiSebelumnya) {
            return list[index].getDurasi();
        }


        return durasiSebelumnya;
    }


    /*
     * Mencari objek Lagu dengan durasi terpanjang.
     * Fungsi ini menggunakan hasil cariDurasiTerpanjang()
     * untuk menentukan durasi maksimum, lalu mencari objeknya.
     *
     * Kompleksitas waktu: O(n)
     */
    static Lagu cariLaguTerpanjang(Lagu[] list, int jumlahLagu) {
        if (jumlahLagu == 0) {
            return null;
        }


        double durasiMaksimum =
                cariDurasiTerpanjang(list, jumlahLagu - 1);


        for (int i = 0; i < jumlahLagu; i++) {
            if (list[i].getDurasi() == durasiMaksimum) {
                return list[i];
            }
        }


        return null;
    }


    public static void main(String[] args) {
        playlist = new Lagu[10];
        playlist[0] = new Lagu("Perfect", "Ed Sheeran", 3.50);
        playlist[1] = new Lagu("Shivers", "Ed Sheeran", 3.80);
        playlist[2] = new Lagu("Fix You", "Coldplay", 4.15);
        playlist[3] = new Lagu("Yellow", "Coldplay", 4.38);
        playlist[4] = new Lagu("Viva La Vida", "Coldplay", 4.52);
        playlist[5] = new Lagu("Photograph", "Ed Sheeran", 4.18);
        playlist[6] = new Lagu("Bad Habits", "Ed Sheeran", 3.51);
        playlist[7] = new Lagu("The Scientist", "Coldplay", 5.09);
        playlist[8] = new Lagu("Thinking Out Loud", "Ed Sheeran", 4.41);
        playlist[9] = new Lagu("Paradise", "Coldplay", 4.38);


        int jumlahLagu = playlist.length;


        System.out.println("=== ANALISIS REKURSIF PLAYLIST ===");
        System.out.println("Jumlah lagu : " + jumlahLagu);


        long s1 = System.nanoTime();
        double total = totalDurasi(playlist, jumlahLagu);
        long e1 = System.nanoTime();
        long t1 = (e1 - s1) / 1_000_000;
        System.out.println("Total durasi : " + String.format("%.2f", total) + " menit");


        long s2 = System.nanoTime();
        Lagu laguTerpanjang = cariLaguTerpanjang(playlist, playlist.length);
        long e2 = System.nanoTime();
        long t2 = (e2 - s2) / 1_000_000;


        if (laguTerpanjang != null) {
            System.out.println("Lagu terpanjang: " + laguTerpanjang.getJudul());
            System.out.println("Artis: " + laguTerpanjang.getArtis());
            System.out.printf("Durasi: %.2f menit%n", laguTerpanjang.getDurasi());
        }


        System.out.println();
        System.out.println("Daftar lagu (ditampilkan terbalik):");
        long s3 = System.nanoTime();
        tampilkanMundur(playlist, jumlahLagu - 1);
        long e3 = System.nanoTime();
        long t3 = (e3 - s3) / 1_000_000;
        System.out.println();


        System.out.println("Execution Time (totalDurasi): " + t1 + " ms");
        System.out.println("Execution Time (tampilkanMundur): " + t3 + " ms");
        System.out.println("Execution Time (cariDurasiTerpanjang): " + t2 + " ms");
    }
}

