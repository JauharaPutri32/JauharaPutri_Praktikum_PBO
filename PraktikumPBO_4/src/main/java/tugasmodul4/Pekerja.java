/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugasmodul4;

/**
 *
 * @author moonsrex_x
 */
public class Pekerja extends Manusia {
    private double gaji;    // Atribut tambahan khusus untuk pekerja
    
    // Constructor
    public Pekerja(String nama, int usia, String pekerjaan, double gaji) {
        super(nama, usia, pekerjaan);     // Memanggil constructor dari kelas induk
        this.gaji = gaji;
    }
    // Getter dan Setter untuk atribut gaji
    public double getGaji() {
        return gaji;
    }
    public void setGaji(double gaji) {
        this.gaji = gaji;
    }
    
    // Method untuk menampilkan informasi pekerja
    @Override 
    public String toString() {
        return "Nama: " + getNama() + "\n" +
               "Pekerjaan: " + pekerjaan + "\n" +
               "Usia: " + usia + "tahun" + "\n" +
               "Gaji pekerjaan: " + getGaji();
    }
}
