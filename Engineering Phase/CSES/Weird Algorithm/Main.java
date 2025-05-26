import java.util.*;
import java.lang.*;
import java.io.*;

class Main{
    public static void solution() {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();  // Read the input number

        System.out.print(n + " ");

        // Generate the Collatz sequence
        while (n != 1) {
            if (n % 2 == 0) {
                n = n / 2;  // If n is even, divide it by 2
            } else {
                n = n * 3 + 1;  // If n is odd, multiply by 3 and add 1
            }

            System.out.print(n);
            if (n != 1) {
                System.out.print(" ");  // Add space if the current number is not the last one
            }
        }

        scanner.close();  // Close the scanner to release resources
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		solution();
		

	}
}
