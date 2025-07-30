import java.util.Scanner;
// class to represent a Circle.
class Circle
{
    // private variable (cannot be accessed directly outside the class)
    
    private float radius;

    //setter method to set the radius
    public void setRadius(float radius)
    {
        // To check the radius is positive or not.
        if(radius>0)
        {
            this.radius = radius;
        }
        // To print the error message that radius is not positive.
        else
        {
            System.err.println("Radius must be greater than zero.");
        }
    }
    //getter method to get the radius
    public float getRadius()
    {
        return radius;
    }
    // Method to calculate the area of Circle.
    private double calculateArea()
    {
        //Area of circle is πr^2
        return Math.PI*radius*radius;
    }
    //public method to display the area.
    public void displayArea()
    {
        System.out.println("Area of Circle : "+calculateArea());
    }
}
public class AreaOfCircle
{
    public static void main(String[] args) 
    {
        // create object of Scanner class to take user input.
        Scanner sc = new Scanner(System.in);
        // Create an object of Circle class.
        Circle c1 = new Circle();
        // Ask user to input the radius.
        System.out.print("Enter the radius of the Circle : ");
        float r = sc.nextFloat();
        // Set the radius using setter method
        c1.setRadius(r);
        //To display the radius
        System.out.println("Radius : "+c1.getRadius());
        // Call the method to display the Area of Circle.
        c1.displayArea();
        // close the Scanner
        sc.close();
    }
}

