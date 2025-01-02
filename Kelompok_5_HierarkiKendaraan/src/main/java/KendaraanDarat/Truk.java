package KendaraanDarat;

public class Truk extends KendaraanDarat {
    private String merekTruk;
    private double asuransi;
    private int kapasitasKargo;

    public Truk(String nama, String warna, String jenisKendaraan, String jenisPenggerak, String merekTruk, double asuransi, int kapasitasKargo) {
        super(nama, warna, jenisKendaraan, jenisPenggerak);
        this.merekTruk = merekTruk;
        this.asuransi = asuransi;
        this.kapasitasKargo = kapasitasKargo;
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
        System.out.println("| Merek Truk          | " + merekTruk + "         |");
        System.out.println("| Kapasitas Kargo     | " + kapasitasKargo + "     |");
        System.out.println("| Asuransi            | " + asuransi + "          |");
        System.out.println("+----------------------+--------------------+");
    }

    public String getMerkTruk() {
        return merekTruk;
    }

    public double getAsuransi() {
        return asuransi;
    }

    public int getKapasitasKargo() {
        return kapasitasKargo;
    }

    public void memuatKargo() {
        System.out.println("Truk dapat memuat total bawaan seberat" + kapasitasKargo + " ton");
    }

    public void jarakMaksimal() {
        System.out.println("Jarak tempuhnya adalah 20.000 km");
    }
}
