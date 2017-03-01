package t_12;

public class WhoCalled {

	static void f(){
		try {
			throw new Exception();
		} catch (Exception e) {
			for(StackTraceElement ste : e.getStackTrace())  // metoda ta zwraca tablice elementów stosu wywolan z ktorych kazdy reprezentujepojedyncza ramke stosu
				System.out.println(ste.getClassName()); // zwraca nazwy metod przez które wyjatek zostal wywolany
		}
	}
	static void g(){
		f();
	}
	static void h(){
		g();
	}
	public static void main(String[] args) {
		f();
		System.out.println();
		g();
		System.out.println();
		h();
	}
}
