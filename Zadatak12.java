package vezbanjeArrayList09_08;

import java.util.ArrayList;

public class Zadatak12 {

	public static void main(String[] args) {
//		12. (za vezbanje) Napisati program koji ima niz duzine 25 proizvoljnih elemenata i stampa niz kao tablu dimenzije 5x5.
//		Primer stampe:
//		1, 2, 3, 4, 6,
//		5, 6, 7, 3, 4,
//		5, 2, 1, 4, 5,
//		6, 6, 6, 2, 1
//		1, 9, 8, 7, 6
		
		ArrayList<Integer> brojevi = new ArrayList<Integer>();
		brojevi.add(2);
		brojevi.add(5);
		brojevi.add(7);
		brojevi.add(6);
		brojevi.add(1);
		{
		for (int i = 0; i < 5; i++) {
			System.out.println(brojevi.get(i) + ", ");
			}
		brojevi.add(5);
		brojevi.add(7);
		brojevi.add(4);
		brojevi.add(6);
		brojevi.add(8);
		{
			for (int i = 5; i < 10; i++) {
			System.out.println(brojevi.get(i) + ", "); 
			}
		brojevi.add(2);
		brojevi.add(5);
		brojevi.add(7);
		brojevi.add(6);
		brojevi.add(1);
		{
			for (int i = 10; i < 15; i++) {
				System.out.println(brojevi.get(i) + ", ");
		}
		brojevi.add(5);
		brojevi.add(7);
		brojevi.add(4);
		brojevi.add(6);
		brojevi.add(8);
		{
			for (int i = 15; i < 20; i++) {
				System.out.println(brojevi.get(i) + ", ");
		}
		brojevi.add(5);
		brojevi.add(7);
		brojevi.add(4);
		brojevi.add(6);
		brojevi.add(8);
		{
			for (int i = 20; i < 25; i++) {
				System.out.println(brojevi.get(i) + ", ");
		}

		
		
		}
}}}}}}
