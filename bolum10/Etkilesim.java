
import java.io.*;

public class Etkilesim {

	public static void main(String args[]) throws Exception{

		for(;;) {

			System.out.print("Lutfen Seciminizi Girin: 1|2|3 - C (CIKIS):");
			int okunan = new BufferedInputStream(System.in).read();
			if(okunan == 49) {
				System.out.println("Bir");
			} else if(okunan == 50) {
				System.out.println("Iki");
			} else if(okunan == 51) {
				System.out.println("Uc");
			} else if(okunan == 67) {
				break; // donguden cik
			} else {
				System.out.print("Tanimsiz\n");
			}
		}
		System.out.print("Uygulama Sonlanmistir");
	}
}
