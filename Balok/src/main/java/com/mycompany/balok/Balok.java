/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.balok;

/**
 *
 * @author user
 */
class Balok {
    private int panjang;
    private int lebar;
    private int tinggi;
    
    // Constructor
    public Balok(int panjang, int lebar, int tinggi) {
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
    }
    
    // Getter dan setter untuk panjang
    public int getPanjang() {
        return panjang;
    }
    public void setPanjang(int panjang) {
        this.panjang = panjang;
    }
    
    // Getter dan setter untuk lebar
    public int getLebar() {
        return lebar;
    }
    public void setLebar(int lebar) {
        this.lebar = lebar;
    }
    
    // Getter dan setter untuk tinggi
    public int getTinggi() {
        return tinggi;
    }
    public void setTinggi(int tinggi) {
        this.tinggi = tinggi;
    }
    
    // Menghitung luas balok
    public int hitungLuas() {
        return 2 * ((panjang * lebar) + (panjang * tinggi) + (lebar * tinggi));
    }
    
    // Menghitung keliling balok
    public int hitungKeliling() {
        return 4 * (panjang + lebar + tinggi);
    }
    
    // Menghitung volume balok
    public int hitungVolume() {
        return panjang * lebar * tinggi;
    }
}
