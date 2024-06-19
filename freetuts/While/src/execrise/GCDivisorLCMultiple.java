package execrise;

import java.util.Scanner;

/*
 * Trong mục 2 khi a và b cách xa nhau thì thuật toán Euclid hoạt động không hiệu quả, ví dụ bạn tìm ULCN(1000000000, 1) 
 * thì thuật toán cần lặp 999999999 lần. 
 */

/*
 * Ta cải tiến thuật toán Euclid bằng nhận xét sau :  
 * UCLN của hai số nguyên không thay đổi khi thay 1 trong 2 số thành số dư của nó với số còn lại. Có nghĩa là UCLN(a, b) = UCLN(b, a % b)
 * 
 * Quá trình thay thế này được lặp đi lặp lại cho tới khi 1 trong 2 số bằng 0, khi đó UCLN chính là số còn lại
 * 
 * Ví dụ 
 * 
 * UCLN(20, 15) = UCLN(15, 20 % 15) = UCLN(15, 5) = UCLN(5, 15 % 5) = UCLN(5, 0) => UCLN(20, 15) = 5
 * 
 * UCLN(16, 28) = UCLN(28, 16 % 28) = UCLN(28, 16) = UCLN(16, 28 % 16) 
 * = UCLN(16, 12) = UCLN(12, 16 % 12) = UCLN(12, 4) = UCLN(4, 12 % 4) = UCLN(4, 0) => UCLN(16, 28) = 4
 * 
 * UCLN(1000000000, 1) = UCLN(1, 1000000000 % 1) = UCLN(1, 0) = 1 => UCLN(1000000000, 1) = 1 (Bạn chỉ cần 1 vòng lặp thay vì 999999999)
 */
public class GCDivisorLCMultiple {

	public static void main(String[] args) {
		// Scanner object
		Scanner scanner = new Scanner(System.in);

		// Input data
		System.out.print("Enter the first number: ");
		int number1 = scanner.nextInt();

		System.out.print("Enter the second number: ");
		int number2 = scanner.nextInt();

		int greaterCommonDivisor = 0;

		// greaterCommonDivisor
		while (number1 <= 0 || number2 <= 0) {
			System.out.println("Re-enter the two positive integers!");
			System.out.print("Enter the first number: ");
			number1 = scanner.nextInt();

			System.out.print("Enter the second number: ");
			number2 = scanner.nextInt();
		}
		
		int temp1 = number1;
		int temp2 = number2;
		
		while (temp2 != 0) {
			int leftover = temp1 % temp2;
			temp1 = temp2;
			temp2 = leftover;
			if (leftover == 0) {
				greaterCommonDivisor = temp1;
			}
		}

		System.out.println("Greater Common Divisor of " + number1 + " and " + number2 + " is: " + greaterCommonDivisor);
		System.out.println("Least Common Multiple of " + number1 + " and " + number2 + " is: "
				+ (number1 * number2) / greaterCommonDivisor);

		// Close scanner
		scanner.close();
	}

}
