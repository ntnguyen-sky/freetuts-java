package execrise;

import java.util.Scanner;

/*
 * Ước Chung Lớn Nhất (UCLN) của 2 số a, b là số lớn nhất mà 2 số a và b cùng chia hết
 * 
 * Thuật toán tự nhiên mà bạn dùng để tìm UCLN đó là duyệt từ số nhỏ hơn trong 2 số về tới 1, số nào mà cả a và b chia hết đầu tiên sẽ là UCLN
 * 
 * Chú ý rằng UCLN(a, 0) = a
 */

/*
 * Bội Chung Nhỏ Nhất (BCNN) của 2 số a, b là số nhỏ nhất mà chia hết đồng thời cho cả a và b
 * 
 * Thuật toán tự nhiên mà bạn dùng để tìm BCNN đó là duyệt từ số lớn hơn trong 2 số và tăng dần cho tới khi gặp số đầu tiên chia hết cho cả a và b.
 */
public class GCDivisorAndLCMultiple {

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
		while (number1 == 0 || number2 == 0) {
			greaterCommonDivisor = number1 + number2;
		}
		
		int min = number1 < number2 ? number1 : number2;
		
		for (int i = min ; i >= 1; i--) {
			if (number1 % i == 0 && number2 % i == 0) {
				greaterCommonDivisor = i; break;
			} else if (i == 1){
				greaterCommonDivisor = 1;
			}
		}
		
		int max = number1 > number2 ? number1 : number2;
		int result = max;
		
		while (true) {
			if (max % number1 == 0 && max % number2 == 0) {
				result = max; break;
			}
			max++;
		}

		System.out.println("Greater Common Divisor of " + number1 + " and " + number2 + " is: " + greaterCommonDivisor);
		System.out.println("Least Common Multiple of " + number1 + " and " + number2 + " is: "
				+ result);

		// Close scanner
		scanner.close();
	}

}
