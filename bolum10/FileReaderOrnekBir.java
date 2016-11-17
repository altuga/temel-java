

import java.io.*;

public class FileReaderOrnekBir {

	/**
	 * Dosya isminin tutuldugu degisken
	 */
	private String dosyaIsmi ;


	/**
	 * Dosyadan verileri tek tek okuyan metod.
	 *
	 * @exception IOException
	 */
	private void tekTekOku() throws IOException {

		FileReader fr = new FileReader(dosyaIsmi);
		System.out.println("encoding:"+fr.getEncoding());

		if(!fr.ready()) { // okunmaya hazir mi ?
			throw new IOException("Henuz okunmaya hazir degil");
		}
		
	
		int c ;
		int toplamSatirSonu = 0 ;
		while( ( c=fr.read() ) != -1) {
			if(c == '\r') {// satir sonu ise
				toplamSatirSonu++;
			}
		}
		System.out.println("toplamSatirSonu:"+toplamSatirSonu);
		fr.close();
	}

	/**
	 * Dosyadan verileri belirtilen char dizisine aktararak,
	 * bloklar halinde okumayi gerceklestiren metod
	 *
	 * @exception IOException
	 */
	private void blokSeklindeOku() throws IOException {

		FileReader fr = new FileReader(dosyaIsmi);
		System.out.println("encoding:"+fr.getEncoding());
		if(!fr.ready()) { // okunmaya hazir mi ?
			throw new IOException("Henuz okunmaya hazir degil");
		}

		char[] cBuf = new char[10];	// 10'luk blok
		int toplamSatirSonu = 0 ;
		int okunanCharSayisi = 0 ;
		while(  (okunanCharSayisi = fr.read(cBuf))  != -1) {
			for( int i=0 ; i < cBuf.length;i++ ) {
				if(cBuf[i] == '\r') {	// satir sonu ise
					toplamSatirSonu++;
				}
			}
		}
		System.out.println("toplamSatirSonu:"+toplamSatirSonu);
		fr.close();
	}


	/**
	 * Dosyadan verileri belirtilen char dizisinin
	 * istenilen elemanlarina aktararak
	 * bloklar halinde okumayi gerceklestiren metod
	 */
	private void belirtilenCercevedeOku() throws IOException {

		FileReader fr = new FileReader(dosyaIsmi);
		System.out.println("encoding:"+fr.getEncoding());
		if(!fr.ready()) { // okunmaya hazir mi ?
			throw new IOException("Henuz okunmaya hazir degil");
		}

		char[] cBuf = new char[10];	// 10'luk blok
		int toplamSatirSonu = 0 ;
		int okunanCharSayisi = 0 ;
		while(  (okunanCharSayisi = fr.read(cBuf,0,cBuf.length)) != -1) {
			for( int i=0 ; i < cBuf.length;i++ ) {
				if(cBuf[i] == '\r') {	 // satir sonu ise
					toplamSatirSonu++;
				}
			}
		}
		System.out.println("toplamSatirSonu:"+toplamSatirSonu);
		fr.close();
	}



	/**
	 * I$lerin baslatildigi metod
	 *
	 * @param args   K�llanicidan alinan parametreler dizisi
	 * @exception IOException
	 */
	public static void main(String args[]) throws IOException {

		/*dosya kontrol*/
		if( args.length != 1 ) {
			System.err.println("Dosya ismi eksik !");
			System.exit(1);
		}

		FileReaderOrnekBir frob = new FileReaderOrnekBir();
		frob.dosyaIsmi = args[0].trim();
		System.out.println("-- Tek tek okuma i$lemi --");
		frob.tekTekOku();
		System.out.println("-- Bloklar halinde okuma i$lemi --");
		frob.blokSeklindeOku();
		System.out.println("-- Blok halinde belirtilen cercevede okuma i$lemi --");
		frob.blokSeklindeOku();


	}

}



