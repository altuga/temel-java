
public class Hesaplama2 {
    
    int sabit  = 2 ; 

    public class Toplama2 { //Uye dahili sinf 
                public  int toplamaYap(int a, int b) {
		    return  (a+b) + sabit  ; 
		}
    }  // class Toplama

   public static void main(String args[]) {
       Hesaplama2.Toplama2 ht = new Hesaplama2().new Toplama2() ;
       int sonuc = ht.toplamaYap(10,5);
       System.out.println("Sonuc  =  10 + 5 + sabit   " + sonuc );
   }


} // class Hesapla

