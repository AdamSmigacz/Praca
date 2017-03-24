package PatternDesign;

interface Posilek {
	public String dawajNazwe();
}

class Pizza implements Posilek {
	public String dawajNazwe() {
		return "Word" +
				"";
	}
}

abstract class Zmiana implements Posilek {
	protected Posilek posilek;

	protected Zmiana(Posilek p) {
		this.posilek = p;
	}

	public abstract String dawajNazwe();
}

class Sos extends Zmiana {
	public Sos(Posilek posilek) {
		super(posilek);
	}

	public String dawajNazwe() {
		return posilek.dawajNazwe() + " + String";
	}
}

class Ser extends Zmiana {
	public Ser(Posilek posilek) {
		super(posilek);
	}

	public String dawajNazwe() {
		return posilek.dawajNazwe() + " + Char";
	}
}

public class FlyWeightDemo {
	public static void main(String[] args) {
		Posilek posilek = new Pizza();
		posilek = new Sos(posilek);
		System.out.println(posilek.dawajNazwe());
		posilek = new Ser(posilek);
		System.out.println(posilek.dawajNazwe());
		
		Posilek posilek2 = new Pizza();
		posilek2 = new Sos(posilek2);
		System.out.println(posilek2.dawajNazwe());
		posilek2 = new Ser(posilek2);
		System.out.println(posilek2.dawajNazwe());
		
	}
}