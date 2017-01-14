package t_5;

enum Wyliczenie{
	NOT, YES, TRUE, FALSE
}
public class typyWyliczeniowe {


	public static void main(String[] args) {
		for (Wyliczenie arg : Wyliczenie.values()) {
			System.out.println(arg + " wyliczenie " + arg.ordinal());			
		}
	}
}
// 185