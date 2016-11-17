
class Calisan {

    public void isYap(double a) {
	
		System.out.println("Calisan.isYap()");
    }
}


class Mudur extends Calisan {

    public void isYap(int a) {
	
		System.out.println("Mudur.isYap()");
    }

    public static void main(String args[]) {
	
	Mudur m = new Mudur();
	m.isYap(3.3);
    }
}


