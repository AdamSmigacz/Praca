package t_11;

import java.util.Iterator;
// obiekt kazdej klasy implementujacej interfejs Iterable mo¿e byc u¿yty w skadni foreach (foreach wykorzystje metode iterator do przegladanie sekwencji)
public class ItterableClass implements Iterable<String>{
	protected String[] words = "Change text fields in CRM".split(" ");
	@Override
	public Iterator<String> iterator() {
		return new Iterator<String>() {
			private int index = 0;
			
			@Override
			public boolean hasNext() {
				return index < words.length;
			}

			@Override
			public String next() {
				return words[index++];
			}

			@Override
			public void remove() {
				throw new UnsupportedOperationException();
				
			}
		};
	}
	
	public static void main(String[] args) {

		for (String string : new ItterableClass()) {
			System.out.println(string);
		}
	}
}
