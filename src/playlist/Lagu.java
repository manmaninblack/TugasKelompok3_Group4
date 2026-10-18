
package playlist;
//Tugas Kelompok ke-3
//Week 8
//Group - 4
//Amelia Rizqi Fadila - 2902824546
//Rismanto - 2902811940
//Primaaditya Redyananda - 2902814450
//Putri Puspita Kartini Rahman - 2902820314

public class Lagu {
    private String judul;
    private String artis;
    private double durasi;

    public Lagu(String judul, String artis, double durasi) {
        this.judul = judul;
        this.artis = artis;
        this.durasi = durasi;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getArtis() {
        return artis;
    }

    public void setArtis(String artis) {
        this.artis = artis;
    }

    public double getDurasi() {
        return durasi;
    }

    public void setDurasi(double durasi) {
        this.durasi = durasi;
    }

    public void tampilkanInfo() {
        System.out.println("Judul : " + judul);
        System.out.println("Artis : " + artis);
        System.out.printf("Durasi : %.2f menit%n", durasi);
    }
}
