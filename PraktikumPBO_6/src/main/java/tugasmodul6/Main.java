/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugasmodul6;

/**
 *
 * @author moonsrex_x
 */
public class Main {
    public static void main(String[] args) {
        KeranjangBelanja belanja = new KeranjangBelanja();

        Produk novel  = new Buku("Buku Janji", 100000);
        Produk alat   = new Elektronik("Hair Dryer", 210000);
        Produk dress  = new Pakaian("Dress Wanita", 165000);

        belanja.tambahProduk(novel);
        belanja.tambahProduk(alat);
        belanja.tambahProduk(dress, 2);
        belanja.tampilkanKeranjang();

    }
}
