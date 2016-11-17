
import java.io.*;

public class BufferYazmaIki {

	private static byte[] veriDizisi = {'A', 'B', 'C', 'D', 'E', 'F', 'G',
		'H', 'I', 'J', 'K', 'L', 'M', 'N',
		'O', 'P', 'Q', 'R', 'S', 'T', 'U',
		'1', '2', '3', '4', '5', '6', '7'
	} ;

	public static void main(String args[]) {
		/*dosya kontrol*/
		if( args.length != 1 ) {
			System.err.println("Dosya ismi eksik !");
			System.exit(1);
		}

		FileOutputStream fos = null ;
		BufferedOutputStream bos = null ; 
		try {

			fos = new FileOutputStream(args[0]); // kaynaga baglan

			bos = new BufferedOutputStream(fos); // Tamponlama
			for( int i=0; i < veriDizisi.length; i++ ) {
				bos.write( veriDizisi[i]); // teker teker icsel diziye yaz
				if( (i % 5) == 0 ) {
					bos.flush(); // giden bayt irmagina yaz
				}
			}   

		} catch( IOException exIo ) {
			System.err.println("Hata Olustu:"+exIo);
		} finally {
			try {
				bos.close(); // ilk kapatma islemi  
				fos.close(); // ikinci kapatma islemi
			} catch( IOException exClose ) {
				System.err.println("Kapatmada sorun var:"+exClose);
			}
		}   
	}
}

