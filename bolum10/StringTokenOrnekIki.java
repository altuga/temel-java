

import java.util.*;
import java.io.*;

public class StringTokenOrnekIki {

	private StringTokenizer st ; 
	private String cumle = "Araba-yolda-bozuldu";

	public StringTokenOrnekIki(boolean ayirac) throws Exception {
		if (ayirac) {
		    st = new StringTokenizer(cumle,"-", true);
		} else {
		    st = new StringTokenizer(cumle,"-");
		}
		
	}

	public void bolumle() throws Exception {
		if (st != null ) {
			while (st.hasMoreElements()) {
				System.out.println("-->" + st.nextToken());
			}
		}
	}

	public static void main( String args[] ) throws Exception {
		
		StringTokenOrnekIki stoi = new StringTokenOrnekIki(true);
		stoi.bolumle();

		System.out.println("------------");

		stoi = new StringTokenOrnekIki(false);
		stoi.bolumle(); 
	}
}
