package t_10;

public class Parcel2 {

	class Contents{
		private int i = 11;
		public int value(){
			return i;
		}
	}
	
	class Destination {
		private String label;
		public Destination(String label) {
			this.label = label;
		}
		String readLabel(){
			return label;
		}
	}
	public Destination to(String s){
		return new Destination(s);
	}

	public Contents contents(){
		return new Contents();
	}
	
	public void ship(String dest){
		Contents c = contents();
		Destination d =to(dest);
		System.out.println(d.readLabel() + ": " + c.value());
	}
	public static void main(String[] args) {
		
		Parcel2 parcel = new Parcel2();
		parcel.ship("Comarch sa");
		
		Parcel2 q = new Parcel2();
		Parcel2.Contents cc = q.contents();
		Parcel2.Destination dd = q.to("Comarch SA");
		//¿eby wywoac obiekt klasy wewnetrznej poza klasa zewnetrzna trzeba wywoac to w nastepujacy sposób  KlasaZewnetrzna.KlasaWewnetrzna nazwa obiektu.

	}

}
