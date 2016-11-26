abstract class Calisan6098 {

    public String pozisyon="Calisan" ;
    public abstract  void calis(); 
	
    public void zamIste() {
	System.out.println("Calisan zamIste");
    }
}

class Mudur6098 extends Calisan6098 {
    
    public Mudur6098 () { // yapilandirici
	 pozisyon = "Mudur" ;
    }
	
    public void calis() {  // iptal etme (override)
	System.out.println("Mudur Calisiyor");
    }
}

class Programci6098 extends Calisan6098 {
    
    public  Programci6098() { // yapilandirici
	pozisyon = "Programci" ;
    }
    public void calis() {  // iptal etme (override)
	System.out.println("Programci Calisiyor");
    }

    public void zamIste() {  // iptal etme (override)
	System.out.println("Programci Zam Istiyor");
    }
}

class Pazarlamaci6098 extends Calisan6098 {
    
    public  Pazarlamaci6098() { // yapilandirici
	pozisyon = "Pazarlamaci" ;
    }
    public void calis() { // iptal etme (override)
	System.out.println("Pazarlamaci Calisiyor");
    }
}


public class AbIsYeri {
    
    public static  void mesaiBasla(Calisan6098[] c ) {
	for (int i = 0 ; i < c.length ; i++) {
	    c[i].calis(); // !Dikkat!
	}

    }

    public static void main(String args[]) {
	      Calisan6098[] c = new Calisan6098[3];
	      // c[0] = new Calisan(); // soyut siniflar new ile direk olusturulamazlar
	      c[0] = new Programci6098(); // yukari dogru cevirim (upcasting)
	      c[1] = new Pazarlamaci6098(); // yukari dogru cevirim (upcasting)
	      c[2] = new Mudur6098(); // yukari dogru cevirim (upcasting)

	      mesaiBasla(c);
    }
}
