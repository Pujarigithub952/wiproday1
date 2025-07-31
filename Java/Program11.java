package assignment;

public class Program11 {
    public void div(double a, double b) {
        if (b != 0) { class Calculator {

    public void add(double a, double b) {
        double result = a + b;
        System.out.println("Addition: " + result);
    }

    // Subtraction
    public void diff(double a, double b) {
        double result = a - b;
        System.out.println("Difference: " + result);
    }

    // Multiplication
    public void mul(double a, double b) {
        double result = a * b;
        System.out.println("Multiplication: " + result);
    }

    // Division

            double result = a / b;
            System.out.println("Division: " + result);
        } else {
            System.out.println("Division by zero is not allowed.");
        }
        }
            
        
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        double num1 = 25;
        double num2 = 5;

        // Invoke methods
        calc.add(num1, num2);
        calc.diff(num1, num2);
        calc.mul(num1, num2);
        calc.div(num1, num2);
    }
}



