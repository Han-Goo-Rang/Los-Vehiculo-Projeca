/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package KendaraanAir;

/**
 *
 * @author HUAWEI
 */
public class KapalLayar extends KendaraanAir {
    private int jumlahLayar;

    public KapalLayar(String nama, String warna, String bahanLambung, String tipePenggerak, int jumlahLayar) {
        super(nama, warna, bahanLambung, tipePenggerak);
        this.jumlahLayar = jumlahLayar;
    }

    // Getter
    public int getJumlahLayar() {
        return jumlahLayar;
    }

    // Deskripsi
    @Override
    public void tampilkanDetail() {
    System.out.println("+---------------------------------------------------------------+");
    System.out.println("|                    Kapal Layar Details                       |");
    System.out.println("+---------------------------------------------------------------+");
    System.out.printf("| %-25s | %-15s |\n", "Nama", getNama());
    System.out.printf("| %-25s | %-15s |\n", "Warna", getWarna());
    System.out.printf("| %-25s | %-15s |\n", "Bahan Lambung", getBahanLambung());
    System.out.printf("| %-25s | %-15s |\n", "Tipe Penggerak", getTipePenggerak());
    System.out.printf("| %-25s | %-15d |\n", "Jumlah Layar", jumlahLayar);
    System.out.println("+---------------------------------------------------------------+");
}

}

