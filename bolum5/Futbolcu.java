class KontrolMerkezi {

    public static void checkUp(CevikSporcu s) {
        // ..
        s.calis();
    }
}

class CevikSporcu {

    public void calis() {
        System.out.println("Sporcu.calis()");
    }
}

class CevikFutbolcu extends CevikSporcu {

    public void calis() {  // iptal etme (Overriding)
        System.out.println("Futbolcu.calis()");
    }

    public static void main(String args[]) {

        CevikSporcu s = new CevikSporcu();
        CevikFutbolcu f = new CevikFutbolcu();
        KontrolMerkezi.checkUp(s);
        KontrolMerkezi.checkUp(f);
    }
}
