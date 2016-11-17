public class  IlkelTipler {

  boolean mantiksal_deger;
  char krakter_deger;
  byte byter_deger;
  short short_deger;
  int int_deger;
  long long_deger;
  float float_deger;
  double double_deger;
  
  public void ekranaBas() {
     System.out.println("Veri Tipleri   Ilk Degerleri");
     System.out.println("boolean        " + mantiksal_deger );
     System.out.println("char           " + krakter_deger); 
     System.out.println("byte           " + byter_deger );
     System.out.println("short          " + short_deger );
     System.out.println("int            " + int_deger );
     System.out.println("long           " + long_deger );
     System.out.println("float          " + float_deger );
     System.out.println("double         " + double_deger);
  }

  public static void main(String args[]) {
	new IlkelTipler().ekranaBas();
	/*     
	       // yukaridaki ifade yerine 
	       // asagidaki ifadeyi de kullanabilirsiniz.
	       IlkelTipler it = new IlkelTipler();
	       it.ekranaBas();
	*/
  }
}

