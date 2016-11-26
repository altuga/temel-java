class Sony {
    public void sesAc() {
        System.out.println("X model televizyon sesAc()");
    }

    public void sesKapa() {
        System.out.println("X model televizyon sesKapa()");
    }

    public void kanalDegistir() {
        System.out.println("X model televizyon kanalDegistir()");
    }
}

class SuperSony extends Sony {
    public void sesAc() {  // iptal etme (override)
        System.out.println("Y model televizyon sesAc()");
    }

    public void sesKapa() { // iptal etme (override)
        System.out.println("Y model televizyon sesKapa()");
    }

    public void kanalDegistir() {  // iptal etme (override)
        System.out.println("Y model televizyon kanalDegistir() ");
    }

    public void teleText() {
        System.out.println("Y model televizyon teleText()");
    }

}

public class Televizyon2 {
    public static void main(String args[]) {

        Object[] ob = new Object[2];
        ob[0] = new Sony(); // yukari dogru cevirim (upcasting)
        ob[1] = new SuperSony(); // yukari dogru cevirim (upcasting)

        for (int i = 0; i < ob.length; i++) {

            // asagiya dogru cevirim (Downcasting)
            Sony sony = (Sony) ob[i];
            sony.sesAc();
            sony.sesKapa();
            sony.kanalDegistir();
            // sony.teleText(); // bu kumanda da boyle bir dugme yok
            System.out.println("-----------------------------------------------");
        }

    }
}

