package t_11;

import java.util.HashSet;
import java.util.Random;
import java.util.TreeSet;


//set posiada dokadnie ten sam zestaw metod (ten sam interfejs) co Collection
public class SetOfInteger {

	public static void main(String[] args) {
		Random rand = new Random();
		HashSet<Integer> hashset = new HashSet<Integer>();
		
		for (int i = 0; i < 100000; i++) {
			hashset.add(rand.nextInt(30));
		}
		System.out.println(hashset);  // elementy listy nie sa posortowane, do wstawiania ich uzyta jest specjana metoda hashujaca
		
		
		TreeSet<Integer> treeset = new TreeSet<Integer>();
		
		for (int i = 0; i < 100000; i++) {
			treeset.add(rand.nextInt(30));
		}
		System.out.println(treeset);  // elementy listy zostaja posortowane
		
		
	}
}
