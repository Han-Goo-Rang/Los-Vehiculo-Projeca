/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package KendaraanAir;

/**
 *
 * @author HUAWEI
 */
public class Kayak extends KendaraanAir {
    private int jumlahDayung;

    public Kayak(String nama, String warna, String bahanLambung, String tipePenggerak, int jumlahDayung) {
        super(nama, warna, bahanLambung, tipePenggerak);
        this.jumlahDayung = jumlahDayung;
    }

    // Getter
    public int getJumlahDayung() {
        return jumlahDayung;
    }

    // Kapasitas Penumpang
    public int kapasitasPenumpang() {
        return 2; // Kayak biasanya untuk 2 orang
    }

    // Total Pendayung
    public int totalPendayung() {
        return jumlahDayung;
    }

    // Deskripsi
    @Override
    public void tampilkanDetail() {
    System.out.println("+---------------------------------------------------------------+");
    System.out.println("|                       Kayak Details                          |");
    System.out.println("+---------------------------------------------------------------+");
    System.out.printf("| %-25s | %-15s |\n", "Nama", getNama());
    System.out.printf("| %-25s | %-15s |\n", "Warna", getWarna());
    System.out.printf("| %-25s | %-15s |\n", "Bahan Lambung", getBahanLambung());
    System.out.printf("| %-25s | %-15s |\n", "Tipe Penggerak", getTipePenggerak());
    System.out.printf("| %-25s | %-15d |\n", "Jumlah Dayung", jumlahDayung);
    System.out.println("+---------------------------------------------------------------+");
}

}

