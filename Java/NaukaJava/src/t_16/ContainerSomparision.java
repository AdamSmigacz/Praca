package t_16;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


class BerylliumSphere{
	private static long counter;
	private final long id = counter++;
	public String toString(){
		return "Sfera: " + id;
	}
}

public class ContainerSomparision {

	public static void main(String[] args) {
		
		BerylliumSphere[] spheres = new BerylliumSphere[10];
		for (int i = 0; i < 5; i++) {
			spheres[i] = new BerylliumSphere();
		}
		System.out.println(Arrays.toString(spheres));
		System.out.println(spheres[4]);
		
		List<BerylliumSphere> list = new ArrayList<BerylliumSphere>();
		for (int i = 0; i < 5; i++) {
			list.add(new BerylliumSphere());
		}
		
		System.out.println(list);
		System.out.println(list.get(4));
		
		int[] integers = {1,2,3,4,5,6,7,8};
		System.out.println(Arrays.toString(integers));
		System.out.println(integers[4]);
		
		List<Integer> integersList = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8));
		integersList.add(97);
		System.out.println(integersList);
		System.out.println(integersList.get(4));
	}
}
