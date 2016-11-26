class Calisan4857 {
    public String pozisyon = "Calisan";

    public void calis() {
    }
}

class Mudur4857 extends Calisan4857 {

    public Mudur4857() { // yapilandirici
        pozisyon = "Mudur";
    }

    public void calis() {  // iptal etme (override)
        System.out.println("Mudur Calisiyor");
    }
}

class Programci4857 extends Calisan4857 {

    public Programci4857() { // yapilandirici
        pozisyon = "Programci";
    }

    public void calis() {  // iptal etme (override)
        System.out.println("Programci Calisiyor");
    }
}

class Pazarlamaci4857 extends Calisan4857 {

    public Pazarlamaci4857() { // yapilandirici
        pozisyon = "Pazarlamaci";
    }

    public void calis() { // iptal etme (override)
        System.out.println("Pazarlamaci Calisiyor");
    }
}


public class IsYeri {

    public static void mesaiBasla(Calisan4857[] c) {
        for (int i = 0; i < c.length; i++) {
            c[i].calis(); // !Dikkat!
        }

    }

    public static void main(String args[]) {
        Calisan4857[] c = new Calisan4857[4];
        c[0] = new Calisan4857(); // yukari dogru cevirim gerekmiyor
        c[1] = new Programci4857(); // yukari dogru cevirim (upcasting)
        c[2] = new Pazarlamaci4857(); // yukari dogru cevirim (upcasting)
        c[3] = new Mudur4857(); // yukari dogru cevirim (upcasting)
        mesaiBasla(c);
    }
}
