/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package KendaraanAir;

/**
 *
 * @author HUAWEI
 */

class Sampan extends KendaraanAir {
    private int jumlahPenumpang;

    public Sampan(String nama, String warna, String bahanLambung, String tipePenggerak, int jumlahPenumpang) {
        super(nama, warna, bahanLambung, tipePenggerak);
        this.jumlahPenumpang = jumlahPenumpang;
    }

    public int kapasitasPenumpang() {
        return jumlahPenumpang;
    }
}