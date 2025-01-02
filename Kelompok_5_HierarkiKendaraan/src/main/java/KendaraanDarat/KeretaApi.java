package KendaraanDarat;

public class KeretaApi extends KendaraanDarat {
    private String jenisKeretaApi;
    private double asuransi;
    private int kapasitasPenumpang;

    public KeretaApi(String nama, String warna, String jenisKendaraan, String jenisPenggerak, String jenisKeretaApi, double asuransi, int kapasitasPenumpang) {
        super(nama, warna, jenisKendaraan, jenisPenggerak);
        this.jenisKeretaApi = jenisKeretaApi;
        this.asuransi = asuransi;
        this.kapasitasPenumpang = kapasitasPenumpang;
    }

    public String getJenisKeretaApi() {
        return jenisKeretaApi;
    }

    public double getAsuransi() {
        return asuransi;
    }

    public int getKapasitasPenumpang() {
        return kapasitasPenumpang;
    }

    @Override
    public void tampilkanDetail() {
        System.out.println("+----------------------+--------------------+");
        System.out.println("| Atribut             | Nilai              |");
        System.out.println("+----------------------+--------------------+");
        System.out.println("| Nama Kendaraan      | " + getNama() + "        |");
        System.out.println("| Warna               | " + getWarna() + "        |");
        System.out.println("| Jenis Kendaraan     | " + getJenisKendaraan() + " |");
        System.out.println("| Jenis Penggerak     | " + getJenisPenggerak() + " |");
        System.out.println("| Jenis Kereta Api    | " + jenisKeretaApi + "    |");
        System.out.println("| Kapasitas Penumpang | " + kapasitasPenumpang + " |");
        System.out.println("| Asuransi            | " + asuransi + "         |");
        System.out.println("+----------------------+--------------------+");
    }
}
