package slcorejavapracticeprojects;

import java.util.ArrayList;

class Geometry {
	public void displayArea(double area) {
		System.out.println("Area: " + area);
	}
}

class Rectangle extends Geometry {
	private double length;
	private double width;

	public Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
	}

	public void calculateArea() {
		double area = length * width;
		System.out.println("Area of the Rectangle: " + area);
	}
}

class Circle extends Geometry {
	private double radius;

	public Circle(double radius) {
		this.radius = radius;
	}

	public void calculateArea() {
		double area = Math.PI * Math.pow(radius, 2);
		System.out.println("Area of the Circle: " + area);
	}
}

class Triangle extends Geometry {
	private double base;
	private double height;

	public Triangle(double base, double height) {
		this.base = base;
		this.height = height;
	}

	public void calculateArea() {
		double area = 0.5 * base * height;
		System.out.println("Area of the Triangle: " + area);
	}
}

public class GeometryCalculator {
	public static void main(String[] args) {
		ArrayList<Geometry> shapes = new ArrayList<>();

		Rectangle rectangle = new Rectangle(5, 3);
		Circle circle = new Circle(2.5);
		Triangle triangle = new Triangle(4, 6);

		shapes.add(rectangle);
		shapes.add(circle);
		shapes.add(triangle);

		for (Geometry shape : shapes) {
			try {
				if (shape instanceof Rectangle) {
					((Rectangle) shape).calculateArea();
				} else if (shape instanceof Circle) {
					((Circle) shape).calculateArea();
				} else if (shape instanceof Triangle) {
					((Triangle) shape).calculateArea();
				} else {
					System.err.println("Unsupported shape.");
				}
			} catch (Exception e) {
				System.err.println("An error occurred: " + e.getMessage());
			} finally {

			}
		}
	}
}
