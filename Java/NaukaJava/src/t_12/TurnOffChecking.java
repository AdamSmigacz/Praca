package t_12;

import java.io.FileNotFoundException;
import java.io.IOException;

class WrapCheckedException {
	void throwRuntimeException(int type) {
		try {
			switch (type) {
			case 0:
				throw new FileNotFoundException();
			case 1:
				throw new IOException();
			case 2:
				throw new RuntimeException(
						"Runtime exception: throwRuntimeException ");
			default:
				return;
			}
		} catch (Exception e) { // adaptacja do wyjatku niesprawdzanego
			throw new RuntimeException(e);
		}
	}
}

class SomeOtherException extends Exception {}

public class TurnOffChecking {
	public static void main(String[] args) {
		WrapCheckedException wce = new WrapCheckedException();
		wce.throwRuntimeException(3);

		for (int i = 0; i < 4; i++) {
			try {
				if (i < 3)
					wce.throwRuntimeException(i);
				else
					throw new SomeOtherException();

			} catch (SomeOtherException e) {
				System.out.println("SomeOtherException: " + e);
			} catch (RuntimeException re) {
				try {
					throw re.getCause();
				} catch (FileNotFoundException e2) {
					System.out.println("FileNotFoundException: " + e2);
				} catch (IOException e1) {
					System.out.println("FileNotFoundException: " + e1);
				} catch (Throwable e3) {
					System.out.println("FileNotFoundException: " + e3);
				}
			}
		}
	}
}
