class KediSarman {

    protected int ayakSayisi = 4;

    public void yakalaAv() {
        System.out.println("Kedi sinifi Av yakaladi");
    }

    public static void main(String args[]) {
        KediSarman kd = new KediSarman();
        kd.yakalaAv();
    }

}

class KaplanJack extends KediSarman {

    public static void main(String args[]) {
        KaplanJack kp = new KaplanJack();
        kp.yakalaAv();
        System.out.println("Ayak Sayisi = " + kp.ayakSayisi);
    }
}