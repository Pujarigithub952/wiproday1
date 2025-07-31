package assignment;

public class Program17 {


	// Base class
	class Vehicle {
	    String color;
	    int noOfWheels;
	    String model;

	    // Constructor
	    public Vehicle(String color, int noOfWheels, String model) {
	        this.color = color;
	        this.noOfWheels = noOfWheels;
	        this.model = model;
	    }

	    // Common method
	    public void displayDetails() {
	        System.out.println("Model: " + model);
	        System.out.println("Color: " + color);
	        System.out.println("Number of Wheels: " + noOfWheels);
	    }
	}

	// Subclass: Truck
	class Truck extends Vehicle {
	    public Truck(String color, int noOfWheels, String model) {
	        super(color, noOfWheels, model);
	    }

	    public void loadCargo() {
	        System.out.println("Truck is loading cargo.");
	    }
	}

	// Subclass: Bus
	class Bus extends Vehicle {
	    public Bus(String color, int noOfWheels, String model) {
	        super(color, noOfWheels, model);
	    }

	    public void pickPassengers() {
	        System.out.println("Bus is picking up passengers.");
	    }
	}

	// Subclass: Car
	class Car extends Vehicle {
	    public Car(String color, int noOfWheels, String model) {
	        super(color, noOfWheels, model);
	    }

	    public void playMusic() {
	        System.out.println("Car is playing music.");
	    }
	}

	// Main class
	public class Road {
	    public static void main(String[] args) {
	        Truck truck = new Truck("Red", 6, "Volvo Truck");
	        Bus bus = new Bus("Blue", 4, "Tata Bus");
	        Car car = new Car("Black", 4, "Honda City");

	        System.out.println("=== Truck Details ===");
	        truck.displayDetails();
	        truck.loadCargo();

	        System.out.println("\n=== Bus Details ===");
	        bus.displayDetails();
	        bus.pickPassengers();

	        System.out.println("\n=== Car Details ===");
	        car.displayDetails();
	        car.playMusic();
	    }
	}


}
