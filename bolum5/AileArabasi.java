public class AileArabasi  {
    
    private Motor m = new Motor();

    public void hareketEt() {
	m.calis();
	System.out.println("Aile Arabasi Calisti");
    }

    public void dur() {
	m.dur();
	System.out.println("Aile Arabasi Durdu");
    }
    
    public static void main(String args[]) {
	AileArabasi aa = new AileArabasi() ;
	aa.hareketEt();
	aa.dur();
    }
}
