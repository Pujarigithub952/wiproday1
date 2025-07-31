package assignment;
package org.animals;
public class Program18 {

public class Lion {
    String color = "Golden";
    int weight = 190;
    int age = 8;

    public boolean isVegetarian() {
        return false;
    }

    public boolean canClimb() {
        return false;
    }

    public String sound() {
        return "Roar";
    }
}

TIGER JAVA
package org.animals;

public class Tiger {
    String color = "Orange with black stripes";
    int weight = 220;
    int age = 6;

    public boolean isVegetarian() {
        return false;
    }

    public boolean canClimb() {
        return true;
    }

    public String sound() {
        return "Growl";
    }
}

DEER JAVA
package org.animals;

public class Deer {
    String color = "Brown";
    int weight = 70;
    int age = 4;

    public boolean isVegetarian() {
        return true;
    }

    public boolean canClimb() {
        return false;
    }

    public String sound() {
        return "Bleat";
    }
}

MONKEY JAVA 
package org.animals;

public class Monkey {
    String color = "Grey";
    int weight = 40;
    int age = 5;

    public boolean isVegetarian() {
        return true;
    }

    public boolean canClimb() {
        return true;
    }

    public String sound() {
        return "Chatter";
    }
}

 ELEPHANT.JAVA
package org.animals;

public class Elephant {
    String color = "Grey";
    int weight = 5000;
    int age = 25;

    public boolean isVegetarian() {
        return true;
    }

    public boolean canClimb() {
        return false;
    }

    public String sound() {
        return "Trumpet";
    }
}

GERAFFIE .Java
package org.animals;

public class Giraffe {
    String color = "Yellow with brown spots";
    int weight = 800;
    int age = 12;

    public boolean isVegetarian() {
        return true;
    }

    public boolean canClimb() {
        return false;
    }

    public String sound() {
        return "Hum";
    }
}

Package 2 -zoo main clss
Vandalur zoo.java
package zoo;

import org.animals.*;

public class VandalurZoo {
    public static void main(String[] args) {
        Lion lion = new Lion();
        Tiger tiger = new Tiger();
        Deer deer = new Deer();
        Monkey monkey = new Monkey();
        Elephant elephant = new Elephant();
        Giraffe giraffe = new Giraffe();

        System.out.println("=== Lion ===");
        displayAnimal(lion.color, lion.weight, lion.age, lion.isVegetarian(), lion.canClimb(), lion.sound());

        System.out.println("\n=== Tiger ===");
        displayAnimal(tiger.color, tiger.weight, tiger.age, tiger.isVegetarian(), tiger.canClimb(), tiger.sound());

        System.out.println("\n=== Deer ===");
        displayAnimal(deer.color, deer.weight, deer.age, deer.isVegetarian(), deer.canClimb(), deer.sound());

        System.out.println("\n=== Monkey ===");
        displayAnimal(monkey.color, monkey.weight, monkey.age, monkey.isVegetarian(), monkey.canClimb(), monkey.sound());

        System.out.println("\n=== Elephant ===");
        displayAnimal(elephant.color, elephant.weight, elephant.age, elephant.isVegetarian(), elephant.canClimb(), elephant.sound());

        System.out.println("\n=== Giraffe ===");
        displayAnimal(giraffe.color, giraffe.weight, giraffe.age, giraffe.isVegetarian(), giraffe.canClimb(), giraffe.sound());
    }

    public static void displayAnimal(String color, int weight, int age, boolean isVeg, boolean canClimb, String sound) {
        System.out.println("Color: " + color);
        System.out.println("Weight: " + weight + " kg");
        System.out.println("Age: " + age + " years");
        System.out.println("Vegetarian: " + (isVeg ? "Yes" : "No"));
        System.out.println("Can Climb: " + (canClimb ? "Yes" : "No"));
        System.out.println("Sound: " + sound);
    }
}

}
