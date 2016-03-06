package Trashegimia;

public class Produkt {


	private int produktID;
	
	private double qmimi ;

    public Produkt(){
    	
    	
    }

    public Produkt(int produktId , double qmimi){
    	this.produktID = produktId;
    	this.qmimi = qmimi;
    }

 protected double getQmimi(){
    	return this.qmimi;
    }
    

}
