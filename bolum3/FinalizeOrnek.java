

public class FinalizeOrnek {

    public static void main(String[] args) {
        new FinalizeOrnek();
        System.gc();

    }

 protected void finalize(){
     System.out.println(this+" nesnesi yok edilecek. Az sonraa.");
 }
}
