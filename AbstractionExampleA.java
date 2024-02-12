abstract class ShapeA {
	static int numberOfShapes = 0;

	ShapeA() {
		numberOfShapes++;
	}
	
	abstract void draw();
	
	static void displayTotalShapes() {
		System.out.println("Total number of shapes: " + numberOfShapes);
	}

	void displayInfo() {
		System.out.println("This is a shape.");
	}
}

class CircleA extends ShapeA {

	@Override
	void draw() {
		System.out.println("I am Circle");
	}
}

class SquareA extends ShapeA {

	@Override
	void draw() {
		System.out.println("I am Square");
	}
}


public class AbstractionExampleA {
	public static void main(String[] args) {
		SquareA square = new SquareA();
		square.draw();
		
		ShapeA square1 = new SquareA();
		square1.draw();
		ShapeA circle1 = new CircleA();
		circle1.draw();
	}
}
