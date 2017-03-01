package t_12;

class MyException2 extends Exception{
	private int x;
	public MyException2(){}
	
	public MyException2(String msg){
		super(msg);
	}
	
	public MyException2(String msg, int x){
		super(msg);
		this.x = x;
	}
	
	public int val(){
		return x;
	}
	public String getMessage(){  // metoda ta peni podobna role jak metoda toString w klasach (tu zostala przeslonieta aby pokazac cos innego niz default)
		return "Komunikat szegolow: " + x + " " + super.getMessage();
	}
}

public class ExtraFeatures {
	
	public static void f() throws MyException2{
		System.out.println("Wyrzucam wyjatek MyException2 z f()");
		throw new MyException2();
	}
	
	public static void g() throws MyException2{
		System.out.println("Wyrzucam wyjatek MyException2 z g()");
		throw new MyException2("Zapoczatkowany w g()");
	}
	
	public static void h() throws MyException2{
		System.out.println("Wyrzucam wyjatek MyException2 z h()");
		throw new MyException2("Zapoczatkowany w h()", 47);
	}

	public static void main(String[] args) {
		try {
			f();
		} catch (MyException2 e) {
			e.printStackTrace(System.out);
		}
		
		try {
			g();
		} catch (MyException2 e) {
			e.printStackTrace(System.out);
		}
		
		try {
			h();
		} catch (MyException2 e) {
			e.printStackTrace(System.out); // Wypisuje Throwable i slad stosu wywolan. Stos wywolan pokazuje sekwencje wywolan metod prowadzaca do miejsca w którym zostal wyrzucony wyjatek (ta metoda pochodzi z klasy Throwable)
			System.out.println("e.val() = " + e.val());
		}

	}

}
