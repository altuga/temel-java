

import java.io.*;


class BasitNesne implements Externalizable  {
    
    int d ;
    
    public BasitNesne(int d) {
	System.out.println("BasitNesne yapilandirici");
	this.d = d ;
    }

    public void readExternal(ObjectInput in) throws IOException,ClassNotFoundException {
	System.out.println("okunuyor");
    }
    
    public void writeExternal(ObjectOutput out) throws IOException {
	System.out.println("yaziliyor");
    }
}


public class Extest {  

    public static void main(String args[]) throws Exception {
	 
	BasitNesne bn = new BasitNesne(7);
	FileOutputStream fos = new FileOutputStream("extest.out");
	ObjectOutputStream oos = new  ObjectOutputStream(fos);
	System.out.println("Dosyaya yaziliyor");
	oos.writeObject(bn);
	fos.close();
	
	FileInputStream fis = new FileInputStream("extest.out");
	ObjectInputStream ois = new ObjectInputStream(fis);
	System.out.println("Dosyaya okunuyor");
	BasitNesne bn2 = (BasitNesne) ois.readObject();
	//System.out.println("e2.d:"+e2.d);
	fis.close();

    }
}

