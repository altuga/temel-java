
import java.io.*;
public class DosyaOkumaBes {

	public static void main(String args[]) {
		if( args.length != 1 ) {
			System.err.println("Dosya ismi eksik !");
			System.exit(1);
		}
		try {
			InputStream is = new FileInputStream(args[0]); //Dikkat
			int b;
			while( (b = is.read()) != -1 ) {
				is.skip(1);	// 1 baytlik atlama
				System.out.println(b + "-" + (char)b );
			}
			is.close();// baglantiyi kapat

		} catch( IOException e ) {
			System.err.println(e);
		}
	}  
}

