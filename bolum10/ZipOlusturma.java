

import java.io.*;
import java.util.zip.*;

public class ZipOlusturma {


	private ZipOutputStream zos ;


	public void ekle(String dosyaIsmi) throws IOException {

		if(zos == null ) {
			throw new IOException("ZipOutputStream == null ");
		}

		BufferedInputStream bis = new BufferedInputStream(
					    new FileInputStream(dosyaIsmi));
		int deger;
		while( (deger=bis.read()) != -1) {
			zos.write(deger);
		}
		bis.close(); 
	}


	public void ziple(String dizin) throws Exception {

		zos = new ZipOutputStream(
			  new BufferedOutputStream(
			  new FileOutputStream("ziptestdosyasi.zip")));

		File dosyalar = new File(dizin);
		String[] dosyaListesi = dosyalar.list();// dikkat
		System.out.println(dizin);
		for(int i=0 ; i<dosyaListesi.length; i++) {
			File dosya = new File(dizin+ File.separator +dosyaListesi[i]);
			if(dosya.isFile()) {
				System.out.println(dosyaListesi[i]);
				ZipEntry ze = new  ZipEntry(dosyaListesi[i]);
				zos.putNextEntry(ze);
				ekle(dizin+ File.separator +dosyaListesi[i]);
			} 
		}
		zos.close(); 
	}


	public static void main(String[] args) throws Exception {
		if(args.length != 1) {
			throw new IOException("Ziplenecek olan dizini giriniz");
		}

		ZipOlusturma zob = new ZipOlusturma();
		zob.ziple(args[0]);
	} 
}

