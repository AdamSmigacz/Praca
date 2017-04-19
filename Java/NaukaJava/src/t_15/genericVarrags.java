package t_15;

import java.util.ArrayList;
import java.util.List;

public class genericVarrags {

	public static <T> List<T> makeList(T...ts ){
		List<T> results = new ArrayList<>();
		for (T item : ts)
			results.add(item);
		return results;
	}
	public static void main(String[] args) {
		List<String> ls = makeList("A");
		System.out.println(ls);
		ls = makeList("A","B","C");
		System.out.println(ls);

	}

}
