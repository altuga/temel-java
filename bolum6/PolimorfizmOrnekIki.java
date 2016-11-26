
class HayvanNesnesi {
    public void avYakala() {
        System.out.println("Hayvan avYakala");
    }
}

class KartalNesnesi extends HayvanNesnesi {
    public void avYakala() {
        System.out.println("Kartal avYakala");
    }
}

class TimsahNesnesi extends HayvanNesnesi {
    public void avYakala() {
        System.out.println("Timsah avYakala");
    }
}

public class PolimorfizmOrnekIki {


    public static HayvanNesnesi rasgeleSec() {
        int sec = ((int) (Math.random() * 3));
        HayvanNesnesi h = null;
        if (sec == 0) h = new HayvanNesnesi();
        if (sec == 1) h = new KartalNesnesi();
        if (sec == 2) h = new TimsahNesnesi();
        return h;
    }

    public static void main(String args[]) {
        HayvanNesnesi[] h = new HayvanNesnesi[3];
        // diziyi doldur
        for (int i = 0; i < 3; i++) {
            h[i] = rasgeleSec();
        }
        // dizi elemanlarini ekrana bas
        for (int j = 0; j < 3; j++) {
            h[j].avYakala();
        }
    }
}
