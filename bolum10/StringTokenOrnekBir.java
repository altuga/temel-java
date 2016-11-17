import java.util.*;
import java.io.*;

public class StringTokenOrnekBir{

	private StringTokenizer st ; 
	private String cumle = "Araba yolda bozuldu";

	public StringTokenOrnekBir() throws Exception {
		st = new StringTokenizer(cumle);
	}

	public void bolumle() throws Exception {
		if (st != null ) {
			while (st.hasMoreElements()) {
				System.out.println("-->" + st.nextToken());
			}
		}
	}

	public static void main( String args[] ) throws Exception {
		
		StringTokenOrnekBir stob = new StringTokenOrnekBir();
		stob.bolumle();

	}
}

