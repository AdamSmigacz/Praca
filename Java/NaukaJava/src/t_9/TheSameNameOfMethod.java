package t_9;

interface I1{
	void f();
}

interface I2{
	void f();
}
class C{
	void f(){
		
	}
}

interface I3 extends I1, I2{}

public class TheSameNameOfMethod extends C implements I1, I2{
	@Override
	public void f() {
		
		System.out.println(getClass().getSimpleName());
	}
	public static void main(String[] args) {

		TheSameNameOfMethod obiekt = new TheSameNameOfMethod();
		obiekt.f();
	}
}
