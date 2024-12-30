package KendaraanDarat;

public class Mobil extends KendaraanDarat {
    private String merekMobil;
    private double asuransi;
    private double jarakMaksimal;

    public Mobil(String nama, String warna, String jenisKendaraan, String jenisPenggerak, String merekMobil, double asuransi, double jarakMaksimal) {
        super(nama, warna, jenisKendaraan, jenisPenggerak);
        this.merekMobil = merekMobil;
        this.asuransi = asuransi;
        this.jarakMaksimal = jarakMaksimal;
    }

    public String getMerekMobil() {
        return merekMobil;
    }

    public double getAsuransi() {
        return asuransi;
    }

    public double getJarakMaksimal() {
        return jarakMaksimal;
    }

    public void mengemudi() {
        System.out.println("Mobil " + merekMobil + " sedang dikemudikan.");
    }
}
