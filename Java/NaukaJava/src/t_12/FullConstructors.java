package t_12;

class MyException extends Exception{
	
	public MyException(){
	}
	
	public MyException(String msg){
		super(msg);
	}
}

public class FullConstructors {
	public static void f() throws MyException{
		System.out.println("Wyjatek zwrocony z f()");
		throw new MyException();
	}
	
	public static void g() throws MyException{
		System.out.println("Wyjatek zwrocony z g()");
		throw new MyException("Wyrzucony z g");
	}
	public static void main(String[] args) {
		try {
			f();
		} catch (MyException e) {
			e.printStackTrace(System.out);
		}
		
		try {
			g();
		} catch (MyException e) {
			e.printStackTrace(System.out);
		}
		
	}

}
