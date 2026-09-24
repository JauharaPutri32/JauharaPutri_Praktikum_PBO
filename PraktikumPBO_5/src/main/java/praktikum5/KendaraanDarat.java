/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum5;

/**
 *
 * @author moonsrex_x
 */
public class KendaraanDarat extends Kendaraan {
    int jumlahPenumpang;
    
    public KendaraanDarat(String nama, int kecepatan, int jumlahPenumpang) {
        super(nama, kecepatan);
        this.jumlahPenumpang = jumlahPenumpang;
    }
    
    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Jumlah penumpang yang bisa naik : " + jumlahPenumpang);
    }
}
