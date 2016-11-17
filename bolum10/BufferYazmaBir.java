
import java.io.*;

public class BufferYazmaBir {

	private static byte[] veriDizisi = {'A','B','C','D','E','F','G'} ;

	public static void main(String args[]) {

		if( args.length != 1 ) {
			System.err.println("Dosya ismi eksik !");
			System.exit(1);
		}

		FileOutputStream fos = null ;
		BufferedOutputStream bos = null ; 
		try {

			fos = new FileOutputStream(args[0]); // kaynaga baglan

			bos = new BufferedOutputStream(fos,100); // Tamponlama
			bos.write( veriDizisi);	// icsel diziye aktarim

		} catch( IOException exIo ) {
			System.err.println("Hata Olustu:"+exIo);
		} finally {
			try {
			    bos.close(); //  kapatma islemi  
			} catch( IOException exClose ) {
				System.err.println("Kapatmada sorun var:"+exClose);
			}
		}   
	}
}

