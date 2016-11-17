import java.io.*;
public class DosyaOkumaUc {

	public static void main(String args[]) {
		if ( args.length != 1 ) {
			System.err.println("Dosya ismi eksik !");
			System.exit(1);
		}
		try {
			InputStream is = new FileInputStream(args[0]); //Dikkat
			byte bDizi[] = new byte[12];
			int okunanByteSayisi;
			while ( (okunanByteSayisi = is.read(bDizi,2,10)) != -1 ) { 
				for ( int i=0;i<12;i++ ) {
					System.out.println(bDizi[i] + "-" + (char)bDizi[i] );
				}
			}
			is.close();// baglantiyi kapat

		} catch ( IOException e ) {
			System.err.println(e);
		}
	}  
}

