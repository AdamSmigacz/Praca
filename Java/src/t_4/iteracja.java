package t_4;

import java.util.Random;

public class iteracja {

	static boolean condition(){
		boolean result = Math.random()< 0.7;
		System.out.println(result + ", ");
		return result;
		
	}
	public static void breakContinue()
	{
		
		for (int i = 0; i < 100; i++) {
			
			if (i == 30){ 
				System.out.println("Przerwanie");
				break;
			}
		if (i>10)
		{
			System.out.println("Liczba: " + i);
			continue;
		}
		System.out.println("Wykonanie petli!");
		}
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
	
	public static void switchFunction(int Operator)
	{
		// switch dziaa tylko z selektorami calkowitymi. Nie dziala on z float double itp.
		switch (Operator) {
		case 1:
			System.out.println("Value: " + 1);
			break;
		case 2:
			System.out.println("Value: " + 2);
			break;
		case 3:
			System.out.println("Value: " + 3);
			break;
		default:
			System.out.println("Default value: " + 100);
			break;
		}
	}
	public static void main(String[] args) {
/*
		while (condition()) {   // wykonuje petle dopoki funkcja zwraca true ; condition() == true
			System.out.println("Wewnatrz petli!");
			System.out.println("Poza petla");
	
		}*/
		//showChar();
		//loopForeach();
		//breakContinue();
		//switchFunction(4);
		
		// strona 142
	}

}
