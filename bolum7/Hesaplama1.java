
public class Hesaplama1 {


	public class Toplama { //Uye dahili sinif   -  public 
		public  int toplamaYap(int a, int b) {
			return a + b ; 
		}
	}  // class Toplama

	protected  class Cikartma {	//Uye dahili sinif - protected 
		public  int cikartmaYap(int a, int b) {
			return a - b ; 
		}
	}  // class Cikartma

	class Carpma { //Uye dahili sinif -friendly
		public  int carpmaYap(int a, int b) {
			return a * b ; 
		}
	}  // class Carpma

	    private class Bolme { //Uye dahili sinif - private 
		public  int bolmeYap(int a, int b) {
			return a / b ; 
		}
	}  // class Bolme


	public static void main(String args[]) {
		
		Hesaplama1.Toplama  ht   =   new Hesaplama1().new Toplama() ;
		Hesaplama1.Cikartma hck = new Hesaplama1().new Cikartma() ;
		Hesaplama1.Carpma   hcp = new Hesaplama1().new Carpma() ;
		Hesaplama1.Bolme     hb =   new Hesaplama1().new Bolme() ;

		int sonuc1 = ht.toplamaYap(10,5);
		int sonuc2 = hck.cikartmaYap(10,5);
		int sonuc3 = hcp.carpmaYap(10,5);
		int sonuc4 = hb.bolmeYap(10,5);

		System.out.println("Toplama  Sonuc = " + sonuc1 );
		System.out.println("Cikartma Sonuc = " + sonuc2 );
		System.out.println("Carpma   Sonuc = " + sonuc3 );
		System.out.println("Bolme    Sonuc = " + sonuc4 );
	}


} // class Hesaplama

