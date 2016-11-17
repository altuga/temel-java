

public abstract class Aday {

    protected String isim ;
    protected String soyad ;
    protected int yas ;
    protected char cinsiyet ;

    public void isimBelirt(String isim) {
	this.isim = isim ;
    }

    public void soyadBelirt(String soyad) {
	this.isim = isim ;
    }

    public void yasBelirt(int yas) {
	this.yas = yas ;
    }

    public void cinsiyetBelirt(char cinsiyet) {
	this.cinsiyet = cinsiyet;
    }

    public String isimAl() {
	return isim ;
    }

    public String soyadAl() {
	return soyad;
    }

    public int yasAl() {
	return yas;
    }

    public char cinsiyetAl() {
	return cinsiyet;
    }


    // dikkat, govdesiz metod=soyut=abstract
    public abstract void sarkiSoyle();


}

