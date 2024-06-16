package study;

import java.util.Scanner;

public class MontlyPrinterTwo {

	public static void main(String[] args) {

		// Create Scanner object to input data
		Scanner scanner = new Scanner(System.in);

		// Promptly the user to enter data
		System.out.print("Enter integer (1 - 12): ");
		int month = scanner.nextInt();

		// Close the scanner
		scanner.close();
		String str = "";
		
		switch (month) {
		case 1:
			str = "January";
			break;
		case 2:
			str = "February";
			break;
		case 3:
			str = "March";
			break;
		case 4:
			str = "April";
			break;
		case 5:
			str = "May";
			break;
		case 6:
			str = "June";
			break;
		case 7:
			str = "July";
			break;
		case 8:
			str = "August";
			break;
		case 9:
			str = "September";
			break;
		case 10:
			str = "October";
			break;
		case 11:
			str = "November";
			break;
		case 12:
			str = "December";
			break;
		default:
			System.out.println("The number entered must be between 1 and 12.");
		}
		System.out.println(str);
	}

}
