package ushtrimePerProject;

import java.util.ArrayList;

public class Programi {

	public static void main(String[] args) {

		ArrayList<String> lista = new ArrayList<String>();

		lista.add("nje");
		lista.add("tungjatjeta");
		lista.add("java");

		for (int i = 0; i < lista.size(); i++) {

			System.out.println(" " + lista.get(i));

		}

		// lista.remove e fshin elementin
		lista.remove(0);

		// lista.set e zevendson elementin
		lista.set(0, "C#");

		// lista.add e shton elementin
		lista.add(0, "nje");

		
		// menyr me e let per for
		for (String elementi : lista) {
			System.out.println(" " + elementi);
		}

	}

}
