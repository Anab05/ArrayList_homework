package vezbanjeArrayList09_08;

import java.util.ArrayList;

public class Zadatak7 {

	public static void main(String[] args) {
		//7.Zadatak
		//Napisati progam koji stampa niz u obrnutom redosledu tj. od zadnjeg elementa do prvog.
		
		ArrayList<Integer> brojevi = new ArrayList<Integer>();
		
		brojevi.add(2); //0
		brojevi.add(3); //1
		brojevi.add(5); //2
		brojevi.add(8); //3
		brojevi.add(9); //4
		
		for (int i = brojevi.size()-1; i >= 0; i--) {
			System.out.print(brojevi.get(i) + ", ");
		}

	}

}
