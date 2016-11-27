
interface CalisanMemur {
	public void calis() ;
}

class MudurMemur implements CalisanMemur {

	public void calis() {  // iptal etti (override)
		System.out.println("Mudur Calisiyor");
	}
}

class GenelMudurMemur extends MudurMemur {

	public void calis() {  // iptal etti (override)
		System.out.println("GenelMudur Calisiyor");
	}
	public void toplantiYonet() {  
		System.out.println("GenelMudur toplanti yonetiyor");
	} 
}


class ProgramciMemur implements CalisanMemur {

	public void calis() {  // iptal etti (override)
		System.out.println("Programci Calisiyor");
	}
}

class AnalizProgramciMemur extends ProgramciMemur {

	public void analizYap() {
		System.out.println("Analiz Yapiliyor");
	}  
}

class SistemProgramciMemur extends ProgramciMemur {


	public void sistemIncele() {
		System.out.println("Sistem Inceleniyor");
	}   
}


class PazarlamaciMemur implements CalisanMemur {

	public void calis() { // iptal etti (override)
		System.out.println("Pazarlamaci Calisiyor");
	}
}                                     

class SekreterMemur implements CalisanMemur {

	public void calis() { // iptal etti (override)
		System.out.println("Sekreter Calisiyor");
	}
}


public class DevletDairesi {

	public static  void mesaiBasla(CalisanMemur[] c ) {
		for (int i = 0 ; i < c.length ; i++) {
			c[i].calis(); // ! Dikkat !
		}
	}

	public static void main(String args[]) {
		CalisanMemur[] c = new CalisanMemur[6];
		// c[0] = new Calisan(); ! Hata ! arayüz olusturulamaz
		c[0] = new ProgramciMemur();	//yukari dogru cevirim (upcasting)
		c[1] = new PazarlamaciMemur();  //yukari dogru cevirim (upcasting)
		c[2] = new MudurMemur();	 //yukari dogru cevirim (upcasting)
		c[3] = new GenelMudurMemur();  //yukari dogru cevirim (upcasting)
		c[4] = new AnalizProgramciMemur(); //yukari dogru cevirim (upcasting)
		c[5] = new SistemProgramciMemur();//yukari dogru cevirim (upcasting)
		mesaiBasla(c);
	}
}

