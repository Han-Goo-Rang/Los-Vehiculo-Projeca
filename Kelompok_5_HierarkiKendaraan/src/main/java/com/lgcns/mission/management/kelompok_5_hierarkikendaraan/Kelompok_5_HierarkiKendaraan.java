package com.lgcns.mission.management.kelompok_5_hierarkikendaraan;

import KendaraanAir.KapalFerry;
import KendaraanAir.KapalLayar;
import KendaraanAir.Kayak;
import KendaraanAir.Rakit;
import KendaraanAir.Sampan;
import KendaraanAir.SpeedBoat;
import KendaraanDarat.KeretaApi;
import KendaraanDarat.Mobil;
import KendaraanDarat.Motor;
import KendaraanDarat.Sepeda;
import KendaraanDarat.Skuter;
import KendaraanDarat.Truk;
import KendaraanUdara.BalonUdara;
import KendaraanUdara.Helikopter;
import KendaraanUdara.PesawatBoeing;
import KendaraanUdara.PesawatJet;
import KendaraanUdara.Roket;
import java.util.Scanner;

public class Kelompok_5_HierarkiKendaraan {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Masukkan nama Anda: ");
        String namaUser = scanner.nextLine();
        System.out.println("\nHalo, " + namaUser + "~ Welkom to sistem hierarki kendaraan.\n");

        while (true) {
            System.out.println("Pilih menu berikut:");
            System.out.println("1. Pelajari apa saja transportasi air");
            System.out.println("2. Pelajari apa saja transportasi darat");
            System.out.println("3. Pelajari apa saja transportasi udara");
            System.out.println("4. Keluar");
            System.out.print("Masukkan pilihan Anda (1-4): ");
            int pilihan = scanner.nextInt();
            scanner.nextLine(); 

            switch (pilihan) {
                case 1:
                    tampilkanKendaraanAir(scanner);
                    break;
                case 2:
                    tampilkanKendaraanDarat(scanner);
                    break;
                case 3:
                    tampilkanKendaraanUdara(scanner);
                    break;
                case 4:
                    System.out.println("\nTerima kasih, " + namaUser + "! Sampai jumpa lagi.");
                    return;
                default:
                    System.out.println("Pilihan tidak valid. Coba lagi.\n");
            }
        }
    }

    
    private static void tampilkanKendaraanAir(Scanner scanner) {
        
        Kendaraan[] kendaraanAir = {
            new KapalFerry("Kapal Ferry", "Putih", "Baja", "Mesin Diesel", 500),
            new Kayak("Kayak", "Hijau", "Fiber Glass", "Dayung", 4),
            new Rakit("Rakit", "Coklat", "Bambu", "Arus Air", 4),
            new Sampan("Sampan", "Putih", "Kayu", "Dayung/Mesin", 2),
            new SpeedBoat("SpeedBoat", "Merah", "Aluminium", "Mesin Jet", 3, 150.0)
        };
        tampilkanDetailKendaraan(kendaraanAir, scanner);
    }

  
    private static void tampilkanKendaraanDarat(Scanner scanner) {
        
        Kendaraan[] kendaraanDarat = {
            new Mobil("Mobil", "Merah", "Mobil", "Mesin", "Volkswagen", 350000000.0),
            new Motor("Motor", "Hitam", "Motor", "Mesin Karbu", "Suzuki", 25000000.0),
            new Sepeda("Sepeda", "Biru", "Sepeda", "Roda", "Polygon"),
            new Skuter("Skuter", "Putih", "Skuter", "Mesin Elektro", "Yamaha", 2400000.0),
            new Truk("Truk", "Kuning", "Truk", "Mesin Diesel", "Volvo", 12000000000.0, 4),
            new KeretaApi("Kereta Api", "Gray-Orange", "Kereta Api", "Lokomotif", "Argo-Lawu", 150000000.0, 75)
        };
        tampilkanDetailKendaraan(kendaraanDarat, scanner);
    }

    
    private static void tampilkanKendaraanUdara(Scanner scanner) {
       
        Kendaraan[] kendaraanUdara = {
            new BalonUdara("Balon Udara", "Merah", 20, "Nilon", 4, "Fusso"),
            new Helikopter("Helikopter", "Hitam", 5, "Aluminium", "AH-1444", "Cyan", 2),
            new PesawatJet("Pesawat Jet", "Biru", 100, "Aluminium", 900, "FH-MIRAGE 1224"),
            new PesawatBoeing("Pesawat Boeing", "Putih", 300, "Aluminium", 850, "Citilink"),
            new Roket("Roket", "Silver", 0, "Titanium", "Apollo 13", 20, 120)
        };
        tampilkanDetailKendaraan(kendaraanUdara, scanner);
    }

    
    private static void tampilkanDetailKendaraan(Kendaraan[] kendaraan, Scanner scanner) {
        for (Kendaraan k : kendaraan) {
            k.tampilkanDetail();
            System.out.println(); 
        }

    while (true) {
        System.out.print("Kembali ke menu utama? (y/n): ");
        String kembali = scanner.nextLine();
        if (kembali.equalsIgnoreCase("y")) {
            return; 
        } else if (kembali.equalsIgnoreCase("n")) {
            System.out.println("Terima kasih telah menggunakan sistem ini!");
            System.exit(0);
        } else {
            System.out.println("Tidak valid. Silakan pilih kembali (y atau n)");
        }
    }
    }
}
