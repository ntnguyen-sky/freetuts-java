package execrise;

import java.util.Scanner;

/*
 * Viết chương trình hiển thị ra màn hình các số chẵn nhỏ hơn hoặc bằng 20, 
 * mỗi số được in ra phải nằm trên 1 dòng.
 */
public class EvenNumber {

	public static void main(String[] args) {
		// Scanner object
		Scanner scanner = new Scanner(System.in);

		int number = 0;

		System.out.println("Even numbers less than or equal to 20 are: ");
		while (number <= 20) {
			System.out.println(number);
			number += 2;
		}

		// Close the scanner to avoid memory leak
		scanner.close();
	}

}
