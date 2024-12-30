/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.lgcns.mission.management.kelompok_5_hierarkikendaraan;

/**
 *
 * @author HUAWEI
 */
public class Kendaraan {
    private String nama;
    private String warna;

    public Kendaraan(String nama, String warna) {
        this.nama = nama;
        this.warna = warna;
    }

    public String getNama() {
        return nama;
    }

    public String getWarna() {
        return warna;
    }

    @Override
    public String toString() {
        return "Kendaraan [nama=" + nama + ", warna=" + warna + "]";
    }
}

