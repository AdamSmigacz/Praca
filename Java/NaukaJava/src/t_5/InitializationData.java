package t_5;

public class InitializationData {

	boolean t;
	char c;
	byte b;
	short s;
	int i;
	long l ;
	float f;
	double d;
	InitializationData reference; 
	
	void printInitialvalues(){
		System.out.println("Typ danych: " + "watrosc poczatkowa");
		System.out.println("Boolean: " + t);
		System.out.println("Char: " + c);
		System.out.println("Byte: " + b);
		System.out.println("Short: " + s);
		System.out.println("Int: " + i);
		System.out.println("Long: " + l);
		System.out.println("Float: " + f);
		System.out.println("Double: " + d);
		System.out.println("Referencja: " + reference);
	}
	// inicjalizacja wszystkich zmiennych jest przeprowadzana przed wywoaniem jakiejkolwiek metody, nawet przed wywoaniem konstruktora
	public static void main(String[] args) {
	InitializationData obiekt = new InitializationData();
	obiekt.printInitialvalues();

	}
}
