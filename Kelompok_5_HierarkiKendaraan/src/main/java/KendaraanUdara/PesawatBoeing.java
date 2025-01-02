package KendaraanUdara;

/**
 * Class PesawatBoeing sebagai subclass dari KendaraanUdara
 */
public class PesawatBoeing extends KendaraanUdara {
    private double kecepatan;
    private String modelPesawat;

    public PesawatBoeing(String nama, String warna, int kapasitasPenumpang, String bahanBody, 
                         double kecepatan, String modelPesawat) {
        super(nama, warna, kapasitasPenumpang, bahanBody);
        this.kecepatan = kecepatan;
        this.modelPesawat = modelPesawat;
    }

    public double menimbangBerat() {
        // Contoh perhitungan berat (misalnya kapasitas penumpang * 80 kg)
        return getKapasitasPenumpang() * 80.0;
    }

    public int melayangSetinggi() {
        // Contoh: ketinggian berdasarkan kecepatan (misalnya setiap 100 km/jam = 500 m ketinggian)
        return (int) (kecepatan / 100.0 * 500);
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
        System.out.println("| Model Pesawat       | " + modelPesawat + "         |");
        System.out.println("| Kecepatan           | " + kecepatan + " km/jam    |");
        System.out.println("| Berat Tertimbang    | " + menimbangBerat() + " kg |");
        System.out.println("| Ketinggian Maksimum | " + melayangSetinggi() + " meter    |");
        System.out.println("+----------------------+--------------------+");
    }
}
