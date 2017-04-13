package t_15;

public class Holder<T> {
	private T a;
	public Holder(T a){
		this.a = a;
	}
	
	public void set(T a){
		this.a = a;
	}
	
	public T get(){
		return a;		
	}
	
	public static void main(String[] args) {

		Holder<String> obiekt = new Holder<>("Compensation Tasks: ");
		System.out.println(obiekt.get());
		obiekt.set("Cases");
		System.out.println(obiekt.get());
		
	}
}
