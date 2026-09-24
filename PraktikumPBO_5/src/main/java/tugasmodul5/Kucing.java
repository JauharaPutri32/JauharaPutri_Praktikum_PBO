/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugasmodul5;

/**
 *
 * @author moonsrex_x
 */
public class Kucing extends Hewan {
    
    public Kucing(String nama, String jenis) {
        super(nama, jenis);
    }
    
    public void suaraKucing() {
        System.out.println("Suara Kucing : Miaw Miaw~");
    }       
    
    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        suaraKucing();
    }    
}
