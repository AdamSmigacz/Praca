package t_11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;


//ArrayList celujacy w operacjach swobodnego dostepu do elementów ale wolniejszy przy wstawianiu i usuwaniu elementów z listy
//LinkedList optymalny do dostepu sekwencyjnego z efektywnymi operacjami wstawiania elementów do srodka listy. Swobodny dostep dziaa stosunkowo wolno ale za to ma bogatszy zestaw funkcji
public class ListFeatures {
	public static void main(String[] args) {
		Random rand = new Random(47);
		List<String> comarch =  new ArrayList<String>(Arrays.asList("Comarch SSE 1", "Comarch SSE 2", "Comarch SSE 3", "Comarch SSE 4", "Comarch SSE 5"));
		System.out.println("1: " + comarch);
		System.out.println("2: " + comarch.contains("Comarch SSE 6"));
		
		comarch.add("Comarch SSE 6"); // dodanie na koniec listy
		System.out.println("3: " + comarch);
		System.out.println("4: " + comarch.contains("Comarch SSE 6")); // sprawdzenie obecnosci na liscie elementu
		 
		comarch.remove("Comarch SSE 4");
		System.out.println("5: " + comarch);
		
		String string = comarch.get(0); // elementy listy sa numerowane od 0
		System.out.println("6: " + string);
		
		comarch.add(3, "Comarch SSE 7"); // wstawianie pod indeks, nale¿y sprawdzic czy dany index istnieje, je¿eli wstawimy pod nieistniejacy to wyjatek
		
		List<String> subcomarch = comarch.subList(2, 5);  //wyciagniety zostanie 2 i 4 element listy (pamietac ¿e numerowane sa od 0)
		System.out.println("7: " + subcomarch);
		
		Collections.sort(subcomarch); // sortowanie
		System.out.println("8: " + subcomarch + " posortowana lista");
		System.out.println("9: " + comarch.containsAll(subcomarch)); // kolejnosc nie jest istotna
		Collections.shuffle(subcomarch, rand); // wymieszanie listy
		System.out.println("10: " + subcomarch);
		System.out.println("11: " + comarch.containsAll(subcomarch) + " Kolejnosc przy containsAll nie jest istotna");
		List<String> copycomarch = new ArrayList<String>(comarch); // kopia listy
		subcomarch = Arrays.asList(comarch.get(1), comarch.get(2));
		copycomarch.retainAll(subcomarch);  // na liscie copy comarch zostaje tylko czesc wspolna z subcomarch, reszta jest usuwana
		System.out.println("12: " + copycomarch);
		copycomarch = new ArrayList<String>(comarch); // kopia listy
		System.out.println("13: " + copycomarch);
		copycomarch.remove(2);
		System.out.println("14: " + copycomarch);
		copycomarch.removeAll(subcomarch);
		System.out.println("15: " + copycomarch);
		//System.out.println("16: " + subcomarch);
		copycomarch.set(1, "Comarch SSE 22");
		copycomarch.addAll(2, subcomarch); // wstawienie sublisty od wybranego elementu; jest to przeciazona metoda, addAll z Collection dodaje elementy na koniec
		System.out.println("16: " + copycomarch);
		System.out.println("isEmpty: " + copycomarch.isEmpty());
		copycomarch.clear();
		System.out.println("isEmpty: " + copycomarch.isEmpty());
		Object table []= comarch.toArray();
		System.out.println(table[1] + " " + table[0]);
	}
}
