/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tubes;

/**
 *
 * @author noven
 */
public class Helikopter {
    // Atribut
    private String namaHelikopter;
    private String warnaHelikopter;
    private int banyakBalingBaling;

    // Konstruktor
    public Helikopter(String namaHelikopter, String warnaHelikopter, int banyakBalingBaling) {
        this.namaHelikopter = namaHelikopter;
        this.warnaHelikopter = warnaHelikopter;
        this.banyakBalingBaling = banyakBalingBaling;
    }

    // Getter dan Setter
    public String getNamaHelikopter() {
        return namaHelikopter;
    }

    public void setNamaHelikopter(String namaHelikopter) {
        this.namaHelikopter = namaHelikopter;
    }

    public String getWarnaHelikopter() {
        return warnaHelikopter;
    }

    public void setWarnaHelikopter(String warnaHelikopter) {
        this.warnaHelikopter = warnaHelikopter;
    }

    public int getBanyakBalingBaling() {
        return banyakBalingBaling;
    }

    public void setBanyakBalingBaling(int banyakBalingBaling) {
        this.banyakBalingBaling = banyakBalingBaling;
    }

    // Method untuk melayang
    public void melayang() {
        System.out.println("Helikopter " + namaHelikopter + " dengan warna " + warnaHelikopter + " sedang melayang di udara.");
    }

    // Method untuk bergerak
    public void gerak() {
        System.out.println("Helikopter " + namaHelikopter + " bergerak dengan menggunakan " + banyakBalingBaling + " baling-baling.");
    }

    // Main Method untuk testing
    public static void main(String[] args) {
        Helikopter heli1 = new Helikopter("Apache AH-64", "Hijau", 4);
        System.out.println("Nama Helikopter: " + heli1.getNamaHelikopter());
        System.out.println("Warna Helikopter: " + heli1.getWarnaHelikopter());
        System.out.println("Banyak Baling-Baling: " + heli1.getBanyakBalingBaling());
        
        heli1.melayang();
        heli1.gerak();
    }
}

