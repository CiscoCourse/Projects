package Programi;

import Polymorphism.A;
import Polymorphism.B;

public class Programi2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	A a = new A();
	System.out.println("" + a.toString());
	
	
	B b = new B(5);
	
	b = new B(6);
	
	System.out.println(""+ b.getX());
	}

}
