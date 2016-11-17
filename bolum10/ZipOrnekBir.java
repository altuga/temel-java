

import java.io.*;
import java.util.zip.*;

public class ZipOrnekBir {

    
    public void ziple(String dizin) throws Exception {
	
	ZipOutputStream zos = new ZipOutputStream(
	     new BufferedOutputStream( new FileOutputStream("x.zip")));

	File dosyalar = new File(dizin);
	String[] dosyaListesi = dosyalar.list();// dikkat
	//String dizin = dosyalar.getAbsolutePath();
	System.out.println(dizin);
	for(int i=0 ; i<dosyaListesi.length; i++) {
	    System.out.println(dizin+"\\"+dosyaListesi[i]);
	    ZipEntry ze = new  ZipEntry(dizin+"\\"+dosyaListesi[i]);
	    System.out.println(ze.getSize());
	    zos.putNextEntry(ze);
	}
	zos.close();

    }


    public static void main(String[] args) throws Exception {
	 if(args.length != 1) {
	     throw new IOException("Listelenecek olan dizini giriniz");
	 }
	
	 ZipOrnekBir zob = new ZipOrnekBir();
	 zob.ziple(args[0]);
    } 
}

