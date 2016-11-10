package t_4;

import java.util.Random;

public class iteracja {

	static boolean condition(){
		boolean result = Math.random()< 0.7;
		System.out.println(result + ", ");
		return result;
		
	}
	
	public static void showChar(){
		for (char i = 0; i < 128; i++) {
			System.out.println("Wartosc: " + (int)i + " znak: " + i);
		}
	}
	
	public static void loopForeach(){
		
		Random rand = new Random();
		float f[] = new float[10];
		for (int i = 0; i < 10; i++) {
			f[i] = rand.nextFloat();
		}
		for( float x : f)
		{
			System.out.println(x);
		}
		
	}
	public static void main(String[] args) {
/*
		while (condition()) {   // wykonuje petle dopoki funkcja zwraca true ; condition() == true
			System.out.println("Wewnatrz petli!");
			System.out.println("Poza petla");
	
		}*/
		//showChar();
		loopForeach();
	}

}
