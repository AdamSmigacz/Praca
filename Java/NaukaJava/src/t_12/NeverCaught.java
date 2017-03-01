package t_12;

public class NeverCaught {
	static void f(){
		throw new RuntimeException();
	}
	static void g(){
		f();
	}
	
	public static void main(String[] args) {
		g();
		//jesli Runtime exception dostanie sie do wyjscia to przed wyjsciem z programu wywoywana jest dla niego metoda printStacktrace
	}

}
