


import java.io.*;
import java.util.zip.*;
import java.util.Enumeration;

public class ZipIcelikOkuma {


	public void dahaBasitOku(String zipDosyasininIsmi) throws Exception {

		ZipFile zf = new ZipFile(zipDosyasininIsmi);
		Enumeration e = zf.entries();
		while (e.hasMoreElements()) {
			ZipEntry ze2 = (ZipEntry)e.nextElement();
			System.out.println("Dosya ismi " + ze2);

			InputStream in = zf.getInputStream(ze2);// Dikkat
			BufferedInputStream bis = new BufferedInputStream(in);
			int veri;
			while ( (veri=bis.read()) != -1) {
				//System.out.println(veri);
				//........................
			}
		} 
	}


	public void oku(String zipDosyasininIsmi) throws Exception {

		ZipInputStream zis = new ZipInputStream(
							 new BufferedInputStream(
							 new FileInputStream(zipDosyasininIsmi)));

		ZipEntry ze ;
		while ( (ze=zis.getNextEntry()) != null) {
			System.out.println("Dosya ismi " + ze.getName());
			int veri;
			while ( (veri=zis.read()) != -1) {
				//System.out.println(veri);
				//........................
			}

		}
		zis.close();

	}

	public static void main(String[] args) throws Exception {

		if (args.length != 1) {
			throw new IOException("Okunacak olan Zip dosyasini belirtiniz");
		}

		ZipIcelikOkuma zio  = new ZipIcelikOkuma();

		System.out.println("okuma() metodu cagriliyor");
		System.out.println("-------------------------");
		zio.oku(args[0]);
		System.out.println("");
		System.out.println("dahaBasitOku() metodu cagriliyor ");
		System.out.println("-------------------------");
		zio.dahaBasitOku(args[0]);

	} 
}


