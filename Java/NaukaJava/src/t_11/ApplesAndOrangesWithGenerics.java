package t_11;

import java.util.ArrayList;

public class ApplesAndOrangesWithGenerics {


	public static void main(String[] args) {
		ArrayList<Apple> apples = new ArrayList<Apple>();
		
		for(int i = 0; i < 10; i++){
			apples.add(new Apple());
		}
		
		//apples.add(new Orange()); // nie mozna dodac tego obiektu, wyjatek poleci
		for(Apple c : apples){
			System.out.println(c.id() + " " + c);
		}
	}

}
