package KendaraanUdara;

public class PesawatJet extends KendaraanUdara {
    private double kecepatan; 
    private String modelJet;
 

    public PesawatJet(String nama, String warna, int kapasitasPenumpang, String bahanBody, 
                      double kecepatan, String modelJet) {
        super(nama, warna, kapasitasPenumpang, bahanBody);
        this.kecepatan = kecepatan;
        this.modelJet = modelJet;
      
    }

    public double hitungJarak(double waktu) {
        return kecepatan * waktu;
    }

    
    public void tampilStatus() {
        System.out.println("Pesawat Jet " + modelJet + " sedang terbang dengan kecepatan " + kecepatan + " km/jam.");
    }

    @Override
    public void tampilkanDetail() {
        System.out.println("+----------------------+--------------------+");
        System.out.println("| Atribut             | Nilai              |");
        System.out.println("+----------------------+--------------------+");
        System.out.println("| Nama Kendaraan      | " + getNama() + "             |");
        System.out.println("| Warna               | " + getWarna() + "           |");
        System.out.println("| Kapasitas Penumpang | " + getKapasitasPenumpang() + "               |");
        System.out.println("| Bahan Body          | " + getBahanBody() + "       |");
        System.out.println("| Model Jet           | " + modelJet + "            |");
        System.out.println("| Kecepatan           | " + kecepatan + " km/jam     |");
        System.out.println("+----------------------+--------------------+");
    }

    @Override
    public String toString() {
        return super.toString() + ", Model Jet: " + modelJet + ", Kecepatan: " + kecepatan;
    }
}
