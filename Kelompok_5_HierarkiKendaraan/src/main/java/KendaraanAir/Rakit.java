/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package KendaraanAir;

/**
 *
 * @author HUAWEI
 */
class Rakit extends KendaraanAir {
    private int jumlahPendorong;

    public Rakit(String nama, String warna, String bahanLambung, String tipePenggerak, int jumlahPendorong) {
        super(nama, warna, bahanLambung, tipePenggerak);
        this.jumlahPendorong = jumlahPendorong;
    }

    public int totalPendorong() {
        return jumlahPendorong;
    }
}
