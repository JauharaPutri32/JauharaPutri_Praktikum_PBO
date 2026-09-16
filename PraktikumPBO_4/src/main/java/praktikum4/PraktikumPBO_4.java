/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package praktikum4;

/**
 *
 * @author moonsrex_x
 */
public class PraktikumPBO_4 {
    public static void main(String[] args) {
        Mobil balap = new Mobil("Mercedes W196", 300, "Straight-8", 2);
        
        System.out.println("-Menampilkan Informasi Kendaraan-");
        balap.tampilkanInfoKendaraan();
        
        System.out.println();
                
        System.out.println("-Menampilkan Informasi Mobil-");
         balap.tampilkanInfoMobil();
    }
}
