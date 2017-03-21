package t_16;

import java.util.Arrays;

public class FillingArrays {

	public static void main(String[] args) {

		int size = 6;
		boolean[] a1 = new boolean[size]; 
		byte[] a2 = new byte[size];
		char[] a3 = new char[size];
		short[] a4 = new short[size];
		int[] a5 = new int[size];
		long[] a6 = new long[size];
		float[] a7 = new float[size];
		double[] a8 = new double[size];
		String[] a9 = new String[size];
		
		Arrays.fill(a1, true);
		System.out.println(Arrays.toString(a1));
		
		Arrays.fill(a2, (byte)11);
		System.out.println(Arrays.toString(a2));
		
		Arrays.fill(a3, 'x');
		System.out.println(Arrays.toString(a3));
		
		Arrays.fill(a4, (short)17);
		System.out.println(Arrays.toString(a4));
		
		Arrays.fill(a5, 1);
		System.out.println(Arrays.toString(a5));
		
		Arrays.fill(a6, 23l);
		System.out.println(Arrays.toString(a6));
		
		Arrays.fill(a7, 1211.222f);
		System.out.println(Arrays.toString(a7));
		
		Arrays.fill(a8, 12222.444);
		System.out.println(Arrays.toString(a8));
		
		Arrays.fill(a9, "CRM side");
		System.out.println(Arrays.toString(a9));
		
		Arrays.fill(a9, 1, 6, "Other side");  // od 3 do 6
		System.out.println(Arrays.toString(a9));
	}
}