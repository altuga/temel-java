

import java.io.*;
import java.util.zip.*;

public class GZIPOlusturma {


	private GZIPOutputStream gzos ;


	public void ekle(String dosyaIsmi) throws IOException {

		if(gzos == null ) {
			throw new IOException("GZIPOutputStream == null ");
		}

		BufferedInputStream bis = new BufferedInputStream(
														 new FileInputStream(dosyaIsmi));
		int deger;
		while( (deger=bis.read()) != -1) {
			gzos.write(deger);
		}
		bis.close(); 
		//gzos.finish();// Dikkat 

	}


	public void gziple(String dizin) throws Exception {

		gzos = new GZIPOutputStream(
			   new BufferedOutputStream(
			   new FileOutputStream("gziptestdosyasi.gzip")));

		File dosyalar = new File(dizin);
		String[] dosyaListesi = dosyalar.list();// dikkat
		System.out.println(dizin);
		for(int i=0 ; i<dosyaListesi.length; i++) {
			File dosya = new File(dizin+ File.separator +dosyaListesi[i]);
			if(dosya.isFile()) {
				System.out.println(dosyaListesi[i]);
				ekle(dizin+ File.separator +dosyaListesi[i]);
			}
		}

		gzos.close();
	}


	public static void main(String[] args) throws Exception {
		if(args.length != 1) {
			throw new IOException("GZIPiplenecek olan dizini giriniz");
		}

		GZIPOlusturma gzob = new GZIPOlusturma();
		gzob.gziple(args[0]);
	} 
}

