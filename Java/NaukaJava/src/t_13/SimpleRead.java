package t_13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;

public class SimpleRead {

	public static BufferedReader input = new BufferedReader(new StringReader("Comarch is the best company\n22 1.61803"));
	
	public static void main(String[] args) {
		
		/*s
		try {
			
			System.out.println("LastName: ");
			String name = input.readLine();
			System.out.println("Ile masz lat? Jaka jest twoja ulubiona liczba zmiennoprzecinkowa?");
			System.out.println("Wejscie: <wiek><liczba>");
			System.out.println();
			String numbers = input.readLine();
			String[] numArray = numbers.split(" ");
			int age = Integer.parseInt(numArray[1]);
			double favourite = Double.parseDouble(numArray[1]);
			System.out.format("Witaj,s%.\n", name);
			System.out.format("Za 5 lat bede mia ich: %d.\n", age+5);
			System.out.format("Moja ulubiona liczba to: %f.\n", favourite);
			
		} catch (IOException e) {
			
			System.out.println("Blad wejscia-wyjscia");
		}
		*/
		String name;
		try {
			name = input.readLine();
			System.out.println(name);
		} catch (IOException e) {
			
			System.out.println("Blad wejscia-wyjscia");
		}
		
		
	}

}
