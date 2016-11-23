public class StatikDegisken {
    
    public static int  x ; 
    public int  y ; 

    public static void ekranaBas(StatikDegisken sd ) {
       System.out.println("StatikDegisken.x = " + sd.x + " StatikDegisken.y = " + sd.y );
    }
    
    public static void main(String args[]) {
	
          StatikDegisken sd1 = new StatikDegisken();
          StatikDegisken sd2 = new StatikDegisken();

          x = 10 ;
          // sd1.x = 10 ; // x = 10 ile ayni etkiyi yapar
          // sd2.x = 10 ; // x = 10 ile ayni etkiyi yapar
          sd1.y = 2 ;
          sd2.y = 8;
          ekranaBas(sd1);
          ekranaBas(sd2);
    }
}

