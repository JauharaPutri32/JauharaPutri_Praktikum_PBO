/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package praktikum6;

/**
 *
 * @author moonsrex_x
 */
public class Main {
    public static void main(String[] args) {
        Hewan hewan = new Kucing();
        System.out.println("========= Kucing =========");
        hewan.bersuara();   // Output: Meow
        
        Kucing kucing = new Kucing();
        kucing.makan("ikan");       // Memanggil metode makan() dari kelas Hewan
        kucing.makan("ikan", 2);   // Memanggil metode makan() yang overloaded
        
        Anjing anjing = new Anjing();
        System.out.println("\n========= Anjing =========");
        anjing.bersuara();  // Output: Woof
        anjing.makan("daging", 3); // Memanggil metode makan() yang overloaded pada kelas Hewan
    }
}
