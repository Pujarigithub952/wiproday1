package assignment;
import java.util.Scanner;
public class Program16 {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        int[] marks = new int[3];
	        for (int i = 0; i < 3; i++) {
	            while (true) {
	                System.out.print("Enter the mark (0-100) for student " + (i + 1) + ": ");
	                if (scanner.hasNextInt()) {
	                    int mark = scanner.nextInt();
	                    if (mark >= 0 && mark <= 100) {
	                        marks[i] = mark;
	                        break;
	                    } else {
	                        System.out.println("Invalid input, try again...");
	                    }
	                } else {
	                    System.out.println("Invalid input, try again...");
	                    scanner.next(); // Clear invalid input
	                }
	            }
	        }

	        double average = (marks[0] + marks[1] + marks[2]) / 3.0;
	        System.out.printf("The average is: %.2f\n", average);
	        
	        scanner.close();
	    }
	}
	


