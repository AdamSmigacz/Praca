package t_7;


class Artist{
	public Artist(int i) {
		System.out.println("konstruktor Art( " + i + " )");
	}
}

class Draw extends Artist{
	public Draw(int i) {
		super(i); // konstruktor z argumentami musi byc wywoany a na dodatek musi to pyc pierwsza instrukcja w konstruktorze klasy pochodnej
		System.out.println("konstruktor Drawing( " + i + " )");
	}
}

public class KonstArg extends Draw{
	KonstArg(int i){
	super(i);
	System.out.println("KonstArg( " + i + " )");
	}

	public static void main(String[] args) {
		KonstArg obiekt = new KonstArg(11);

	}
//220
}
