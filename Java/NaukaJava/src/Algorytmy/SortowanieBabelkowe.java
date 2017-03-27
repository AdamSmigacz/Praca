package Algorytmy;


import java.util.Arrays;

public class SortowanieBabelkowe {
	public static void swap(int[] tablica, int i, int j) {
		int temp = tablica[i];
		tablica[i] = tablica[j];
		tablica[j] = temp;
	}

	public static void bubblesort1(int[] tablica) {
		for (int i = 0; i < tablica.length - 1; i++) {
			for (int j = 0; j < tablica.length - 1; j++) {
				if (tablica[j] > tablica[j + 1]) {
					System.out.println(tablica[j] + " " + tablica[j + 1]);
					swap(tablica, j, j + 1);
				}
			}
		}
	}

	public static void bubblesort2(int[] tablica) {
		for (int i = 1; i < tablica.length; i++) {
			for (int j = 0; j < tablica.length - i; j++) {
				if (tablica[j] > tablica[j + 1]) {
					swap(tablica, j, j + 1);
				}
			}
		}
	}
	
	public static void main(String[] args) {
		int[] table = { 9, 8, 7, 5, 6, 4, 3, 2, 1 };
		bubblesort1(table);
		System.out.println(Arrays.toString(table));
		
	}
}
