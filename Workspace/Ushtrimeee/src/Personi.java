
public class Personi {

//klasa Person (emri , adresa )
   
	
	private String emri ;
    
    private String adresa ;


    public Personi(){
   	 
    }

    public Personi(String emri , String adresa){
  	  
  	  this.emri = emri;
  	  this.adresa = adresa;
    }
    
    
    public String getEmri(){
  	      return this.emri;
    }
    
    public String getAdresa(){
    	  return this.adresa;
      }

}
