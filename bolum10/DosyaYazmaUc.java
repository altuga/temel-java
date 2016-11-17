
import java.io.*;

public class DosyaYazmaUc {

	private static byte[] veriDizisi = {'A','B','C','D','E','F','G'} ;

	public static void main(String args[]) {

		if ( args.length != 1 ) {
			System.err.println("Dosya ismi eksik !");
			System.exit(1);
		}

		FileOutputStream fos = null ;
		try {
			fos = new FileOutputStream(args[0]/*aaa.txt*/); // kaynaga baglan
			fos.write( veriDizisi, 1, 5 ); // toplu aktarim
		} catch ( IOException exIo ) {
			System.err.println("Hata Olustu:"+exIo);
		} finally {
			try {
				fos.close(); // onemli
			} catch ( IOException exClose ) {
				System.err.println("Kapatmada sorun var:"+exClose);
			}
		}
	}
}

