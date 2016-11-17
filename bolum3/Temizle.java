class Elma {

	int i = 0 ;
	Elma(int y) {
		this.i = y ;
		System.out.println("Elma Nesnesi Olusturuluyor = " + i );        
	}

	public void finalize() {
		System.out.println("Elma Nesnesi Yok Ediliyor = "+ i );
	} 
}

public class Temizle {

	public static void main(String args[]) {
		for (int y=0 ; y<10 ;y++) {
			Elma e = new Elma(y);
		}

		for (int y=10 ; y<21 ;y++) {
			Elma e = new Elma(y);
		}
	}
}

