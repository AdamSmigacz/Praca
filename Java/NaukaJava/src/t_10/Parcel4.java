package t_10;

interface Destination{
	String readLabel();
}

interface Contents{
	int value();
}

public class Parcel4 {
	private class Pcontents implements Contents{
		private int i = 11;
		@Override
		public int value() {
			return i;
		}
	}
	private class PDestination implements Destination{

		private String label;
		
		private PDestination(String whereTo){
			label = whereTo;
		}
		
		@Override
		public String readLabel() {
			return label;
		}
	}
	
	public Destination destination(String s){
		return new PDestination(s);
	}
	
	public Contents contents(){
		return new Pcontents();
	}

	
	public static void main(String[] args) {
		
		Parcel4 p4 = new Parcel4();
		Contents c = p4.contents();
		Destination d = p4.destination("Comarch");
		System.out.println(d.readLabel() + " " + (Integer)(c.value()));

	}

}
