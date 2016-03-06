package klasa;

public class numri {
  // vlera final nuk ndryshon
	private final int  POWER = 2 ;
	
   public  static double squareRoot(double value){
	   return Math.sqrt(value);
   }

   //vlera statice ndryshon
   public static double square(double value){
	   return Math.pow(value, 2);
	   
   }

   public static double squares(double base , double power){
	   return Math.pow(base , power);
   }

}
