/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package KendaraanUdara;

/**
 *
 * @author VIP
 */
public class BalonUdara extends KendaraanUdara{
    private int jumlahTabungGas;
    private String merk;
    
    public BalonUdara(String nama, String warna, int kapasitasPenumpang, String bahanBody, int jumlahTabungGas, String merk){
    super(nama, warna, kapasitasPenumpang, bahanBody);
    }
    
    public int getJumlahTabungGas(){
    return jumlahTabungGas;
    }
    
    public String getMerk(){
    return merk;
    }
    
    @Override
    public String toString(){
        return "Nama kendaraan: " + getNama() + "\n Warna Kendaraan: " + 
                getWarna() + "\n Kapasitas Penumpang: " + getKapasitasPenumpang() + "\n Bahan Body: " 
                + getBahanBody() + "\n Jumlah Tabung Gas: " + getJumlahTabungGas() + "\n Merk: " + getMerk();
    }
}
