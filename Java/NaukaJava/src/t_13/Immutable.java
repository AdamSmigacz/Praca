package t_13;

public class Immutable {

	public static String upcase(String s){
		return s.toUpperCase();
	}
	

	public static void main(String[] args) {
		String s = "in family mobile_service";
		System.out.println(s);
		String us = upcase(s);
		System.out.println(us);
		System.out.println(s);
	}
// obiekty klasy String sa niezmienne(immutable). kazda metoda klasy String zwraca nowy obiekt String z ciagiem wynikowym. Pierwotny egzemplarz String pozostaje nietkniety
// przy przekazaniu 1 do metody upcase() tworzy sie kopia referencji 1. Fizyczny obiekt docelowy referencji pozostaje w swoim pierwotnym polo¿eniu
}
