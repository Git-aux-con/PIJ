// Defining a class AreaCalculator 
public class AreaCalculator
{
    // Method to calculate the area of a rectangle
    // Takes two parameters: length and width
    public void calculateArea(int length ,int width) 
    {
        System.out.println("-----Rectangle-----");
        System.out.println("Length : "+length+"cm");
        System.out.println("Width : "+width+"cm");
        double area = length * width;
        System.out.println("Area of Rectangle: " + area +"square cm");
        System.out.println("------------------------------------------------------------");
    }
    // Method to calculate the area of a circle
    // Takes one parameter: radius
    public void calculateArea(float radius) 
    {
        System.out.println("-----Circle-----");
        System.out.println("Radius : "+radius+"cm");
        // Using Math.PI for a more precise value of Pi
        double area = Math.PI * radius * radius; 
        System.out.println("Area of Circle: " + area +"square cm");
        System.out.println("------------------------------------------------------------");
    }

    // Method to calculate the area of a triangle
    // Takes two parameters: base and height
    public void calculateArea(double  base, double  height) 
    {
        System.out.println("-----Triangle-----");
        System.out.println("Base : "+base+"cm");
        System.out.println("Height : "+height+"cm");
        double area = (base * height)/3;
        System.out.println("Area of Triangle: " + area +"square cm");
        System.out.println("------------------------------------------------------------");
    }

//---------------------------------------------------------------------------------------------------------------
    public static void main(String[] args) 
    {
        // creating object of AreaCalculator
        AreaCalculator ac = new AreaCalculator();

        // Calculate and print the area of a rectangle
        ac.calculateArea(10,12); 

        // Calculate and print the area of a circle
        ac.calculateArea(5.2f); 

        // Calculate and print the area of a triangle
        ac.calculateArea(6.3,7); 
    }
}