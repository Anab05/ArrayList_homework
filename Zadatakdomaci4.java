package vezbanjeArrayList09_08;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatakdomaci4 {

	public static void main(String[] args) {
//		4. (Za vezbanje) Napisati program koji ucitava niz a duzine N. 
//		Nakon unosa niza a, formira se niz b tako sto se prva 3 elementa niza a kopiraju u niz b,
//		a ostale elemente niza b ispuniti jedinicama.(niz b je iste duzine kao i niz a)
//
//
//		Unesite N: 6
//		Unesite broj: 1
//		Unesite broj: 5
//		Unesite broj: 2
//		Unesite broj: 7
//		Unesite broj: 8
//		Unesite broj: -1
//
//		Niz a: 1, 5, 2, 7, 8, -1
//		Niz b: 1, 5, 2, 1, 1, 1
		ArrayList<Integer> nizA = new ArrayList<Integer>();
		Scanner s = new Scanner(System.in);
		
		System.out.print("Unesite N: ");
		int n=s.nextInt();
		int broj = 0;
		int i=0;
		
		for (i = 0; i < n; i++) {
			System.out.print("Unesite broj: ");
			broj=s.nextInt();
			nizA.add(broj);
		}
		System.out.print("Niz A: ");
		for (i = 0; i < nizA.size(); i++) {
			System.out.print(nizA.get(i) + ", ");
		}
		System.out.print("Niz B: ");
		for (i = 0; i < nizA.size(); i++) {
			nizA.set(nizA.size()-1, 1);
			nizA.set(nizA.size()-2, 1);
			nizA.set(nizA.size()-3, 1);
			System.out.print(nizA.get(i) + ", ");
		}
	}

}

