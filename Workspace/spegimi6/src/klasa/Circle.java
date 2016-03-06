package klasa;

public class Circle {

         private int radius;
         
         
         public Circle(){
        	 
         }
         
         
         public Circle(int radius){
        	 this.radius = radius ;
        	 
         }
         
         public double calculatePerimeter(){
        	 return 2 * Math.PI * radius ;
        	 
         }

        public double calduclateArea(){
        	return Math.PI * Math.pow(radius, 2);
        }







}
