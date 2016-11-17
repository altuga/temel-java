

import java.io.*;


class Filtre implements FilenameFilter {

	private String dosyaUzanti  ;

	public Filtre(String uzanti) {

		if( uzanti.startsWith( "." ))
			dosyaUzanti = uzanti;
		else
			dosyaUzanti	= "." + uzanti;     
	}

	public boolean accept(File dizin, String dosyaIsmi) {

		if( dosyaIsmi.endsWith( dosyaUzanti ) )
			return true;
		else
			return false;

	}
}

public class GelismisListeliyici {


	public void listele(String dizin, String uzanti) {
		File dosyalar = new File(dizin);
		String[] dosyaListesi = dosyalar.list(new Filtre(uzanti));// dikkat
		for(int i=0 ; i<dosyaListesi.length; i++) {
			System.out.println(dosyaListesi[i]);
		}

	}


	public static void main(String[] args) throws IOException {
		if(args.length != 2) {
			throw new IOException("Listelenecek olan dizini ve "+
								  " dosya uzantisini giriniz");
		}

		GelismisListeliyici gl = new GelismisListeliyici();
		gl.listele(args[0],args[1]);
	} 
}
