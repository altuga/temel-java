
import java.io.*;
public class DosyaOkumaDort {

	public static void main(String args[]) {
		if ( args.length != 1 ) {
			System.err.println("Dosya ismi eksik !");
			System.exit(1);
		}
		try {
			InputStream is = new FileInputStream(args[0]); //Dikkat
			int okunabilecekByteSayisi = is.available();
			System.out.println("okunabilecekByteSayisi = " +
					    okunabilecekByteSayisi);
			is.close();// baglantiyi kapat

		} catch ( IOException e ) {
			System.err.println(e);
		}
	}  
}

