package assignment;

public class Program25 {

import java.util.Scanner;

public class MyTriangle {

    // Check if triangle is valid
    public static boolean isValid(double a, double b, double c) {
        return (a + b > c) && (a + c > b) && (b + c > a);
    }

    // Compute perimeter
    public static double perimeter(double a, double b, double c) {
        return a + b + c;
    }

    // Compute area using Heron's formula
    public static double area(double a, double b, double c) {
        double s = (a + b + c) / 2; // semi-perimeter
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    // Main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter side a (or -1 to exit): ");
            double a = scanner.nextDouble();

            if (a == -1) {
                System.out.println("Bye~");
                break;
            }

            System.out.print("Enter side b: ");
            double b = scanner.nextDouble();
            System.out.print("Enter side c: ");
            double c = scanner.nextDouble();

            if (isValid(a, b, c)) {
                double peri = perimeter(a, b, c);
                double ar = area(a, b, c);
                System.out.printf("Perimeter = %.2f\n", peri);
                System.out.printf("Area = %.2f\n", ar);
            } else {
                System.out.println("The input is invalid.");
            }
            System.out.println(); // extra line for spacing
        }

        scanner.close();
    }
}
OUTPUT 
Enter side a (or -1 to exit): 3
Enter side b: 4
Enter side c: 5
Perimeter = 12.00
Area = 6.00

Enter side a (or -1 to exit): 1
Enter side b: 2
Enter side c: 3
The input is invalid.

Enter side a (or -1 to exit): -1
Bye~

26.Given integer array, remove the duplicate elements and print sum of even 
numbers in the array.
input 1={2,3,54,1,6,7,7}
CODE 
SAMPLE INPUT
int[] input1 = {2, 3, 54, 1, 6, 7, 7};
import java.util.*;

public class RemoveDuplicatesAndSumEvens {
    public static void main(String[] args) {
        int[] input = {2, 3, 54, 1, 6, 7, 7};

        // Use a Set to remove duplicates
        Set<Integer> uniqueNumbers = new LinkedHashSet<>();
        for (int num : input) {
            uniqueNumbers.add(num);
        }

        // Calculate sum of even numbers
        int sum = 0;
        for (int num : uniqueNumbers) {
            if (num % 2 == 0) {
                sum += num;
            }
        }

        System.out.println("Unique elements: " + uniqueNumbers);
        System.out.println("Sum of even numbers: " + sum);
    }
}
OUTPUT 
Unique elements: [2, 3, 54, 1, 6, 7]
Sum of even numbers: 62

27.Create an enum of the six types of paper currency. Loop through the values( ) and print each value. Write a switch statement for the enum.  For each
   case, output a description of that particular currency.
CODE:
public class CurrencyEnumDemo {

    // Define enum with 6 paper currency types
    enum Currency {
        ONE, FIVE, TEN, TWENTY, FIFTY, HUNDRED
    }

    public static void main(String[] args) {

        // Loop through all currency values
        for (Currency note : Currency.values()) {
            System.out.print(note + ": ");
            
            // Switch to print description
            switch (note) {
                case ONE:
                    System.out.println("Smallest denomination currency note.");
                    break;
                case FIVE:
                    System.out.println("Commonly used for small purchases.");
                    break;
                case TEN:
                    System.out.println("Used frequently in daily transactions.");
                    break;
                case TWENTY:
                    System.out.println("Less common but still circulated.");
                    break;
                case FIFTY:
                    System.out.println("Medium denomination currency note.");
                    break;
                case HUNDRED:
                    System.out.println("High value note, widely accepted.");
                    break;
                default:
                    System.out.println("Unknown currency.");
            }
        }
    }

}
