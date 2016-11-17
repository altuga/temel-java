
public class CopNesne {

	public static void main(String args[]) {
		Elma e = new Elma(1);
		new Elma(2);
		System.gc() ; // çöp toplayýcýsýný çaðýrdýk 
	}
}

