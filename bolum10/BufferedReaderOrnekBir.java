

import java.io.*;

public class BufferedReaderOrnekBir {

	/**
	 * Dosya isminin tutuldugu degisken
	 */
	private String dosyaIsmi ;



	private void satirSatirOku() throws IOException {

		BufferedReader br = 
		new BufferedReader(new FileReader(dosyaIsmi));

		if(!br.ready()) { // okunmaya hazir mi ?
			throw new IOException("Henuz okunmaya hazir degil");
		}

		int toplamSatirSonu=0;
		while( ( br.readLine() ) != null) {
			toplamSatirSonu++; 
		}
		System.out.println("toplamSatirSonu:"+toplamSatirSonu);
		br.close();
	}


	public static void main(String args[]) throws IOException {

		/*dosya kontrol*/
		if( args.length != 1 ) {
			System.err.println("Dosya ismi eksik !");
			System.exit(1);
		}

		BufferedReaderOrnekBir brob = new BufferedReaderOrnekBir();
		brob.dosyaIsmi = args[0].trim();
		brob.satirSatirOku();

	}

}



