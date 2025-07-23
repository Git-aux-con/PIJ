import java.util.Scanner;
class Factorial
{
		public static void main(String[] args)
		{     

			Scanner obj =new Scanner(System.in);
			int fac = 1; // it is initialized to store the factorial result
			System.out.print("Enter the Number : ");
			int i = obj.nextInt();
             if(i>0)
            {
			    for(int a = 1;a <= i;a++)
			    {
				    fac = fac*a; // multiply the current factorial result with the current position.
					
			    }
				    System.out.println("The Factorial of given number is "+fac);
             }
             
        }
}