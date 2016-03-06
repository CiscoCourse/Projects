package klasa;

public class Vehicle {

	String color ;
	int speed ;
	
	public Vehicle(){	
	}

	public Vehicle(String color , int speed){
	
       this.color = color;
       this.speed = speed;
       
	
	}
	
	public Vehicle (int speed){
	
		
		this.speed = speed ;
	}
	
	
    public void setColor(String color){
    	this.color = color;
    }               

    public void setSpeed(int speed){
         this.speed = speed;
    	
   }

    public double calculateDistace(double time){
    	double distance;
    
    distance = speed * time ;
    return distance;
    
    }
    
    
    
    

     public double calculateDistance(int speed , double time ){
		return speed * time;
    	 
     }



}



