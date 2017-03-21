package t_16;

import java.util.Arrays;
import java.util.Collections;

public class Arrayssort {

	public static void main(String[] args) {
	
		String[] sa = {"Adam", "Anna", "Adrian", "ANgelika", "Andzia", "Bartek",
				"Anita",
				"Anzelma",
				"Apollona",
				"Arabella",};
		
		System.out.println(Arrays.toString(sa));
		Arrays.sort(sa);
		System.out.println(Arrays.toString(sa));
		Arrays.sort(sa, Collections.reverseOrder());
		System.out.println(Arrays.toString(sa));
		Arrays.sort(sa, String.CASE_INSENSITIVE_ORDER);
		System.out.println(Arrays.toString(sa));
	}
}