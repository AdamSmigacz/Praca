package t_13;

import java.util.Scanner;

public class demoScaner {

	public static void main(String[] args) {
					/*
			      String imie; //w nim zapiszemy swoje imie
			      Scanner odczyt = new Scanner(System.in); //obiekt do odebrania danych od u¿ytkownika
			      System.out.println("Give name: ");
			      imie = odczyt.nextLine();
			      System.out.println("Welcome " + imie + "!"); //wyœwietlamy powitanie
*/
			      Scanner scaner = new Scanner("12, 34, 56, 78, 90, 12, 34");
			      scaner.useDelimiter("\\s*,\\s*"); // okresla jak ma wygladac separator
			      while (scaner.hasNext()) {
					System.out.println(scaner.next());
					
				}
			      
	}

}
