/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugasmodul4;

/**
 *
 * @author moonsrex_x
 */
public class Main {
    public static void main(String[] args) {
        Pekerja seni = new Pekerja("Rara", 19, "Ilustrator", 5000000);
        
        System.out.println("-Menampilkan Informasi Pekerja-");
        System.out.println(seni.toString());
        
        System.out.println();
                
        seni.setNama("Hasna");
        System.out.println("-Mengubah Nama Pekerja (Rara > Hasna)-");
        System.out.println(seni.toString());
    }
}
