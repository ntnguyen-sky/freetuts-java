package exercise;

import java.text.DecimalFormat;
import java.util.Scanner;

/*
 * form 𝑎𝑥+𝑏=0
 * the formula 𝑥 = −𝑏/𝑎, x=− , provided that 𝑎 ≠ 0
 */
public class FirstDegreeEquations {

	public static void main(String[] args) {
		// Create a Scanner object for reading input 
		Scanner scanner = new Scanner(System.in);
		DecimalFormat decimal = new DecimalFormat();
		
		// Prompt the user to enter the coefficients
		System.out.print("Enter the coefficient a: ");
		int a = scanner.nextInt();
		
		System.out.print("Enter the coefficient b: ");
		int b = scanner.nextInt();
		
		// Check if a is 0
		if (a==0) {
			if (b==0) {
				System.out.println("The equation has infinitely many solutions.");
			} else {
				System.out.println("The equation has no solution.");
			}
		} else {
			// Calculation the solution using the formula x = -b / a
			double x = (double )-b /a;
			System.out.println("The solution to the equation " + a + "x + " + b + " = 0 is x = " + decimal.format(x));
		}
		
		// Close the scanner to avoid memory leaks
		scanner.close();
	}

}
