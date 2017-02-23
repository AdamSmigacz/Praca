package t_11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class SimpleIteration {


	public static void main(String[] args) {
		List<String> comarch =  new ArrayList<String>(Arrays.asList("Comarch SSE 1", "Comarch SSE 2", "Comarch SSE 3", "Comarch SSE 4", "Comarch SSE 5"));
		Iterator <String> it = comarch.iterator();
		
		while (it.hasNext()) {
			String s = it.next();
			System.out.println(s);
			
		}
		System.out.println(" ");
		for (String string : comarch) {
			System.out.println(string);
		}
		while (it.hasNext()) {
			it.next();
			it.remove();
		}
		System.out.println();
	}

}
