package vezbanjeArrayList09_08;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak5 {

	public static void main(String[] args) {
//		Napisati program koji u sebi ima definisan niz od 10 broja (brojevi su proizvoljni) 
//		i koji menja vrednost elementa na pozciji K. K i novu vrednost unosi korisnik.
//		Primer:
//		Unesite pozicjiu od 0 do 9: 3
//		Unesite novu vrednost: 11
//		Element na 3. poziciji treba na kraju da ima vrednost 11 u vasem programu.
		
		ArrayList<Integer> brojevi = new ArrayList<Integer>();
		Scanner s = new Scanner(System.in);
		
		System.out.print("Unesite poziciju K (od 0 do 9): ");
		int k = s.nextInt();
		
		System.out.print("Unesite novu vrednost : ");
		int vrednost = s.nextInt();
		
		brojevi.add(2); //0
		brojevi.add(3); //1
		brojevi.add(5); //2
		brojevi.add(8); //3
		brojevi.add(9); //4
		brojevi.add(4); //5
		brojevi.add(7); //6
		brojevi.add(3); //7
		brojevi.add(6); //8
		brojevi.add(2); //9
		
		brojevi.set(k, vrednost);
		System.out.print("Element na " + k + ". poziciji, treba na kraju da ima vrednost " + vrednost + ".");
		//System.out.println(brojevi);
	}

}
