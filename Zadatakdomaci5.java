package vezbanjeArrayList09_08;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatakdomaci5 {

	public static void main(String[] args) {
//
//5. (Za vezbanje) Napisati program koji ucitava niz stringova duzine N, tako da ucitavanje elemenata u niz a bude obrnuto. 
//		Primer:
//		Unesite N: 4
//		Unesite string: xxx1
//		Unesite string: xxx4
//		Unesite string: xxx6
//		Unesite string: xxx9
//
//		Niz a: xxx9, xxx6, xxx4, xxx1
//		Komentar: Stanje niza a u memoriji je:
//			a[0]="xxx9",
//			a[1]="xxx6",
//			a[2]="xxx4",
//			a[3]="xxx1",
		
		ArrayList<String> niz = new ArrayList<String>();
		Scanner s = new Scanner(System.in);
		
		System.out.print("Unesite vrednost N: ");
		int n = s.nextInt();
		int i=0;
		for (i = 0; i < n; i++) {
			System.out.print("Unesite string: ");
			String a = s.next();
			niz.add(a);
			niz.get(i);
		} 
		System.out.print("Niz a: ");
		for (i = niz.size()-1; i >= 0; i--) {
			System.out.print(niz.get(i) + ", ");
		}
	

	}

}
