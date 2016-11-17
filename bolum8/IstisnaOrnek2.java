
import java.io.*;

public class IstisnaOrnek2 {

    public void cokCalis() {
        try {
            File f = new File("ornek.txt");
            BufferedReader bf = new BufferedReader(new FileReader(f));
            System.out.println(bf.readLine());
        } catch (IOException ex) {
            System.out.println("Hata Yakalandi =" + ex);
        }
        
    }

    public void calis() {
        cokCalis();
        System.out.println("calis() metodu");
    }

    public static void main(String args[]) {
        IstisnaOrnek2 io2 = new IstisnaOrnek2();
        io2.calis();
        System.out.println("main() metodu");
    }

}
