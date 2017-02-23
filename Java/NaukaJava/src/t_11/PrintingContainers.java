package t_11;

import java.util.*;

public class PrintingContainers {
	static Collection fill (Collection<String> collection){
		collection.add("Comarch CA 1 ");
		collection.add("Comarch CA 2 ");
		collection.add("Comarch CA 3 ");
		collection.add("Comarch CA 4 ");
		return collection;
	}

	static Map fill(Map<String, String>map){
		map.put("Comarch CA 1 ", " SSE 1");
		map.put("Comarch CA 2 ", " SSE 2");
		map.put("Comarch CA 3 ", " SSE 3");
		map.put("Comarch CA 4 ", " SSE 4");
		map.put("Comarch CA 5 ", " SSE 5");
		return map;
	}
	public static void main(String[] args) {
		
		System.out.println(fill(new ArrayList<String>()));
		System.out.println(fill(new LinkedList<String>()));
		System.out.println(fill(new HashSet<String>()));
		System.out.println(fill(new TreeSet<String>()));
		System.out.println(fill(new LinkedHashSet<String>()));
		System.out.println(fill(new HashMap<String, String>()));
		System.out.println(fill(new TreeMap<String, String>()));
		System.out.println(fill(new LinkedHashMap<String, String>()));
		
	}
}
