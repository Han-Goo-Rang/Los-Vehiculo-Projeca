package KendaraanDarat;

public class Sepeda extends KendaraanDarat {
    private String merekSepeda;

    public Sepeda(String nama, String warna, String jenisKendaraan, String jenisPenggerak, String merekSepeda) {
        super(nama, warna, jenisKendaraan, jenisPenggerak);
        this.merekSepeda = merekSepeda;
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
        System.out.println("| Merek Sepeda        | " + merekSepeda + "        |");
        System.out.println("+----------------------+--------------------+");
    }
}
