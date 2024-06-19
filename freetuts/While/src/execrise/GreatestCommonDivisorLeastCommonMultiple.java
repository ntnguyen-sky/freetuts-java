package execrise;

import java.util.Scanner;

/*
 * Viết chương trình nhập vào 2 số nguyên dương, 
 * tìm và in ra màn hình ước số chung lớn nhất và bội số chung nhỏ nhất của 2 số nguyên dương nhập từ bàn phím.
 */

public class GreatestCommonDivisorLeastCommonMultiple {

	public static void main(String[] args) {
		// Scanner object
		Scanner scanner = new Scanner(System.in);

		// Input data
		System.out.print("Enter the first number: ");
		int number1 = scanner.nextInt();

		System.out.print("Enter the second number: ");
		int number2 = scanner.nextInt();
		
		int greaterCommonDivisor;
		int temp1 = number1;
		int temp2 = number2;

		// greaterCommonDivisor
		while (number1 <= 0 || number2 <= 0) {
			System.out.println("Re-enter the two positive integers!");
			System.out.print("Enter the first number: ");
			number1 = scanner.nextInt();

			System.out.print("Enter the second number: ");
			number2 = scanner.nextInt();
		}
		
		// Algorithm Euclid
		// UCLN của hai số nguyên không thay đổi khi thay số lớn hơn bằng hiệu của nó với số nhỏ hơn
		
		/*
		 * Quá trình thay thế này được lặp đi lặp lại cho tới khi 2 số bằng nhau, khi đó UCLN chính là 1 trong 2 số.
		 * 
		 * Ví dụ
		 * 
		 * UCLN(20, 15) = UCLN (15, 5) = UCLN(5, 10) = UCLN(5, 5) => UCLN(20, 15) = 5
		 * 
		 * UCLN(16, 10) = UCLN(10, 6) = UCLN(6, 4) = UCLN(4, 2) = UCLN(2, 2) => UCLN(16, 10) = 2
		 */

		while (temp1 != temp2) {
			if (temp1 > temp2) {
				temp1 -= temp2;
			} else {
				temp2 -= temp1;
			}
		}

		greaterCommonDivisor = temp1;
		// Để tìm BCNN bạn có thể dựa vào kiến thức : BCNN(a, b) = a * b / UCLN(a, b). 

		// Ví dụ BCNN(28, 20) = 28 * 20 / UCLN(28, 20) = 560 / 4 = 140
		System.out.println("Greater Common Divisor of " + number1 + " and " + number2 + " is: " + greaterCommonDivisor);
		System.out.println("Least Common Multiple of " + number1 + " and " + number2 + " is: " + (number1*number2)/greaterCommonDivisor);

		// Close scanner
		scanner.close();
	}

}
