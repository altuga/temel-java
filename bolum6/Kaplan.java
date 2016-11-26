class KediNesnesi {

	public void yakalaAv() {
		System.out.println("Kedi sinifi Av yakaladi");
	}

}

class KaplanNesnesi extends KediNesnesi {

	public static void goster(KediNesnesi k) {
		k.yakalaAv();     
	}

   
	public static void main(String args[] ) {
		KediNesnesi k = new KediNesnesi()  ;
		KaplanNesnesi  kp = new KaplanNesnesi();
		goster(k);   
		goster(kp);	 // yukari dogru cevirim (upcasting)
	}       
}

