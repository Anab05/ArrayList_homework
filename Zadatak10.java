package vezbanjeArrayList09_08;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak10 {

	public static void main(String[] args) {
//		10.(za vezbanje)Napisati program koji ucitava sa tastature N karaktera i kreira niz koji predstavlja palindrom.
//		Na kraju programa odstampati novo kreirani niz.
//		Primer izvrsenja:
//		Unesite N: 4
//		Unesite karakter: M
//		Unesite karakter: b
//		Unesite karakter: n
//		Unesite karakter: c
//		Palindrom:
//		M, b, n, c, c, n, b, M
//		Napomena: U memoriji niz treba da ima sve ove elemente.
		
		ArrayList<String> slova = new ArrayList<String>();
		Scanner s = new Scanner(System.in);
		
		System.out.print("Unesite vrednost N: ");
		int n=s.nextInt();
		int i=0;
		for (i = 0; i < n; i++) {
		System.out.print("Unesite karakter: ");
		String slovo = s.next();
		slova.add(slovo);
		}
		System.out.print(slova.get(i));
		
		for ( i = slova.size()-1; i >=0; i--) {
			System.out.print(slova.get(i) + ", ");
			
		}
	}

}
