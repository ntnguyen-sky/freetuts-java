package exercise;

import java.util.Scanner;

/**
 * Nhập vào 2 số bất kỳ từ bàn phím và thực hiện các yêu cầu sau:

1. Tính tổng, hiệu, tích, thương, chia lấy dư của 2 số đó.

2. Sử dụng các toán tử so sánh đã học để so sánh 2 số đó.
 */
public class MathOperations {

	public static void main(String[] args) {
//		Declare two number
		double firstNumber;
		double secondNumber;
		
//		Create Scanner object to input data
		Scanner scanner = new Scanner(System.in);
		
//		Prompt user for first number
		System.out.print("Enter the first number: ");
		firstNumber = scanner.nextDouble();
		
//		Prompt user for second number 
		System.out.print("Enter the second number: ");
		secondNumber = scanner.nextDouble();
		
//		Perform math operations
		double addit = firstNumber + secondNumber;
		double subt = firstNumber - secondNumber;
		double mult = firstNumber * secondNumber;
		
		
//		Handle division by zero
		if(secondNumber == 0) {
			System.out.println("Division: Error! Division by zero.");
			System.out.println("Remainder Error! Division by zero.");
			System.out.println("Please Re-entern the second number other than 0: ");
			secondNumber = scanner.nextDouble();
			
//			Close the Scanner object after using to avoid memory to leaks
			scanner.close();		
		}

		double divis = firstNumber / secondNumber;
		double dividingOfRemainder = firstNumber % secondNumber;
		
//		Displaying results of addition, subtraction, and multiplication ...
		System.out.println("Addition: " + addit);
		System.out.println("Subtraction: " + subt);
		System.out.println("Multiplition: " + mult);
		System.out.println("Division: " + divis);
		System.out.println("Division of the remainder: " + dividingOfRemainder);
		
	}

}
