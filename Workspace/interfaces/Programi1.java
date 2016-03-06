package Programi1;

import Interfaces.Katrori;
import Interfaces.Rrethi;

public class Programi1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Katrori katrori1  = new Katrori(3);
	Katrori katrori2 = new Katrori(5);
	  
    
	int krahasimi = katrori1.krahaso(katrori2);
	
			
			System.out.println("Krahasimi : " + krahasimi );
	
	
	Rrethi rrethi1 = new Rrethi(3);	
	Rrethi rrethi2 = new Rrethi(5);	
	
	
	int krahasimi2 = rrethi1.krahaso(rrethi2);
	
	          System.out.println("Krahasimi Rrathve : " + krahasimi2);
	
	}

}
