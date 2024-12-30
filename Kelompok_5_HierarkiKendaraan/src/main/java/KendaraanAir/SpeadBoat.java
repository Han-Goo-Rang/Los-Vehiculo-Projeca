/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package KendaraanAir;

/**
 *
 * @author HUAWEI
 */

class SpeedBoat extends KendaraanAir {
    private int kapasitasMesin;
    private double kecepatan;

    public SpeedBoat(String nama, String warna, String bahanLambung, String tipePenggerak, int kapasitasMesin, double kecepatan) {
        super(nama, warna, bahanLambung, tipePenggerak);
        this.kapasitasMesin = kapasitasMesin;
        this.kecepatan = kecepatan;
    }

    public int totalMesin() {
        return kapasitasMesin;
    }

    public double hitungKecepatan() {
        return kecepatan;
    }
}
