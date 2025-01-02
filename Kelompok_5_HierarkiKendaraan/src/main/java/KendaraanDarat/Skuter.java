package KendaraanDarat;

public class Skuter extends KendaraanDarat {
    private String merekSkuter;
    private double asuransi;

    public Skuter(String nama, String warna, String jenisKendaraan, String jenisPenggerak, String merekSkuter, double asuransi) {
        super(nama, warna, jenisKendaraan, jenisPenggerak);
        this.merekSkuter = merekSkuter;
        this.asuransi = asuransi;
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
        System.out.println("| Merek Skuter        | " + merekSkuter + "        |");
        System.out.println("| Asuransi            | " + asuransi + "          |");
        System.out.println("+----------------------+--------------------+");
    }
}
