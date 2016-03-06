package Interfaces;

public class Rrethi{

	
	  int radius ;
	  
	  
	 

	public  Rrethi(){
		  
	  }
	
       public  Rrethi(int radius){
    	   this.radius = radius;
       }

       
        public double getSyprina(int radius){
        	
        	return Math.PI * Math.pow(this.radius, 2);
        }	
        
        	
        	public int krahaso (Object object) {
        		
        		Rrethi rrethi = (Rrethi) object ;
				return radius;
        }
}



