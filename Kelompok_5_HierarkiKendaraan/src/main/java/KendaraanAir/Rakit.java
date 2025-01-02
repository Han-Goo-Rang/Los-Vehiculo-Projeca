/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package KendaraanAir;

/**
 *
 * @author HUAWEI
 */
public class Rakit extends KendaraanAir {
    private int jumlahPendorong;

    public Rakit(String nama, String warna, String bahanLambung, String tipePenggerak, int jumlahPendorong) {
        super(nama, warna, bahanLambung, tipePenggerak);
        this.jumlahPendorong = jumlahPendorong;
    }

    // Getter
    public int getJumlahPendorong() {
        return jumlahPendorong;
    }

    // Total pendorong
    public int totalPendorong() {
        return jumlahPendorong;
    }

    // Deskripsi
    @Override
    public void tampilkanDetail() {
    System.out.println("+---------------------------------------------------------------+");
    System.out.println("|                       Rakit Details                          |");
    System.out.println("+---------------------------------------------------------------+");
    System.out.printf("| %-25s | %-15s |\n", "Nama", getNama());
    System.out.printf("| %-25s | %-15s |\n", "Warna", getWarna());
    System.out.printf("| %-25s | %-15s |\n", "Bahan Lambung", getBahanLambung());
    System.out.printf("| %-25s | %-15s |\n", "Tipe Penggerak", getTipePenggerak());
    System.out.printf("| %-25s | %-15d |\n", "Jumlah Pendorong", jumlahPendorong);
    System.out.println("+---------------------------------------------------------------+");
}

}

