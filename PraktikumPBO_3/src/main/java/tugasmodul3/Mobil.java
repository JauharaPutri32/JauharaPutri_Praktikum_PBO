/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugasmodul3;

/**
 *
 * @author moonsrex_x
 */
public class Mobil {
    private String merk;
    private String model;
    private String warna;
    private int tahun;

    public Mobil(String merk, String model, String warna, int tahun) {
        this.merk   = merk;
        this.model  = model;
        this.warna  = warna;
        this.tahun  = tahun;
    }
    
    public String getMerk() {
        return merk;
    }
    public void setMerk(String merk) {
        this.merk = merk;
    }
    
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    
    public String getWarna() {
        return warna;
    }
    public void setWarna(String warnaBaru) {
        String warnaLama = this.warna;
        this.warna       = warnaBaru;
        System.out.println("Warna: " + warnaLama + "-> " + this.warna);
    }

    public int getTahun() {
        return tahun;
    }
    public void setTahun(int tahun) {
        this.tahun = tahun;
    }

    void displayInfo() {
        System.out.println("Merk : " + getMerk());
        System.out.println("Model: " + getModel());
        System.out.println("Warna: " + getWarna());
        System.out.println("Tahun: " + getTahun());
    }
    
    void startEngine() {
        System.out.println("Mesin mobil " + getMerk() + " menyala");
    }
}
