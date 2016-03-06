package Interfaces;

public class Katrori implements Krahasushme {

	private int gjatesia;
	
	
	
	public Katrori(){
		
	}

	public Katrori(int gjatesia){
		this.gjatesia = gjatesia;
	}
	
	public double getSyprina(){
		return Math.pow(this.gjatesia, 2);
	}
	
	public int krahaso (Object object) {
		
		Katrori katrori = (Katrori) object ;
		
		
		//TODO : Implementation goes here
		
		if(this.getSyprina() > katrori.getSyprina()){
			return 1;
		}
		else if(this.getSyprina() < katrori.getSyprina()){
			return -1;
		}else
			return 0;
		
		
	}

	@Override
	public int krahaso(Katrori katrori) {
		// TODO Auto-generated method stub
		return 0;
	}
              
	
}
