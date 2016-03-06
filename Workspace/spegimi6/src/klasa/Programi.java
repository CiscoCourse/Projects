package klasa;


public class Programi {

	public static void main(String[] args) {

      Vehicle vehicle = new Vehicle();
      
      Vehicle vehicle1  = new Vehicle("yellow" , 100);
      
      Vehicle vehicle3 = new Vehicle(100);
      
	vehicle.setSpeed(100);
		
	double distance = vehicle.calculateDistace(10);
	
	System.out.println("Distanca e kaluar eshte : " + distance + " metra");
	
	System.out.println("Distanca e kaluar2 eshte : " + vehicle3.calculateDistace(10) + " metra");
	
	System.out.println("Distanca e kaluar3 eshte : " + vehicle.calculateDistance(50, 38));	
		
		
		
		
	
	
	}

}
