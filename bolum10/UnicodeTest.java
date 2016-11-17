

import java.io.*;

public class UnicodeTest { 

	
	public static void main(String[] args) throws IOException {
		
		String krakterler = "abcð" ;
		System.out.println( UnicodeBulucu.unicodeBul(krakterler) );
		
		krakterler = new String( krakterler.getBytes("ISO8859-9"),"ISO8859-1" );
		System.out.println( UnicodeBulucu.unicodeBul(krakterler) );
		
		krakterler = new String( krakterler.getBytes("ISO8859-1"),"ISO8859-4" );			
		System.out.println( UnicodeBulucu.unicodeBul(krakterler) );
		
		krakterler = new String( krakterler.getBytes("ISO8859-4"),"ISO8859-9" );
		System.out.println( UnicodeBulucu.unicodeBul(krakterler) );
	}
}
