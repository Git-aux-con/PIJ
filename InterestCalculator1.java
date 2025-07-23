import java.util.Scanner;
/*---- Defining an Interest class ----*/
class Interest
{
	/*---- Declaring member variables ----*/
	float principal;//variable to store principal
	float rate;//variable to store rate
	int time;//variable to store time
	/*----------------------------------------------------*/
	/*--- Defining a constructor ---*/
	Interest()
	{
		/*--- create an object ---*/
		Scanner sc=new Scanner(System.in);
		/*--- Prompt the user to input principal ----*/
		System.out.print("Enter principal(in Rs) :");
		principal = sc.nextFloat();
		/*-----------------------------------------*/
		/*--- Prompt the user to input rate ---*/
		System.out.print("Enter rate(in %) : ");
		rate = sc.nextFloat();
		/*-----------------------------------*/
		/*--- Prompt the user to input the time ----*/
		System.out.print("Enter time(in year) : ");
		time = sc.nextInt();
		/*--- closing the scanner ---*/
		sc.close();
		System.out.println("-------------------------------------------------");
	}
	/*---- Method to display data ----*/
	public void displayData()
	{
		System.out.println("Principal : Rs "+principal);
		System.out.println("Rate : "+rate+" %");
		System.out.println("Time : "+time+" year");
	}
	/*--- Method to calculate simple interest ----*/
	public void calculateSimpleInterest()
	{
		float si = (principal * rate * time)/100;
		System.out.println("Simple Interest : Rs "+si);
	}
}
/*-------------Initial class----------------------*/
public class InterestCalculator1 {

	public static void main(String[] args) {
		// Creating object of Interest class
		Interest interest = new Interest();
		interest.displayData();// method displaying principal,rate and time
		interest.calculateSimpleInterest();//method calculating simple interest and displaying it
	}

}
