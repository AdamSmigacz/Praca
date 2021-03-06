package t_11;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

//klasy Arrays and Collections udostepniaja metody narzedziowe grupujace elementy do postaci kolekcji Collection

public class AddingGroup {


	public static void main(String[] args) {
		
		Collection<Integer> collection = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6));
		System.out.println(collection);
		
		Integer [] moreInts = {7,8,9,10,11,12,13};
		collection.addAll(Arrays.asList(moreInts)); //bardziej elastyczna
		System.out.println(collection);
		
	
		Collections.addAll(collection, 14,15,16,17,18); //dziaa szybciej
		System.out.println(collection);
		
		Collections.addAll(collection, moreInts);
		System.out.println(collection);
		
		List<Integer> list = Arrays.asList(21,22,23,24,25,26);  // rozmiaru tej listy nie mozna modyfikowac
		//list.add(12); niemozliwe
		System.out.println(list);
		
		list.set(1, 33);
		System.out.println(list);
		

	}

}
