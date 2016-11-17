
public class Yumurta {
  int toplam_yumurta_sayisi = 0;
  
  Yumurta sepeteKoy() {
    toplam_yumurta_sayisi++;
    return this;
  }
  
  void goster() {
    System.out.println("toplam_yumurta_sayisi = " + toplam_yumurta_sayisi);
  }
  
  public static void main(String[] args) {
    Yumurta y = new Yumurta();
    y.sepeteKoy().sepeteKoy().sepeteKoy().goster();
  }
} 

