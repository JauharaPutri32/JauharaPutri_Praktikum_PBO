/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum3;

/**
 *
 * @author moonsrex_x
 */
public class Main {
    public static void main(String[] args) {
        Hewan kucing = new Hewan("Nana", 3);
        kucing.suara();
        kucing.info();
    
        System.out.println();
        
        Hewan anjing = new Hewan("Nono", 5);
        anjing.suara();
        anjing.info();
        anjing.berlari();
    }
}