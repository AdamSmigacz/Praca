package t_3;

import java.util.Random;


class LevelNumber{
	int iLevel;
}

public class Operatory {

	public static boolean op1(int val)
	{
		System.out.println("Prawdziwosc warunku: " + (val < 1));
		return val < 1;
		
	}
	
	public static boolean op2(int val)
	{
		System.out.println("Prawdziwosc warunku: " + (val < 2));
		return val < 2;
		
	}
	
	public static boolean op3(int val)
	{
		System.out.println("Prawdziwosc warunku: " + (val < 3));
		return val < 3;
		
	}
	
	public static void showReferenceDifference(){
		// przy przypisywaniu obiektu do obiektu kopiowana jest referencja!!! A wiec po operacj przypisania zmianay wprowadzane w jednym obiekcie wprowadzane sa tez do drugiego
		// przypisywanie pol pozwala zachowac oba obiekty
		LevelNumber ln1 = new LevelNumber();
		LevelNumber ln2 = new LevelNumber();
		
		ln1.iLevel = 22;
		ln2.iLevel = 33;
		
		System.out.println("Liczba pierwsza to: " + ln1.iLevel + ", a liczba druga to: " + ln2.iLevel);
		
		
		System.out.println(ln1.equals(ln2));
		
		ln1.iLevel = ln2.iLevel;
		ln2.iLevel = 34;
		
		System.out.println("Liczba pierwsza to: " + ln1.iLevel + ", a liczba druga to: " + ln2.iLevel);
		
		ln1 = ln2;

		System.out.println("Liczba pierwsza to: " + ln1.iLevel + ", a liczba druga to: " + ln2.iLevel);
		ln1.iLevel = 55;
		
		System.out.println("Liczba pierwsza to: " + ln1.iLevel + ", a liczba druga to: " + ln2.iLevel);
	}
	
	public static void RandomNumbers(){
		// random musi przyjowac liczby > 0
		Random rand = new Random();
		for(int i = 0; i < 10; i++)
		System.out.println("Losowa liczba: " + (rand.nextInt(11)-20));
	}

	public static void Inkrementacja(){
		//++a najpierw + 1 a potem zwracany wynik
		//a++ najpierw zwracany wynik a potem +1
		int i = 1;
		System.out.println("Preinkrementacja: " + ++i);
		System.out.println("Postinkrementacja: " + i++);
		System.out.println("Argument: " + i);
		System.out.println("Predekrementacja: " + --i);
		System.out.println("Postdekrementacja: " + i--);
		System.out.println("Argument: " + i);
		
	}
	
	
	public static void main(String[] args) {
		//showReferenceDifference();
		//Inkrementacja();
		//RandomNumbers();
		
		System.out.println("Wynik sprawdzania: " + (op1(0)&&op2(2)&&op3(2))); // trzeci warunek nie by sprawdzany bo juz drugi zwraca false. Przyspieszenie dzialania systemu 
		
// strona 128
	}

}
