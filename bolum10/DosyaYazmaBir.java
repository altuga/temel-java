
import java.io.*;

public class DosyaYazmaBir {

	private static byte[] veriDizisi = {'A','B','C','D','E','F','G'} ;

	public static void main(String args[]) {

		if(args.length != 1) {
			System.err.println("Dosya ismi eksik !");
			System.exit(1);
		}

		FileOutputStream fos = null ;
		try {
			fos = new FileOutputStream(args[0]); // kaynaga baglan
			for(int i=0;i<veriDizisi.length;i++) {
				fos.write( veriDizisi[i] );
			}
		} catch (IOException exIo) {
			System.err.println("Hata Olustu:"+exIo);
		} finally {
		   	try {
				fos.close(); // onemli
			} catch (IOException exClose) {
				System.err.println("Kapatmada sorun var:"+exClose);
			}  
		}   
	}
}
