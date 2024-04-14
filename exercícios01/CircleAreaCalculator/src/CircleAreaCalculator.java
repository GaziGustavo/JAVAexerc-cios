// Import the Scanner class to allow reading user input
import java.util.Scanner;
// Define the Circle Area Calculator class, which contains the main method (entry point of the program)

public class CircleAreaCalculator {
    public static void main(String[] args) {
        // Create a Scanner object to read user input from the console
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter the radius of the circle
        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();

        // Calculate the area of the circle using the formula: area = π * radius * radius
        double area = Math.PI * radius * radius;

        // Print the area of the circle
        System.out.println("The area of the circle with radius " + radius + " is: " + area);

        // Close the Scanner object to release resources
        scanner.close();
    }
}
