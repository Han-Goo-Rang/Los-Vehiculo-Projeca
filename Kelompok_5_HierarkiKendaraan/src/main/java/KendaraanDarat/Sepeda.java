package KendaraanDarat;
import com.lgcns.mission.management.kelompok_5_hierarkikendaraan.Kendaraan;

public class Sepeda extends Kendaraan {
    private String merekSepeda;
    private double asuransi;

    public Sepeda(String nama, String warna, String merekSepeda, double asuransi) {
        super(nama, warna);
        this.merekSepeda = merekSepeda;
        this.asuransi = asuransi;
    }

    public String getMerekSepeda() {
        return merekSepeda;
    }

    public double getAsuransi() {
        return asuransi;
    }

    public void mengayuh() {
        System.out.println("Sepeda " + merekSepeda + " sedang dikayuh.");
    }
}
