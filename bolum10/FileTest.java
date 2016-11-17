import java.io.*;

public class FileTest { 

	
	public static void main(String[] args) throws IOException {
		File f = new File("aaa.txt");
		f.createNewFile();
		
		// sifre yaz
		System.out.println("--> " + f.getAbsolutePath() );
		//f.deleteOnExit();
		
	}
	
}