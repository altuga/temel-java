import java.io.*;

public class Ispat {

	private static byte[] veriDizisi = new byte[2048];

	public static void main(String args[]) throws IOException {
				
		char[] veriDizisi =  {'ð','A','c','H','þ'};
		FileOutputStream fos = null ;
		try {
			fos = new FileOutputStream("yazi4.txt"); // kaynaga baglan
			
			for(int i=0; i<veriDizisi.length; i++) {
				fos.write( veriDizisi[i] );	// teker teker aktarim
			}    
		} catch(IOException exIo) {
			System.err.println("Yazmada Hata Olustu:"+exIo);
		} finally {
			fos.close(); // onemli
		} 
	}
}

