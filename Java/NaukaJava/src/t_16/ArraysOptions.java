package t_16;

import java.util.Arrays;

public class ArraysOptions {


	public static void main(String[] args) {
	
		BerylliumSphere[] a;
		BerylliumSphere[] b = new BerylliumSphere[5];
		
		//System.out.println("a: " + Arrays.toString(a)); niezainicjalizowana tablica która nie moze byc wyswietlona
		System.out.println("b: " + Arrays.toString(b));
		BerylliumSphere[] c = new BerylliumSphere[4];
		
		for (int i = 0; i < c.length; i++) {
			if(c[i] == null){
				c[i] = new BerylliumSphere();
			}
		}
		// inicjalizacja grupowa
		BerylliumSphere[] d = {new BerylliumSphere(), new BerylliumSphere(), new BerylliumSphere(), new BerylliumSphere()};
		
		//dynamiczna inicjalizacja grupowa
		
		a = new BerylliumSphere[]{
				new BerylliumSphere()
				, new BerylliumSphere()
				, new BerylliumSphere()
				, new BerylliumSphere()
				, new BerylliumSphere()
				, new BerylliumSphere()
		};
		
		System.out.println("a.length: " + a.length);
		System.out.println("b.length: " + b.length);
		System.out.println("c.length: " + c.length);
		System.out.println("d.length: " + d.length);
		a=d;
		
		System.out.println("a.length: " + a.length);
		
		//tablice typów podstawowych
		
		int[] e;
		int[] f = new int[15];
		System.out.println(Arrays.toString(f));
		
		int[] g = new int[8];
		for (int i = 0; i < g.length; i++) {
			g[i] = i*i;
		}
		System.out.println(Arrays.toString(g));
		
		int[] h = {11,22,33,66};
		System.out.println("f.length: " + f.length);
		System.out.println("g.length: " + g.length);
		System.out.println("h.length: " + h.length);
		
		e=h;
		System.out.println("e.length: " + e.length);
		
		e= new int[]{1,2};
		System.out.println("e.length: " + e.length);
626
	}
}
