package study;

import java.util.Scanner;

/*
 * Nhập vào một số nguyên từ 1 - 12 từ bàn phím 
 * và hiển thị ra tháng tương ứng với số đó (nhập vào số 1 thì sẽ hiển thị ra là "Tháng 1".
 */
public class MonthPrinter {

	public static void main(String[] args) {
		// Create Scanner object to input data
		Scanner scanner = new Scanner(System.in);

		// Promptly the user to enter data
		System.out.print("Enter integer (1 - 12): ");
		int month = scanner.nextInt();

		// Check
		if (month <= 12 && month > 0) {
			switch (month) {
			case 1:
				System.out.println("January");
				break;
			case 2:
				System.out.println("February");
				break;
			case 3:
				System.out.println("March");
				break;
			case 4:
				System.out.println("April");
				break;
			case 5:
				System.out.println("May");
				break;
			case 6:
				System.out.println("June");
				break;
			case 7:
				System.out.println("July");
				break;
			case 8:
				System.out.println("August");
				break;
			case 9:
				System.out.println("September");
				break;
			case 10:
				System.out.println("October");
				break;
			case 11:
				System.out.println("November");
				break;
			case 12:
				System.out.println("December");
				break;
//			default:
//				System.out.println("The number entered must be between 1 and 12.");
			}
		} else {
			System.out.println("The entered number does not meet the condition!");
		}

		// Close the scanner
		scanner.close();
	}

}
