import java.util.Scanner;

public class EvenOddCount {
    public static void main(String[] args) {
        // Create an array of 20 integers
        int[] numbers = new int[20];
        Scanner scanner = new Scanner(System.in); 
        System.out.print("Enter Any 20 Numbers : ");
        // Initialize the array by user input.
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }

        // Initialize count for even and odd numbers
        int evenCount = 0;
        int oddCount = 0;

        // It is used to count even and odd numbers
        for (int number : numbers) {
            if (number % 2 == 0) {
                evenCount++; // Increment in even count if the number is even.
            } else {
                oddCount++; // Increment in odd count if the number is odd.
            }
        }

        //To Print the array
        System.out.print("Array: ");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();// Move to the next line

        // To Print the counts of even and odd numbers
        System.out.println("Number of even numbers: " + evenCount);
        System.out.println("Number of odd numbers: " + oddCount);
        scanner.close();
    }
}
