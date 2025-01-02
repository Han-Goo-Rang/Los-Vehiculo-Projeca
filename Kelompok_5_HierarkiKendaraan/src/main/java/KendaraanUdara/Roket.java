package KendaraanUdara;

public class Roket extends KendaraanUdara {
    private String namaRoket;
    private double lebar;
    private double tinggi;

    public Roket(String nama, String warna, int kapasitasPenumpang, String bahanBody, 
                 String namaRoket, double lebar, double tinggi) {
        super(nama, warna, kapasitasPenumpang, bahanBody);
        this.namaRoket = namaRoket;
        this.lebar = lebar;
        this.tinggi = tinggi;
    }

    public String getNamaRoket() {
        return namaRoket;
    }

    public double getLebar() {
        return lebar;
    }

    public double getTinggi() {
        return tinggi;
    }

    public void meluncur() {
        System.out.println("Roket " + namaRoket + " sedang meluncur.");
    }

    public void statusMonitor() {
        System.out.println("Memantau status roket: " + namaRoket);
    }

    @Override
    public void tampilkanDetail() {
        System.out.println("+----------------------+--------------------+");
        System.out.println("| Atribut             | Nilai              |");
        System.out.println("+----------------------+--------------------+");
        System.out.println("| Nama Kendaraan      | " + getNama() + "           |");
        System.out.println("| Warna               | " + getWarna() + "          |");
        System.out.println("| Kapasitas Penumpang | " + getKapasitasPenumpang() + "              |");
        System.out.println("| Bahan Body          | " + getBahanBody() + "          |");
        System.out.println("| Nama Roket          | " + namaRoket + "           |");
        System.out.println("| Lebar               | " + lebar + " meter         |");
        System.out.println("| Tinggi              | " + tinggi + " meter         |");
        System.out.println("+----------------------+--------------------+");
    }
}