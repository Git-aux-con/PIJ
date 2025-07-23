import java.util.Scanner;

public class InterestCalculator {

    /*
     * Calculates the simple interest.
     * Simple Interest (SI) = (Principal * Rate * Time) / 100
     *
     * principal The initial amount of money.
     * rate The annual interest rate (as a percentage, e.g., 5 for 5%).
     * time The time period in years.
     */
    public static double calculateSimpleInterest(double principal, double rate, double time) {
        return (principal * rate * time) / 100;
    }

    /*
     * Calculates the compound interest.
     * Amount (A) = P * (1 + R/100)^T
     * Compound Interest (CI) = A - P
     */
    public static double calculateCompoundInterest(double principal, double rate, double time) {
        // Calculate the amount after compounding
        double amount = principal * Math.pow((1 + rate / 100), time);
        // Calculate the compound interest
        return amount - principal;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double principal = sc.nextDouble();
        double rate = sc.nextDouble();
        double time = sc.nextDouble();
        System.out.println("Principal : "+principal+" Rs.");
        System.out.println("Rate : "+rate+" %");
        System.out.println("Time in years : "+time+" years");
        // Calculate and display simple interest
        double simpleInterest = calculateSimpleInterest(principal, rate, time);
        System.out.println("Simple Interest: " + simpleInterest);

        // Calculate and display compound interest
        double compoundInterest = calculateCompoundInterest(principal, rate, time);
        System.out.println("Compound Interest: " + compoundInterest);
    }
}
