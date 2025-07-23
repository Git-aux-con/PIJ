public class FibonacciSeries {

    public static void main(String[] args) {
        // Define the number of terms to print in the Fibonacci series
        int numberOfTerms = 20;

        // Initialize the first two terms of the Fibonacci series
        // The Fibonacci series starts with 0 and 1
        int term1 = 0;
        int term2 = 1;

        // Print the header for the output
        System.out.println("Fibonacci Series up to " + numberOfTerms + " terms:");

        // Handle the case for 0 terms (no output)
        if (numberOfTerms == 0) {
            return; // Exit if no terms are requested
        }

        // Handle the case for 1 term (only print 0)
        if (numberOfTerms >= 1) {
            System.out.print(term1); // Print the first term
        }

        // Handle the case for 2 terms (print 0 and 1)
        if (numberOfTerms >= 2) {
            System.out.print(", " + term2); // Print the second term
        }

        // Loop to generate and print the remaining terms
        // The loop starts from the 3rd term (index 2) as the first two are already printed
        for (int i = 2; i < numberOfTerms; i++) {
            // Calculate the next term as the sum of the previous two terms
            int nextTerm = term1 + term2;

            // Print the calculated next term, preceded by a comma and space
            System.out.print(", " + nextTerm);

            // Update term1 to the value of term2 for the next iteration
            term1 = term2;

            // Update term2 to the value of nextTerm for the next iteration
            term2 = nextTerm;
        }

        // Add a newline character at the end for clean output formatting
        System.out.println();
    }
}