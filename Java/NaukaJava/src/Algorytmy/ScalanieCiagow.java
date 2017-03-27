package Algorytmy;

import java.util.Arrays;

public class ScalanieCiagow {

	private static int[] tab = { 1, 5, 13, 24, 35, 48, 59, 67, 86, 94 };
	private static int[] tab2 = { 2, 4, 11, 27, 49, 53, 64, 3, 74, 85, 99 };
	private static int[] tab_wynikowa;

	public static void swap(int[] tablica, int i, int j) {
		int temp = tablica[i];
		tablica[i] = tablica[j];
		tablica[j] = temp;
	}

	public static void main(String[] args) {
		int i, j, k;

		// Wypisz zawartosc pierwszego ciagu
		System.out.println("Pierwszy ciag:");
		for (int e : tab) {
			System.out.print(e + ", ");
		}
		// Wypisz zawartosc drugiego ciagu
		System.out.println("\nDrugi ciag:");
		for (int e : tab2) {
			System.out.print(e + ", ");
		}

		// Utworz tablice wynikowa
		tab_wynikowa = new int[tab.length + tab2.length - 1];

		// Bierz mniejsza wartosc z pierwszego badz drugiego ciagu,
		// dopoki zaden z nich sie nie skonczy
		for (i = j = k = 0; i < 10 && j < 10; k++) {
			if (tab[i] < tab2[j]) {
				tab_wynikowa[k] = tab[i];
				++i;
			} else {
				tab_wynikowa[k] = tab2[j];
				++j;
			}
		}

		// Jeden z ciagow sie skonczyl dopisz do wyniku pozostaly
		if (i < 10) {
			for (; i < 10; i++, k++) {
				tab_wynikowa[k] = tab[i];
			}
		} else {
			for (; j < 10; j++, k++) {
				tab_wynikowa[k] = tab2[j];
			}
		}

		// Wypisz wynik
		System.out.println("\nCiag wynikowy:" + Arrays.toString(tab_wynikowa) );


		System.out.println();
		for (int i1 = 0; i1 < tab_wynikowa.length - 1; i1++) {
			for (int j1 = 0; j1 < tab_wynikowa.length - 1; j1++) {
				if (tab_wynikowa[j1] > tab_wynikowa[j1 + 1]) {
					System.out.println(tab_wynikowa[j1] + " "+ tab_wynikowa[j1 + 1]);
					swap(tab_wynikowa, j1, j1 + 1);
				}
			}
		}
		System.out.println(Arrays.toString(tab_wynikowa));
	}
}