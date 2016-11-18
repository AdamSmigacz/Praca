package t_5;

public class thisConstructors {

	int arg;
	String napis;
	
	public thisConstructors(int arg) {
		this("cos napisane");
		this.arg = arg;
		System.out.println("Wartosc liczbowa: " + this.arg);
		System.out.println("Konstruktor int");
	}
	
	public thisConstructors(String napis){
		
		this.napis = napis;
		System.out.println("napis: " + this.napis);
		System.out.println("Konstruktor string");
	}
	
	public thisConstructors(int arg, String napis){
		this(arg);
		this.napis = napis;
		System.out.println("Konstruktor int string: " + this.napis);
	}
	
	public thisConstructors(){
		this(12, "Cos napisane");
		System.out.println("Konstruktor domyslny");
	}

	public static void main(String[] args) {
		
		thisConstructors tc = new thisConstructors();
		
	}

}
