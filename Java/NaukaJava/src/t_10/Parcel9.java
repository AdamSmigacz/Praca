package t_10;

public class Parcel9 {

	public Destination destination(final String dest){  // aby wewnetrzna klasa anonimowa moga sie odwoac do tego argumentu musi byc on finalny (jezeli jest uzywana w klasie bazowej)
		return new Destination() {
			private String label = dest;
			@Override
			public String readLabel() {
				return label;
			}
		};
	}

	public static void main(String[] args) {
		
		Parcel9 p = new Parcel9();
		Destination d = p.destination("Comarch");
		System.out.println(d.readLabel());

	}
307
}
