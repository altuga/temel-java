

import java.io.*;

public class Listeliyici {

    
    public void listele(String dizin) {
	File dosyalar = new File(dizin);
	String[] dosyaListesi = dosyalar.list();// dikkat
	for(int i=0 ; i<dosyaListesi.length; i++) {
	    System.out.println(dosyaListesi[i]);
	}

    }


    public static void main(String[] args) throws IOException {
	 if(args.length != 1) {
	     throw new IOException("Listelenecek olan dizini giriniz");
	 }
	
	 Listeliyici l = new Listeliyici();
	 l.listele(args[0]);
    } 
}
