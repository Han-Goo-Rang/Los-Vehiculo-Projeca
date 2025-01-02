package KendaraanUdara;

public class PesawatKargo extends KendaraanUdara {
    private String modelPesawat;
    private double kapasitasKargo;

    public PesawatKargo(String nama, String warna, int kapasitasPenumpang, String bahanBody, String modelPesawat, double kapasitasKargo) {
        super(nama, warna, kapasitasPenumpang, bahanBody);
        this.modelPesawat = modelPesawat;
        this.kapasitasKargo = kapasitasKargo;
    }

    public String getModelPesawat() {
        return modelPesawat;
    }

    public double getKapasitasKargo() {
        return kapasitasKargo;
    }

    @Override
    public void tampilkanDetail() {
        System.out.println("+----------------------+--------------------+");
        System.out.println("| Atribut             | Nilai              |");
        System.out.println("+----------------------+--------------------+");
        System.out.println("| Nama Kendaraan      | " + getNama() + "           |");
        System.out.println("| Warna               | " + getWarna() + "          |");
        System.out.println("| Kapasitas Penumpang | " + getKapasitasPenumpang() + "              |");
        System.out.println("| Bahan Body          | " + getBahanBody() + "          |");
        System.out.println("| Model Pesawat       | " + modelPesawat + "       |");
        System.out.println("| Kapasitas Kargo     | " + kapasitasKargo + " kg         |");
        System.out.println("+----------------------+--------------------+");
    }
}
