import java.io.*;


class GelismisNesne implements Externalizable  {
    
    int d ;
    String s ;
    
    public GelismisNesne() {
	System.out.println("GelismisNesne varsayilan yapilandirici");
    }

    public GelismisNesne(int d, String s) {
	this.d = d ;
	this.s = s ;
    }

    public void readExternal(ObjectInput in) throws IOException,ClassNotFoundException {
	System.out.println("okunuyor");
	d = in.readInt();
	s = (String) in.readObject();
    }
    
    public void writeExternal(ObjectOutput out) throws IOException {
	System.out.println("yaziliyor");
	out.writeInt(d);    
	out.writeObject(s);
    }
}


public class GelismisExtest {  

    public static void main(String args[]) throws Exception {
	 
	if (args.length != 2) {
	    System.err.println("Parametreler eksik girilmis !");
	    System.exit(-1);
	}

	int i = Integer.parseInt(args[0]);
	GelismisNesne gn = new GelismisNesne(i, args[1] );
	FileOutputStream fos = new FileOutputStream("gelismis.out");
	ObjectOutputStream oos = new  ObjectOutputStream(fos);
	System.out.println("Dosyaya yaziliyor");
	oos.writeObject(gn);
	fos.close();
	
	FileInputStream fis = new FileInputStream("gelismis.out");
	ObjectInputStream ois = new ObjectInputStream(fis);
	System.out.println("Dosyaya okunuyor");
	GelismisNesne gn2 = (GelismisNesne) ois.readObject();
	fis.close();

	System.out.println("gn2.d:"+gn2.d);
	System.out.println("gn2.s:"+gn2.s);
    }
}


