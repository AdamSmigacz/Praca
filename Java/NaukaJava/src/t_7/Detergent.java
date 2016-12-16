package t_7;

class Cleanser{
	private String s = "Cleanser ";
	public void append (String a){
		s += a;
	}
	
	public void dulite(){
		append("dilute() ");
	}
	
	public void apply(){
		append("apply() ");
	}
	
	public void scrub(){
		append("scrub() ");
	}
	
	public String toString(){
		return s;
	}
	
	public static void main(String[] args) {
		Cleanser oCleanser = new Cleanser();
		
		oCleanser.apply();
		oCleanser.dulite();
		oCleanser.scrub();
		System.out.println(oCleanser);
	}
}

public class Detergent extends Cleanser{

	public void scrub(){ //nadpisanie metody z klasy bazowej
		//super.scrub(); // wywoanie metody z klasy bazowej
		append("Detergent scrub() ");
		
	}
	
	public void fame() {
		append("fame() "); 
	}

	public static void main(String[] args) {
		Detergent oDetergent = new Detergent();
		
		oDetergent.fame();
		oDetergent.apply();
		oDetergent.dulite();
		oDetergent.scrub();
		
		System.out.println(oDetergent);

	}

}
