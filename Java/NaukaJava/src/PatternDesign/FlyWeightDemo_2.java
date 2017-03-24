package PatternDesign;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

final class Relation {
	final private String description;

	public Relation(String description) {
		this.description = description;
	}

	public String getDescription() {
		return description;
	}

}

/*Nastêpnie tworzymy klasê FlyweightFactory, w której bêdzie ca³a logika omawianego wzorca. W metodzie createRelation sprawdzamy, 
 * czy obiekt o podanym opisie ju¿ istnieje. Jeœli nie, to tworzymy ten obiekt i wyœwietlamy komunikat u¿ytkownikowi. 
 * W przeciwnym wypadku pobieramy obiekt z tym parametrem (w naszym przypadku z HashMapy).*/


class FlyweightFactory {
	private Map<String, Relation> relations = Collections.synchronizedMap(new HashMap());

	public synchronized Relation createRelation(String description) {
		Relation relation = (Relation) relations.get(description);
		if (relation == null) {
			relation = new Relation(description);
			relations.put(description, relation);
			System.out.println("Creating new relation: " + relation.getDescription());
		}
		return relation;
	}
}

public class FlyWeightDemo_2 {

	public static void main(String[] args) {
		FlyweightFactory flyweightFactory = new FlyweightFactory();
		for (int i = 0; i < 100; i++) {
			flyweightFactory.createRelation("Comarch");
		}
		flyweightFactory.createRelation("Comarch S.A.");
	}
}
