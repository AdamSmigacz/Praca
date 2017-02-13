package t_10;

class Outer{
	
	void f(){
		System.out.println("Outer.f()");
	}
	public class Inner{
		void f(){
			System.out.println("Inner.f()");
		}
		public Outer outer(){
			return Outer.this;
			
		}
	}
	public Inner inner(){
		return new Inner();
	}
}

public class DotThis {

	
	public static void main(String[] args) {
		Outer o = new Outer();
		Outer.Inner oi = o.inner();
		oi.f();
		oi.outer().f(); // wywolanie funkcji na rzecz zwroconej referencji z klasy wewnetrznej
	}
}
