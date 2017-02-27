package t_11;

import java.io.ObjectInputStream.GetField;
import java.util.Map;

public class EnvironmentVariable {

	public static void main(String[] args) {

		for (Map.Entry entry : System.getenv().entrySet()) {
			System.out.println(entry.getKey() + ": " + entry.getValue());
		}
	}

}
