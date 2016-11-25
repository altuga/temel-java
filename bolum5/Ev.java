

final class TelevizyonSamsung {

    public void kanalBul() {
        System.out.println("Kanal bulunuyor.");
    }
}


//class SuperTelevizyonSamsung extends TelevizyonSamsung {

//}


class Ev {

    int oda_sayisi = 5;
    TelevizyonSamsung tv = new TelevizyonSamsung();
    // Televizyon tv2 = new Televizyon() ;

    public static void main(String args[]) {

        Ev e = new Ev();
        e.tv.kanalBul();
    }

}

