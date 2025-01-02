/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package KendaraanAir;

/**
 *
 * @author HUAWEI
 */
public class Sampan extends KendaraanAir {
    private int penumpang;

    public Sampan(String nama, String warna, String bahanLambung, String tipePenggerak, int penumpang) {
        super(nama, warna, bahanLambung, tipePenggerak);
        this.penumpang = penumpang;
    }

    // Getter
    public int getPenumpang() {
        return penumpang;
    }

    // Kapasitas Penumpang
    public int kapasitasPenumpang() {
        return penumpang;
    }

    // Deskripsi
    @Override
    public void tampilkanDetail() {
    System.out.println("+---------------------------------------------------------------+");
    System.out.println("|                       Sampan Details                         |");
    System.out.println("+---------------------------------------------------------------+");
    System.out.printf("| %-25s | %-15s |\n", "Nama", getNama());
    System.out.printf("| %-25s | %-15s |\n", "Warna", getWarna());
    System.out.printf("| %-25s | %-15s |\n", "Bahan Lambung", getBahanLambung());
    System.out.printf("| %-25s | %-15s |\n", "Tipe Penggerak", getTipePenggerak());
    System.out.printf("| %-25s | %-15d |\n", "Kapasitas Penumpang", penumpang);
    System.out.println("+---------------------------------------------------------------+");
    }
}
