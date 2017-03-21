package t_16;

import java.util.Arrays;

public class ComparingArrays {

	public static void main(String[] args) {

		int[] a1 = new int[10];
		int[] a2 = new int[10];
		
		Arrays.fill(a1, 11);
		Arrays.fill(a2, 11);
		 
		System.out.println("Equals of table: " + Arrays.equals(a1, a2)); // porównanie calych tablic -> musza miec ta sama liczbe identycznych elementów ustawionych pod tymi samymi indeksami 
		a1[0] = 1;
		System.out.println("Equals of table: " + Arrays.equals(a1, a2));
		
		
	}
}
