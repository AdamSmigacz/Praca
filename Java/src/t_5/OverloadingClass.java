package t_5;

public class OverloadingClass {

	void exampleMethodInt(double x)
	{
		System.out.println("Argument x: " + x);
	}
	
	void exampleMethod(int x)
	{
		exampleMethodInt(x);
	}
	public static void main(String[] args) {
		
		int x = 1;
		OverloadingClass type = new OverloadingClass();
		type.exampleMethod(x);

	}

}



