package t_11;

import java.util.Arrays;
import java.util.LinkedList;

public class LinkedListFeatures {

	public static void main(String[] args) {
		
		LinkedList<String> linkedlist = new LinkedList<String>(Arrays.asList(
				"Comarch SSE 1", "Comarch SSE 2", "Comarch SSE 3",
				"Comarch SSE 4", "Comarch SSE 5"));;
		System.out.println(linkedlist);
		System.out.println("LinkedList getFirst(): " + linkedlist.getFirst());  // pobiera pierwsyz element
		System.out.println("LinkedList element(): " + linkedlist.element());  // pobiera pierwsyz element
		System.out.println("LinkedList peek(): " + linkedlist.peek()); // kiedy lista jest pusta zwraca null (nie rzuca wyjatku)
		
		System.out.println("LinkedList remove(): " + linkedlist.remove()); //usuwa i zwraca pierwszy element
		System.out.println("LinkedList peek(): " + linkedlist.removeFirst()); //usuwa i zwraca pierwszy element
		System.out.println("LinkedList pool(): " + linkedlist.poll()); //usuwa i zwraca pierwszy element (nie rzuca wyjatku)
		
		linkedlist.addFirst("Comarch SSE 2"); //dodaje element na poczatek
		linkedlist.add("Comarch SSE 6"); // dodaje elementa na koniec listy
		linkedlist.offer("Comarch SSE 7");  // dodaje elementa na koniec listy
		linkedlist.addLast("Comarch SSE 8");  // dodaje elementa na koniec listy
		System.out.println(linkedlist);
		System.out.println(linkedlist.size());
	}

}
