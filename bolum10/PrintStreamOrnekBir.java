
import java.io.* ;

public class PrintStreamOrnekBir {

	private String[] stringDizisi = 
	{ "KOCAELI", "SAKARYA", "BURSA"};

	private double[] doubleDizisi = 
	{ 10.2, 11.8, 13.1} ;

	private int[] intDizisi = 
	{ 2, 3, 4} ;



	public void dosyayaYaz(String dosyaIsmi) throws IOException {
		
		FileOutputStream fos = new FileOutputStream( dosyaIsmi );
		PrintStream ps = new PrintStream(fos);

		for(int i=0; i<3; i++) {
			ps.print(stringDizisi[i]); // String
			ps.print("-");
			ps.print(doubleDizisi[i]); // double
			ps.print("-");
			ps.print(intDizisi[i]);  // int
			ps.println();
			
			boolean kontrol = ps.checkError();
			if(kontrol) { // hata varsa
				throw new IOException("Hata var...");
			} 
		} 
		ps.close();

	}

	public static void main(String args[]) throws IOException {

		/* Dosya  kontrol */
		if(args.length != 1) {
			System.err.println("Dosya ismi eksik !");
			System.exit(1);
		}
		PrintStreamOrnekBir psob = new PrintStreamOrnekBir();
		psob.dosyayaYaz(args[0]);
	}
}
