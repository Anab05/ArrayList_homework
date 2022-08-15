package vezbanjeArrayList09_08;

import java.util.ArrayList;

public class Zadatak2 {

	public static void main(String[] args) {
		//2.Zadatak
		//Napisati program koji u sebi ima definisan niz od 5 broja (brojevi su proizvoljni) 
		//i menja vrednost elementa na poziciji 3 tako sto je povecava 10 puta.
		
		ArrayList<Integer> brojevi = new ArrayList<Integer>();
		
		brojevi.add(2);
		brojevi.add(3);
		brojevi.add(5);
		brojevi.add(8);
		brojevi.add(9);
		
		brojevi.set(3, brojevi.get(3)*10);
		System.out.println(brojevi.get(3));
		
		brojevi.set(brojevi.size()-1,11);
		System.out.println(brojevi.get(brojevi.size()-1));

	}

}
