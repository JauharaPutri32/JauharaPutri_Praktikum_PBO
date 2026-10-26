/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SistemManajemen;

/**
 *
 * @author moonsrex_x
 */
public class Produk {
    private String namaProduk;
    private double harga;
    
    //Constructor
    public Produk(String namaProduk, double harga) {
        this.namaProduk  = namaProduk;     
        this.harga       = harga;
    }
    
    //Metode getter setter
    public String getNama() {
        return namaProduk;
    }
    public void setNama(String namaProduk) {
        this.namaProduk = namaProduk;
    }
    
    public double getHarga() {
        return harga;
    }
    public void setHarga(double harga) {
        this.harga = harga;
    }
    
    public void tampilkanInfo() {
        System.out.println("Nama Produk\t\t: " + getNama());
        System.out.println("Harga\t\t\t: Rp." + getHarga());
    }
}
