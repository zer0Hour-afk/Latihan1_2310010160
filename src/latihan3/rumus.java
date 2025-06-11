/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan3;


public class rumus {
    //Muhammad Baihaqqi, //2310010160, //4DTIBJB
    int sisi;
    int panjang;
    int lebar;
    int hasil;
    
    public rumus(int sisi, int panjang, int lebar) {
        this.sisi = sisi;
        this.panjang = panjang;
        this.lebar = lebar;
        this.hasil = 0; 
    }
    
     public void hitungLuasPersegi() {
        hasil = sisi * sisi;
    }
    
    public void hitungLuas() {
        hasil = panjang * lebar;
    }
    
    public void tampilkanHasil() {
        System.out.println("Hasil perhitungan: " + hasil);
    }
}
