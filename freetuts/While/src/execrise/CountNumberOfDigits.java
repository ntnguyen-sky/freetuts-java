package execrise;

import java.util.Scanner;

/*
 * Viết chương trình nhập vào 1 số nguyên dương bất kỳ nhập từ bàn phím. Đếm và in ra màn hình số chữ số của số đó.

Ví dụ: Nhập vào số 1234 thì hiển thị kết quả = 4.
 */
public class CountNumberOfDigits {

	public static void main(String[] args) {
		// Scanner object
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter the positive integer: ");
		int number = scanner.nextInt();
		
		while (number <= 0) {
            System.out.println("Enter the positive integer: ");
            number = scanner.nextInt();
        }
		
		int temp = number;
		int count = 0;
		while (temp >= 1) {
			temp = temp/10;
			count++;
		}
		System.out.println("Count the number of digits of a positive integer " + number +" is : " + count);
		// Close scanner
		scanner.close();
		
		
	}

}
