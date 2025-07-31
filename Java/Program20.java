package assignment;

public class Program20 {

abstract class Vehicle {
    String brand;

    Vehicle(String brand) {
        this.brand = brand;
    }

    // Abstract methods
    abstract void startEngine();
    abstract void stopEngine();
}

// Car class extends Vehicle
class Car extends Vehicle {

    Car(String brand) {
        super(brand);
    }

    @Override
    void startEngine() {
        System.out.println(brand + " Car engine started.");
    }

    @Override
    void stopEngine() {
        System.out.println(brand + " Car engine stopped.");
    }
}

// Motorcycle class extends Vehicle
class Motorcycle extends Vehicle {

    Motorcycle(String brand) {
        super(brand);
    }

    @Override
    void startEngine() {
        System.out.println(brand + " Motorcycle engine started.");
    }

    @Override
    void stopEngine() {
        System.out.println(brand + " Motorcycle engine stopped.");
    }
}

// Main class
public class VehicleTest {
    public static void main(String[] args) {
        Vehicle myCar = new Car("Toyota");
        Vehicle myBike = new Motorcycle("Yamaha");

        myCar.startEngine();
        myCar.stopEngine();

        System.out.println();

        myBike.startEngine();
        myBike.stopEngine();
    }
}


}
