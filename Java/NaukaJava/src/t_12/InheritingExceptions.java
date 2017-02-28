package t_12;

class SimpleException extends Exception{
	
}

public class InheritingExceptions {

	public void f() throws SimpleException{
		System.out.println("Wyrzucam wyjatek SimpleException z f()");
		
			throw new SimpleException();
	}
	public static void main(String[] args) {
		InheritingExceptions obiekt = new InheritingExceptions();
		try {
			obiekt.f();
		} catch (SimpleException e) {
			
			System.out.println("Wyrzucony");
		}

	}

}
