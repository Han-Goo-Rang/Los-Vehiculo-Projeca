/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package KendaraanUdara;

/**
 *
 * @author VIP
 */
public class PesawatJet extends KendaraanUdara{
    private double kecepatan;
    private String modelJet;
    
    public PesawatJet(String nama, String warna, int kapasitasPenumpang, String bahanBody, double kecepatan, String modelJet){
    super(nama, warna, kapasitasPenumpang, bahanBody);
    this.kecepatan = kecepatan;
    this.modelJet = modelJet;
    }
    
    public double getKecepatan(){
    return kecepatan;
    }
    
    public String getModelJet(){
    return modelJet;
    }
    
    @Override
    public String toString(){
        return "Nama kendaraan: " + getNama() + "\n Warna Kendaraan: " + 
                getWarna() + "\n Kapasitas Penumpang: " + getKapasitasPenumpang() + "\n Bahan Body: " 
                + getBahanBody() + "\n Kecepatan maksimum: " + getKecepatan() + "\n Model Jet: " + getModelJet();
    }    
}
