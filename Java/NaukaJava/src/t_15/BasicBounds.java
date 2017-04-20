package t_15;

import java.awt.Color;

interface HasColor {
	java.awt.Color getColor();
}

class Colored<T extends HasColor> {

	T item;

	Colored(T item) {
		this.item = item;
	}

	// Obramowanie typów konkretyzujacych pozwala na wywolanie metody (nietrzeba
	// dodawac casta)
	java.awt.Color color() {
		return item.getColor();
	}
}

class Dimension {
	public int x, y, z;
}

// ramy wielokrotne (najpierw klasa a potem interfejs)
class ColoredDimension<T extends Dimension & HasColor> {
	T item;

	ColoredDimension(T item) {
		this.item = item;
	}

	T getItem() {
		return item;
	}

	java.awt.Color color() {
		return item.getColor();
	}

	int getX() {
		return item.x;
	}

	int getY() {
		return item.y;
	}

	int getZ() {
		return item.z;
	}
}

interface Weight {
	int weight();
}
// napierw klasy potem interfejsy, klasa moze byc tylko jedna po extends
class Solid<T extends Dimension & HasColor & Weight> {
	T item;

	public Solid(T item) {
		this.item = item;
	}

	T getItem() {
		return item;
	}

	java.awt.Color color() {
		return item.getColor();
	}

	int getX() {
		return item.x;
	}

	int getY() {
		return item.y;
	}

	int getZ() {
		return item.z;
	}

	int weight() {
		return item.weight();
	}

}

class Bounded extends Dimension implements HasColor, Weight {

	public int weight() {
		return 0;
	}

	public Color getColor() {
		return null;
	}

}

public class BasicBounds {
	public static void main(String[] args) {

		Solid<Bounded> solid = new Solid<Bounded>(new Bounded());
		solid.color();
		solid.getY();
		solid.weight();
	}
}
