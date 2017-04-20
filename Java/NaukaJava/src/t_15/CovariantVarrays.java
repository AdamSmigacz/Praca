package t_15;

import java.util.ArrayList;
import java.util.List;

class Fruit {
}

class Apple extends Fruit {
};

class Jonathan extends Apple {
}

class Orange extends Fruit {
}

public class CovariantVarrays {

	public static void main(String[] args) {

		Fruit[] fruit = new Apple[10];
		fruit[0] = new Apple();
		fruit[1] = new Jonathan();
		try {
			fruit[0] = new Fruit();
		} catch (Exception e) {
			System.out.println(e);
		}
		try {
			fruit[0] = new Orange();
		} catch (Exception e) {
			System.out.println(e);
		}

		//List<Fruit> list = new ArrayList<Apple>(); //Nie mo¿na czegos takiego zrobic w javie ()
		// mo¿na przetrzymywac w kontenerze typu fruit pochodne obiekty typu apple ale nie mo¿na przypisac róznych typów kontenerów!!!!!
	}

}
