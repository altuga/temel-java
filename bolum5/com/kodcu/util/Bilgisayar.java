package com.kodcu.util;

import com.kodcu.math.* ;

public class Bilgisayar extends HesapMakinesi {
    
    protected void hesapla(double a , double b) {
	System.out.println("HesapMakinesi.hesapla() -> a: "+a+"b: "+b);
    }

    public static void main(String args[]) {
	 Bilgisayar b = new Bilgisayar();
	 b.hesapla(3.15, 5.6);
	 HesapMakinesi hm = new HesapMakinesi();
	 // hm.hesapla(3.15, 5.6); ! Hata ! baska paket icersinden erisilemez
    }
}

