
import java.io.*;
public class DosyaOkuma3 {

	public static void main(String args[]) {
		if(args.length != 1) {
			System.err.println("Dosya ismi eksik !");
			System.exit(1);
		}
		try {
			InputStream is = new FileInputStream(args[0]);
			byte bDizi[] = new byte[11];
			is.read(bDizi,2,10);
			for(int i=0;i<10;i++) {
			     System.out.println(bDizi[i]);
			}
			is.close();// baglantiyi kapat
			
		} catch(IOException e) {
			System.err.println(e);
		}
	}

}
