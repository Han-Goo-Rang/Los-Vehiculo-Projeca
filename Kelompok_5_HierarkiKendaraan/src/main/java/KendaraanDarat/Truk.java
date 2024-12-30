package KendaraanDarat;

// Hisyam
public class Truk extends KendaraanDarat {
    private String merekTruk;
    private double asuransi;
    private int kapasitasKargo;
    private double jarakMaksimal;

    public Truk(String nama, String warna, String jenisKendaraan, String jenisPenggerak, String merekTruk, double asuransi, int kapasitasKargo, double jarakMaksimal) {
        super(nama, warna, jenisKendaraan, jenisPenggerak);
        this.merekTruk = merekTruk;
        this.asuransi = asuransi;
        this.kapasitasKargo = kapasitasKargo;
        this.jarakMaksimal = jarakMaksimal;
    }

    public String getMerekTruk() {
        return merekTruk;
    }

    public double getAsuransi() {
        return asuransi;
    }

    public int getKapasitasKargo() {
        return kapasitasKargo;
    }

    public double getJarakMaksimal() {
        return jarakMaksimal;
    }

    public void memuatKargo() {
        System.out.println("Truk " + merekTruk + " sedang memuat kargo.");
    }
}

