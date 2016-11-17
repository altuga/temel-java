
interface Toplayici {
	public int hesaplamaYap() ;
}


public class Hesaplama8 {

	public Toplayici topla(final int a, final int b) {
		return new Toplayici() {
			public int hesaplamaYap()  {
				
				// final olan yerel degiskenlere ulasabilir. 
				return a + b ; 
			}
		}; // noktali virgul sart

	} // topla, metod sonu


	public static void main(String args[]) {

		Hesaplama8 h8 = new Hesaplama8();
		Toplayici t  = h8.topla(5,9);
		int sonuc = t.hesaplamaYap();
		System.out.println("Sonuc  =  5 + 9  =  " + sonuc );
	}
} // class Hesaplama8




