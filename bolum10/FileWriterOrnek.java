
import java.io.*;

public class FileWriterOrnek {

	private char[] cbuf = { 'M','e','r','h','a','b','a'};
	private FileWriter  yazici ;

	// islerin baslatildigi yapilandirici metod
	public FileWriterOrnek(String dosyaIsmi) throws IOException {
		yazici = new FileWriter(dosyaIsmi);	// baglanti kurma islemi
	}

	/**
	 * Verileri fiziksel dosyaya tek tek yazan metod
	 *
	 * @throws   IOException
	 *
	 */
	public void tekTekyaz() throws IOException{
		yazici.write("\r\n");// bir satir asagiya gec
		for(int i=0 ;i<cbuf.length ;i++ ) {
			yazici.write( cbuf[i] );
		}
	}

	/**
	 * Verileri blok halinde dosyaya yazan metod
	 *
	 * @throws   IOException
	 *
	 */
	public void blokHalindeYaz() throws IOException {
		yazici.write("\r\n");// bir satir asagiya gec
		yazici.write(cbuf);
	}

	/**
	 * Verilerin belirli bir kismini dosyaya yazan metod
	 *
	 * @throws   IOException
	 *
	 */
	public void belirliBlokHalindeYaz() throws IOException{
		yazici.write("\r\n");// bir satir asagiya gec
		yazici.write(cbuf, 3, cbuf.length-3);
	}

	public static void main(String[] args) throws IOException{

		/*dosya kontrol*/
		if( args.length != 1 ) {
			System.err.println("Dosya ismi eksik !");
			System.exit(1);
		}
		FileWriterOrnek fwo = new FileWriterOrnek(args[0]);
		System.out.println("Tek tek yaziyor");
		fwo.tekTekyaz();
		System.out.println("Blok halinde yaziyor");
		fwo.blokHalindeYaz();
		System.out.println("Belirli bir kismi yaziyor");
		fwo.belirliBlokHalindeYaz();

		if(fwo.yazici != null) {
			fwo.yazici.close();
		}
		System.out.println("Sonucu gormek icin "+args[0]+" dosyasini inceleyin");
	}  
}

