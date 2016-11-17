
import java.io.*;

public class StringBufferOrnek {

    private static String[] iller = { "Kocaeli", "Bursa", "Sakarya", "Afyon" } ;

    public static void main(String args[]) throws IOException {
	StringWriter swrt  = new StringWriter();
	for(int i=0 ; i<stamp.length; i++) {
	    swrt.write(stamp[i]); // String nesnelerini yazdiriyoruz
	    swrt.write('-'); // tek bir char yazdiriyoruz
	}

	System.out.println(swrt.toString());
	StringBuffer sf = swrt.getBuffer();
	System.out.println(sf.reverse().toString());
    }
}

