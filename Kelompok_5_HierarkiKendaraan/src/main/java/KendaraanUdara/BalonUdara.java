package KendaraanUdara;

public class BalonUdara extends KendaraanUdara {
    private int jumlahTabungGas;
    private String merk;

    public BalonUdara(String nama, String warna, int kapasitasPenumpang, String bahanBody, 
                      int jumlahTabungGas, String merk) {
        super(nama, warna, kapasitasPenumpang, bahanBody);
        this.jumlahTabungGas = jumlahTabungGas;
        this.merk = merk;
    }

    public int getJumlahTabungGas() {
        return jumlahTabungGas;
    }

    public String getMerk() {
        return merk;
    }

    public double posisiKetinggian() {
        // Contoh perhitungan posisi ketinggian berdasarkan jumlah tabung gas
        return jumlahTabungGas * 100.0; // Asumsi setiap tabung gas menghasilkan 100 meter ketinggian
    }

    @Override
    public void tampilkanDetail() {
        System.out.println("+----------------------+--------------------+");
        System.out.println("| Atribut             | Nilai              |");
        System.out.println("+----------------------+--------------------+");
        System.out.println("| Nama Kendaraan      | " + getNama() + "            |");
        System.out.println("| Warna               | " + getWarna() + "          |");
        System.out.println("| Kapasitas Penumpang | " + getKapasitasPenumpang() + "                |");
        System.out.println("| Bahan Body          | " + getBahanBody() + "      |");
        System.out.println("| Jumlah Tabung Gas   | " + jumlahTabungGas + "              |");
        System.out.println("| Merk                | " + merk + "           |");
        System.out.println("| Posisi Ketinggian   | " + posisiKetinggian() + " meter    |");
        System.out.println("+----------------------+--------------------+");
    }
}
