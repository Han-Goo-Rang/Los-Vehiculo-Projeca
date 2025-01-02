/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package KendaraanAir;

/**
 *
 * @author HUAWEI
 */
public class SpeedBoat extends KendaraanAir {
    private int kapasitasMesin;
    private double kecepatan;

    public SpeedBoat(String nama, String warna, String bahanLambung, String tipePenggerak, int kapasitasMesin, double kecepatan) {
        super(nama, warna, bahanLambung, tipePenggerak);
        this.kapasitasMesin = kapasitasMesin;
        this.kecepatan = kecepatan;
    }

    // Getter
    public int getKapasitasMesin() {
        return kapasitasMesin;
    }

    public double getKecepatan() {
        return kecepatan;
    }

    // Total Mesin
    public int totalMesin() {
        return kapasitasMesin;
    }

    // Hitung Kecepatan
    public double hitungKecepatan() {
        return kecepatan;
    }

    // Deskripsi
    @Override
public void tampilkanDetail() {
    System.out.println("+---------------------------------------------------------------+");
    System.out.println("|                       Speed Boat Details                     |");
    System.out.println("+---------------------------------------------------------------+");
    System.out.printf("| %-25s | %-15s |\n", "Nama", getNama());
    System.out.printf("| %-25s | %-15s |\n", "Warna", getWarna());
    System.out.printf("| %-25s | %-15s |\n", "Bahan Lambung", getBahanLambung());
    System.out.printf("| %-25s | %-15s |\n", "Tipe Penggerak", getTipePenggerak());
    System.out.printf("| %-25s | %-15d HP |\n", "Kapasitas Mesin", kapasitasMesin);
    System.out.printf("| %-25s | %-15.2f km/h |\n", "Kecepatan", kecepatan); // Format diperbaiki
    System.out.println("+---------------------------------------------------------------+");
}

}

