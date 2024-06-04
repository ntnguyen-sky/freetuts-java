package freetuts;

import java.util.Scanner;


/*
 * Toán tử điều kiện 3 ngôi là cấu trúc thay thế của biểu thức điều kiện if - else trong Java.
 */
public class CheckEvenOdd {

	public static void main(String[] args) {
		// Scanner object
		Scanner scanner = new Scanner(System.in);
		
		// Declare variable
		int number;
		
		// Input data
		System.out.print("Enter your number that need to check even or odd: ");
		number = scanner.nextInt();
		
		// Close Scanner object to avoid memory leaks
		scanner.close();
		
		// Check even or odd
		String result = (number%2==0) ? "Not Weird" : "Weird";
		System.out.println(result);
	}

}
