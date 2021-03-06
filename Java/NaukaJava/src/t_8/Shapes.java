package t_8;

class Shape{
	public void draw(){
		System.out.println("Shape.draw() ");
	}
	public void erase(){
		System.out.println("Shape.erase() ");
	}
}

class Circle extends Shape{
	public void draw(){
		System.out.println("Circle.draw() ");
	}
	public void erase(){
		System.out.println("Circle.erase() ");
	}
}

class Square extends Shape{
	public void draw(){
		System.out.println("Square.draw() ");
	}
	public void erase(){
		System.out.println("Square.erase() ");
	}
}

class Triangle extends Shape{
	public void draw(){
		System.out.println("Triangle.draw() ");
	}
	public void erase(){
		System.out.println("Triangle.erase() ");
	}
}

public class Shapes {

	
	public static void main(String[] args) {
		Shape circle = new Circle();
		Shape square = new Square();
		Shape triangle = new Triangle();
		
		circle.draw();
		circle.erase();
		
		square.draw();
		square.erase();
		
		triangle.draw();
		triangle.erase();
	}

}
