package KendaraanDarat;

public class Motor extends KendaraanDarat {
    private String merekMotor;
    private double asuransi;

    public Motor(String nama, String warna, String jenisKendaraan, String jenisPenggerak, String merekMotor, double asuransi) {
        super(nama, warna, jenisKendaraan, jenisPenggerak);
        this.merekMotor = merekMotor;
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
        System.out.println("| Merek Motor         | " + merekMotor + "         |");
        System.out.println("| Asuransi            | " + asuransi + "          |");
        System.out.println("+----------------------+--------------------+");
    }
}
