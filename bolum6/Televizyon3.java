

class Samsung {
	public void sesAc() {
		System.out.println("X model televizyon sesAc()");
	}

	public void sesKapa() {
		System.out.println("X model televizyon sesKapa()");
	}

	public void kanalDegistir() {
		System.out.println("X model televizyon kanalDegistir()");
	}
}

class SuperSamsung extends Samsung {
	public void sesAc() {  // iptal ediyor (override)
		System.out.println("Y model televizyon sesAc()");
	}

	public void sesKapa() {	// iptal ediyor (override)
		System.out.println("Y model televizyon sesKapa()");
	}

	public void kanalDegistir() {  // iptal ediyor (override)
		System.out.println("Y model televizyon kanalDegistir() ");
	}

	public void teleText() {
		System.out.println("Y model televizyon teleText()");
	}

}

public class Televizyon3 {
	public static void main(String args[]) {
		
		Object[] ob = new Object[2] ;
		ob[0] = new Samsung() ;
		ob[1] = new SuperSamsung() ;

		for (int i = 0 ; i < ob.length ; i++) {

			Object o = ob[i] ;
			if (o instanceof SuperSamsung) {	// RTTI
				SuperSamsung superSamsung = (SuperSamsung) o ; //artik guvenli
				superSamsung.sesAc();
				superSamsung.sesKapa();
				superSamsung.kanalDegistir();
				superSamsung.teleText() ;
			} else if (o instanceof Samsung) { // RTTI
				Samsung samsung = (Samsung) o ; // artik guvenli
				samsung.sesAc();
				samsung.sesKapa();
				samsung.kanalDegistir();

			}
		}

	}
}

