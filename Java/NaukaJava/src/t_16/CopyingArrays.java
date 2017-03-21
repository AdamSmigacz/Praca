package t_16;

import java.util.Arrays;

public class CopyingArrays {


	public static void main(String[] args) {
	
		int[] i = new int[7];
		int[] j = new int[10];
		Arrays.fill(i, 11);
		Arrays.fill(j, 23);
		
		System.out.println("i: " + Arrays.toString(i));
		System.out.println("j: " + Arrays.toString(j));
		
		System.arraycopy(i, 0, j, 2, i.length); // kopiwoanie tablicy ¿ródlowej "i" do  docelowej 'j' 
		System.out.println("j: " + Arrays.toString(j));
	}

}
