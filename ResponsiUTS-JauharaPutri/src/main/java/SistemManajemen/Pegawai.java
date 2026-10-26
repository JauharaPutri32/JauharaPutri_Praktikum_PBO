/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SistemManajemen;

/**
 *
 * @author moonsrex_x
 */
public class Pegawai {
    private String namaPegawai;
    private double gaji;
    
    //Constructor
    public Pegawai(String namaPegawai, double gaji) {
        this.namaPegawai  = namaPegawai;     
        this.gaji         = gaji;
    }
    
    //Metode getter setter
    public String getNama() {
        return namaPegawai;
    }
    public void setNama(String namaPegawai) {
        this.namaPegawai = namaPegawai;
    }
    
    public double getGaji() {
        return gaji;
    }
    public void setGaji(double gaji) {
        this.gaji = gaji;
    }
    
    public void tampilkanInfo() {
        System.out.println("Nama Pegawai\t\t: " + getNama());
        System.out.println("Gaji\t\t\t: Rp." + getGaji());
    }
}
