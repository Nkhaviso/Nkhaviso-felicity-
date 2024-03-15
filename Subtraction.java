
import java.util.Scanner;


    public class Subtraction {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter the first number: ");
            double num1 = scanner.nextDouble();
            
            System.out.print("Enter the second number: ");
            double num2 = scanner.nextDouble();
            
            double result = subtract(num1, num2);
            
            System.out.println("The result of subtraction is: " + result);
        }
    }
    
    public static double subtract(double a, double b) {
        return a - b;
    }
}