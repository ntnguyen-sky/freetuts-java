package exercise;

import java.text.DecimalFormat;
import java.util.Scanner;

/*
 * form ax^2+bx+c=0
 * the discriminant ( 𝑏^2 − 4𝑎𝑐),
 */

public class QuadraticEquationSolver {

	public static void main(String[] args) {
		// Create a Scanner object for reading input
		Scanner scanner = new Scanner(System.in);
		DecimalFormat decimal = new DecimalFormat();

		// Prompt the user to enter the coefficients
		System.out.print("Enter the coefficient a: ");
		int a = scanner.nextInt();

		System.out.print("Enter the coefficien b: ");
		int b = scanner.nextInt();

		System.out.print("Enter the coefficien c: ");
		int c = scanner.nextInt();

		// Check if a is 0
		if (a == 0) {
			// If a is zero, it is not a quadratic equation
			System.out.println("The value of 'a' cannot be zero in a quadratic equation.");
		} else {
			// Calculate the discriminant
			double discriminant = (double) Math.pow(b, 2) - 4 * a * c;

			// Check the nature of the roots based on the discriminant
			if (discriminant > 0) {
				// Two distinct real roots
				double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
				double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
				System.out.println("The equation has two distint real roots: x1 = " + decimal.format(root1) + ", x2 = "
						+ decimal.format(root2));
			} else if (discriminant == 0) {
				// One real root
				double root = -b / (2 * a);
				System.out.println("The equation has one real roots: x = " + decimal.format(root));
			} else {
				// Two complex roots
				double realPart = -b / (2 * a);
				double imaginaryPart = Math.sqrt(-discriminant) / (2 * a);
				System.out.println("The equation has two complex roots: x1 = " + decimal.format(realPart) + " + "
						+ decimal.format(imaginaryPart) + "i, x2 = " + decimal.format(realPart) + " - "
						+ decimal.format(imaginaryPart) + "i");
			}
		}

		// Close the scanner to avoid memory leak
		scanner.close();
	}

}
