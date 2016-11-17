

public class FirlatimOrnek2 {


	public int basla(int a, int b) throws Exception {
		int sonuc = 0 ;  
		try {
			sonuc = a / b ; 
		} catch(Exception ex) {
			System.out.println("basla() istisna yakalandi"); 
			throw ex; 
		} finally {
			System.out.println("sonuc : "+ sonuc); 
			return sonuc ;
		}
	}

	public static void main(String args[]) {
		try {
			FirlatimOrnek2 fo2 = new FirlatimOrnek2();
			fo2.basla(1,0);
		} catch(Exception ex) {
			System.out.println("main() istisna yakalandi"); 
		}
	}
}
