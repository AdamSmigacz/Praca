package t_13;

import java.util.List;
import java.util.ArrayList;

public class InfiniteRecursion {
	public String toString() {
		return "Adres InfiniteRecursion: " + super.toString()+ "\n";  //jesli dalibysmy tu "this" to powstanie petla bo dla this zostanie wywolane ponownie toString 
	}

	public static void main(String[] args) {
		List<InfiniteRecursion> list = new ArrayList<InfiniteRecursion>();
		for (int i = 0; i < 10; i++) {
			list.add(new InfiniteRecursion());
		}

		System.out.println(list);
	}
340
}
