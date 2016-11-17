

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Collection;

public class SiralamaBir {

    public static void ekranaBas(Collection c) {
	System.out.println("-------------------------");
	Iterator iterator = c.iterator();
	while (iterator.hasNext()) {
	    System.out.println("-->" + iterator.next());
	}
    }
     
    public static void main(String args[]) {
     
	 ArrayList sayiTorbasi = new ArrayList();
	 for (int i=0; i<15; i++) {
	     int sayi = ((int) (Math.random() * 100));
	     sayiTorbasi.add(new Integer(sayi));
	 }
	 ekranaBas(sayiTorbasi);
	 Collections.sort(sayiTorbasi); // dikkat
	 // ekranaBas(sayiTorbasi);
     System.out.println(sayiTorbasi);     // Böyle yapsak ??
     }
}
