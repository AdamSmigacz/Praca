package t_5;

class OwnerClass{
	
	int i;
	public OwnerClass(int i) {
		this.i = i;
		System.out.println("Zainicjalizowano: " + this.i);
		
	}
	
}

public class InitializationStatic {

	OwnerClass ow1;
	OwnerClass ow2;
	{
		ow1 = new OwnerClass(1);
		ow2 = new OwnerClass(2);
	}
	
	
	static int i;
	static char c;
	static boolean b;
	
	static{
		i=1;
		c='c';
		b = true;
		System.out.println("Wykonano inicjalizacje! " + i + " " + c + " " + b);
	}
	
	public static void main(String[] args) {
		//System.out.println("Argument: " + InitializationStatic.i);
		InitializationStatic obiekt = new InitializationStatic();
		
	}

}
