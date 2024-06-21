package study;

import java.util.Scanner;

/*
 * Viết chương trình nhập vào các số nguyên và tính tổng các số đó, nếu tổng lớn hơn > 100 
 * thì kết thúc vòng lặp và hiển thị thông báo tổng của các số đã nhập.
 */
public class SumIntegerNumber {
	public static void main(String[] args) {
		// Scanner object 
		Scanner scanner = new Scanner(System.in);
		int sum;
		do {
			System.out.print("Enter the first number: ");
			int number1 = scanner.nextInt();
			System.out.print("Enter the second number: ");
			int number2 = scanner.nextInt();
			sum = number1 + number2;
			System.out.println("Sum of the integers is : " + sum);
		} while (sum < 100);
		
		// Close scanner 
		scanner.close();
	}
}
