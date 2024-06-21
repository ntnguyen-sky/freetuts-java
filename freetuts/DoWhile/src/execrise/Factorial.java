package execrise;

import java.util.Scanner;

/*
 * Viết chương trình nhập vào 1 số nguyên dương bất kỳ từ bàn phím. Sau đó tính và in ra giai thừa của số đó.
 * 
 * Yêu cầu: Chương trình phải kiểm tra và yêu cầu người dùng nhập vào n >= 0.
 */
public class Factorial {

	public static void main(String[] args) {
		// Scanner object
		Scanner scanner = new Scanner(System.in);

		// Input
		int number;
		do {
			System.out.print("Enter the number: ");
			number = scanner.nextInt();
		} while (number <= 0);

		// Calculate factorial
		int factorial = 1;
		int temp = 1;
		while (temp <= number) {
			factorial *= temp;
			temp++;
		}
		System.out.println(number + "! = " + factorial);

		// Close the scanner
		scanner.close();
	}

}
