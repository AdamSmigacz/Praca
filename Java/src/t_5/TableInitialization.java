package t_5;

import java.util.Arrays;


public class TableInitialization {


public static void zFunction(int... arg){ // arg to tablica
	
	for(Integer i : arg)
	System.out.println("Zmienna typ argumentów: " + i);
}


	public static void main(String[] args) {
		
		int[] t1 = {1,2,3,4,5,6,7,8,9};
		int[] t2;
		t2 = t1; //kopiowanie referencji, od tej pory obie tablice wskazuja na to samo
		
		for (int i = 0; i < t2.length; i++) {
			t2[i] = 10 * t2[i];
		}
		
		for (int i = 0; i < t1.length; i++) {
			System.out.println("Wartosc " + (i + 1) + " elementu to: " + t1[i]);
		}
		
		Integer[] b;
		
		b = new Integer[]{
			new Integer(1)
			, new Integer(2)
			, new Integer(3)
			, new Integer(4)
			, new Integer(5)
			, new Integer(6)};
		System.out.println("Tablica Integer: " + Arrays.toString(b));
		

		zFunction(1);
		zFunction();
		zFunction('C');
		
		
	}

}
