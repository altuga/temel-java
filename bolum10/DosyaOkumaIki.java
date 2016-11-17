
import java.io.*;
public class DosyaOkumaIki {

	public static void main(String args[]) {
		if(args.length != 1) {
			System.err.println("Dosya ismi eksik !");
			System.exit(1);
		}
		try {
			InputStream is = new FileInputStream(args[0]); //Dikkat
			byte[] bDizi = new byte[100];
			int okunanByteSayisi ;
			while( (okunanByteSayisi = is.read(bDizi)) != -1 ) {
				for(int i=0; i<okunanByteSayisi; i++) {
					System.out.println(bDizi[i] + "-" + (char)bDizi[i] );
				}
				System.out.println("Okunan byte dizisi : "+okunanByteSayisi+" ");
						
			}
			System.out.println("Okunan byte dizisi (dosya sonu) : "+okunanByteSayisi+" ");
			is.close();// baglantiyi kapat

		} catch(IOException e) {
			System.err.println(e);
		}
	} 
}

