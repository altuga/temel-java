
import java.io.*;

class Kedi implements Serializable {
    
    public String isim ; 
    public String cins ;
    public int yas ;

    public Kedi(String isim, String cins, int yas) {
	    this.isim = isim ;
	    this.cins = cins ;
	    this.yas  = yas	;

    }

    public void miyavla() {
	    System.out.println("miyavv " + cins );
	    System.out.println("miyavv " + yas);
	    int x = 3+5 ; 
	    double d = 3.5 * 8*9 ; 
    }  
}




