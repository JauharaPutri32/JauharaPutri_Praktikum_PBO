/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package praktikum9;

/**
 *
 * @author moonsrex_x
 */
public class Main {
    public static void main(String[] args) {
        Kendaraan mobil  = new Mobil();
        Kendaraan sepeda = new Sepeda();
        Kendaraan motor  = new Motor();
        
        System.out.println("== Kendaraan Mobil ============================");
        mobil.berjalan();
        mobil.info();
        
        System.out.println("\n== Kendaraan Sepeda ===========================");
        sepeda.berjalan();
        sepeda.info();
        
        System.out.println("\n== Kendaraan Motor ============================");
        motor.berjalan();
        motor.info();
    }
}
