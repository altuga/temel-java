
class LG {

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

class SuperLG extends LG {
	
	public void sesAc() {  // iptal etme (override)
		System.out.println("Y model televizyon sesAc()");
	}

	public void sesKapa() { // iptal etme (override)
		System.out.println("Y model televizyon sesKapa()");
	}

	public void kanalDegistir() {  // iptal etme (override)
		System.out.println("Y model televizyon kanalDegistir() ");
	}

	public void teleText() { // kat�lan yeni bir �zellik
		System.out.println("Y model televizyon teleText()");
	}

}

public class Televizyon {
	public static void main(String args[]) {

		// yukari dogru cevirim ( upcasting )
		LG  lg  = new LG();
		lg.sesAc();
		lg.sesKapa();
		lg.kanalDegistir();
		
		//!! hata !! , bu kumandanin boyle bir dugmesi yok :)
		// lg.teleText() ;
	}
}

