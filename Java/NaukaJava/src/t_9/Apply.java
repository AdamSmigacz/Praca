package t_9;

import java.util.Arrays;

class Processor{
	public String name(){
		return getClass().getSimpleName();
	}
	Object process(Object input){
		return input;
	}
}

class Upcase extends Processor{
	String process(Object input){
		return ((String)input).toUpperCase();
	}
}

class Downcase extends Processor{
	String process(Object input){
		return ((String)input).toLowerCase();
	}
}


class Spliter extends Processor{
	String process(Object input){
		return Arrays.toString(((String)input).split(" "));
	}
}
public class Apply {
public static void processor(Processor p, Object o){
	System.out.println("Uzywam procesora: " + p.name());
	System.out.println(p.process(s));
}

static String s = "Idzie grzes przez wies worek z piaskiem niesie";
	
	public static void main(String[] args) {
		
	Apply.processor(new Upcase(), s);
	Apply.processor(new Downcase(), s);
	Apply.processor(new Spliter(), s);  //wzorzec projektowy strategy - zachowanie metody zalezy od obiektu argumentu (g�wna czesc metody jest taka sama, a szczeg�y zaleza od typu argumentu wejsciowego)

	}

}
