
import java.io.* ;
import java.util.zip.*;

public class CheckedOrnekIki {

	public static void main(String args[]) {

		/* Dosya  kontrol */
		if(args.length != 1) {
			System.err.println("Dosya ismi eksik !");
			System.exit(1);
		} 

		try {

			Adler32 adler32r = new Adler32();
			FileInputStream fis = new  FileInputStream(args[0]);
			CheckedInputStream cis = new CheckedInputStream(fis,adler32r);
			
			int b ; 
			while( (b = cis.read()) != -1 ) {
				System.out.println(b+" - "+ (char)b );
			}

			Checksum cs = cis.getChecksum();
			double cisDeger = cs.getValue();
			System.out.println("Adler32 = " + cisDeger);
			fis.close();
		} catch(IOException exIo) {
			System.err.println("Hata var --> " + exIo);
		}
	}
}
