package t_12;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.logging.Logger;

//Rejestrowanie wyjatków

class LoggingException extends Exception{
	private static Logger loger = Logger.getLogger("LoggingException");
	public LoggingException() {
		StringWriter trace = new StringWriter();
		printStackTrace(new PrintWriter(trace));
		loger.severe(trace.toString());
	}
}
public class LoggingExceptions {

	public static void main(String[] args) {
		try {
			throw new LoggingException();
		} catch (LoggingException e) {
			System.err.println("Przechwycono " + e);
		}
		
		try {
			throw new LoggingException();
		} catch (LoggingException e) {
			System.err.println("Przechwycono " + e);
		}

	}

}
