package execrise;

import java.util.Scanner;

/*
 * Viết chương trình nhập vào 1 số nguyên dương n (0 < n <= 10), tính và in ra màn hình n giai thừa.
 * 
 * Hướng dẫn: Công thức tính n! = 1.2.3...n.
 */
public class Factorial {

	public static void main(String[] args) {
		// Scanner object 
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter the number: ");
		int factorial = scanner.nextInt();
		int temp = factorial;
		int result = 1;
		
		while (factorial >= 1) {
			result *= factorial;
			factorial--;
		}
		
		System.out.println("Factorial of " + temp +"! is : " + result);
		
		// Close scanner object 
		scanner.close();
	}

}
