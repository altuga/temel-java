
import java.io.* ;

public class PushbackOrnekBir {

	public static void main(String args[]) throws IOException{

		/* Dosya  kontrol */
		if(args.length != 1) {
			System.err.println("Dosya ismi eksik !");
			System.exit(1);
		}

		FileInputStream fis = new  FileInputStream(args[0]);
		PushbackInputStream pis = new  PushbackInputStream(fis); 

		try {

			int b  ; 

			b = pis.read();	// A
			System.out.println( b + " --> " + (char)b );

			b = pis.read();	// B
			System.out.println( b + " --> " + (char)b );

			b = pis.read();	// C
			System.out.println( b + " --> " + (char)b );

			b = pis.read();	// D
			System.out.println( b + " --> " + (char)b );

			b = pis.read();	// E
			System.out.println( b + " --> " + (char)b );

			pis.unread(b);	// dikkat
			
			b = pis.read();	// tekrardan E
			System.out.println( b + " --> " + (char)b + " <-> tekrardan okundu");

			b = pis.read();	// F
			System.out.println( b + " --> " + (char)b );

			b = pis.read();	// G
			System.out.println( b + " --> " + (char)b );


		} catch(IOException exIo) {
			System.err.println("Hata Olustu:"+exIo);
		} finally {
			fis.close();
		}
	}
}
