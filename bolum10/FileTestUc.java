

import java.io.*;

public class FileTestUc {

    public static void main(String[] args) throws IOException {
	
	String ayirac = File.separator ;
	File dosya = File.createTempFile("test","tmp", new File(ayirac+"temp") );
	dosya.deleteOnExit(); // onemli

	PrintWriter  yazici = new PrintWriter (new FileWriter(dosya)) ; 
        yazici.println("Merhabalar");
	yazici.close();	// onemli
		
	// okuma islemi
	// gecici dosyadan verileri okuyoruz.
	BufferedReader okuyucu = new BufferedReader( new FileReader(dosya));
	String okunan = okuyucu.readLine();
	while(okunan != null) {
	    System.out.println(okunan);
	    okunan = okuyucu.readLine(); 
	}

	okuyucu.close();// onemli
    } 
}
