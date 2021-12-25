package com.company;

public class Overload {
    public static void skorHesapla(String isim, int puan){
        System.out.println(isim + " kullanıcısının puanı : " + puan);
    }
    public static void skorHesapla( int puan){
        System.out.println("İsimsiz kullanıcının puanı : " + puan);
    }
    public static void skorHesapla(String isim){
        System.out.println(isim + " kullanıcısının puanı bulunmuyor ");
    }
    public static void main(String[] args) {
        skorHesapla("Ayse",100);
        skorHesapla("Ayse");
        skorHesapla(100);
    }
}
