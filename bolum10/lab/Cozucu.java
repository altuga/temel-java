
import java.io.*;

public class Cozucu {


	public static void main(String args[]) throws Exception {

		ObjectInputStream coz  = new ObjectInputStream(
													  new FileInputStream("kedi.nsn"));

		Object k =  coz.readObject();
		coz.close();
		System.out.println( k.toString());
	}
}
