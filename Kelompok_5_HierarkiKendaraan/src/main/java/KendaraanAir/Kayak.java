/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package KendaraanAir;

/**
 *
 * @author HUAWEI
 */
class Kayak extends KendaraanAir {
    private int jumlahDayung;

    public Kayak(String nama, String warna, String bahanLambung, String tipePenggerak, int jumlahDayung) {
        super(nama, warna, bahanLambung, tipePenggerak);
        this.jumlahDayung = jumlahDayung;
    }

    public int kapasitasPenumpang() {
        return 1; // Example value
    }

    public int totalPendayung() {
        return jumlahDayung;
    }
}
