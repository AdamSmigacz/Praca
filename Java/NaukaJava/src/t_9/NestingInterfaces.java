package t_9;

class A{
	interface B{
		 void f();
	}
	public class BImp implements B{

		@Override
		public void f() {
			System.out.println("BImpl.f();");
			
		}
	}
	
	private class BImp2 implements B{

		@Override
		public void f() {
			System.out.println("BImpl2.f();");
			
		}
	}
	
	public interface C{
		void f();
	}
	
	class CImp implements C{

		@Override
		public void f() {
			System.out.println("CImpl.f();");
			
		}
	}
	
	class CImp2 implements C{

		@Override
		public void f() {
			System.out.println("CImpl2.f();");
			
		}
	}
	
	
	private interface D{
		void f();
	}
	
	private class DImp implements D{

		@Override
		public void f() {
			System.out.println("DImpl.f();");
			
		}
	}
	
	public class DImp2 implements D{

		@Override
		public void f() {
			System.out.println("DImpl2.f();");
			
		}
	}
	
public D getD() {
	return new DImp2();
}

}


public class NestingInterfaces {

	
	public static void main(String[] args) {

	}

}

// nie mo¿na tworzyc zagnie¿dzonych interfejsów prywatnych
