


import java.io.*;
import java.util.zip.*;

public class GZIPIcelikOkuma {


	public void oku(String zipDosyasininIsmi) throws Exception {

		GZIPInputStream gzis = new GZIPInputStream(
							   new BufferedInputStream(
							   new FileInputStream(zipDosyasininIsmi)));


		byte btmp[] = new byte[2048] ; 
		int okunanveriSayisi ;
		while ( (okunanveriSayisi = gzis.read(btmp,0,btmp.length)) != -1) {

			System.out.println(okunanveriSayisi);   
			System.out.println(btmp);
			// okuma islemi ....
		}


		gzis.close();

	}

	public static void main(String[] args) throws Exception {

		if (args.length != 1) {
			throw new IOException("Okunacak olan GZIP dosyasini belirtiniz");
		}

		GZIPIcelikOkuma zio  = new GZIPIcelikOkuma();

		System.out.println("okuma() metodu cagriliyor");
		System.out.println("-------------------------");
		zio.oku(args[0]); 
	} 
}


