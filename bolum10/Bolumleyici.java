

import java.io.*;


public class Bolumleyici {

	public FileReader okuyucu ;
	public StreamTokenizer st ;


	public  Bolumleyici() throws IOException {

		okuyucu = new FileReader("aciklama.txt");
		st = new  StreamTokenizer(okuyucu);
		st.ordinaryChar('*');
		st.ordinaryChar('-');
		st.ordinaryChar('.');
		st.ordinaryChar('/');
	}



	public void bol() throws IOException {

		while(st.nextToken() != StreamTokenizer.TT_EOF) {

			switch(st.ttype) {
			case StreamTokenizer.TT_EOL:
				break;
			case StreamTokenizer.TT_NUMBER:
				System.out.println("Sayi geldi:" + st.nval);  
			case StreamTokenizer.TT_WORD:
				if(st.sval != null)
					System.out.println("String geldi:" + st.sval);
			}
		} 
	}

	public static void main(String args[]) throws IOException {

		Bolumleyici b = new Bolumleyici();
		b.bol();
		if(b.okuyucu != null) {
			b.okuyucu.close();
		}
	}
}




