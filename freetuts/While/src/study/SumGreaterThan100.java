package study;

import java.util.Scanner;

/*
 * Viết chương trình nhập vào các số nguyên và tính tổng các số đó, 
 * nếu tổng lớn hơn > 100 thì kết thúc vòng lặp và hiển thị thông báo tổng của các số đã nhập.
 */
public class SumGreaterThan100 {

	public static void main(String[] args) {
		int number, sum = 0;
		// Scanner object
		Scanner scanner = new Scanner(System.in);
		
		// Check sum variable is greater than 100
		while (sum < 100) {
			System.out.print("Enter any the integer: ");
			number = scanner.nextInt();
			
			sum += number;
		}
		
		System.out.println("Sum: " + sum);
		
		// Close scanner to avoid memory leak
		scanner.close();
	}

}
