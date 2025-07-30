import java.util.InputMismatchException;
// Importing Scanner Class.
import java.util.Scanner;

// Custom exception for invalid radius.
class InvalidRadiusException extends Exception 
{
    public InvalidRadiusException(String msg) 
    {
        super(msg);
    }
}

public class CircleCalculator 
{
        public static void main(String[] args) 
    {
         // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter the radius of the circle: ");
            float radius = scanner.nextFloat(); // Input the radius from the user

            // Check if the radius is valid (non-negative)
            if (radius < 0) {
                 // Throw custom exception.
                throw new InvalidRadiusException("Radius cannot be negative.");
            }
            // Calculate area and perimeter
            double area = Math.PI * radius * radius;
            double perimeter = 2 * Math.PI * radius;

            // Display the results
            System.out.println("Area of the circle: " + area);
            System.out.println("Perimeter of the circle: " + perimeter);

        } 
        catch (InputMismatchException ime) 
        {
            // Handle non-numeric input
            System.err.println("Invalid input. Please enter a numeric value for the radius.");
        } 
        catch (InvalidRadiusException ire) 
        {
            // Handle custom exception for invalid radius
            System.err.println("Error: " + ire);
        } 
        finally 
        {
            scanner.close(); // Close the scanner to release resources
        }
    }
}