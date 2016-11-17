import java.io.*; 

class Cekirdek implements Serializable {

	public String isim;    
	public double d ;

	public Cekirdek( String isim, double d) {
		this.isim = isim;
		this.d = d ;
		System.out.println("Cekirdek yapilandirici method");
	}
}

public class DonusumTest1 {


	public static void main(String args[]) throws Exception {

		Cekirdek c = new Cekirdek("Test Programi", 2.33d);

		// Yazma i$lemi
		FileOutputStream fos = new  FileOutputStream("cek.nsn");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(c);
		fos.close();

		// Yazdiklamizi okuyalim
		FileInputStream fis =   new FileInputStream("cek.nsn");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Cekirdek c2 = (Cekirdek) ois.readObject();
		fis.close();

		System.out.println("c2.isim = " +  c2.isim);
		System.out.println("c2.d = " +  c2.d); 
	}
}

