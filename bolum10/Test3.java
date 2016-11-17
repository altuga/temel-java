
import java.io.*; 
import java.util.*;

public class Test3 {

	public static void kopyala(String kaynak, String hedef) throws IOException {

		InputStream okuyucu = null ;
		OutputStream yazici = null ;

		try {

			okuyucu = new FileInputStream(kaynak);
			yazici = new FileOutputStream(hedef);
			
			// Dosya boyutu aliniyor.
			int dosyaUzunlugu = okuyucu.available();
			long baslamaZamani = new Date().getTime();
			byte buf[] = new byte[dosyaUzunlugu];
			okuyucu.read(buf);
			yazici.write(buf);
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
