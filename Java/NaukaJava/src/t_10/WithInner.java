package t_10;

class OuterO {
	OuterO() {
		System.out.println("OuterO konstruktor");
	}
	class InnerO {

		public InnerO(){
			System.out.println("InnerO konstruktor");
		}
	}
}

public class WithInner extends OuterO.InnerO {

	WithInner(OuterO o) {
		o.super();  // to wywoanie zapewnia niezbedna referencje do obiektu zewnetrznego
	}

	public static void main(String[] args) {
		OuterO o = new OuterO();
		WithInner w = new WithInner(o);

	}

}
