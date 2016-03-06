package detyra5;

public class KalkulatoriQmimit implements Interface {

	public double varguQmimeve[] = { 3, 22, 15, 31, 18, 5, 7, 11, 13, 2, 12 };

	double sum = 0;

	public double saQmime() {

		System.out.println("Sa Qmime jan : " + varguQmimeve.length);
		return varguQmimeve.length;
	}

	public double totaliQmimeve() {

		for (int counter = 0; counter < varguQmimeve.length; counter++) {

			sum += varguQmimeve[counter];

		}
		System.out.println("Totali i Qmimeve eshte : " + sum);

		return sum;
	}

}
