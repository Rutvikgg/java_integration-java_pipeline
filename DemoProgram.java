public class DemoProgram {

    public static void main(String[] args) {
        int limit = 100; // Set the limit to 100
        int result = sumEvenNumbers(limit); // Call the function

        // Print the result
        System.out.println("The sum of even numbers from 1 to " + limit + " is: " + result);
    }
    
    // Function to calculate the sum of even numbers up to a given limit
    public static int sumEvenNumbers(int limit) {
        int sum = 0;

        // Loop through all numbers from 1 to the specified limit
        for (int i = 1; i <= limit; i++) {
            // Check if the number is even
            if (i % 2 == 0) {
                sum += i; // Add the even number to the sum
            }
        }
        return sum; // Return the final sum
    }
}