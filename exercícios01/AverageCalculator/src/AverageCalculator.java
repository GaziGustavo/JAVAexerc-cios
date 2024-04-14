// Import the Scanner class to allow reading user input
import java.util.Scanner;
// Define the Average Calculator class, which contains the main method (entry point of the program)

public class AverageCalculator {

    public static void main(String[] args) {
        // Create a Scanner object to read user input from the console
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter three numbers
        System.out.println("Enter three numbers:");

        // Read the three numbers entered by the user
        System.out.print("Number 1: ");
        double number1 = scanner.nextDouble();

        System.out.print("Number 2: ");
        double number2 = scanner.nextDouble();

        System.out.print("Number 3: ");
        double number3 = scanner.nextDouble();

        // Calculate the arithmetic average of the three numbers
        double average = (number1 + number2 + number3) / 3;

        // Print the arithmetic average
        System.out.println("The average of the three numbers is: " + average);

        // Close the Scanner object to release resources
        scanner.close();
    }
}
