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
public class KendaraanAir extends Kendaraan{
    private String bahanLambung;
    private String tipePenggerak;

    public KendaraanAir(String nama, String warna, String bahanLambung, String tipePenggerak) {
        super(nama, warna);
        this.bahanLambung = bahanLambung;
        this.tipePenggerak = tipePenggerak;
    }

    public String getBahanLambung() {
        return bahanLambung;
    }

    public String getTipePenggerak() {
        return tipePenggerak;
    }

    @Override
    public String toString() {
        return super.toString() + ", KendaraanAir [bahanLambung=" + bahanLambung + ", tipePenggerak=" + tipePenggerak + "]";
    }
}