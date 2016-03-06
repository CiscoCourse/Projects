package Programi;

import Polymorphism.Internisti;
import Polymorphism.Kardiologu;
import Polymorphism.Mjeku;

public class Programi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	Internisti internisti = new Internisti();
	Kardiologu kardiologu = new Kardiologu();
	
	
	 internisti.trego();	
     kardiologu.trego();

     Mjeku mjeku = new Kardiologu();
     
     mjeku.trego();
     
     Mjeku mjeku2 = new Internisti();

     mjeku2.trego();	
}

        

}
