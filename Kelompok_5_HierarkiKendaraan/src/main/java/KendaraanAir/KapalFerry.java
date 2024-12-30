package KendaraanAir;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author HUAWEI
 */
class KapalFerry extends KendaraanAir {
    private int kapasitasMesin;

    public KapalFerry(String nama, String warna, String bahanLambung, String tipePenggerak, int kapasitasMesin) {
        super(nama, warna, bahanLambung, tipePenggerak);
        this.kapasitasMesin = kapasitasMesin;
    }

    public String desc() {
        return "Nama: " + getNama() + ", Warna: " + getWarna() + ", Bahan Lambung: " + getBahanLambung() + ", Tipe Penggerak: " + getTipePenggerak() + ", Kapasitas Mesin: " + kapasitasMesin;
    }
}

