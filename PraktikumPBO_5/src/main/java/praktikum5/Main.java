/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package praktikum5;

/**
 *
 * @author moonsrex_x
 */
public class Main {
    public static void main(String[] args) {
        Mobil mobil = new Mobil("Toyota", 180, 4, 4);
        System.out.println("(1) Kendaraan Mobil: ");
        mobil.tampilkanInfo();
        
        System.out.println();
        
        SepedaMotor motor = new SepedaMotor("Yamaha", 120, 1, "2-tak");
        System.out.println("(2) Kendaraan Sepeda Motor: ");
        motor.tampilkanInfo();
    }
}
