// Import the Scanner class to allow reading user input
import java.util.Scanner;

// Define the temperature converter class, which contains the main method (entry point of the program)

public class temperature_converter {


    public static void main(String[] args) {
        // Create a Scanner object to read user input from the console
        Scanner scanner = new Scanner(System.in);

        // Prompts the user to enter the temperature in Celsius and reads the entered number
        System.out.print("Enter the temperature in Celsius: ");
        float Celsius = scanner.nextInt();

        //formula to transform Celsius into Fahrenheit
        float Fahrenheit = Celsius * 9 / 5 + 32;

        System.out.println("temperature in Fahrenheit:" + Fahrenheit);

        // Close the Scanner object to release resources
        scanner.close();
    }

}