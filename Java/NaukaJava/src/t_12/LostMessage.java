package t_12;

class VeryImportantException extends Exception{
	public String toString(){
		return "Very Important Exception";
	}
}

class EasyException extends Exception{
	public String toString(){
		return "Easy Exception";
	}
}

public class LostMessage {

	void f() throws VeryImportantException{
		throw new VeryImportantException();
	}
	
	void dispose() throws EasyException{
		throw new EasyException();
	}
	public static void main(String[] args) {
		try {
			LostMessage lm = new LostMessage();
			try {
				lm.f();
			} finally {
				lm.dispose();
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
