package assignment;
import java.util.Scanner;
public class Program24 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] speeds = new double[5];
        double sum = 0;

        // Taking input
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter speed of racer " + (i + 1) + ": ");
            speeds[i] = scanner.nextDouble();
            sum += speeds[i];

        // Calculate average speed
        double average = sum / 5;
        System.out.printf("\nAverage speed: %.2f\n", average);

        // Display qualifying racers
        System.out.println("Qualifying racers (speed > average):");
        for (double speed : speeds) {
            if (speed > average) {
                System.out.println(speed);
            }
        }

        scanner.close();
    }
}



