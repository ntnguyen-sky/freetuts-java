package freetuts;

import java.util.Scanner;

//Ví dụ dưới đây sẽ so sánh 2 số và hiển thị ra màn hình số nhỏ nhất trong 2 số
public class CompareTwoNumber {

	public static void main(String[] args) {
		// Declare two number
		int firstNumber, secondNumber, min;
		
		// Create Scanner object
		Scanner scanner = new Scanner(System.in);
		
		// Input data
		System.out.print("Enter first number: ");
		firstNumber = scanner.nextInt();
		
		System.out.println("Enter second number: ");
		secondNumber = scanner.nextInt();
		
		if (firstNumber > secondNumber){
			min = secondNumber;
		} else min = firstNumber;
		
		System.out.println("Min number is: " + min);
		// Close object Scanner to avoid memory leaks
		scanner.close();
	}

}
