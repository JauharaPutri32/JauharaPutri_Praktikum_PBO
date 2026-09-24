/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum5;

/**
 *
 * @author moonsrex_x
 */
public class Mobil extends KendaraanDarat {
    int jumlahPintu;
    
    public Mobil(String nama, int kecepatan, int jumlahPenumpang, int jumlahPintu) {
        super(nama, kecepatan, jumlahPenumpang);
        this.jumlahPintu = jumlahPintu;
    }
    
    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Jumlah Pintu                    : " + jumlahPintu);
    }
}
