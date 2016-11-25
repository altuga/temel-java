
class CalisanFabrika {

    public void isYap(double a) {

        System.out.println("Calisan.isYap()");
    }
}


class MudurFabrika extends CalisanFabrika {

    public void isYap(int a) {

        System.out.println("Mudur.isYap()");
    }

    public static void main(String args[]) {

        MudurFabrika mudurFabrika = new MudurFabrika();
        mudurFabrika.isYap(3.3);
    }
}


