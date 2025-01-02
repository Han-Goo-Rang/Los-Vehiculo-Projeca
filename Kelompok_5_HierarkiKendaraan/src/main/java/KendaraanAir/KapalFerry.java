package KendaraanAir;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author HUAWEI
 */
public class KapalFerry extends KendaraanAir {
    private int kapasitasMesin;

    public KapalFerry(String nama, String warna, String bahanLambung, String tipePenggerak, int kapasitasMesin) {
        super(nama, warna, bahanLambung, tipePenggerak);
        this.kapasitasMesin = kapasitasMesin;
    }

    // Getter
    public int getKapasitasMesin() {
        return kapasitasMesin;
    }

    // Deskripsi
    @Override
    public void tampilkanDetail() {
    System.out.println("+---------------------------------------------------------------+");
    System.out.println("|                    Kapal Ferry Details                       |");
    System.out.println("+---------------------------------------------------------------+");
    System.out.printf("| %-25s | %-15s |\n", "Nama", getNama());
    System.out.printf("| %-25s | %-15s |\n", "Warna", getWarna());
    System.out.printf("| %-25s | %-15s |\n", "Bahan Lambung", getBahanLambung());
    System.out.printf("| %-25s | %-15s |\n", "Tipe Penggerak", getTipePenggerak());
    System.out.printf("| %-25s | %-15d |\n", "Kapasitas Mesin", kapasitasMesin);
    System.out.println("+---------------------------------------------------------------+");
}

}


