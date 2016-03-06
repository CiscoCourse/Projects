
public abstract class Syprina {

   protected int brinjaA ;
   
   protected int brinjaB ;
   
   
   public Syprina(){
	   
   }
   public Syprina ( int brinjaA , int brinjaB ){
	   
	   this.brinjaA = brinjaA ;
	   this.brinjaB = brinjaB ;
   }

public abstract double kalkuloSyprinen();
             

    

   public int getbrinjaA() {
	   return brinjaA;
   }
   
   public int getbrinjaB(){
	   return brinjaB;
   }
   
}
