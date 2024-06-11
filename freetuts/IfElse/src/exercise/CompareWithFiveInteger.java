package exercise;

import java.util.Scanner;

/*
 * Nhập một số nguyên bất kỳ từ bàn phím, 
 * sau đó kiểm tra số đó lớn hơn 5 thì in ra là số đó lớn hơn 5, ngược lại in ra số đó nhỏ hơn 5.
 */
public class CompareWithFiveInteger {

	public static void main(String[] args) {
		// Declare 
		int number;
		
		// Create Scanner object
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter number: ");
		number = scanner.nextInt();
		
		// Compare 
		if (number > 5) {
			System.out.println(number + " is greater than 5");
		} else if (number < 5) {
			System.out.println(number + " is less than 5");
		} else System.out.println("The number entered is 5");
		// Close Scanner object to avoid memory leaks
		scanner.close();
	}

}
