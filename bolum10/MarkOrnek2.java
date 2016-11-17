
import java.io.*;
public class MarkOrnek2 {

	public static void main(String args[]) {
		if(args.length != 1) {
			System.err.println("Dosya ismi eksik !");
			System.exit(1);
		}
		try {
			FileInputStream fis = new FileInputStream(args[0]);
			BufferedInputStream bis = new BufferedInputStream(fis);
			int cnt = 0;
			int b;
			boolean markSupported = fis.markSupported();
			System.out.println("markSupported-->" + markSupported);
			while((b = bis.read()) != -1) {
				if(b == '\n') System.out.println();
				System.out.print( (char)b );
				if(markSupported) {
					fis.mark(9);
				}
			}
			fis.close();
			System.out.println(cnt);
		} catch(IOException e) {
			System.err.println(e);
		}
	}

}
