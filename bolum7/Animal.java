
interface Animal {
	public void avlan() ;

}

abstract class Cat implements Animal {

	public abstract  void takipEt() ;
}

class Tiger extends Cat {

	public void avlan() { // iptal etti (override)
		System.out.println("Kaplan takip ediyor...");
	}


	public void takipEt() {	// iptal etti (override)
		System.out.println("Kaplan takip ediyor...");
	}                         

}
