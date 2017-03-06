package t_13;

public class Rudolph {


	public static void main(String[] args) {
		for (String patern : new String [] {
				"Rudolph", "[rR]udolph","[rR][aeiou][a-z]ol.*","R.*"  }) { 
			System.out.println("Rudolph".matches(patern));
		};
	}
}
