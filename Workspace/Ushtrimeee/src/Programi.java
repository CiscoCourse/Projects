
public class Programi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Personi[] personat = new Personi[3];
		
		Studenti studenti1 = new Studenti ("Arlind" , "Gjilan" , "158" ) ;
		personat[0] = studenti1;
		
		Studenti studenti2 = new Studenti ("Ardian" , "Gjilan" , "551" ) ;
		personat[1] = studenti2 ;
		
		
		Studenti studenti3 = new Studenti ("Lindi" , "Prishtin" , "999" ) ;
		personat[2] = studenti3 ;
		
		
		
		for(int i=0; i < personat.length ; i++){
            
			Studenti studentii = (Studenti) personat[i];
			
			
			
			System.out.println("Emri  : " + studentii.getEmri());
			
			System.out.println("Adresa  :" + studentii.getAdresa());
			
			System.out.println("Numri i indexit : " + studentii.getnrIndex());
			
			
			
       }
		
		
		
		
		
		
		
		
		
		
		
	}

}
