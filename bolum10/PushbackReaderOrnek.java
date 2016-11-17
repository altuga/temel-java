
import java.io.*;

class Parcaliyici {



	private PushbackReader pr;

	// parcaciklarin tipi
	private static final int HARF = 1;
	private static final int SAYI = 2;

	private int tip ;

	// PushbackReader nesnesi ile dosyayi bagliyoruz
	public Parcaliyici(String fn) throws IOException {
		FileReader fr = new FileReader(fn);
		BufferedReader br = new BufferedReader(fr);
		pr = new PushbackReader(br, 1);
	}



	// ilk krakterin hangi parcaliyici tipde oldugunu buluyoruz
	public void tipBelirle(char ch) {
		// gelen krakter harf mi ? sayi mi ?

		if(Character.isLetter(ch)) {
			tip = HARF;
		} else if(Character.isDigit(ch)) {
			tip = SAYI;
		}
	}

	// Bir sonraki parcayi bul

	public String birSonrakiParcayiBul() throws IOException {
		int c;
		char ch; 

		c = pr.read();
		// dosya sonu mu?

		if(c == -1) { // dosya sonu ise null gonder.
			return null;
		}

		ch = (char)c;
		tipBelirle(ch);

		// ayni tipleri StringBuffer nesnesi icerisinde biriktiriyoruz
		// i$e ilk okunan veriyi iceriye atmakla basliyalim
		StringBuffer sb = new StringBuffer();
		sb.append(ch);

		for(;;) { // sonsuz dongu
			c = pr.read();
			if(c == -1) {
				break;
			}
			ch = (char)c;



			// okunan krakter, ilk krakterin tipi ile ayni mi
			if((tip == HARF && Character.isLetter(ch)) || 
			   (tip == SAYI && Character.isDigit(ch))) {
				sb.append(ch);
			} else { // degilse okudugunu geri birak
				pr.unread(c);
				break; // donguden cik
			}
		}

		return sb.toString();
	}

	public void close() throws IOException {
		pr.close();
	}
}

public class PushbackReaderOrnek {
	public static void main(String args[]) throws IOException {

		// dosya ismi kontrol
		if( args.length != 1 ) {
			System.err.println("Dosya ismi eksik !");
			System.exit(1);
		}

		Parcaliyici prclyc = new Parcaliyici(args[0]);
		String parca;

		//parcala...
		while((parca = prclyc.birSonrakiParcayiBul()) != null) {
			System.out.println(parca);
		}

		prclyc.close();
	}
}


