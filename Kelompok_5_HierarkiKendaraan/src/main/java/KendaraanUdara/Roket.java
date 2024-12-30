/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package KendaraanUdara;

/**
 *
 * @author noven
 */
public class Roket {
    // Atribut
    private String namaRoket;
    private double lebar;
    private double tinggi;

    // Konstruktor
    public Roket(String namaRoket, double lebar, double tinggi) {
        this.namaRoket = namaRoket;
        this.lebar = lebar;
        this.tinggi = tinggi;
    }

    // Getter dan Setter
    public String getNamaRoket() {
        return namaRoket;
    }

    public void setNamaRoket(String namaRoket) {
        this.namaRoket = namaRoket;
    }

    public double getLebar() {
        return lebar;
    }

    public void setLebar(double lebar) {
        this.lebar = lebar;
    }

    public double getTinggi() {
        return tinggi;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    // Method untuk meluncur
    public void meluncur() {
        System.out.println("Roket " + namaRoket + " sedang meluncur ke luar angkasa!");
    }

    // Method untuk memantau status
    public void statusMonitor() {
        System.out.println("Status Roket:");
        System.out.println("Nama Roket: " + namaRoket);
        System.out.println("Lebar: " + lebar + " meter");
        System.out.println("Tinggi: " + tinggi + " meter");
        System.out.println("Semua sistem berjalan dengan normal.");
    }

    // Main Method untuk testing
    public static void main(String[] args) {
        Roket roket1 = new Roket("Falcon 9", 3.7, 70);
        roket1.statusMonitor();
        roket1.meluncur();
    }
}

