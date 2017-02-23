package t_11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.TreeSet;


public class CrossContainerIteration {

	public static void display(Iterator<String> it){
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println();
	}

	public static void main(String[] args) {
		ArrayList<String> arraylist = new ArrayList<String>(Arrays.asList("Comarch SSE 1", "Comarch SSE 2", "Comarch SSE 3", "Comarch SSE 4", "Comarch SSE 5"));
		LinkedList<String> linkedlist = new LinkedList<>(Arrays.asList("Comarch SSE 11", "Comarch SSE 21", "Comarch SSE 31", "Comarch SSE 41", "Comarch SSE 51"));
		HashSet<String> hashset = new HashSet<String>(Arrays.asList("Comarch SSE 12", "Comarch SSE 22", "Comarch SSE 32", "Comarch SSE 42", "Comarch SSE 52"));
		TreeSet<String> treeSet = new TreeSet<String>(Arrays.asList("Comarch SSE 13", "Comarch SSE 23", "Comarch SSE 33", "Comarch SSE 43", "Comarch SSE 53"));
		
		display(arraylist.iterator());
		display(linkedlist.iterator());
		display(hashset.iterator());
		display(treeSet.iterator());
	}

}
