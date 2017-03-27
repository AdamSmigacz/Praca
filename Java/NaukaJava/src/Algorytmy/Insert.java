package Algorytmy;


public class Insert {

	private static int tablica[] = {67, 11, 12, 4, 3, 2, 1 };
	private static int ile_liczb;

	private static void insertionsort(int tablica[]) {
		int i, j, v;

		for (i = 1; i < tablica.length; i++) {
			j = i;
			v = tablica[i];
			while ((j > 0) && (tablica[j - 1] > v)) {
				tablica[j] = tablica[j - 1];
				j--;
			}
			tablica[j] = v;
		}
	}

	public static void main(String[] args) {

		int i, liczba;

		System.out.println("Ile liczb chesz posortowac.");
		ile_liczb = 4;

		System.out.println("Tablica przed posortowaniem:");
		for (i = 0; i < tablica.length; i++)
			System.out.println(tablica[i]);
		insertionsort(tablica);
		System.out.println("Tablica po posortowaniu:");
		for (i = 0; i < tablica.length; i++)
			System.out.println(tablica[i]);
	}
}