package t_11;

import java.util.ArrayList;

class GrannySmith extends Apple{}
class Gala extends Apple{}
class Fuji extends Apple{}
class BraeBurn extends Apple{}

public class GenericsAndUpcasting {


	public static void main(String[] args) {
		ArrayList<Apple> apples = new ArrayList<Apple>();
		apples.add(new GrannySmith());
		apples.add(new Gala());
		apples.add(new Fuji());
		apples.add(new BraeBurn());
		apples.add(new Apple());
		
		for(Apple a : apples){
			System.out.println(a + " " +a.id());
		}
	}
}
