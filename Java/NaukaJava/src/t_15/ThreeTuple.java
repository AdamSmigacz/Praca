package t_15;
// stworzenie krotki 3 elementowej poprzez dziedziczenie
public class ThreeTuple<A,B,C> extends TwoTuple<A, B>{
	
	final C third;
	
	public ThreeTuple(A a, B b, C c) {
		super(a, b);
		this.third = c;
	}
	
	public String toString(){
		return "( " + first + ", " + second + ", " + third + " )";
	}

	public static void main(String[] args) {
		ThreeTuple<Integer, String, Double> obiekt = new ThreeTuple<Integer, String, Double>(1, "One", 1.1);
		System.out.println(obiekt);
	}

}
