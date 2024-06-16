package exercise;

import java.util.Scanner;

/*
 * Viết chương trình nhập vào một ký tự thường 
 * và hiển thị thông báo ký tự vừa nhập là nguyên âm hay không phải nguyên âm.
 */
public class VowelsOrConsonants {

	public static void main(String[] args) {
		// Scanner object
		Scanner scanner = new Scanner(System.in);

		// Input
		char character;
		System.out.print("Enter the character: ");
		character = scanner.next().charAt(0);

		// Close Scanner object to avoid memory leaks
		scanner.close();

		// Check
		switch (character) {
		case 'a':
		case 'e':
		case 'o':
		case 'i':
		case 'u':
			System.out.println("This is a vowel character.");
			break;
		default:
			System.out.println("This is a consonant character.");
		}

	}

}
