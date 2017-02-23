package t_11;
// listiterator ma wiecej opcji ale nie jest az tak wydajny jak zwyky iterator
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class ListItteration {
	public static void main(String[] args) {

		List<String> arraylist = new ArrayList<String>(Arrays.asList(
				"Comarch SSE 1", "Comarch SSE 2", "Comarch SSE 3",
				"Comarch SSE 4", "Comarch SSE 5"));
		ListIterator<String> lit = arraylist.listIterator();
		while (lit.hasNext()) {
			System.out.println(lit.next() + " " + lit.previousIndex() + " " 
		+ lit.nextIndex());

		}
		System.out.println();
		while (lit.hasPrevious()) {
			System.out.println(lit.previous());
		}
		System.out.println();
		
		lit = arraylist.listIterator(2);
		
		while (lit.hasNext()) {
			
			System.out.println(lit.next());
		}
	}
}
