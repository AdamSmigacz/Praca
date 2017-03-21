package t_16;

import java.util.*;


public class IceCream {
	
	private static Random rand = new Random(47);
	
	static final String[] FLAVOURS = {"Czekoladowe", "Truskawkowe", "Karmel", "Mieta", "Rodzynki", "Praliny", "Brówki"};

	public static String[] flavorSet(int n){
		
		if(n > FLAVOURS.length)
			throw new IllegalArgumentException("Za duzo smakow");
		String[] results = new String[n];
		boolean[] picked = new boolean[FLAVOURS.length];
		for (int i = 0; i < n; i++) {
			int t;
			do{
				t=rand.nextInt(FLAVOURS.length);
				System.out.println(picked[t]);}
			while(picked[t]);
				results[i] = FLAVOURS[t];
				picked[t] = true;
			
		}
		return results;
	}
	
	public static void main(String[] args) {
		for (int i = 0; i < 2; i++) {
			System.out.println(Arrays.deepToString(flavorSet(5)));
		}
	}
}
