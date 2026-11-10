/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugasmodul10;

/**
 *
 * @author moonsrex_x
 */
public class Main {
    public static void main(String[] args) {
        // Objek Elektronik
        Pembayaran kipas = new Elektronik();
        double hargaKipas = 150000;
        double elektronik = kipas.hitungPajak(hargaKipas);
        System.out.println("== Barang Elektronik ===================================");
        System.out.println("Harga:" + hargaKipas);
        System.out.println("Pajak:" + elektronik);
        System.out.println("Harga setelah terkena pajak:" + (hargaKipas + elektronik));
        
        // Objek Makanan
        Pembayaran kue = new Makanan();
        double hargaKue = 25000;
        double makanan = kue.hitungPajak(hargaKue);
        System.out.println();
        System.out.println("== Barang Makanan ======================================");
        System.out.println("Harga:" + hargaKue);
        System.out.println("Pajak:" + makanan);
        System.out.println("Harga setelah terkena pajak:" + (hargaKue + makanan));
    }
}
