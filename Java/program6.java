package assignment;
import java.util.Scanner;
public class program6 {
	    public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);

	        // Taking input
	        System.out.print("Enter your marks: ");
	        int marks = input.nextInt();
	        char grade;

	        // Grading logic
	        if (marks < 25) {
	            grade = 'F';
	        } else if (marks <= 45) {
	            grade = 'E';
	        } else if (marks <= 50) {
	            grade = 'D';
	        } else if (marks <= 60) {
	            grade = 'C';
	        } else if (marks <= 80) {
	            grade = 'B';
	        } else {
	            grade = 'A';
	        }

	        System.out.println("Your grade is: " + grade);

	        input.close();
	    }
	}

