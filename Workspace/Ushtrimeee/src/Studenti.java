
public class Studenti extends Personi {

	 // Studenti trashegon klasen Person dhe ka nrIdex-it
	
	
	private String nrIndex ;

	public Studenti(){
	   	 
    }

    public Studenti(String emri , String adresa , String nrIndex){
  	  super(emri , adresa);
  	  this.nrIndex = nrIndex;
  	  
    }
    
    
    public String getnrIndex(){
  	      return this.nrIndex;
    }


}


