/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package KendaraanDarat;

/**
 *
 * @author acer nitro
 */
public class Motor extends KendaraanDarat{
    private String merekMotor;
    private double asuransi;
    
    public Motor(String nama, String warna, String merekMotor, double asuransi, String jenisKendaraan, String jenisPenggerak){
        super (nama, warna, jenisKendaraan, jenisPenggerak);
        this.merekMotor = merekMotor;
        this. asuransi = asuransi;
    }
    
    public double jarakMaksimal(){
        return 1;
    }
    
    public void menyetir(){
        System.out.println("Sedang menyetir");
    }
    
    public void mengerem(){
        System.out.println("Tidak mengerem");
    }
}
