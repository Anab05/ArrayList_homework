package vezbanjeArrayList09_08;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak9 {

	public static void main(String[] args) {
		// 9.Napisati program koji ima definisan niz od N broja i od korisnika ucitava N brojeva i cuva ih u niz. 
				//Nakon unosa brojeva sracunati sumu niza i prikazati je na kraju programa.
				//Primer:
//					Unesite N: 10
//					Unesite broj: 1
//					Unesite broj: 2
//					Unesite broj: 3
//					Unesite broj: 4
//					Unesite broj: 8
//					Unesite broj: 9
//					Unesite broj: 2
//					Unesite broj: 1
//					Unesite broj: 70
//					Unesite broj: 5
//					Suma je 42

		Scanner s = new Scanner(System.in);
		ArrayList<Integer> brojevi = new ArrayList<Integer>();
		
		System.out.print("Unesite vrednost N: ");
		int n=s.nextInt();
		int suma=0;
		int broj = 0;
		
		for (int i = 0; i < n; i++) {
			System.out.print("Unesite broj: ");
			broj = s.nextInt();
			brojevi.add(broj);
			//tako se formira niz
		}
			
		for (int i = 0; i < brojevi.size(); i++) {
			suma = suma + brojevi.get(i);
			
		}
		System.out.print("Suma je: " + suma);
	}


}
