

import java.io.*;


class UltraGelismisNesne implements Externalizable  {
    
    int d ;
    String s ;
    
    public UltraGelismisNesne() {
	System.out.println("UltraGelismisOrnek varsayilan yapilandirici");
    }

    public UltraGelismisNesne(int d, String s) {
	this.d = d ;
	this.s = s ;
    }

    public void readExternal(ObjectInput in) throws IOException,ClassNotFoundException {
	System.out.println("okunuyor");
    }
    
    public void writeExternal(ObjectOutput out) throws IOException {
	System.out.println("yaziliyor");
    }
}


public class UltraGelismisExtest {  

    public static void main(String args[]) throws Exception {
	 
	if (args.length != 2) {
	    System.err.println("Parametreler eksik girilmis !");
	    System.exit(-1);
	}

	int i = Integer.parseInt(args[0]);
	UltraGelismisNesne ugn = new UltraGelismisNesne(i, args[1] );
	FileOutputStream fos = new FileOutputStream("ultragelismis.out");
	ObjectOutputStream oos = new  ObjectOutputStream(fos);
	System.out.println("Dosyaya yaziliyor");
	oos.writeObject(ugn);
	fos.close();
	
	FileInputStream fis = new FileInputStream("ultragelismis.out");
	ObjectInputStream ois = new ObjectInputStream(fis);
	System.out.println("Dosyaya okunuyor");
	UltraGelismisNesne ugn2 = (UltraGelismisNesne) ois.readObject();
	fis.close();

	System.out.println("gn2.d:"+ugn2.d);
	System.out.println("gn2.s:"+ugn2.s);
    }
}

