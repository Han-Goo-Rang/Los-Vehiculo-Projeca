/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package KendaraanUdara;
import com.lgcns.mission.management.kelompok_5_hierarkikendaraan.Kendaraan;
/**
 *
 * @author VIP
 */

public class KendaraanUdara extends Kendaraan{
    private int kapasitasPenumpang;
    private String bahanBody;
    
    public KendaraanUdara(String nama, String warna, int kapasitasPenumpang, String bahanBody){
    super(nama, warna);
    this.kapasitasPenumpang = kapasitasPenumpang;
    this.bahanBody = bahanBody;
    }
    
    public int getKapasitasPenumpang(){
    return kapasitasPenumpang;
    }
    
    public String getBahanBody(){
    return bahanBody;
    }
    
    @Override
    public String toString(){
        return "Nama kendaraan: " + getNama() + "\n Warna Kendaraan: " + 
                getWarna() + "\n Kapasitas Penumpang: " + getKapasitasPenumpang() + "\n Bahan Body: " + getBahanBody();
    }
}
