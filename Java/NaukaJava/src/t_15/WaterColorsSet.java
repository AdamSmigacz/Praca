package t_15;

import java.util.EnumSet;
import java.util.Set;
import t_15.Sets;


public class WaterColorsSet {

	public static void main(String[] args) {

		Set<WaterColors> set1 = EnumSet.range(WaterColors.ROSE, WaterColors.BLACK);
		Set<WaterColors> set2 = EnumSet.range(WaterColors.ZINC, WaterColors.BLUE);
		System.out.println("set1: " + set1);
		System.out.println("set2: " + set2);
		System.out.println(Sets.union(set1, set2));
		Set<WaterColors> subset = Sets.intersection(set1, set2);
		System.out.println("Sets.intersection(set1, set2): " +  subset);
		System.out.println("Sets.difference(set1, subset): " + Sets.difference(set1, subset));
		System.out.println("Sets.complement(set1, set2): " + Sets.complement(set1, set2));
	}

}
