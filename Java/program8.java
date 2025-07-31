package assignment;
import java.util.Scanner;
public class program8 {
	    public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);

	        
	        System.out.print("Enter the number of classes held: ");
	        int classesHeld = input.nextInt();

	        System.out.print("Enter the number of classes attended: ");
	        int classesAttended = input.nextInt();

	        
	        double attendancePercentage = (classesAttended * 100.0) / classesHeld;
	        System.out.println("Attendance percentage: " + attendancePercentage +" %");
	        System.out.print("Do you have a medical cause? (Y/N): ");
	        char medicalCause = input.next().charAt(0);
	        if (attendancePercentage >= 70 || medicalCause == 'Y' || medicalCause == 'y') {
	            System.out.println("Student is allowed to sit in the exam.");
	        } else {
	            System.out.println("Student is NOT allowed to sit in the exam.");
	        }

	        input.close();
	    }
	}
