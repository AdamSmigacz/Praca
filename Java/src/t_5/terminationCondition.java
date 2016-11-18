package t_5;

class Book {
	boolean checkedOut = false;
	Book(boolean checkOut){
		checkedOut = checkOut;
	}
	
	void checkIn(){
		checkedOut = false;
	}
	
	protected void finalize(){
		if(checkedOut){ 
			System.out.println("Wywolanie finalize ! " + checkedOut);
		}
	}
}

public class terminationCondition {

	public static void main(String[] args) {
		
		Book obiekt = new Book(true);
		obiekt.checkIn();
		new Book(true);
		System.gc(); // wywolanie metody do sprzatania i znajdowania bledu.
	}
}
