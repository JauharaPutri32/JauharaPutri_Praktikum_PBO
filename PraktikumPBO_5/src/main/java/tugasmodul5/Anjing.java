/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugasmodul5;

/**
 *
 * @author moonsrex_x
 */
public class Anjing extends Hewan {
    
    public Anjing(String nama, String jenis) {
        super(nama, jenis);
    }
    
    public void suaraAnjing() {
        System.out.println("Suara Anjing : Guk Guk~");
    }   
    
    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        suaraAnjing();
    }     
}
