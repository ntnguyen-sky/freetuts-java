package freetuts;

import java.util.Scanner;

// Ví dụ dưới đây sẽ so sánh số bạn nhập vào với 10 và hiển thị ra kết quả so sánh.
public class CompareWithTen {

	public static void main(String[] args) {
		// Create object Scanner 
		Scanner scanner = new Scanner(System.in);
		
		// Input data
		System.out.print("Enter the number to be compared with 10: ");
		int number = scanner.nextInt();
		
		// Close object Scanner to avoid memory leaks
		scanner.close();
		
		if (number != 10) {
			// Comparison
			if (number > 10 ) {
				System.out.println("The number to be compared is greater than 10. (" + number + " > 10)");
			} else {
				System.out.println("The number to be compared is less than 10. (" + number + " < 10)");
			}
		} else {
			System.out.println("(10 = 10)");
		}
			
			

		
		
		
		

	}

}
