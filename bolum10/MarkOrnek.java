
import java.io.*;
public class MarkOrnek {

	public static void main(String args[]) throws Exception{


		InputStream is = null;
		BufferedInputStream bis = null ;
		try {
			is = new FileInputStream(new File(args[0]));
				bis = new BufferedInputStream(is,4);

			int ch;
			int readings = 0;
			boolean marked = bis.markSupported();
			if(!marked) {
				throw new Exception("mark()/reset() desteklenmiyor");
			}
			boolean  resetlenmis =  false;

			// dosya sonuna kadar oku(EOF)

			while((ch = bis.read()) != -1) {

				System.out.println("-" + ch);
			    //System.out.println("buf.length =  "  + bis.getBufferSize());
				// B harfinin posizyonunu isaretle (mark)
				if( (ch == 66) ) {	// B harfi
					bis.mark(1); // 1 bayti 
				}
			}

			System.out.println("Ikinci donguye giriyor");
			bis.reset();
			while((ch = bis.read()) != -1) { 
				System.out.println("-" + ch);
			}


		} finally {
			try {
				bis.close();
			} catch(Throwable t) {
				// bisey yapma
			}
		}

	}
}

