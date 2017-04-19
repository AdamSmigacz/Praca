package t_11;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class SetOperations {

	public static void main(String[] args) {
		
		Set<String> setlist = new HashSet<String>();
		Collections.addAll(setlist, "A B C D E F G H I J K L M N O P R".split(" "));
		setlist.add("M");
		System.out.println("H: " + setlist.contains("H"));
		System.out.println("Z: " + setlist.contains("Z"));
		
		Set<String> setlist_2 = new HashSet<String>();
		Collections.addAll(setlist_2, "O P R S T U V".split(" "));
		System.out.println("setlist_2 in setlist: " + setlist.containsAll(setlist_2));
		setlist_2.remove("R");
		setlist_2.remove("S");
		setlist_2.remove("T");
		setlist_2.remove("U");
		setlist_2.remove("V");
		System.out.println("setlist_2 in setlist after removing elements: " + setlist.containsAll(setlist_2));
		setlist.retainAll(setlist_2);
		System.out.println("Setlist: " + setlist);
		setlist.clear();
		System.out.println(setlist.isEmpty());
		System.out.println(setlist.size());
	}

}
