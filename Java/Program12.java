package assignment;
import java.util.*;
public class Program12 {
    private String studName;
    private int marksInEng; 

class Student {
    private static int rollCounter = 1;
    private int rollNo;

    private int marksInMaths;
    private int marksInScience;

    public Student(String name, int eng, int maths, int science) {
        this.rollNo = rollCounter++;
        this.studName = name;
        this.marksInEng = eng;
        this.marksInMaths = maths;
        this.marksInScience = science;
    }

    public int getRollNo() { return rollNo; }
    public String getStudName() { return studName; }
    public int getMarksInEng() { return marksInEng; }
    public int getMarksInMaths() { return marksInMaths; }
    public int getMarksInScience() { return marksInScience; }

    public int getTotalMarks() {
        return marksInEng + marksInMaths + marksInScience;
    }

    public double getPercentage() {
        return getTotalMarks() / 3.0;
    }
}

class Standard {
    private List<Student> students = new ArrayList<>();

    public void addStudent(Student s) {
        students.add(s);
    }

    public void displayByRollNo() {
        students.stream()
            .sorted(Comparator.comparingInt(Student::getRollNo))
            .forEach(s -> System.out.println("Roll No: " + s.getRollNo() + ", Name: " + s.getStudName()));
    }

    public void displayTopperByPercentage() {
        Student topper = Collections.max(students, Comparator.comparingDouble(Student::getPercentage));
        System.out.println("Topper: Roll No: " + topper.getRollNo() + ", Name: " + topper.getStudName());
    }

    public void displayTopperInMaths() {
        Student mathsTopper = Collections.max(students, Comparator.comparingInt(Student::getMarksInMaths));
        System.out.println("Top in Maths: Roll No: " + mathsTopper.getRollNo() + ", Name: " + mathsTopper.getStudName());
    }

    
    public void displayByMathsScienceTotal() {
        students.stream()
            .sorted(Comparator.comparingInt(s -> s.getMarksInMaths() + s.getMarksInScience()))
            .forEach(s -> System.out.println("Roll No: " + s.getRollNo() + ", Name: " + s.getStudName()));
    }

    public void displayWithRank() {
        students.sort((s1, s2) -> Integer.compare(s2.getTotalMarks(), s1.getTotalMarks()));

        int rank = 1;
        for (Student s : students) {
            System.out.printf("Rank %d -> Roll No: %d, Name: %s, Total: %d, Percentage: %.2f%%\n",
                rank++, s.getRollNo(), s.getStudName(), s.getTotalMarks(), s.getPercentage());
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Standard std = new Standard();

        std.addStudent(new Student("Alice", 85, 90, 88));
        std.addStudent(new Student("Bob", 78, 95, 84));
        std.addStudent(new Student("Charlie", 82, 89, 91));
        std.addStudent(new Student("David", 88, 85, 80));
        std.addStudent(new Student("Eva", 75, 70, 72));
        std.addStudent(new Student("Frank", 90, 92, 85));
        std.addStudent(new Student("Grace", 80, 86, 88));
        std.addStudent(new Student("Hannah", 85, 90, 90));

        System.out.println("\n1. Roll No and Name in ascending order:");
        std.displayByRollNo();

        System.out.println("\n2. Student with highest percentage:");
        std.displayTopperByPercentage();

        System.out.println("\n3. Student with highest mark in Maths:");
        std.displayTopperInMaths();

        System.out.println("\n4. Students sorted by total marks in Maths + Science:");
        std.displayByMathsScienceTotal();

        System.out.println("\n5. All students with Total, Percentage and Rank:");
        std.displayWithRank();
    }
}




}
