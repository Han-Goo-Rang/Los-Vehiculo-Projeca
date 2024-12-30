/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package KendaraanUdara;

/**
 *
 * @author VIP
 */
public class PesawatBoeing extends KendaraanUdara{
    private double kecepatan;
    private String modelPesawat;
    
    public PesawatBoeing (String nama, String warna, int kapasitasPenumpang, String bahanBody, double kecepatan, String modelPesawat){
    super(nama, warna, kapasitasPenumpang, bahanBody);
    this.kecepatan = kecepatan;
    this.modelPesawat = modelPesawat;
    }
    
    public double getKecepatan(){
    return kecepatan;
    }
    
    public String getModelPesawat(){
    return modelPesawat;
    }
    
    @Override
    public String toString(){
        return "Nama kendaraan: " + getNama() + "\n Warna Kendaraan: " + 
                getWarna() + "\n Kapasitas Penumpang: " + getKapasitasPenumpang() + "\n Bahan Body: " 
                + getBahanBody() + "\n Kecepatan maksimum: " + getKecepatan() + "\n Model Pesawat: " + getModelPesawat();
    }
}
