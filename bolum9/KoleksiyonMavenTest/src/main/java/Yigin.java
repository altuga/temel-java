import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;

/**
 * Created by IntelliJ IDEA.
 * User: usta
 * Date: 04.03.2012
 * Time: 11:27
 * To change this template use File | Settings | File Templates.
 */
public class Yigin {

    private static LinkedList torba = new LinkedList();

    public void veriAt(Object o) {
        torba.addFirst(o);
    }

    public Object veriCek() {
        return torba.removeFirst();
    }


    public static void main(String[] args) {

        String u1 = "Turkiye" ;
        String u2 = "Japonya" ;
        String u3 = "Almanya" ;

        Yigin y = new Yigin();
        y.veriAt(u3);
        y.veriAt(u2);
        System.out.println(" --> " + y.veriCek());
        y.veriAt(u1);
        System.out.println(" --> " + y.veriCek());

        Iterator it=torba.iterator();
        while (it.hasNext()){
            System.out.println(it.next().toString());
        }
        Collections.sort(torba,new Comparator<String>() {
            public int compare(String o1, String o2) {
                return 0;  //To change body of implemented methods use File | Settings | File Templates.
            }
        });
    }


}
