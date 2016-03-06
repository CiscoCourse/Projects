package Klienti;

import Trashegimia.Produkt;

public class Libri extends Produkt {


      private String isbn;
      
      public Libri(){
    	 
      }

      public Libri(int produktId, double qmimi ,String isbn){
    	  super(produktId , qmimi);
    	  this.isbn = isbn;
      }
      
      
      public String getIsbn(){
    	  return this.isbn;
      }
      
}
