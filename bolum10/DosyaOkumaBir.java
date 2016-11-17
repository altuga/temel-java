
import java.io.*;
public class DosyaOkumaBir {
	
	public static void main(String args[]) {
		if(args.length != 1) {
			System.err.println("Dosya ismi eksik !");
			System.exit(1);
		}
		try {
			InputStream is = new FileInputStream(args[0]);
			int b ;
			while((b = is.read()) != -1) {
				System.out.println(b + "-" + (char)b );
			}
			is.close(); // baglantiyi kapat
			
		} catch(IOException e) {
			System.err.println(e);
		}
	}
}

