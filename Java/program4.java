package assignment;
import java.util.Scanner;
public class program4 {
	    public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);
	        System.out.print("Enter your name: ");
	        String name = input.nextLine();

	        System.out.print("Enter your roll number: ");
	        String rollNumber = input.nextLine();

	        System.out.print("Enter your field of interest: ");
	        String interest = input.nextLine();
	        System.out.println("Hey, my name is " + name + " and my roll number is " + rollNumber + ". My field of interest are " + interest + ".");

	        input.close();
	    }
	}

