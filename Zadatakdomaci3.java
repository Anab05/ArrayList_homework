package vezbanjeArrayList09_08;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatakdomaci3 {

	public static void main(String[] args) {
//		Napisati program koji ucitava niz A duzine N i broj X. 
//		Nakon unosa treba ispisati indekse onih clanova niza koji su jednaki broju X.
//		Primer izvrsenja:
//			Unesite N: 5
//			Unesite broj: 1
//			Unesite broj: 3
//			Unesite broj: 7
//			Unesite broj: 3
//			Unesite broj: 9
//			Unesite X: 3
//
//			Rezultat: Elementi niza A koji su jednaki broju X imaju indekse: 
//				1, 3
		ArrayList<Integer> nizA = new ArrayList<Integer>();
		Scanner s = new Scanner(System.in);
		
		System.out.print("Unesite N: ");
		int n=s.nextInt();
		System.out.print("Unesite X: ");
		int x=s.nextInt();
		int broj=0;
		for (int i = 0; i <n; i++) {
			System.out.print("Unesite broj: ");
			broj = s.nextInt();
			nizA.add(broj);
		}
		System.out.print("Elemetni niza A koji su jednaki X imaju indekse:" );
		for (int i = 0; i < nizA.size(); i++) {
			nizA.get(i);
			if (x==nizA.get(i)) {
				nizA.get(i);
				System.out.print(i + ", ");
			}
			
			}

	}

}
