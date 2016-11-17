
import java.io.*;

public class BufferedWriterOrnek {

	private char[] btamp = null ;
	PrintWriter yazici = null ;
	BufferedReader okuyucu = null ;


	public BufferedWriterOrnek() throws IOException {

		okuyucu = new BufferedReader(new FileReader("yazi3.txt"));

		// Dikkat
		yazici = new PrintWriter(new BufferedWriter(new FileWriter("bwo.txt"))); 
	}


	public void oku() {

		try {
			String okunan = okuyucu.readLine();
			while (okunan != null) {
				okunan = okuyucu.readLine();
				yaz(okunan);
			}
			okuyucu.close();
			yazici.close();

		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}

	public void yaz(String yazilacak) throws IOException {
		if (yazilacak == null)
			return;	 // null ise  yazma

		yazici.println(yazilacak);

	}

	public static void main(String args[]) throws IOException {
		BufferedWriterOrnek tampwo = new  BufferedWriterOrnek();  
		tampwo.oku();
	}
}
