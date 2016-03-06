package Interfaces;

 public class Programi {

	public static void main(String[] args) {
		// TODO Auto-generate  
		
		
		
		Katrori katrori1 = new Katrori(3);
		Katrori katrori2 = new Katrori(5);
		
		int krahasimi = katrori1.krahaso(katrori2);
		
		System.out.println("Krahasimi: " + krahasimi);
	
	}

}
