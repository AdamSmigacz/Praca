package t_10;

public class DotNew {

	class Inner{}
	
	public static void main(String[] args) {
		
		DotNew dn = new DotNew(); 
		DotNew.Inner dni = dn.new Inner();  //stworzenie nowej klasy wewnetrznej
		// nie mozna utworzyc obiektu klasy wewnetrznej jezeli nie istnieje obiek klasy zewnetrznej
	}

}
