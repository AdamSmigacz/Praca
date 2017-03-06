package t_13;

public class IntegerMatch {
	
	public static void main(String[] args) {
		
		System.out.println("-1234".matches("-?\\d+"));
		System.out.println("15475".matches("-?\\d+"));
		System.out.println("+475".matches("-?\\d+"));
		System.out.println("+475".matches("(-|\\+)?\\d+"));
		
	}
}
