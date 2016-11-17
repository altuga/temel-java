

import java.io.*;

public class BufferedReaderOrnekIki {

	private String dosyaIsmi ;


	private void isaretlemeYap() throws IOException {

		BufferedReader br = new BufferedReader(new FileReader(dosyaIsmi));

		if(!br.ready()) { // okunmaya hazir mi ?
			throw new IOException("Henuz okunmaya hazir degil");
		}

		if(!br.markSupported()) { // i$aretleme destekleniyor mu ?
			throw new IOException("I$aretleme desteklenmiyor..");
		}

		int b;
		while( ( b=br.read() ) != -1) {
			System.out.println(b +"> " + (char)b);
			if(b=='C') {
				br.mark(32);
			}
		}
		br.reset();// makarayi geri sar
		System.out.println("Makara geri sariliyor...");
		while( ( b=br.read() ) != -1) {
			System.out.println(b +"> " + (char)b);
		}

		br.close();
	}


	public static void main(String args[]) throws IOException {

		/*dosya kontrol*/
		if( args.length != 1 ) {
			System.err.println("Dosya ismi eksik !");
			System.exit(1);
		}

		BufferedReaderOrnekIki brob = new BufferedReaderOrnekIki();
		brob.dosyaIsmi = args[0].trim();
		brob.isaretlemeYap();

	}

}



