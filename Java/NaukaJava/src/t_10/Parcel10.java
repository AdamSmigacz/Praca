package t_10;

public class Parcel10 {

	public Destination destination(final String dest, final float price){
		return new Destination() {
			private int cost;

			{
				//jest to inicjalizator klasy anonimowej, "taki umowny konstruktor"
				cost = Math.round(price);
				if(cost>100){
					System.out.println("Za drogo");
				}
			}
			private String label = dest;
			@Override
			public String readLabel() {
				
				return label;
			}
		};
	}
	public static void main(String[] args) {
	
		Parcel10 p = new Parcel10();
		Destination d = p.destination("Comarch", 111);
		System.out.println(d.readLabel());
	}

}
