package vezbanjeArrayList09_08;

import java.util.ArrayList;

public class Zadatak3 {

	public static void main(String[] args) {
		//Napisati program koji u sebi ima definisan niz od 5 broja 
		//(brojevi su proizvoljni) i koji zamenjuje vrednosti prvog (na poziciji nula) i zadnjeg elemnta niza.
		
		ArrayList<Integer> brojevi = new ArrayList<Integer>();
		
		brojevi.add(2);
		brojevi.add(3);
		brojevi.add(5);
		brojevi.add(8);
		brojevi.add(9);
		
		int pozicijaNula = brojevi.get(0); // 2
		//int pozicijaZadnja = brojevi.get(brojevi.size()-1); // 9
		
		brojevi.set(0, brojevi.get(brojevi.size()-1));
		brojevi.set(brojevi.size()-1, pozicijaNula);
		System.out.println("Pozicija 0 je " + brojevi.get(0));
		System.out.println("Poslednja pozicija je " + brojevi.get(brojevi.size()-1));
	}

}
