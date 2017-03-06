package t_13;

public class TestRegularExpresion {


	public static void main(String[] args) {
		if(args.length < 2){
			System.out.println("Stosowanie:\njava TestRegularExpresion " + "ciagznakow wyrazenieregularne+");
			System.exit(0);
		}
		for(String arg: args ){
			System.out.println("Wyra¿enie regularne: \"" + arg + "\"");
		}
	}
446
}
