package assignment;

public class program3 {
	public static void main(String[] args) {
        int totalStudents = 90;
        int totalBoys = 45;
        int totalGradeA = totalStudents * 50 / 100;
        int boysGradeA = 20;

        int girlsGradeA = totalGradeA - boysGradeA;

        System.out.println("Total number of girls getting grade A: " + girlsGradeA);
    }
}

