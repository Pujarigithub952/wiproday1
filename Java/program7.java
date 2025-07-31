package assignment;
import java.util.Scanner;
public class program7 {
	    public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);
	        System.out.print("Enter the number of classes held: ");
	        int classesHeld = input.nextInt();

	        System.out.print("Enter the number of classes attended: ");
	        int classesAttended = input.nextInt();

	        double attendancePercentage = (classesAttended * 100.0) / classesHeld;

	        System.out.println("Attendance percentage: " + attendancePercentage + "%");

	        if (attendancePercentage >= 70) {
	            System.out.println("Student is allowed to sit in the exam.");
	        } else {
	            System.out.println("Student is NOT allowed to sit in the exam.");
	        }

	        input.close();
	    }
	}
