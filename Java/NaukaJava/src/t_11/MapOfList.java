package t_11;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapOfList {
	public static Map<String, List<String>> staticMap = new HashMap<String, List<String>>();
	static{
		staticMap.put("Anna", Arrays.asList("Kot", "Pies", "Kuna", "Kon", "Wydra", "Ryj�wka", "Zajac"));
		staticMap.put("Piotr", Arrays.asList("Kot", "Pies", "Kuna", "Kon", "Wydra", "Ryj�wka", "Zajac"));
		staticMap.put("Barbara", Arrays.asList("Kot", "Pies", "Kuna", "Kura", "Wydra", "Ryj�wka", "Zajac"));
		staticMap.put("Sylwia", Arrays.asList("Kot", "Pies", "Kuna", "�aba", "Wydra", "Ryj�wka", "Zajac"));
		staticMap.put("Daniel", Arrays.asList("Kot", "Pies", "Kuna", "Okon", "Ryba", "Ryj�wka", "Zajac"));
	}
	public static void main(String[] args) {
		
		System.out.println("Klucze mapy: " + staticMap.keySet());
		System.out.println("Wartosci mapy: " + staticMap.values());
		for(String s : staticMap.keySet()){
			System.out.println(s + " ma: ");
			for(String sv : staticMap.get(s)){
				System.out.println("       " + sv);
				
			}
		}
	}
}
