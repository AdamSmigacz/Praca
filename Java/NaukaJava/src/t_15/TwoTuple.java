package t_15;

// przyklad krotki
public class TwoTuple<A, B> {

	public final A first;
	public final B second;
	
	public TwoTuple(A a, B b){
		this.first = a;
		this.second = b;
	}
	public String toString(){
		return "( " + first + ", " + second + " )";
	}
	
	public static void main(String[] args) {

		TwoTuple<String, Integer> object = new TwoTuple<String, Integer>("One", 1);
		System.out.println(object);
	}

}
