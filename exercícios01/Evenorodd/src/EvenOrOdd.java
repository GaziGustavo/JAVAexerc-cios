// Import the Scanner class to allow reading user input
import java.util.Scanner;

// Define the even or odd class, which contains the main method (entry point of the program)
public class EvenOrOdd {
    public static void main(String[] args) {
        // Create a Scanner object to read user input from the console
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter an integer and read the entered number
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        // Check if the number is even or odd and print the result
        if (number % 2 == 0) {
            System.out.println(number + " is an even number.");
        } else {
            System.out.println(number + " is an odd number.");
        }

        // Close the Scanner object to release resources
        scanner.close();
    }
}
