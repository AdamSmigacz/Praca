package t_15;

import java.util.*;

class Forb {
}

class Fnorkle {
}

class Quark<Q> {
}

class Practicle<POSITION, MOMENTUM> {
}

public class Lostinformation {

	public static void main(String[] args) {

		List<Forb> list = new ArrayList<Forb>();
		Map<Forb, Fnorkle> map = new HashMap<Forb, Fnorkle>();
		Quark<Fnorkle> quark = new Quark<Fnorkle>();
		Practicle<Long, Double> practicle = new Practicle<Long, Double>();
		System.out.println(Arrays.toString(list.getClass().getTypeParameters()));
		System.out.println(Arrays.toString(map.getClass().getTypeParameters()));
		System.out.println(Arrays.toString(quark.getClass().getTypeParameters()));
		System.out.println(Arrays.toString(practicle.getClass().getTypeParameters()));
		
		// w kodzie uogólnionym nie ma dostepu do informacji o typach konkretyzujacych uogólnienie np List<String> oraz List<Integer> w czasie wykonania sa tymi samymi typami
		
		Class c1 = new ArrayList<Integer>().getClass();
		Class c2 = new ArrayList<String>().getClass();
		System.out.println(Arrays.toString(c1.getTypeParameters()));
	}

}
