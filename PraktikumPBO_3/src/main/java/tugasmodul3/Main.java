/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugasmodul3;

/**
 *
 * @author moonsrex_x
 */
public class Main {
    public static void main(String[] args) {
        Mobil balap = new Mobil("Mercedes-Benz", "Mercedes W196", "Biru", 1954);
        balap.displayInfo();
        
        System.out.println("=".repeat(40));
        balap.setWarna("Merah");
        System.out.println("=".repeat(40));
        
        balap.displayInfo();
        balap.startEngine();
    
        System.out.println();
        
        Mobil kodok = new Mobil("Volkswagen", "Beetle", "Hijau", 2019);
        kodok.displayInfo();
        kodok.startEngine();
    }
}
