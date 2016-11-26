
class Calisan6111 {
	public String pozisyon = "Calisan";
	public void calis() {
	}
}

class Mudur6111  {

	public String pozisyon = "Mudur";

	public Mudur6111 () { // yapilandirici
		pozisyon = "Mudur" ;
	}
	public void calis() {  
		System.out.println("Mudur Calisiyor");
	}
}

class Programci6111 {

	public String pozisyon = "Programci";

	public  Programci6111() {  // yapilandirici
		pozisyon = "Programci" ;
	}
	public void calis() {	
		System.out.println("Programci Calisiyor");
	}
}

class Pazarlamaci6111 {

	public String pozisyon = "Pazarlamaci";
	
	public  Pazarlamaci6111() {	// yapilandirici
		pozisyon = "Pazarlamaci" ;
	}

	public void calis() {  // iptal etme (override)
		System.out.println("Pazarlamaci Calisiyor");
	}
}


public class IsYeriNon {

	public static  void mesaiBasla(Object[] o ) {
		
		for ( int i = 0 ; i < o.length ; i++ ) {
			
			if ( o[i] instanceof Calisan6111 ) {
				  Calisan6111 c = (Calisan6111) o[i] ; // asagiya dogru cevirim
				  c.calis();

			} else if ( o[i] instanceof Mudur6111 ) {
				  Mudur6111 m = (Mudur6111) o[i] ; // asagiya dogru cevirim
				  m.calis();

			} else if ( o[i] instanceof Programci6111 ) {
                  Programci6111 p = (Programci6111) o[i] ; // asagiya dogru cevirim
				  p.calis();
			} else if ( o[i] instanceof Pazarlamaci6111 ) {
                  Pazarlamaci6111 paz = (Pazarlamaci6111) o[i] ; // asagiya dogru cevirim
				  paz.calis();
			} 
			
			//...
		}
	}

	public static void main(String args[]) {
	
		Object[] o = new Object[4];
		o[0] = new Calisan6111();     // yukari dogru cevirim (upcasting)
		o[1] = new Programci6111();	  // yukari dogru cevirim (upcasting)
		o[2] = new Pazarlamaci6111(); // yukari dogru cevirim (upcasting)
		o[3] = new Mudur6111();	      // yukari dogru cevirim (upcasting)
		mesaiBasla(o);
	}
}

