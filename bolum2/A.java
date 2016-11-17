class Sayi {
	int i;
}


class NesnelerdeAtama {
	public static void main(String[] args) {
		Sayi s1 = new Sayi();
		Sayi s2 = new Sayi();
		s1.i = 9;
		s2.i = 47;
		System.out.println("1: s1.i: " + s1.i +", s2.i: " + s2.i);
		s1 = s2; // referanslar kopyalaniyor .. nesneler degil
		System.out.println("2: s1.i: " + s1.i +", s2.i: " + s2.i);
		s1.i = 27;
		System.out.println("3: s1.i: " + s1.i +", s2.i: " + s2.i);
	}
}

class A {
	public static void main(String[] args) {

		System.out.println("Miyav "  );

	}
}