

import java.io.*;

public class BufferedReaderOrnekUc {

	public static void bilgiMesajiGoster() {
		System.out.print("Veri Giriniz (cikmak icin 9'a basiniz):");
	}


	public static void main(String args[]) throws IOException {

		BufferedReader bf =  new BufferedReader(new InputStreamReader(System.in));

		bilgiMesajiGoster();
		String okunan = bf.readLine();
		System.out.println("**"+okunan+"**");
		while( !okunan.equals("9") ){ // -1 girene kadar devam et
			bilgiMesajiGoster();
			okunan = bf.readLine();
			System.out.println("**"+okunan+"**");

		} 
	}   
}



