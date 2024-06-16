package exercise;

import java.util.Scanner;

/*
 * Nhập vào số tương ứng từ 1 đến 7 sau đó hiển thị ra màn hình thứ tương ứng với số đó, trong đó:
 * 
 * Số 1: Chủ nhật.
 * 
 * Số 2: Thứ 2.
 * ...
 * Số 7: Thứ 7.
 * Nếu nhập số ngoài phạm vi này thì hiển thị thông báo "Nhập số không hợp lệ".
 */
public class Date {

	public static void main(String[] args) {
		// Scanner object
		Scanner scanner = new Scanner(System.in);

		// Prompt the user to enter the number
		System.out.print("Enter the number: ");
		int number = scanner.nextInt();

		// Print
		switch (number) {
		case 1:
			System.out.println("Sunday");
			break;
		case 2:
			System.out.println("Monday");
			break;
		case 3:
			System.out.println("Tuesday");
			break;
		case 4:
			System.out.println("Wensday");
			break;
		case 5:
			System.out.println("Thursday");
			break;
		case 6:
			System.out.println("Friday");
			break;
		case 7:
			System.out.println("Saturday");
			break;
		default:
			System.out.println("Invalid number entered.");
		}
		// Close the scanner to avoid memory leaks
		scanner.close();
	}

}
