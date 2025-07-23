import java.util.Scanner;
/*--- Defining a class ---*/
class Fibonacci
{
	/*--- Method to generate the nth term of Fibonacci series---*/
	private int fibonacciTerm(int n)
	{
		if(n==1)
		{
			return 0;
		}
		else if(n==2)
		{
			return 1;
		}
		else
		{
			return fibonacciTerm(n-1)+ fibonacciTerm(n-2);
		}
	}
	/*--- method to display fibonacci series ----*/
	public void displayFibonacciSeries()
	{
		/*--- Creating object of scanner class ---*/
		Scanner sc=new Scanner(System.in);
		/*--- Asking the user to input number of term ---*/
		System.out.print("Enter the number of terms : ");
		int terms = sc.nextInt();
		System.out.println("-----------------------------------");
		System.out.println("Fibonacci series till "+terms+"terms : ");
		for(int n=1;n<=terms;n++)
		{
			System.out.print(fibonacciTerm(n)+" , ");
		}
	}
}
/*---- Initial class ----*/
public class FibonacciSeries1 {

	public static void main(String[] args) {
		// Creating object of Fibonacci class
		Fibonacci fibonacci = new Fibonacci();
		fibonacci.displayFibonacciSeries();
	}

}
