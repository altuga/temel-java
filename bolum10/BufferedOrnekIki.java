
import java.io.*; 

public class BufferedOrnekIki {

	public static void main(String args[]) throws IOException {
		/* Dosya  kontrol */
		if(args.length != 1) {
			System.err.println("Dosya ismi eksik !");
			System.exit(1);
		}

		// i$leme devam
		InputStream is = null;
		BufferedInputStream bis = null ;
		try {
			is = new FileInputStream(args[0]);
			bis = new BufferedInputStream(is,10); // 10 baytlik blok

			int b ;
			while( (b = bis.read()) != -1 ) {
				System.out.println(b+" - "+ (char)b );
				if(b == 67) { // C harfine esit ise..
					bis.mark(32);//i$aretle
				}
			}

			System.out.println("Makara geri sariliyor...");
			bis.reset();// makarayi geri sar

			while( (b = bis.read()) != -1 ) {
				System.out.println(b+" - "+ (char)b );
			}

		} catch(IOException exIo) {
			System.err.println("Hata Olustu : " + exIo );
		} finally {
			is.close();
		}
	}
}
