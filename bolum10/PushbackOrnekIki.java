
import java.io.* ;

public class PushbackOrnekIki {

	public static void main(String args[]) throws IOException{

		/* Dosya  kontrol */
		if(args.length != 1) {
			System.err.println("Dosya ismi eksik !");
			System.exit(1);
		}

		FileInputStream fis = new  FileInputStream(args[0]);
		PushbackInputStream pis = new  PushbackInputStream(fis); 

		try {

			int a = pis.read();	// A
			System.out.println( a + " --> " + (char)a );

			int b = pis.read();	// B
			System.out.println( b + " --> " + (char)b );

			int c = pis.read();	// C
			System.out.println( c + " --> " + (char)c );

			int d = pis.read();	// D
			System.out.println( d + " --> " + (char)d );

			int e = pis.read();	// E
			System.out.println( e + " --> " + (char)e );

			pis.unread(d);	// dikkat
			pis.unread(e);	// dikkat 


		} catch(IOException exIo) {
			System.err.println("Hata Olustu:"+exIo);
		} finally {
			fis.close();
		}
	}
}
