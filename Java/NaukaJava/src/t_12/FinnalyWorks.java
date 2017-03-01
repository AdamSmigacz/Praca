package t_12;

class ThreeException extends Exception{}

public class FinnalyWorks {

	static int count = 0;
	
	public static void main(String[] args) {
		
		while(true){
			try{
				if(count++ == 0){
					throw new ThreeException();
				}
			System.out.println("None exception!");
			}catch(ThreeException e){
				System.out.println("Wyjatek TreeException!");
			}finally{
				System.out.println("In block finally");
				if(count ==2)
					break;
			}
		}
	}
}
