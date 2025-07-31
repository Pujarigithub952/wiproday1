package assignment;

public class Program21 {

abstract class Person {
    String name;

    Person(String name) {
        this.name = name;
    }

    // Abstract methods
    abstract void eat();
    abstract void exercise();
}

// Athlete class extends Person
class Athlete extends Person {

    Athlete(String name) {
        super(name);
    }

    @Override
    void eat() {
        System.out.println(name + " eats a high-protein, healthy diet.");
    }

    @Override
    void exercise() {
        System.out.println(name + " exercises daily with intense workouts.");
    }
}

// LazyPerson class extends Person
class LazyPerson extends Person {

    LazyPerson(String name) {
        super(name);
    }

    @Override
    void eat() {
        System.out.println(name + " eats mostly junk food and snacks.");
    }

    @Override
    void exercise() {
        System.out.println(name + " rarely exercises and prefers to relax.");
    }
}

// Main class
public class PersonTest {
    public static void main(String[] args) {
        Person athlete = new Athlete("Rahul");
        Person lazy = new LazyPerson("Ramesh");

        athlete.eat();
        athlete.exercise();

        System.out.println();

        lazy.eat();
        lazy.exercise();
    }
}


}
