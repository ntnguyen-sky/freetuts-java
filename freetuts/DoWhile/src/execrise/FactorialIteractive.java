package execrise;

import java.util.Scanner;

public class FactorialIteractive {
	public static long factorial(int number) {
		long fact = 1;
		for (int i = 1; i <= number; i++) {
			fact = (long) fact*i;
		}
		return fact;
	}
	
	public static void main(String[] args) {
		// Create scanner
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the number: ");
		int number = scanner.nextInt();
		long result = factorial(number);
		System.out.println("Factorial of " + number + " is: " + result);
		
		// Close the scanner
		scanner.close();
	}

}
