package vezbanjeArrayList09_08;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatakdomaci1 {

	public static void main(String[] args) {
//		1.Zadatak
//		Napisati program koji ucitava N brojeva i smesta ih u niz. 
//		Zatim, iz niza, broji koliko je parnih brojeva uneto. brojeve unosi korisnik.
//		Unesite N: 5 // n broja
//		Unesite broj: 1 //0
//		Unesite broj: 3
//		Unesite broj: 4
//		Unesite broj: 7
//		Unesite broj: 8 //4
//		U nizu ima 2 parna broja.
		
		ArrayList<Integer> brojevi = new ArrayList<Integer>();
		Scanner s = new Scanner(System.in);
		
		System.out.print("Unesite N: ");
		int n = s.nextInt();
		int brojac = 0; // brojanje parnih brojeva
		for (int i = 0; i < n; i++) {
			System.out.print("Unesite broj: ");
			int broj = s.nextInt();
			brojevi.add(broj); //formiranje niza
		}
		for (int i = 0; i < brojevi.size(); i++) {
			brojevi.get(i); // ispisujemo sve brojeve koje smo dobili od 0 do 4 pozicije
			if (brojevi.get(i)%2==0) { // proveravamo da li su svaki broj posebno iz niza
				brojac++;				// deljiv sa 2, i ako jeste brojac se povecava
			}
			System.out.print("Niz ima " + brojac +"parna broja");
		}
	}

}
