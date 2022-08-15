package vezbanjeArrayList09_08;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak4 {

	public static void main(String[] args) {
		//Napisati program koji u sebi ima definisan niz od 5 broja (brojevi su proizvoljni) 
		//i koji prikazuje element na poziciji K. K unosi korisnik.
		//Primer:
		//Unesite pozicjiu: 2
		//Na pozicji 2 je vrednost 7.
		
		ArrayList<Integer> brojevi = new ArrayList<Integer>();
		Scanner s = new Scanner(System.in);
		
		System.out.print("Unesite poziciju K (od 0 do 4): ");
		int k = s.nextInt();
		
		brojevi.add(2); //0
		brojevi.add(3); //1
		brojevi.add(5); //2
		brojevi.add(8); //3
		brojevi.add(9); //4
		
		System.out.print("Na poziciji " + k + " nalazi se vrednost " + brojevi.get(k) + ".");
		
		
		

	}

}
