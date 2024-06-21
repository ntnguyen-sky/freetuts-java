package execrise;

import java.math.BigInteger;
import java.util.Scanner;

public class FactorialRecursive {

	public static BigInteger factorial(BigInteger n) {
		if (n.compareTo(BigInteger.ZERO) < 0) {
            throw new IllegalArgumentException("Number must be non-negative.");
        }
        if (n.equals(BigInteger.ZERO)) {
            return BigInteger.ONE;
        } else {
            return n.multiply(factorial(n.subtract(BigInteger.ONE)));
        }
	}

	public static void main(String[] args) {
		// Create scanner
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter the number: ");
		int number = scanner.nextInt();
        try {
            BigInteger result = factorial(BigInteger.valueOf(number));
            System.out.println("Factorial of " + number + " is: " + result);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
		// Close the scanner
		scanner.close();
	}

}
