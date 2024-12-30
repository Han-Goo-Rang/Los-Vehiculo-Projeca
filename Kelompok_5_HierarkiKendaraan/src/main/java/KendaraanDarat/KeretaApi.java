/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package KendaraanDarat;

/**
 *
 * @author Kaka (diperbaiki Hisyam)
 */
public class KeretaApi extends KendaraanDarat {
    private String jenisKeretaApi;
    private double asuransi;
    private int kapasitasPenumpang;
    private double kecepatanMaksimal; // Menambahkan atribut kecepatan maksimal

    public KeretaApi(String nama, String warna, String jenisKendaraan, String jenisPenggerak, String jenisKeretaApi, double asuransi, int kapasitasPenumpang, double kecepatanMaksimal) {
        super(nama, warna, jenisKendaraan, jenisPenggerak);
        this.jenisKeretaApi = jenisKeretaApi;
        this.asuransi = asuransi;
        this.kapasitasPenumpang = kapasitasPenumpang;
        this.kecepatanMaksimal = kecepatanMaksimal;
    }

    // Getter untuk jenisKeretaApi
    public String getJenisKeretaApi() {
        return jenisKeretaApi;
    }

    // Getter untuk asuransi
    public double getAsuransi() {
        return asuransi;
    }

    // Getter untuk kapasitas penumpang
    public int getKapasitasPenumpang() {
        return kapasitasPenumpang;
    }

    // Getter untuk kecepatan maksimal
    public double getKecepatanMaksimal() {
        return kecepatanMaksimal;
    }

    // Metode untuk transportasi penumpang
    public void transportasiPenumpang() {
        System.out.println("Kereta Api " + jenisKeretaApi + " sedang mengangkut " + kapasitasPenumpang + " penumpang.");
    }
}
