
import java.io.*; 
import java.util.*;

public class Test4 {

	private static final int TAMPBOYUT = 200000;
	private static byte buf[] = new byte[TAMPBOYUT];


	public static void kopyala(String kaynak, String hedef) throws IOException {

		InputStream okuyucu = null ;
		OutputStream yazici = null ;

		try {

			okuyucu = new FileInputStream(kaynak);
			yazici = new FileOutputStream(hedef);
			long baslamaZamani = new Date().getTime();
			while(true) {
				int okunan = okuyucu.read(buf);
				if(okunan == -1) {
					break;
				}
				yazici.write(buf);
			}
			long bitisZamani =  new Date().getTime() - baslamaZamani ;
			System.out.println("Toplam gecen sure:"+bitisZamani+"ms");
			okuyucu.close();
			yazici.close();
		} finally {
			if(okuyucu != null) {
				okuyucu.close();
			}
			if(yazici != null) {
				yazici.close();
			}
		}
	}

	public static void main(String args[]) throws IOException {

		if( (args[0]==null) && (args[1]==null) ) {
			System.out.println("Girilen parametreler eksik!");
			System.out.println("args[0] = kopyalanacak olan dosya"
					   +" ismi (kaynak)");
			System.out.println("args[1] = yeni olusasacak olan dosya"
					   +" ismi (hedef)");
			System.exit(-1);
		}
		
		kopyala(args[0],args[1]);

	}
}
