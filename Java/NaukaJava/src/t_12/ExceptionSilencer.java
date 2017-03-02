package t_12;

public class ExceptionSilencer {


	@SuppressWarnings("finally")
	public static void main(String[] args) {
		try {
			throw new RuntimeException();
		} finally {
			return;  // instrukcja return w bloku finally tlumi wylapanie wyjatku
		}
	}

}
