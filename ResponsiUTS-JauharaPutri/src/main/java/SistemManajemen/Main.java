/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package SistemManajemen;
import java.time.LocalDate;
/**
 *
 * @author moonsrex_x
 */
public class Main {
    public static void main(String[] args) {
        Elektronik alat = new Elektronik("Drawing pen tablet", 700000, 1); 
        System.out.println("== PRODUK ========================================");
        alat.tampilkanInfo();
        
        PegawaiTetap rara = new PegawaiTetap("Rara", 50000000, 50000000); 
        System.out.println("\n== PEGAWAI TETAP ================================");
        rara.tampilkanInfo();
        
        //Polimorfisme
        Produk dessert = new Makanan("Cheesecake", 25000, LocalDate.parse("2027-08-13"));
        System.out.println("\n== POLIMORFISME =================================");
        System.out.println("-- PRODUK ---------------------------------------");        
        dessert.tampilkanInfo();
        Pegawai jaemin = new PegawaiKontrak("Jaemin", 25000000, 12);
        System.out.println("\n-- PEGAWAI KONTRAK ------------------------------");
        jaemin.tampilkanInfo();
    }
}
