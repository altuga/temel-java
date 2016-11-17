public class ContinueTest {

	public static void main(String[] args) {
	
		for ( int i = 0; i < 30; i++ ) {
			if ( i ==9 ) {// for dongusunu kiriyor
				continue;
			}
			System.out.println("i =" +i);
		}
		System.out.println("Donguden cikti");
	} 
}
