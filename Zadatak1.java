package vezbanjeArrayList09_08;

import java.util.ArrayList;

public class Zadatak1 {

	public static void main(String[] args) {
		ArrayList <Integer> brojevi = new ArrayList<Integer>();
//		brojevi.add(1); //pozicija 0
//		brojevi.add(2); //pozicija 1
//		brojevi.add(3); //pozicija 2
//		brojevi.add(4); //pozicija 3
//		
//		brojevi.size();
//		brojevi.get(1); // na poziciji 1 nalazi se broj 2
//		
//		System.out.println(brojevi.size());
//		System.out.println(brojevi.get(1));
//		
//		System.out.println("Rezultat je:" + (brojevi.get(3)+brojevi.get(1)+3));
//		int x = brojevi.get(3)+2;
//		System.out.println(x);
//		
//		int suma = brojevi.get(0)+brojevi.get(1)+brojevi.get(2)+brojevi.get(3);
//		System.out.println("Suma je "+ suma);
		
//		1.Zadatak
//		Napisati program koji u sebi ima definisan niz od 5 broja 
//		(brojevi su proizvoljni) i prikazuje sumu nultog i zadnjeg elementa tog niza.
		
		brojevi.add(2); //0
		brojevi.add(3); //1
		brojevi.add(5); //2
		brojevi.add(8); //3
		brojevi.add(9); //4
		brojevi.add(6); //5
	 	
		//int pozicijaPoslednjeg = brojevi.size() - 1; // da izracunamo koja nam je poslednja pozicija u nizu kada ne znamo koliki nam je niz; 
													 // bkvl broj pozicije
		
		int suma = brojevi.get(0)+brojevi.get(brojevi.size()-1);
		System.out.println("Suma je :" + suma);
		
		suma = brojevi.get(0)+brojevi.get(brojevi.size()/2); //brojevi.size()/2 za poziciju srednjeg elem
		System.out.println("Suma 1 i srednjeg elementa je :" + suma);
		
	}

}
