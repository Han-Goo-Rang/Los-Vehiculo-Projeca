package KendaraanUdara;

public class Helikopter extends KendaraanUdara {
    private String namaHelikopter;
    private String warnaHelikopter;
    private int banyakBalingBaling;

    public Helikopter(String nama, String warna, int kapasitasPenumpang, String bahanBody, 
                      String namaHelikopter, String warnaHelikopter, int banyakBalingBaling) {
        super(nama, warna, kapasitasPenumpang, bahanBody);
        this.namaHelikopter = namaHelikopter;
        this.warnaHelikopter = warnaHelikopter;
        this.banyakBalingBaling = banyakBalingBaling;
    }

    public void melayang() {
        System.out.println("Helikopter " + namaHelikopter + " sedang melayang di udara.");
    }

    public void gerak() {
        System.out.println("Helikopter " + namaHelikopter + " bergerak menuju tujuan.");
    }

    @Override
    public void tampilkanDetail() {
        System.out.println("+----------------------+--------------------+");
        System.out.println("| Atribut             | Nilai              |");
        System.out.println("+----------------------+--------------------+");
        System.out.println("| Nama Kendaraan      | " + getNama() + "            |");
        System.out.println("| Warna               | " + getWarna() + "          |");
        System.out.println("| Kapasitas Penumpang | " + getKapasitasPenumpang() + "                |");
        System.out.println("| Bahan Body          | " + getBahanBody() + "      |");
        System.out.println("| Nama Helikopter     | " + namaHelikopter + "      |");
        System.out.println("| Warna Helikopter    | " + warnaHelikopter + "      |");
        System.out.println("| Banyak Baling-Baling| " + banyakBalingBaling + "              |");
        System.out.println("+----------------------+--------------------+");
    }
}
