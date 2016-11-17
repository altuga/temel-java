
import java.io.*; 
import java.util.*;

public class KrTest2 {

	public static void kopyala(String kaynak, String hedef) throws IOException {
		
		BufferedReader okuyucu = null ;
		BufferedWriter yazici = null ;
		
		try {
			
			Reader okunacakDosya = new FileReader(kaynak);
			okuyucu = new BufferedReader(okunacakDosya);

			Writer yazilacakDosya = new FileWriter(hedef);
			yazici = new BufferedWriter(yazilacakDosya);

			long baslamaZamani = new Date().getTime();
			while(true) {
				int veri = okuyucu.read();
				if(veri == -1) {
					break;
				}
				yazici.write(veri);
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
