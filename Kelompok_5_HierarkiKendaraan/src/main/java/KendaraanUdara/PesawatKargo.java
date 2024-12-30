/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package KendaraanUdara;

/**
 *
 * @author noven
 */
public class PesawatKargo {
    // Atribut
    private String modelPesawat;
    private double kecepatanMaks;
    private int maksimalKargo;

    // Konstruktor
    public PesawatKargo(String modelPesawat, double kecepatanMaks, int maksimalKargo) {
        this.modelPesawat = modelPesawat;
        this.kecepatanMaks = kecepatanMaks;
        this.maksimalKargo = maksimalKargo;
    }

    // Getter dan Setter
    public String getModelPesawat() {
        return modelPesawat;
    }

    public void setModelPesawat(String modelPesawat) {
        this.modelPesawat = modelPesawat;
    }

    public double getKecepatanMaks() {
        return kecepatanMaks;
    }

    public void setKecepatanMaks(double kecepatanMaks) {
        this.kecepatanMaks = kecepatanMaks;
    }

    public int getMaksimalKargo() {
        return maksimalKargo;
    }

    public void setMaksimalKargo(int maksimalKargo) {
        this.maksimalKargo = maksimalKargo;
    }

    // Method untuk menghitung total tabung gas berdasarkan kapasitas kargo
    public int totalTabungGas() {
        int beratTabungGas = 50; // Berat satu tabung gas dalam kg
        return maksimalKargo / beratTabungGas;
    }

    // Method untuk menghitung total pemberat berdasarkan kapasitas kargo
    public int totalPemberat() {
        int beratPemberat = 100; // Berat satu pemberat dalam kg
        return maksimalKargo / beratPemberat;
    }

    // Main Method untuk testing
    public static void main(String[] args) {
        PesawatKargo pesawat1 = new PesawatKargo("Boeing 747-8F", 988, 100000);
        System.out.println("Model Pesawat: " + pesawat1.getModelPesawat());
        System.out.println("Kecepatan Maks: " + pesawat1.getKecepatanMaks() + " km/jam");
        System.out.println("Kapasitas Maksimal Kargo: " + pesawat1.getMaksimalKargo() + " kg");
        
        System.out.println("Total Tabung Gas yang Bisa Dibawa: " + pesawat1.totalTabungGas());
        System.out.println("Total Pemberat yang Bisa Dibawa: " + pesawat1.totalPemberat());
    }
}

