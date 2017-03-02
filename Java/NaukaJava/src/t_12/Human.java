package t_12;

class Annoyance extends Exception{}
class Sneeze extends Annoyance{}

public class Human {


	public static void main(String[] args) {
		try {
			throw new Sneeze();
			
		} catch (Sneeze e) {
			System.out.println("Catched exception Sneeze()");  // nie mozna zamienic miejscami wywoania bo inaczej kopilator wyjebie blad
			
		} catch (Annoyance e){
			System.out.println("Catched exception Annoyance()");
		}

		try {
			throw new Sneeze();
			
		} catch (Annoyance e){ // blok ten przejmuje wyjatki Annoyance lub wyjatki dziedziczace po tej klasie jak np Sneeze
			System.out.println("Catched exception Annoyance()");  // przechwytywanie typu bazowego
		}
	}

}
