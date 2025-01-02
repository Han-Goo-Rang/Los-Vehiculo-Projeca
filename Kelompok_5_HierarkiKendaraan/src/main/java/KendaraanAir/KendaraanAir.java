/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package KendaraanAir;
import com.lgcns.mission.management.kelompok_5_hierarkikendaraan.Kendaraan;

/**
 *
 * @author HUAWEI
 */
public abstract class KendaraanAir extends Kendaraan {
    protected String bahanLambung;
    protected String tipePenggerak;

    public KendaraanAir(String nama, String warna, String bahanLambung, String tipePenggerak) {
        super(nama, warna);
        this.bahanLambung = bahanLambung;
        this.tipePenggerak = tipePenggerak;
    }

    // Getter
    public String getBahanLambung() {
        return bahanLambung;
    }

    public String getTipePenggerak() {
        return tipePenggerak;
    }

    // toString Method
    @Override
    public String toString() {
        return super.toString() + ", Bahan Lambung: " + bahanLambung + ", Tipe Penggerak: " + tipePenggerak;
    }

    // Metode abstrak untuk menampilkan deskripsi kendaraan
    @Override
    public abstract void tampilkanDetail();
}
