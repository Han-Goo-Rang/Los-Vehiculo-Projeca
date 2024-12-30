/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package KendaraanDarat;

/**
 *
 * @author noven
 */
public class Skuter {
    // Atribut
    private String merekSkuter;
    private double asuransi;

    // Konstruktor
    public Skuter(String merekSkuter, double asuransi) {
        this.merekSkuter = merekSkuter;
        this.asuransi = asuransi;
    }

    // Getter dan Setter
    public String getMerekSkuter() {
        return merekSkuter;
    }

    public void setMerekSkuter(String merekSkuter) {
        this.merekSkuter = merekSkuter;
    }

    public double getAsuransi() {
        return asuransi;
    }

    public void setAsuransi(double asuransi) {
        this.asuransi = asuransi;
    }

    // Method untuk menghitung jarak maksimal
    public double jarakMaksimal() {
        double rataRataKonsumsiBahanBakar = 40; // km per liter
        double kapasitasTangki = 5; // liter
        return rataRataKonsumsiBahanBakar * kapasitasTangki;
    }

    // Method untuk menyetir
    public void menyetir() {
        System.out.println("Skuter dengan merek " + merekSkuter + " sedang dikendarai.");
    }

    // Method untuk mengerem
    public void mengerem() {
        System.out.println("Skuter dengan merek " + merekSkuter + " sedang mengerem.");
    }
}

