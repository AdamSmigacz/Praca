package t_15;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class ContainermethodDifferences {

	static Set<String> metodSet(Class<?> type) {
		Set<String> result = new TreeSet<String>();
		for (Method m : type.getMethods()) {
			result.add(m.getName());
		}
		return result;
	}

	static void interfaces(Class<?> type) {
		System.out.println("Interfejsy w " + type.getSimpleName() + ": ");
		List<String> result = new ArrayList<String>();
		for (Class<?> c : type.getInterfaces()) {
			result.add(c.getSimpleName());
		}
		System.out.println(result);
	}

	static Set<String> object = metodSet(Object.class);
	static{
		object.add("klon");
	}
	static void difference(Class<?> superset, Class<?> subset){
		System.out.println(superset.getSimpleName() + " dziedziczy po " + subset.getSimpleName() + " , dodajac: ");
		Set<String> comp = Sets.difference(metodSet(superset), metodSet(subset));
		comp.removeAll(object);
		System.out.println(comp);
		interfaces(superset);
	}
	public static void main(String[] args) {
		
		System.out.println("Collection " + metodSet(Collection.class));
		interfaces(Collection.class);
		difference(Set.class, Collection.class);
		
	}
}
