package t_8;

class Meal{
	public Meal() {
		System.out.println("Meal() ");
	}
}

class Bread{
	public Bread() {
		System.out.println("Bread() ");
	}
}


class Cheese{
	public Cheese() {
		System.out.println("Cheese() ");
	}
}

class Lettuce{
	public Lettuce() {
		System.out.println("Lettuce() ");
	}
}

class Lunch extends Meal {
	Lunch(){
		System.out.println("Lunch() ");
	}
}

class PortableLunch extends Lunch{
	public PortableLunch() {
	System.out.println("PortableLunch()");
	}
}

public class Konstruktory extends PortableLunch{
private Bread b = new Bread();
private Cheese c = new Cheese();
private Lettuce l = new Lettuce();

public Konstruktory(){
	System.out.println("Sandwich() ");
}

	
	public static void main(String[] args) {
	new Konstruktory();

	}

}
