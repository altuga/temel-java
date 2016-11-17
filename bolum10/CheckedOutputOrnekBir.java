
import java.io.* ;
import java.util.zip.*;

public class CheckedOutputOrnekBir {

	private static byte[] veriDizisi = 
	{   'A', 'B', 'C', 'D', 'E', 'F', 'G',
		'H', 'I', 'J', 'K', 'L', 'M', 'N',
		'O', 'P', 'Q', 'R', 'S', 'T', 'U',
		'1', '2', '3', '4', '5', '6', '7'
	} ;



	public static void yaz(CheckedOutputStream cos) throws IOException {

		for(int i=0; i<veriDizisi.length; i++) {
			cos.write( veriDizisi[i] );
		}   

	}

	public static void main(String args[]) {

		/* Dosya  kontrol */
		if(args.length != 1) {
			System.err.println("Dosya ismi eksik !");
			System.exit(1);
		}

		try {

			CRC32 crc32r = new CRC32();
			

			FileOutputStream fos = new  FileOutputStream(args[0]);
			CheckedOutputStream cos = new CheckedOutputStream(fos, crc32r);
			yaz(cos); //yazdirma islemi
			Checksum cs = cos.getChecksum();

			//CRC32 icin 
			double cisDeger = cs.getValue();
			System.out.println("CRC32 = " + cisDeger);
			fos.close();
		} catch(IOException exIo) {
			System.err.println("Hata var --> " + exIo);
		}
	}
}
