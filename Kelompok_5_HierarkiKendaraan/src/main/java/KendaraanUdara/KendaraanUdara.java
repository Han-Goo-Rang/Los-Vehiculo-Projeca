package KendaraanUdara;

import com.lgcns.mission.management.kelompok_5_hierarkikendaraan.Kendaraan;

public abstract class KendaraanUdara extends Kendaraan {
    private int kapasitasPenumpang;
    private String bahanBody;

    public KendaraanUdara(String nama, String warna, int kapasitasPenumpang, String bahanBody) {
        super(nama, warna);
        this.kapasitasPenumpang = kapasitasPenumpang;
        this.bahanBody = bahanBody;
    }

    public int getKapasitasPenumpang() {
        return kapasitasPenumpang;
    }

    public String getBahanBody() {
        return bahanBody;
    }

    @Override
    public String toString() {
        return super.toString() + ", Kapasitas Penumpang: " + kapasitasPenumpang + ", Bahan Body: " + bahanBody;
    }

    // Abstract method to be implemented by subclasses
    @Override
    public abstract void tampilkanDetail();
}
