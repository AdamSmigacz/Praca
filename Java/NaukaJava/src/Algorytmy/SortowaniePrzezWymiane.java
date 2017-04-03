package Algorytmy;

import java.util.Arrays;

public class SortowaniePrzezWymiane {
/*Metoda ta nazywana jest sortowaniem przez wymianê gdy¿ na pocz¹tku szukany jest najmniejszy element, po znalezieniu go jest on zamieniany z pierwszym elementem tablicy.*/
	static int[] table = { 61, 22, 47, 55, 88, 99, 11, 2, 3, 4, 6, 7, 8, 9, 5, 2 };

	public static void selectionSort(int[] tablica) {
		int temp;
		for (int i = 0; i < tablica.length - 1; i++) {
			for (int j = i + 1; j < tablica.length; j++) {
				if (tablica[j] < tablica[i]) {
					temp = tablica[i];
					tablica[i] = tablica[j];
					tablica[j] = temp;
				}
			}
		}
	}

	public static void main(String[] args) {

		selectionSort(table);
		System.out.println(Arrays.toString(table));
	}

}
