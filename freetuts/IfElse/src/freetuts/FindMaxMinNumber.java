package freetuts;

import java.util.Scanner;

/*
 * nhập 3 số bất kỳ từ bàn phím và hiển thị ra màn hình số lớn nhất trong 3 số đó.
 */
public class FindMaxMinNumber {

	public static void main(String[] args) {
		// Scanner object
		Scanner scanner = new Scanner(System.in);
		
		// Declare or input data
		
		System.out.print("Enter first number: ");
		double firstNumber = scanner.nextDouble();
		
		System.out.print("Enter second number: ");
		double secondNumber = scanner.nextDouble();
		
		System.out.print("Enter third number: ");
		double thirdNumber = scanner.nextDouble();
		
		// Close Scanner object
		scanner.close();
		
		// Comparison 
		// Ex " 15 , 11, 18
		double max = 0;
		
		if (firstNumber >= secondNumber) {
			
			if(secondNumber >= thirdNumber)
				max = firstNumber;
			else if(firstNumber >= thirdNumber)
				max = firstNumber;
			else max = thirdNumber;
			
		} else {
			max = secondNumber;
		}
		
		System.out.println("Max: " + max);
		
	}

}
