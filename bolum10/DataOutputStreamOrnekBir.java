
import java.io.* ;

public class DataOutputStreamOrnekBir {

	public static void main(String args[]) throws IOException{

		/* Dosya  kontrol */
		if(args.length != 1) {
			System.err.println("Dosya ismi eksik !");
			System.exit(1);
		}

		try {
			FileOutputStream fos = new FileOutputStream( args[0] );
			DataOutputStream dos = new DataOutputStream( fos );
			dos.writeBoolean(false);
			dos.writeDouble(10.2);
			dos.writeInt(8);
			fos.close();
		} catch(IOException exIo) {
			System.err.println("Yazmada hata var --> " + exIo);
		}


		// dosyaya yazdiklarimizi okuma zamani  
		FileInputStream fis = null ;
		DataInputStream dis = null ;
		try {
			fis = new  FileInputStream(args[0]);
			dis = new  DataInputStream(fis); 
			while( true ) {
				boolean b1 = dis.readBoolean();
				System.out.println( "--> " + b1 );

				double d1 = dis.readDouble();
				System.out.println( "--> " + d1 );

				int i1 = dis.readInt();
				System.out.println( "--> " + i1 );

			}
		} catch(EOFException exEof) {
			System.err.println("Dosya Sonu <-o-> ");
		} catch(IOException exIo) {
			System.err.println("Okumada hata var --> " + exIo);
		} finally {
			dis.close();
		} 
	} 
}

