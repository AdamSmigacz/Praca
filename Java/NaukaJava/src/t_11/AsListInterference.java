package t_11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


class Snow{}
class Powder extends Snow{}
class Crusty extends Snow{}
class Slush extends Snow{}
class Light extends Powder{}
class Heavy extends Powder{}

public class AsListInterference {
	public static void main(String[] args) {
		
		List<Snow> list = Arrays.asList(new Slush(), new Crusty(), new Powder());
		
		//List<Snow> list2 = Arrays.asList(new Light(), new Heavy(), new Heavy()); // lista rozpoznaj podtypy Powder a nie Snow
		
		List <Snow> snow3 = Arrays.<Snow>asList(new Light(), new Heavy());
		
		List<Snow> snow4 = new ArrayList<Snow>();
		
		snow4.add(new Light());
		snow4.add(new Heavy());
		
		Collections.addAll(snow4, new Light(), new Heavy());
		
		
	}

}
