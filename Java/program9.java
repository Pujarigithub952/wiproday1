package assignment;
import java.util.Scanner;
public class program9 {
	    public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);

	        double totalRetailValue = 0.0;
	        int productNumber;
	        int quantity;

	        System.out.println("Enter product number (1, 2, 3) and quantity sold (enter 0 to stop):");

	        while (true) {
	            System.out.print("\nEnter product number (1-3) or 0 to exit: ");
	            productNumber = input.nextInt();

	            if (productNumber == 0) {
	                break;  // Exit the loop
	            }

	            System.out.print("Enter quantity sold: ");
	            quantity = input.nextInt();

	            switch (productNumber) {
	                case 1:
	                    totalRetailValue += 22.50 * quantity;
	                    break;
	                case 2:
	                    totalRetailValue += 44.50 * quantity;
	                    break;
	                case 3:
	                    totalRetailValue += 9.98 * quantity;
	                    break;
	                default:
	                    System.out.println("Invalid product number. Please enter 1, 2, or 3.");
	            }
	        }

	        System.out.println("\nTotal retail value of all products sold: ₹" + totalRetailValue);

	        input.close();
	    }
	}


