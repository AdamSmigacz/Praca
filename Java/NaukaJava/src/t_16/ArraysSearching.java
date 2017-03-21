package t_16;

import java.util.Arrays;

public class ArraysSearching {


	public static void main(String[] args) {
	
		String[] sa = "If Key Customer Escalation assigned to case subtype or actual reason is No or empty then generally do nothing aka".split(" ");
		System.out.println(Arrays.toString(sa));
		Arrays.sort(sa, String.CASE_INSENSITIVE_ORDER);
		System.out.println(Arrays.toString(sa));
		System.out.println(Arrays.binarySearch(sa, "Customer")); // zwraca id -> tablica musi byc posortowana!!!! inaczej wyniki sa z dupy
		
	}
}
