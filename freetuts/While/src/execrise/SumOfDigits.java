package execrise;

import java.util.Scanner;

/*
 * Nhập vào một số nguyên dương bất kỳ từ bàn phím, 
 * sau đó tính và hiển thị ra tổng của các chữ số có trong số đó.
 * Ví dụ: Nhập số 1230 thì tổng của các chữ số = 10.
 */
public class SumOfDigits {

	public static void main(String[] args) {
		// Scanner object
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter the number: ");
		int number = scanner.nextInt();
		
		while (number <= 0 ) {
			System.out.print("Enter the number: ");
			number = scanner.nextInt();
		}
		
		int temp = number;
		int sum = 0;
		while (temp >= 1) {
			sum += (temp % 10); 
			temp = temp/10;
		}
		System.out.println("Sum of the integer number (" + number + ") is: " + sum);
		
		
		// Close scanner
		scanner.close();

	}

}
