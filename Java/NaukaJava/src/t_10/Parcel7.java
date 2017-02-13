package t_10;

public class Parcel7 {

	public Contents contents(){
		return new Contents() {  //anonimowa klasa wewnetrzna
			private int i = 11;
			@Override
			public int value() {
				return i;
			}
		};
	}

	public static void main(String[] args) {
		Parcel7 p = new Parcel7();
		Contents c = p.contents();

	}

}
