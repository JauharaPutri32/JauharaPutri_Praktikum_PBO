/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugasmodul6;
import java.util.ArrayList;
/**
 *
 * @author moonsrex_x
 */
public class KeranjangBelanja {
    private ArrayList<Produk> daftarProduk = new ArrayList<>();

    public void tambahProduk(Produk produk) {
        daftarProduk.add(produk);
        System.out.println(produk.getNama() + " ditambahkan ke keranjang.");
    }

    public void tambahProduk(Produk produk, int jumlah) {
        for (int i = 0; i < jumlah; i++) {
            daftarProduk.add(produk);
        }
        System.out.println(produk.getNama() + " ditambahkan dengan jumlah " + jumlah + " barang.");
    }
    
    public double totalBayar() {
        double total = 0;
        for (Produk produk : daftarProduk) {
            total += produk.hitungDiskon(); 
        }
        return total;
    }
    
    public void tampilkanKeranjang() {
        System.out.println("\n================ KERANJANG BELANJA ================");
        for (Produk p : daftarProduk) {
            System.out.println("+ " + p.getNama() + "\t| Harga Diskon: Rp" + p.hitungDiskon());
        }
        System.out.println("---------------------------------------------------");
        System.out.println("TOTAL HARGA KESELURUHAN : Rp" + totalBayar());
        System.out.println("===================================================");
    }
}
