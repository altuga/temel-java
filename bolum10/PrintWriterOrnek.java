
import java.io.*;

public class PrintWriterOrnek {

	private static char[] ctamp = { 's','e','l','a','m'}   ;
	private static String[] stamp = { "selam", "kedi", "yarasa", "maymun", "penguen"} ;
	private static double[] dtamp = {1.23, 1.01, 3.43, 3.2, 4.2};

	public static void main(String[] args) throws IOException {

		FileWriter fw = new FileWriter("pwo.txt");
		PrintWriter pw = new PrintWriter(fw); // Dikkat

		// 3 diziyide hedef kaynaga yazdir
		for(int i=0; i<3; i++) {
			for(int j=0; j<5; j++) {
				if(i==0) {
					pw.print(ctamp[j]+"-");
				} else if(i==1) {
					pw.print(stamp[j]+"-");
				} else if(i==2) {
					pw.print(dtamp[j]+"-");
				}
			}
			pw.println();
			pw.println("------");
		}

		pw.close();// kapat
	}
}
