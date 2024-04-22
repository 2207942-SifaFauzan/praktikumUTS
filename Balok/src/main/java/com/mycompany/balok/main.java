/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.balok;

/**
 *
 * @author user
 */

public class main {
    public static void main(String[] args) {
        // Membuat objek balok pertama
        Balok balok1 = new Balok(1, 1, 1);
        System.out.println("Balok dengan panjang : " + balok1.getPanjang() + ", lebar : " + balok1.getLebar() + " dan tinggi : " + balok1.getTinggi() + ". Luasnya : " + balok1.hitungLuas() + ", sedangkan kelilingnya : " + balok1.hitungKeliling() + " dan volumenya : " + balok1.hitungVolume());
        
        // Membuat objek balok kedua
        Balok balok2 = new Balok(30, 40, 50);
        System.out.println("Balok dengan panjang : " + balok2.getPanjang() + ", lebar : " + balok2.getLebar() + " dan tinggi : " + balok2.getTinggi() + ". Luasnya : " + balok2.hitungLuas() + ", sedangkan kelilingnya : " + balok2.hitungKeliling() + " dan volumenya : " + balok2.hitungVolume());
        
        // Membuat objek balok ketiga
        Balok balok3 = new Balok(25, 35, 45);
        System.out.println("Balok dengan panjang : " + balok3.getPanjang() + ", lebar : " + balok3.getLebar() + " dan tinggi : " + balok3.getTinggi() + ". Luasnya : " + balok3.hitungLuas() + ", sedangkan kelilingnya : " + balok3.hitungKeliling() + " dan volumenya : " + balok3.hitungVolume());
    }
}

