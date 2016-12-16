package t_7;

class Art{
	public Art() {
		System.out.println("konstruktor Art()");
	}
}

class Drawing extends Art{
	public Drawing() {
		System.out.println("konstruktor Drawing()");
	}
}

class Painting extends Drawing{
	public Painting() {
		System.out.println("konstruktor Painting()");
	}
}

public class KontruktoryKolejnosc extends Painting {

public KontruktoryKolejnosc() {
System.out.println("KonstruktoryKolejnosc konstruktor");
}
	public static void main(String[] args) {
		KontruktoryKolejnosc obiekt = new KontruktoryKolejnosc(); // konstruktory inicjalizuja sie od najbardziej bazowej klasy

	}

}
