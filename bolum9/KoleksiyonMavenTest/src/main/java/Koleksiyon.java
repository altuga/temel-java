import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by IntelliJ IDEA.
 * User: usta
 * Date: 04.03.2012
 * Time: 10:52
 * To change this template use File | Settings | File Templates.
 */
public class Koleksiyon {


    public static void main(String args[]) {

        Collection torba = new ArrayList();

        String elemanBir = "elma";
        String elemanIki = "armut";

        torba.add(elemanBir); // dikkat
        torba.add(elemanIki); // dikkat

        Collection yedekTorba = new ArrayList();
        String elemanUc = "uzum";
        String elemanDort = "kivi";
        yedekTorba.add(elemanUc);
        yedekTorba.add(elemanDort);

        torba.addAll(yedekTorba); // dikkat

        boolean sonucBir = torba.contains(elemanIki); // dikkat
        System.out.println(sonucBir+" torbada var mi : "+ sonucBir);

        boolean sonucIki = torba.containsAll(yedekTorba); // dikkat
        System.out.println(" hepsi torbada var mi : "+ sonucIki);

        boolean sonucUc = torba.isEmpty(); // dikkat
        System.out.println(" torba bos mu : "+ sonucUc);

        boolean silindiMi = torba.remove(elemanIki); // dikkat
        System.out.println(" silindiMi : "+ silindiMi);

        System.out.println(" torbanin boyutu : "+ torba.size() );

        // torbanin iceligini ekrana bas 1
        Object[] oDizi = torba.toArray();
        for (int i=0; i<oDizi.length; i++) {
            System.out.println("-->" + oDizi[i]);
        }

        // torbanin iceligini ekrana bas 2
        System.out.println(torba);
      ;
    }
}
