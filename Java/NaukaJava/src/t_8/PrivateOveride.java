package t_8;

public class PrivateOveride {

private void f(){
	System.out.println("Private void f()");
}
	public static void main(String[] args) {
		PrivateOveride obiekt = new Derived();
		obiekt.f(); // zostanie wypisana metoda prywatna klasy bazowej; metod prywatnych nie mozna przeslaniac
	}

}


class Derived extends PrivateOveride{
	public void f(){
		System.out.println("Public void f()");
	}
}
