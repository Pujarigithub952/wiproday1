package assignment;

public class Program14 {
	class Shape {

	    // Area of square
	    public double area(double side) {
	        return side * side;
	    }

	    // Area of rectangle
	    public double area(double length, double breadth) {
	        return length * breadth;
	    }

	 
	    public double perimeter(double side) {
	        return 4 * side;
	    }

	   
	    public double perimeter(double length, double breadth) {
	        return 2 * (length + breadth);
	    }
	}

	public class Main {
	    public static void main(String[] args) {
	        Shape shape = new Shape();

	        double squareSide = 5.0;
	        double rectLength = 10.0;
	        double rectBreadth = 6.0;

	        System.out.println("----- Square -----");
	        System.out.println("Area: " + shape.area(squareSide));
	        System.out.println("Perimeter: " + shape.perimeter(squareSide));

	        System.out.println("\n----- Rectangle -----");
	        System.out.println("Area: " + shape.area(rectLength, rectBreadth));
	        System.out.println("Perimeter: " + shape.perimeter(rectLength, rectBreadth));
	    }
	}




}
