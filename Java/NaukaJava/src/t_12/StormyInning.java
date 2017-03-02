package t_12;

import java.io.IOException;

class BaseballException extends Exception{}
class Foul extends BaseballException{}
class Strike extends BaseballException{}


interface Storm{
	public void event() throws RainedOut;
	public void rainedhard() throws RainedOut;
}

abstract class Inning{
	
	public Inning() throws BaseballException {}
	public void event() throws BaseballException{}
	public abstract void atBat() throws Strike, Foul;
	public void walk(){}
}

class StormException extends Exception{}
class RainedOut extends StormException{}
class PopFoul extends Foul{}

public class StormyInning extends Inning implements Storm {
	// mo¿na dodawac wyjatki do konstruktorów, ale trzeba uporac sie z wyjatkami konstruktora klasy bazowej
	public StormyInning() throws RainedOut, BaseballException{}
	public StormyInning(String s) throws Foul, BaseballException{}
	
	// zwykle metody musza trzymac sie specyfikacji wyjatkow wg wersji klasy bazowej
	
	@Override
	public void rainedhard() throws RainedOut/*, IOException*/ {} // mo¿na zawezic wyjatki, ale nie mozna rozszerzyc  w przeciazaonej metodzie
	
	@Override
	public void atBat() throws PopFoul {}
	
	
	// mo¿na zaniechac wyrzucania jakichkolwiek wyjatkow pomimo ich obecnosci w klasie bazowej
	public void event(){}
	public static void main(String[] args) {
		
		try {
			StormyInning si = new StormyInning();
			si.atBat();
			
		} catch (PopFoul e) {
			System.out.println("Popfoul");
			e.printStackTrace(System.out);
		}catch (RainedOut e) {
			System.out.println("RainedOut");
			e.printStackTrace(System.out);
		}catch (BaseballException e) {
			System.out.println("BaseballException");
			e.printStackTrace(System.out);
		}
		
		try {
			Inning i = new StormyInning(); // rzutowanie w gore
			i.atBat();
			//trzeba przechwycic wyjatki z wersji metody z klasy bazowej
		} catch (Strike e) {
			System.out.println("Strike");
			e.printStackTrace(System.out);
		} catch (Foul e) {
			System.out.println("Foul");
			e.printStackTrace(System.out);
		} catch (RainedOut e) {
			System.out.println("RainedOut");
			e.printStackTrace(System.out);
		} catch (BaseballException e) {
			System.out.println("BaseballException");
			e.printStackTrace(System.out);
		}
	}
	// Interfejs specyfikacji wyjatkow dla konkretnej metody moze zostac zawezony w trakcie dziedziczenia i przesloniecia ale nie mozna go rozszerzac.


}
