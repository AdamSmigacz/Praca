package t_12;

class OnOffException extends Exception{}

class OnOffException2 extends Exception{}

public class Switch {

	private boolean state = false;
	
	public boolean read(){
		return state;
	}
	public void on(){
		state = true;
	}
	
	public void off(){
		state = false;
	}
	
	public String toString(){
		return state ? "on" : "off";
	}
	
	public static void main(String[] args) {
		
		try {
			
		} catch (Exception e) {
			
		}

	}

}
