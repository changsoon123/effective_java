package effective_practice;

public class Practice_num57 {

	public static void main(String[] args) {

		
		
	}

}

abstract class Figure1 {
	abstract double area();
}

class Circle extends Figure1 {
	final double radius;

	Circle(double radius) { this.radius = radius; }

	@Override double area() { return Math.PI * (radius * radius); }
}

class Rectangle extends Figure1 {
	final double length;
	final double width;

	Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
	}

	@Override double area() { return length * width; }
}