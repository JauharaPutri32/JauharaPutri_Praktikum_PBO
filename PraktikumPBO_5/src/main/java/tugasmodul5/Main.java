/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugasmodul5;

/**
 *
 * @author moonsrex_x
 */
public class Main {   
    public static void main(String[] args) {
        Kucing kucing = new Kucing("Nana", "Anggora");
        System.out.println("(1) Informasi Hewan Kucing: ");
        kucing.tampilkanInfo();
        
        System.out.println();
        
        Anjing anjing = new Anjing("Nono", "Samoyed");
        System.out.println("(2) Informasi Hewan Anjing: ");
        anjing.tampilkanInfo();
    }
}
