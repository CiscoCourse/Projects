package Trashegimia;

import Klienti.Libri;


public class Programi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Produkt produkt = new Produkt(1, 25.5);
		Libri libri = new Libri(1 , 25.5 , "ISBN-978-1");
		
		
		
		System.out.println("Qmimi : " + produkt.getQmimi());
		System.out.println("Qmimi- : " + libri.getQmimi());
		System.out.println("ISBN e Librit : " + libri.getIsbn());
		
		
		
		
	}

}
