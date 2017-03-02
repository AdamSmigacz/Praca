package t_12;

public class MultipleReturns {

	public static void f(int i){
		System.out.println("Initialization of cleaning");
		try {
			System.out.println("Point 0");
			if ( i == 1 ) 
				return;
				System.out.println("Point 1");
			 if(i == 2) 
				return;	
				System.out.println("Point 2");
			if(i == 3)
				return;
			System.out.println("Point 3");
			return;
		} finally {
			System.out.println("Cleaning");
		}
	}

	public static void main(String[] args) {
		f(3); // zawsze dochodzi do wywolania bloku finnaly niezaleznie od przerwania try 
	}

}
