package t_11;

import java.io.ObjectInputStream.GetField;
import java.util.HashMap;
import java.util.Map;

public class EnvironmentVariable {

	public static void main(String[] args) {

		for (Map.Entry entry : System.getenv().entrySet()) {
			//System.out.println(entry.getKey() + ": " + entry.getValue());
		}
		
		Map<Integer, String> mapexample = new HashMap<Integer, String>();
		for (int i = 0; i < 5; i++) {
			mapexample.put(i , "Comarch SSE " + (i+1));
		}
		for(Map.Entry<Integer, String> mm : mapexample.entrySet()){
			System.out.println(mm.getKey() + ": " + mm.getValue());
		}

	}
}
