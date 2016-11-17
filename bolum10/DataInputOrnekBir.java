
import java.io.* ;

public class DataInputOrnekBir {

	public static void main(String args[]) throws Exception{

		/* Dosya  kontrol */
		if(args.length != 1) {
			System.err.println("Dosya ismi eksik !");
			System.exit(1);
		}

		FileInputStream fis = new  FileInputStream(args[0]);
		DataInputStream dis = new  DataInputStream(fis); 

		try {
			byte c ; 
			double d ;
			while( true ) {
				c = dis.readByte();  
				System.out.println( "--> " + c );
			}
		} catch(EOFException exEof) {
			System.err.println("Dosya Sonu <-o-> ");
		} catch(IOException exIo) {
			System.err.println("Hata Var: "+exIo);
		} finally {
			fis.close();
		}
	}
}
