

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
	System.out.println("miyavv " + cins + "-" + yas);
    }

}	  	


public class Dondurucu {

    private ObjectOutputStream dondur ;
    
    public Dondurucu() throws IOException{
	 dondur = new ObjectOutputStream( new FileOutputStream("kedi.nsn") );
    }
    
    public void dondur(Kedi k) throws IOException{ 
	// Kediyi donduruyoruz
	dondur.writeObject(k);
    }

    public void dondurucuyuKapat() throws IOException {
        dondur.close(); // kapama islemi
    }

    public static void main(String args[]) throws IOException {
	Dondurucu d = new Dondurucu();
	Kedi k = new Kedi("Duman", "Van Kedisi", 4);
	d.dondur(k);
	d.dondurucuyuKapat();
	System.out.println("Kedi donduruldu");
    } 
}
