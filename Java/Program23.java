package assignment;
import java.util.Arrays;
import house.Hall;
import house.Kitchen;
public class Program23 {

package house;

import static java.lang.System.out; // importing out statically

public class Hall {
    public void showMessage() {
        out.println("This is the first room while entering the house");
    }
}
KITCHEN.JAVA /HOUSE
package house;

public class Kitchen {
    public void displayAppliances() {
        String[] appliances = {"Fridge", "Microwave", "Oven", "Mixer"};
        System.out.println("Original appliances array:");
        for (String item : appliances) {
            System.out.println(item);
        }

        // Copying the array
        String[] copiedAppliances = Arrays.copyOf(appliances, appliances.length);
        System.out.println("\nCopied appliances array:");
        for (String item : copiedAppliances) {
            System.out.println(item);
        }
    }

Main java
import house.Hall;
import house.Kitchen;

public class Main {
    public static void main(String[] args) {
        Hall hall = new Hall();
        hall.showMessage();

        Kitchen kitchen = new Kitchen();
        kitchen.displayAppliances();
    }
}


}
