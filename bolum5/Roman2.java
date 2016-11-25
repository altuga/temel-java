class KalinKitap {
	public int sayfaSayisiOgren() {
		System.out.println("Kitap2 - sayfaSayisiOgren() ");
		return 440;
	}

	public double fiyatOgren() {
		System.out.println("Kitap2 - fiyatOgren() ");
		return 2500000 ;
	}

	public String yazarIsmiOgren() {
		System.out.println("Kitap2 - yazarIsmiOgren() ");
		return "xy";
	}
}

class KalinRoman extends KalinKitap {

	public int sayfaSayisiOgren() {
		System.out.println("Roman2 - sayfaSayisiOgren() ");
		return 569;
	}

	public double fiyatOgren() {
		System.out.println("Roman2 - fiyatOgren() ");
		return 8500000 ;
	}


	public static void main( String args[] ) {
		KalinRoman kalinRoman = new KalinRoman();
		int sayfasayisi = kalinRoman.sayfaSayisiOgren();
		double fiyat  = kalinRoman.fiyatOgren();
		String yazar = kalinRoman.yazarIsmiOgren();
	}
}
