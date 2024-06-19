package execrise;

import java.util.Scanner;

/*
 * Viết chương trình nhập vào số nguyên dương n, tính và in ra màn hình tổng 1^2 + 2^2 + ... + n2.
 */
public class SumOfSquares {

	public static void main(String[] args) {
		// Scanner object
		Scanner scanner = new Scanner(System.in);
		
		int integer, sum = 0;
		
		// Input positive integer
		System.out.print("Enter the positive integer: ");
		integer = scanner.nextInt();
		
		while (integer <= 0) {
			System.out.print("Enter the positive integer: ");
			integer = scanner.nextInt();
		}
		
		
		// Sum of squares of numbers
		while (integer >= 1) {
			sum +=  (int) (Math.pow(integer,2));
			integer--;
		}
		
		System.out.println("The sum of squares of number is " + sum);
		
		// Close the scanner to avoid memory leak
		scanner.close();
	}

}
