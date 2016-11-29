
import java.io.*;

public class IstisnaOrnek1 {

    public void cokCalis() {
        File f = new File("ornek.txt");
        //BufferedReader bf = new BufferedReader(new FileReader(f));
        //System.out.println(bf.readLine());
    }

    public void calis() {
        cokCalis();
    }

    public static void main(String args[]) {
        IstisnaOrnek1 io1 = new IstisnaOrnek1();
        io1.calis();
    }

}
