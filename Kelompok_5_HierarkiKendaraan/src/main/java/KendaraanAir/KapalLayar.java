/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package KendaraanAir;

/**
 *
 * @author HUAWEI
 */
class KapalLayar extends KendaraanAir {
    private int jumlahLayar;

    public KapalLayar(String nama, String warna, String bahanLambung, String tipePenggerak, int jumlahLayar) {
        super(nama, warna, bahanLambung, tipePenggerak);
        this.jumlahLayar = jumlahLayar;
    }

    public String desc() {
        return "Nama: " + getNama() + ", Warna: " + getWarna() + ", Bahan Lambung: " + getBahanLambung() + ", Tipe Penggerak: " + getTipePenggerak() + ", Jumlah Layar: " + jumlahLayar;
    }
}

