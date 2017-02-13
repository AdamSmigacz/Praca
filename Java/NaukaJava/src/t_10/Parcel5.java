package t_10;

public class Parcel5 {

	public Destination destination(String s){
		class pDestination implements Destination{

			private String label;
			public pDestination(String label) {
				this.label = label;
			}
			@Override
			public String readLabel() {
				return label;
			}
		}
		return new pDestination(s);
	}
	public static void main(String[] args) {
		Parcel5 p = new Parcel5();
		Destination d = p.destination("Comarch");
		System.out.println(d.readLabel());

	}

}
