package vezbanjeArrayList09_08;

import java.util.ArrayList;

public class Zadatak6 {

	public static void main(String[] args) {
//		6.Zadatak
//		Napisati program koji ispisuje niz brojeva na ekranu. Niz je definisan proizvoljno.
//		Primer:
//		1, 2, 34, 5, 7, -9
//		KORISTECI PETLJU !!!!!!!!!!!!!!!!!!
		
		ArrayList<Integer> brojevi = new ArrayList<Integer>();
		
		brojevi.add(2); //0
		brojevi.add(3); //1
		brojevi.add(5); //2
		brojevi.add(8); //3
		brojevi.add(9); //4
		
		for (int i = 0; i < brojevi.size(); i++) {
			System.out.print(brojevi.get(i) + ",");
		}

	}

}
