import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static int[] findSumIndices(int[] nums, int target) {
        // Create a map to store the already seen values and their indices
        HashMap<Integer, Integer> indexMap = new HashMap<>();

        // Iterate through the array of numbers
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            // Calculate the complement needed to reach the target
            int complement = target - num;

            // Check if the complement has been seen
            if (indexMap.containsKey(complement)) {
                // If yes, return the indices of the two numbers
                return new int[] {indexMap.get(complement), i};
            }

            // If not, store the index of the current number
            indexMap.put(num, i);
        }

        // If no pair is found, return null
        return null;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the elements of the array separated by space: ");
        String input = scanner.nextLine();
        System.out.print("Enter the target value: ");
        int target = scanner.nextInt();

        // Split the input by spaces to get individual elements
        String[] elements = input.split(" ");

        // Convert the elements to int type
        int[] nums = new int[elements.length];
        for (int i = 0; i < elements.length; i++) {
            nums[i] = Integer.parseInt(elements[i]);
        }

        int[] result = findSumIndices(nums, target);
        if (result != null) {
            System.out.println("Indices found: " + result[0] + ", " + result[1]);
        } else {
            System.out.println("No pair found.");
        }
    }
}
