package ProgramiPersoni;

import java.util.ArrayList;
import java.util.List;

import ushtrimePerProject.Personi;

public class Programi {

	public static void main(String[] args) {
		
		
		List<Personi> personat = new ArrayList<Personi>();
          
		Personi person = new Personi("Ardian", "Gjilan");
		
		personat.add(person);
		
		Personi person1 = new Personi("Arlind", "Prishtin");
	
		personat.add(person1) ;
		
		Personi person2 = new Personi("Arton", "Ferizaj");
		
		personat.add(person2);

		
		personat.add(person);
		personat.add(person1);
		personat.add(person2);
		
		
		for (Personi elementi : personat) {
			System.out.println(" " + elementi);

	}
	}
	


}
