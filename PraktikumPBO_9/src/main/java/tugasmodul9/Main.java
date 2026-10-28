/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugasmodul9;

/**
 *
 * @author moonsrex_x
 */
public class Main {
    public static void main(String[] args) {
        Hewan kucing = new Kucing();
        Hewan anjing = new Anjing();
        
        System.out.println("Kucing mengeluarkan suara :");
        kucing.suara();
        
        System.out.println("\nAnjing mengeluarkan suara :");
        anjing.suara();
    }
}
