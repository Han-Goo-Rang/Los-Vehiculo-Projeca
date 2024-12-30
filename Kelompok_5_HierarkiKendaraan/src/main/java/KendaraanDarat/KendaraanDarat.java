/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package KendaraanDarat;
import com.lgcns.mission.management.kelompok_5_hierarkikendaraan.Kendaraan;
/**
 *
 * @author acer nitro
 */
public class KendaraanDarat extends Kendaraan{
    private String jenisKendaraan;
    private String jenisPenggerak;
    
    public KendaraanDarat(String nama, String warna, String jenisKendaraan, String jenisPenggerak){
        super(nama,warna);
        this.jenisKendaraan = jenisKendaraan;
        this.jenisPenggerak = jenisPenggerak;
    }
    
    public String getJenisKendaraan(){
        return jenisKendaraan;
    }
    
    public String getJenisPenggerak(){
        return jenisPenggerak;
    }
    
    public String toString(){
        return ("Jenis Kendaraan: " + jenisKendaraan + ", Jenis Penggerak: " + jenisPenggerak);
    }
}
