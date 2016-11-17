
public class IstisnaSiralamasi3 {  

    public static void main(String args[]) {
	  try {
	     throw new  IstisnaIki(); // dikkat
	  } catch (IstisnaBir is1) {
	      System.out.println("istisna yakalandi IstisnaBir: " );
	  } catch (IstisnaIki is2) {
	      System.out.println("istisna yakalandi IstisnaIki: " );	
	  }
    }
}

