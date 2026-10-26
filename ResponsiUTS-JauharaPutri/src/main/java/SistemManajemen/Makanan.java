/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SistemManajemen;
import java.time.LocalDate;
/**
 *
 * @author moonsrex_x
 */
public class Makanan extends Produk{
    private LocalDate tanggalKadaluarsa;
    
    public  Makanan(String namaProduk, double harga, LocalDate tanggalKadaluarsa) {
        super(namaProduk, harga);
        this.tanggalKadaluarsa = tanggalKadaluarsa;
    }
    
    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Tanggal kadaluarsa\t: " + tanggalKadaluarsa);
    }
}
