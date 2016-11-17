

import java.io.*;

public class FileTestIki {

    public static void main(String[] args) throws IOException {
	
	File dosya = new File("Test1.txt");
	boolean olustuMu = dosya.createNewFile(); // fiziksel bir dosya olustur.
        System.out.println("olustuMu:"+olustuMu);
    } 
}
