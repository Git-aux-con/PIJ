// importing Scanner class from java.util package.
import java.util.Scanner;

// Define an interface named TwoDFigure
interface TwoDFigure {
    void displayData(); // Method to display details of the figure
    double calculateArea(); // Method to calculate area
    double calculatePerimeter(); // Method to calculate perimeter
}
/*---------------------------------------------------------------------------------------------------------*/

// Class for Rectangle implementing TwoDFigure
class Rectangle implements TwoDFigure {
    double length, width;

    // Constructor
    Rectangle(Scanner sc) 
    {
        // Input for Rectangle
        System.out.print("Enter length of rectangle: ");
        length = sc.nextDouble();
        System.out.print("Enter width of rectangle: ");
        width = sc.nextDouble();
        System.out.println("--------------------------------------");
    }

    // Display data about the rectangle
    @Override
    public void displayData() 
    {
        System.out.println("\n--- Rectangle ---");
        System.out.println("Length: " + length);
        System.out.println("Width: " + width);
        System.out.println("Area: " + calculateArea());
        System.out.println("Perimeter: " + calculatePerimeter());
    }
    @Override
    public double calculateArea() {
        return length * width;
    }
    @Override
    public double calculatePerimeter() {
        return 2 * (length + width);
    }
}
/*---------------------------------------------------------------------------------------------------------*/

// Class for Square implementing TwoDFigure
class Square implements TwoDFigure 
{
    double side;

    // Constructor
    Square(Scanner sc) 
    {
        // Input for Square
        System.out.print("\nEnter side of square: ");
        side = sc.nextDouble();
        System.out.println("--------------------------------------");
    }

    // Display data about the square
    @Override
    public void displayData() 
    {
        System.out.println("\n--- Square ---");
        System.out.println("Side: " + side);
        System.out.println("Area: " + calculateArea());
        System.out.println("Perimeter: " + calculatePerimeter());
    }
    @Override
    public double calculateArea() {
        return side * side;
    }
    @Override
    public double calculatePerimeter() {
        return 4 * side;
    }
}

/*---------------------------------------------------------------------------------------------------------*/
// Class for Circle implementing TwoDFigure
class Circle implements TwoDFigure 
{
    double radius;

    // Constructor
    Circle(Scanner sc) 
    {
         // Input for Circle
         System.out.print("\nEnter radius of circle: ");
         radius = sc.nextDouble();
         System.out.println("--------------------------------------");
    }

    // Display data about the circle
    @Override
    public void displayData() {
        System.out.println("\n--- Circle ---");
        System.out.println("Radius: " + radius);
        System.out.println("Area: " + calculateArea());
        System.out.println("Perimeter (Circumference): " + calculatePerimeter());
    }
    @Override
    public double calculateArea() 
    {
       // Using Math.PI for a more precise value of Pi
        return Math.PI * radius * radius;
    }
    @Override
    public double calculatePerimeter() 
    {
        // Using Math.PI for a more precise value of Pi
        return 2 * Math.PI * radius;
    }
}

/*---------------------------------------------------------------------------------------------------------*/
// Main class to test the implementation using user input
public class TwoDFigureTest {
    public static void main(String[] args) 
    {
        // Scanner is used to take input from the user.
        Scanner sc = new Scanner(System.in);

        Rectangle rectangle = new Rectangle(sc);
        Square square = new Square(sc);
        Circle circle = new Circle(sc);

        // Display all shape data
        rectangle.displayData();
        square.displayData();
        circle.displayData();

        sc.close(); // Close the scanner
    }
}