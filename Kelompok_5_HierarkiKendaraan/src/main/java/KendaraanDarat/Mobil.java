package KendaraanDarat;

public class Mobil extends KendaraanDarat {
    private String merekMobil;
    private double asuransi;

    public Mobil(String nama, String warna, String jenisKendaraan, String jenisPenggerak, String merekMobil, double asuransi) {
        super(nama, warna, jenisKendaraan, jenisPenggerak);
        this.merekMobil = merekMobil;
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
        System.out.println("| Merek Mobil         | " + merekMobil + "         |");
        System.out.println("| Asuransi            | " + asuransi + "          |");
        System.out.println("+----------------------+--------------------+");
    }
}
